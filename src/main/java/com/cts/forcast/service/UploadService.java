package com.cts.forcast.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

	public String uploadFile(MultipartFile file);
	
	public String writeData(String fileName);

}
