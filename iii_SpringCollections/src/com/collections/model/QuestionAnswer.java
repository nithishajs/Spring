package com.collections.model;

import java.util.List;

public class QuestionAnswer {
	
	private int qno;
	private String question;
	private List <String> answers;
	
	
	public int getQno() {
		return qno;
	}


	public void setQno(int qno) {
		this.qno = qno;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<String> getAnswers() {
		return answers;
	}


	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}


	public QuestionAnswer(int qno, String question, List<String> answers) {
		super();
		this.qno = qno;
		this.question = question;
		this.answers = answers;
	}


	public QuestionAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show () {
		
		System.out.println(qno+" "+question+"\n"+"Answers :");
		
		for(String x : answers) {
			System.out.println(x);
		}
	}
}
