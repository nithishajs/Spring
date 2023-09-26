package com.collectioc.model;

import java.util.List;

public class Question {
	
	private int qno;
	private String question;
	private List<Answer> answer;
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
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public Question(int qno, String question, List<Answer> answer) {
		super();
		this.qno = qno;
		this.question = question;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println(qno+". "+question+"\n"+"Answers By :");
		for(Answer x : answer) {
			System.out.println(x.getAno()+" "+x.getAnswer()+" by "+x.getAnsby() );
		}
		System.out.println("\n");
	}

}
