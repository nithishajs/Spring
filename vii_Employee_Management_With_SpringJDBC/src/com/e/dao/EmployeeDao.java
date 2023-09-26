package com.e.dao;

import java.util.List;

import com.e.model.Employee;

public interface EmployeeDao {
	
	public boolean saveEmployee(Employee e);
	public void listEmployee();
	public Employee listById(int id);
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(int id);

}
