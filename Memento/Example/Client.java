package com.memento;
public class Client{
	public static void main(String[] args){
		Document document = new Document();
		document.setTitle("title");
		document.setContext("context");
		document.setSendPerson("person");
		System.out.println("第一次创建的对象:"+document.getTitle()+document.getContext+document.getSendPerson());
		Memento memento = document.getMemento();
		document.setTitle("title2");
		document.setContext("context2");
		document.setSendPerson("person2");
		System.out.println("第二次创建的对象:"+document.getTitle()+document.getContext+document.getSendPerson());
		document.setMemento(memento);
		System.out.println("恢复第一次创建的对象:"+document.getTitle()+document.getContext+document.getSendPerson());
	}
}