package com.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@RequestMapping("/doUpload")
	public String doUpload(MultipartFile file, HttpSession session)
			throws IOException {
		if (!file.isEmpty()) {
			System.out.println("getOriginalFilename:"
					+ file.getOriginalFilename());
			System.out.println("getName: " + file.getName());
			System.out.println("getContentType" + file.getContentType());
			System.out.println("getSize" + file.getSize());
			String path = session.getServletContext().getRealPath("upload");
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(
					path + "//" + file.getOriginalFilename()));
		}
		return "uploadSuccess";
	}

	
}
