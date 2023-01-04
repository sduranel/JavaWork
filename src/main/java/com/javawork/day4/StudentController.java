package com.javawork.day4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class StudentController {
	@Autowired
	private StudentService stservice;
	
	@GetMapping("/getlist")
	public static String getList() {
		return "Tetzzzzs";
	}
	@GetMapping("/getstudents")
	public List<Student> getStudents() {
//		stservice.createStudents();
		return stservice.getAllStudents();
	}
}
