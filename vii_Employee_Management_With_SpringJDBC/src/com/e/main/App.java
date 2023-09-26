package com.e.main;
import java.util.*;
import com.e.dao.*;
import com.e.model.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		EmployeeDaoImpl dao=(EmployeeDaoImpl)ac.getBean("dao");
		
		Scanner sc = new Scanner(System.in);
		
	
		int choice;
		
		do {
			
			System.out.println("****Employee Management With SpringJdbc****");
			System.out.println("1.Add employee");
			System.out.println("2.List employee");
			System.out.println("3.View employee");
			System.out.println("4.Upadte employee");
			System.out.println("5.Delete employee");
			System.out.println("0.Exit");
			
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				
				
				System.out.println("Enter employee name :");
				String name = sc.nextLine();
				
				System.out.println("Enter employee dept :");
				String dept = sc.nextLine();
				
				System.out.println("Enter employee salary :");
				float salary = sc.nextFloat();
				
				Employee e = new Employee(name, dept, salary);
				boolean b = dao.saveEmployee(e);
				
				if(b) {
					System.out.println("something error"+" "+b);
				}else {
					System.out.println("Employee added successfully" +" "+ b);
				}
			break;
			
			case 2:
				dao.listEmployee();
			break;
			
			case 3:
				System.out.println("Enter employee id :");
				int id1 = sc.nextInt();
				
				Employee emp = dao.listById(id1);
				System.out.println(emp.getEid()+" "+emp.getName()+" "+emp.getDept()+" "+emp.getSalary());
			break;
			
			case 4:
				
				System.out.println("Enter employee id :");
				int id2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter employee name :");
				String name1 = sc.nextLine();
				
				System.out.println("Enter employee dept :");
				String dept1= sc.nextLine();
				
				System.out.println("Enter employee salary :");
				float salary1 = sc.nextFloat();
				
				Employee e1 = new Employee(id2,name1, dept1, salary1);
				
				boolean b1 = dao.updateEmployee(e1);
				
				if(b1) {
					System.out.println("something error"+" "+b1);
				}else {
					System.out.println("Employee updated successfully" +" "+ b1);
				}
			break;
			
			case 5:
				
				System.out.println("Enter employee id :");
				int id3 = sc.nextInt();
				
				boolean b3 = dao.deleteEmployee(id3);
				
				if(b3) {
					System.out.println("something error"+" "+b3);
				}else {
					System.out.println("Employee deleted successfully" +" "+ b3);
				}
				
			break;
			
			case 0:
				System.out.println("Thsnk you!");
			break;
			
			default:
				System.out.println("invalid input!");
			break;
			}
		}while(choice!=0);

	}

}
