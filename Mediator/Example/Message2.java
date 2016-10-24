package com.mediator;
//具体的消息内容类2
public class Messsage2 extends Message{
	private String name;
	public String getName(){
		return "消息队列2";
	}
	public void receiveMessage(Message messsage1){
		System.out.println(messsage1.getName()+"堵塞了"+getName());
	}
}