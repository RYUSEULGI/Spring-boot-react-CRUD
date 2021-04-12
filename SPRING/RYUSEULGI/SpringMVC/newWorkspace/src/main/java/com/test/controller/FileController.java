package com.test.controller;

import java.io.File;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.test.filesetting.Path;
import com.test.service.FileService;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@Log 
@Controller
@AllArgsConstructor
@RequestMapping("/file")
public class FileController {

	private FileService service;
	
	@GetMapping("/uploadForm.do")
	public String getUploadingForm() {
		log.info("get uploading form");
		
		return "file/uploadForm";
	}
	
	@PostMapping("/upload.do")
	public String doUploadingForm(@RequestParam String name, @RequestParam MultipartFile file) {
		log.info("do uploading form");
		
		String ofname = file.getOriginalFilename();
		
		if(ofname != null) {
			ofname= ofname.trim();
		}
		if(ofname.length() != 0) {
			service.saveStore(file);
		}
		
		return "redirect:list.do";
	}
	
	@GetMapping("/list.do")
	public ModelAndView getFileList() {
		log.info("get filelist");
		
		File store = new File(Path.FILE_STORE);
		
		if(!store.exists()) {
			store.mkdirs();
		}
		
		File files[] = store.listFiles();
		
		return new ModelAndView("file/list", "files" , files);
	}
	
	@GetMapping("/delete.do")
	public String getDelete(@RequestParam String fname) {
		log.info("get delete");
		
		File file = new File(Path.FILE_STORE, fname);
		
		if(file.exists()) {
			file.delete();
		}
		
		return "redirect:list.do";
	}
	
	@GetMapping("/multiForm.do")
	public String getMultiForm() {
		log.info("get Multi form");
		
		return "file/multiForm";
	}
	
	@PostMapping("/multiForm.do")
	public String doMultiForm(@RequestParam ArrayList<MultipartFile> files) {
		log.info("do Multi form");
		
		for(MultipartFile file: files) {
			String ofname = file.getOriginalFilename();
			
			if(ofname != null) {
				ofname= ofname.trim();
			}
			if(ofname.length() > 0) {
				service.saveStore(file);
			}
		}
		return "redirect:list.do";
	}
	
	@GetMapping("/download.do")
	public ModelAndView getDownload(@RequestParam String fname) {
		log.info("file download");
		
		File file = new File(Path.FILE_STORE, fname);
	
		if(file.exists()) {
			return new ModelAndView("fileDownloadView", "downloadFile" , file);
		} else {
			log.info("no file in here");
			return new ModelAndView("redirect:list.do");
		}
	}
}
