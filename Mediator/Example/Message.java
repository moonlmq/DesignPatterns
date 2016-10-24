package com.mediator;
//消息内容抽象类
public abstract class Message{
	public void sendMessage(String messageFrom,String messageTo){
		messages.send(messageFrom,messageTo);
	}
	public abstract void receiveMessage(Message messageFrom);
	public abstract String getName();
	public Messages getMessages(){return messages;}
	public void setMessages(Messages messages){this.messages = messages;}
	private Messages messages;
}