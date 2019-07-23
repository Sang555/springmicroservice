package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	private StudentDAO obj;
	
	@RequestMapping("/")
	public String getPage()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String add(Student s)
	{
		obj.save(s);
		return "home.jsp";
	}

}
