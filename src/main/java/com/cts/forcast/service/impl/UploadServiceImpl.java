package com.cts.forcast.service.impl;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cts.forcast.service.UploadService;

@Service("uploadService")
public class UploadServiceImpl implements UploadService {

	// @Autowired
	// UploadDao uploadDao;

	@Value("${sharedfolder:D:\\\\Shared}")
	private String destination;

	public String uploadFile(MultipartFile file) {
		String name = "";
		if (!file.isEmpty()) {
			try {
				name = file.getOriginalFilename();
				name = name.substring(0, name.lastIndexOf(".")).concat(".csv");
				byte[] bytes = file.getBytes();
				File dir = new File(destination);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				writeData(serverFile.getAbsolutePath());
				return serverFile.getAbsolutePath();
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name + " because the file was empty.";
		}
	}

	public String writeData(String fileName) {
		BufferedReader fileReader = null;
		String line = "";
		try {
			fileReader = new BufferedReader(new FileReader(fileName));
			while ((line = fileReader.readLine()) != null) {
				// uploadDao.insertLeave(line.split(",")[0], line.split(",")[1]
				// , line.split(",")[2]);
			}
			return "Success";
		} catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
			return "Failed to upload";
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}
	}
}
