package com.mediator;
//定义消息接口
public interface Messages{
	void send(String messageFrom, String messageTo);
	void add(Message message);
}