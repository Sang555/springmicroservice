package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@RestController
@SpringBootApplication
public class MsMyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMyServiceApplication.class, args);
	}
	
	@RequestMapping
	public String demoMethod()
	{
		return "<h1>WELCOME</h1>";
	}

}
