package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.po.UploadImageResModel;
import com.example.service.AlbumService;
import com.example.util.TencentCOS;



@RestController
@RequestMapping("/file")
public class FileApi {
	
	private static String secretId = "AKIDkJdiX7MXjgO0NUhocBUZOyJUQ7awrvXt";
	
	private static String secretKey = "MUMzNWQ5d4HG1XnnY4QXP1OVN0NbbKo3";
	
	private static  String bucketName = "ppx-1300493028";
	
	@Autowired
	private AlbumService albumService;
	/**
	 * 使用fileInput插件进行文件上传
	 * @param request 获取上传图片
	 * @param response
	 * @return 上传结果
	 * @throws UnsupportedEncodingException//编码异常
	 */
	@RequestMapping("/uploadimageone")
	public UploadImageResModel uplodaImageOneWithFileInput(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
//		String secretId = "AKIDzlLl038qW2PXlBlTM0SijW4WjphJizzn";
//		String secretKey = "lHdmjU6ToulNk7F7j5B2nKbeS1KOFpEN";
//		String bucketName = "csp-1251531734";
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
			// TODO Auto-generated catch block
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
