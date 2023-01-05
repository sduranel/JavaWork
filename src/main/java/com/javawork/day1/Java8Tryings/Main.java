package com.javawork.day1.Java8Tryings;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	//	NamesList.getNamesList();
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student(1,"Serkan",45,"Main Street"));
        students.add(new Student(2,"Serkan",15,"Main Street"));
        		
        for(Student s: students) {
        	System.out.println(s.toString());
        }
		
		  System.out.println(students.stream().collect(Collectors.toList()));
		 
	}

}
