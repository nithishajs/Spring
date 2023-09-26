package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res = new ClassPathResource("Bean.xml");
		
		BeanFactory bean = new XmlBeanFactory(res);
				
	    Student s1 = (Student)bean.getBean("cl");
		s1.show();

	}

}
