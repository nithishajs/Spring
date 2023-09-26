package com.collectiocmap.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import com.collectiocmap.model.Quest;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res = new ClassPathResource("bean.xml");
		
		BeanFactory bean = new XmlBeanFactory(res);
		
		Quest qa =(Quest)bean.getBean("q1");
		qa.show();

	}

}
