package com.mediator;
//具体的消息内容类1
public class Messsage1 extends Message{
	private String name;
	public String getName(){
		return "消息队列1";
	}
	public void receiveMessage(Message messsage1){
		System.out.println(messsage1.getName()+"堵塞了"+getName());
	}
}