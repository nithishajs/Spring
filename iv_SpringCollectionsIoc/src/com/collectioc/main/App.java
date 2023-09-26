package com.collectioc.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import com.collectioc.model.Question;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res = new ClassPathResource("bean.xml");
		
		BeanFactory bean = new XmlBeanFactory(res);
		
		Question qa = (Question)bean.getBean("q1");
		qa.show();
		
		Question qa2 = (Question)bean.getBean("q2");
		qa2.show();

	}

}
