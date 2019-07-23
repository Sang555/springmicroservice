package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/client")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/demo")
	public String invoke()
	{
		return "JUST FOR DEMO";
	}
	
	@HystrixCommand(fallbackMethod="xyz")
	@GetMapping("/callservice")
	public String invokeService()
	{
		String url="http://MY-SERVICE:8091";
		return restTemplate.getForObject(url, String.class);
	}
	
	//same return type as the hystrix annotated one
	public String xyz()
	{
		/*
		 someother url can be called
		  		String url="http://MY-SERVICE:8091";
		return restTemplate.getForObject(url, String.class);
		 */
		return "<h1>SORRY SERVER DOWN</h1>";
	}

}
