package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.util.TencentCOS;
import com.example.po.UploadImageResModel;



@RestController
@RequestMapping("/api/ck")
public class CkeditorController {
	@RequestMapping("/uploadimg")
	public UploadImageResModel uploadImg(@RequestParam("upload") MultipartFile multipartFile) throws Exception {
		String secretId = "AKIDkJdiX7MXjgO0NUhocBUZOyJUQ7awrvXt";
		String secretKey = "MUMzNWQ5d4HG1XnnY4QXP1OVN0NbbKo3";
		String bucketName = "ppx-1300493028";
		UploadImageResModel res= new UploadImageResModel();
		
		if(multipartFile == null|| multipartFile.isEmpty()) {
			res.setUploaded(0);
			return res;
	}
		String fileName = multipartFile.getOriginalFilename();
		// 获取文件后缀
		String prefix = fileName.substring(fileName.lastIndexOf("."));
		File excelFile = null;
		try {
			excelFile = File.createTempFile("imagesFile-" + System.currentTimeMillis(), prefix);
			multipartFile.transferTo(excelFile);
			fileName = TencentCOS.uploadfile(excelFile, secretId, secretKey, bucketName);
			// 访问路径
			String path = "https://" + bucketName + ".cos.ap-shanghai.myqcloud.com/" + fileName;
		
			res.setUploaded(1);
			res.setFileName(fileName);
			res.setUrl(path);
			// 程序结束时，删除临时文件
		} catch (IOException e) {
			res.setUploaded(0);
		}

		return res;

	}
	public UploadImageResModel uplodaImageMultiWithFileInput(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		UploadImageResModel res = new UploadImageResModel();
		/** 页面控件的文件流* */
        MultipartFile multipartFile = null;
        Map map =multipartRequest.getFileMap();
         for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                Object obj = i.next();
                multipartFile=(MultipartFile) map.get(obj);

               }
		if (multipartFile == null || multipartFile.isEmpty()) {
			res.setUploaded(0);
			return res;
		}
		return res;
	}

}
