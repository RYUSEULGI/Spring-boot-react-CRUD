package com.test.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.test.filesetting.Path;

import lombok.extern.java.Log;

@Log
@Service
public class FileServiceImpl implements FileService{
	
	@Override
	public String saveStore(MultipartFile file) {
		String ofname = file.getOriginalFilename();
		int idx = ofname.lastIndexOf(".");
		String ofHeader = ofname.substring(0, idx);
		String ofTail = ofname.substring(idx);
		long ms = System.currentTimeMillis();  // 제목이 중복되지 않게 하기 위해 현재시간 추가 
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ofHeader);
		sb.append("_");
		sb.append(ms);
		sb.append(ofTail);
		
		String saveFileName = sb.toString();
		boolean flag = writeFile(file, saveFileName);
		// long fileSize = file.getSize();
		
		if(flag) {
			log.info("file save success");
			// DB와 연결하기
			// saveFileName, ofname, fileSize
		} else {
			log.info("file save fail");
		} 
		
		return Path.FILE_STORE + "/" +saveFileName;
	}

	@Override
	public boolean writeFile(MultipartFile file, String saveFileName) {
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
