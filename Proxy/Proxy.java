package com.proxy;
public class Proxy implements Subject{
	private Subject subject
	//在该类中针对接口Subject编程，而不针对具体的类
	public Proxy(Subject subject){
		this.subject = subject
	}
	public void Request(){
		subject.Request();
	}

}