package com.collectioc.model;

public class Answer {
	
	private int ano;
	private String answer;
	private String ansby;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnsby() {
		return ansby;
	}
	public void setAnsby(String ansby) {
		this.ansby = ansby;
	}
	
	public Answer(int ano, String answer, String ansby) {
		super();
		this.ano = ano;
		this.answer = answer;
		this.ansby = ansby;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [ano=" + ano + ", answer=" + answer + ", ansby=" + ansby + "]";
	}
	
	
	
	

}
