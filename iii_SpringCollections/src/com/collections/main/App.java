package com.collections.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.*;

import com.collections.model.QuestionAnswer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res = new ClassPathResource("bean.xml");
		
		BeanFactory ben = new XmlBeanFactory(res);
		
		QuestionAnswer qa =  (QuestionAnswer)ben.getBean("q1");
		qa.show();
		
		QuestionAnswer qa2 =  (QuestionAnswer)ben.getBean("q2");
		qa2.show();

	}

}
