package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendemailApplicationTests {
	
	/**
     * 注入发送邮件的接口
     */
    @Autowired
    private MailService mailService;

    

    @Test
    public void sendmailHtml(){
        mailService.sendHtmlMail("2291177920@qq.com","主题：你好html邮件","<h1>内容：第一封html邮件</h1>");
    }

}
