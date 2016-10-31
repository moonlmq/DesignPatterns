package com.memento;
public class Memento{
	public Memento(Document document){
		this.title = document.getTitle();
		this.context = document.getContext();
		this.sendPerson = document.getSendPerson();
	}
	private String title;
	private String context;
	private String sendPerson;
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getContext(){
		return context;
	}
	public void setContext(String context){
		this.context = context;
	}
	public String getSendPerson(){
		return sendPerson;
	}
	public void setSendPerson(String sendPerson){
		this.sendPerson = sendPerson;
	}
}