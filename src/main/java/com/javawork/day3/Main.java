package com.javawork.day3;

import java.util.List;
import java.util.stream.Collectors;


public class Main {

    private static EmployeeDAO employeeDao;
    
    public static void main(String[] args) {
        employeeDao = new EmployeeDaoImpl();
         
        List<Employee> employees = employeeDao.getAllEmployees();
        System.out.println(employees);
		/*
		 * employees.stream().forEach(System.out::println); employees.stream().filter(e
		 * -> "Serkan1".equals(e.getName())) .forEach(System.out::println);
		 */
        List<Employee> empList = employees.stream()
        		          .filter(e -> e.getSalary() > 5005.00)
                          .collect(Collectors.toList());
        empList.forEach(System.out::println);
	}

	/*
	 * public void getList() { System.out.println(employees.toString()); }
	 */

}
