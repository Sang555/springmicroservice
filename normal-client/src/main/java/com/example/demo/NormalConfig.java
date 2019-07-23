package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.*;

@Configuration
public class NormalConfig {

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
