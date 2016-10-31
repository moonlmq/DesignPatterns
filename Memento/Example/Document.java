package com.memento;
public class Document{
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
	//备忘者
	public Memento getMemento(){
		return new Memento(this);
	}
	//获取备忘的内容
	public void setMemento(Memento memento){
		this.title = memento.getTitle();
		this.context = memento.getContext();
		this.sendPerson = memento.getSendPerson();
	}
}