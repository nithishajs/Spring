package com.e.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.e.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		String query= "INSERT INTO employees(name, dept, salary) VALUES(?,?,?)";
		return jdbc.execute(query,  new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				ps.setString(1, e.getName());
				ps.setString(2, e.getDept());
				ps.setFloat(3, e.getSalary());
				return ps.execute();
			}
			
		});
	}

	@Override
	public void listEmployee() {
		// TODO Auto-generated method stub
		
		String query= "SELECT * FROM employees";
		List<Employee> emp = jdbc.query(query, new ResultSetExtractor<List<Employee>>(){

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				 List<Employee> list=new ArrayList<Employee>();  
			        while(rs.next()){  
			        Employee e=new Employee();  
			        e.setEid(rs.getInt(1));  
			        e.setName(rs.getString(2)); 
			        e.setDept(rs.getString(3));  
			        e.setSalary(rs.getFloat(4));  
			        list.add(e);  
			
			        }  
			        return list;  
			        }  
			    });  
			  }  
			

	@Override
	public Employee listById(int id) {
		// TODO Auto-generated method stub
		String query= "SELECT * FROM employees WHERE eid=?";
		
		
		return jdbc.execute(query,  new PreparedStatementCallback<Employee>() {

			@Override
			public Employee doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
			     Employee e=new Employee();  
				  while(rs.next()){  
				   
				        e.setEid(rs.getInt(1));  
				        e.setName(rs.getString(2)); 
				        e.setDept(rs.getString(3));  
				        e.setSalary(rs.getFloat(4));  
				     
				
				        }  
				        return e;  
			}
			
		});
	}

	@Override
	public boolean updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		String query= "UPDATE employees SET name=?,dept=?,salary=? WHERE eid=?";
		return jdbc.execute(query, new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
			
				ps.setString(1, e.getName());
				ps.setString(2, e.getDept());
				ps.setFloat(3, e.getSalary());
				ps.setInt(4, e.getEid());
				return ps.execute();
			}
			
		});
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		String query = "DELETE FROM employees WHERE eid=?";
		
		return jdbc.execute(query, new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, id);
				return ps.execute();
			}
			
		});
	}

}
