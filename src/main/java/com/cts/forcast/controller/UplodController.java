package com.cts.forcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cts.forcast.service.UploadService;

@Controller
@RequestMapping("/uploadController")
public class UplodController {

	@Autowired
	private UploadService uploadService;
	
    /**
     * Upload single file
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String uploadFileHandler(@RequestParam(value="userFile") MultipartFile file) {
    	return uploadService.uploadFile(file); 
    }

    /**
     * Upload multiple file
     */
    @RequestMapping(value = "/uploadMultiple", method = RequestMethod.POST)
    public @ResponseBody String uploadMultipleFileHandler(@RequestParam(value="userFile") MultipartFile[] files) {
        String message = "";
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            message = uploadService.uploadFile(file);
        }
        return message;
    }
    
    @RequestMapping(value = "/writeFile", method = RequestMethod.GET)
    public @ResponseBody String writeContent(@RequestParam(value="fileName") String fileName) {
//        return uploadService.writeData("D:\\Shared\\leaveSheet.csv");
        return uploadService.writeData(fileName);
    }
}
