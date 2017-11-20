package com.didiapace.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
@Configuration
@PropertySource(value={"classpath:jdbc.properties","classpath:env.properties",
		"classpath:httpclient.properties","classpath:redis.properities","classpath:rabbitmq.properties"})
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String index(){
		
		return "Hello SpringBoot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class);
	}
}
