package com.test.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	public String saveStore(MultipartFile file);
	public boolean writeFile(MultipartFile file, String saveFileName);
}
