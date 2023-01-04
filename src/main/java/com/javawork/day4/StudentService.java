package com.javawork.day4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
    
	private List<Student> students = new ArrayList<>();

	public StudentService() {
		students.add(new Student(101,"Serkan1",50));
		students.add(new Student(102,"Serkan3",51));
		students.add(new Student(103,"Serkan2",53));
		students.add(new Student(104,"Serkan6",57));	
	}
	
	public List<Student> getAllStudents() {
		return students;
	}	

}
