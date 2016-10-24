package com.mediator;
import java.util.Map;
import java.util.HashMap;
//定义消息对象的实现类
public class MessageImpl implements Messsage{
	private Map map = new HashMap();
	public void send(String messageFrom, String messageTo){
		Message message1 = (Message)map.get(messageFrom);
		Message message2 = (Message)map.get(messageTo);
		message2.receiveMessage(message1);
	}
	public void add(Message message){
		message.setMessages(this);
		map.put(message.getName(),message);
	}
}