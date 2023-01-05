package com.javawork.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDaoImpl implements EmployeeDAO {
	private List<Employee> employees = new ArrayList<>();

	public EmployeeDaoImpl() {
		employees.add(new Employee(101,"Serkan1",50,5001.00));
		employees.add(new Employee(102,"Serkan3",51,5012.00));
		employees.add(new Employee(103,"Serkan2",53,5006.00));
		employees.add(new Employee(104,"Serkan6",57,5003.00));	
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmpName(Employee emp, String name) {
		// TODO Auto-generated method stub
		
	}
}
