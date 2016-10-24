package com.mediator;
public class Client{
	public static void main(String[] argv){
		Messages messages = new MessageImpl();
		Message a = new Message1();
		Message b = new Message2();
		messages.add(a);
		messages.add(b);
		a.sendMessage("消息队列1","消息队列2");
	}
}