package com.collectiocmap.model;

import java.util.Map;

public class Quest {
	
	private int qno;
	private String question;
	private Map<String,String> answer;
	
	public Quest(int qno, String question, Map<String, String> answer) {
		super();
		this.qno = qno;
		this.question = question;
		this.answer = answer;
	}
	
	public void show() {
		System.out.println("Qn :"+qno+" "+question+"\nAnswers :");
		for(Map.Entry m:answer.entrySet()){
			System.out.println(m.getKey() + " by "+m.getValue());
		}
	}

}
