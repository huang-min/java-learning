package com.mindasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@ImportResource({"classpath:xxx.xml",""})
public class Application {

	@RequestMapping("/test")
	public String test(){
		return "HelloWorld";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}