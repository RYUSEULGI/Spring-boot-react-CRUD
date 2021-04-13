package com.test.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.test.domain.Address;
import com.test.domain.AddressFile;
import com.test.filesetting.Path;
import com.test.mapper.AddressMapper;

import lombok.extern.java.Log;

@Log
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> list() {
        return addressMapper.list();
    }

    @Override
    public void delete(long seq) {
        addressMapper.delete(seq);
    }

	@Override
	@Transactional
	public void insert(Address address, ArrayList<MultipartFile> files) {
		addressMapper.insertSelectKey(address);
		log.info("address id : " + address.getSeq());
		
		for(MultipartFile file: files) {
			String ofname = file.getOriginalFilename();
			
			if(ofname != null) ofname= ofname.trim();
			if(ofname.length() != 0) {
				AddressFile addrFile = saveStore(file);
				
				if(addrFile != null) {
					addrFile.setSeq(address.getSeq());
					addressMapper.insertFile(addrFile);
				}
			}
		}
	}
	
	private AddressFile saveStore(MultipartFile file) {
		String ofname = file.getOriginalFilename();
		int idx = ofname.lastIndexOf(".");
		String ofHeader = ofname.substring(0, idx);
		String ofTail = ofname.substring(idx);
		long ms = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ofHeader);
		sb.append("_");
		sb.append(ms);
		sb.append(ofTail);
		
		String saveFileName = sb.toString();
		boolean flag = writeFile(file, saveFileName);
		long fileSize = file.getSize();
		
		if(flag) {
			log.info("file save success");
			return new AddressFile(-1L, ofname, saveFileName, fileSize, -1L);
		} else {
			log.info("file save fail");
			return null;
		} 
	}
	
	private boolean writeFile(MultipartFile file, String saveFileName) {
		File dir = new File(Path.FILE_STORE);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		FileOutputStream out = null;
		
		try {
			byte data[] =file.getBytes();
			out = new FileOutputStream(Path.FILE_STORE + "/" +saveFileName);
			
			out.write(data);
			out.flush();
			
			return true;
			
		}catch(IOException e){
			return false;
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch(IOException e) {
				
			}
		}
	}

}
