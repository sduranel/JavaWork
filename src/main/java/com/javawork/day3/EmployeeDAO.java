package com.javawork.day3;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Optional<Employee> getEmployeeById(int id);
    public void save(Employee emp);
    public void delete(Employee emp);
    public void updateEmpName(Employee emp, String name);
}