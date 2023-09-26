package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import com.byname.model.A;
import com.bytype.model.City;
import com.bytype.model.State;
import com.constructor.model.Student;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res =  new ClassPathResource("bean.xml");
		
		BeanFactory bean = new XmlBeanFactory(res);
//1.byname		
//		A a = (A)bean.getBean("a", A.class) ;
//		
//		a.show();
		

//2.bytype
		
//		State st = bean.getBean("state", State.class);
//	    st.setName("UP");
//	       
//		City c = bean.getBean("city", City.class);
//		c.setId(1);
//        c.setName("Thiruvarur");
//        
//        
//        c.setS(st);
//        c.showCitYDetails();
        
  
//3.constructor
        
		Student c =(Student)bean.getBean("s1");
		System.out.println(c.getFullname());
		System.out.println(c.getCourse().getCname());

	}

}
