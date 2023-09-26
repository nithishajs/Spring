package com.ioc.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.ioc.model.Employee;

public class App {
	
	public static void main(String [] args) {
		
		Resource res = new ClassPathResource("bean.xml");
		
		BeanFactory bean = new XmlBeanFactory(res);
		
		Employee em = (Employee)bean.getBean("e1");
		em.show();
		
	}

}
