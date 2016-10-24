package com.Responsibility;
public class ConcreteHandler1 extends Handler{
	public void handleRequest(){
		if(getSuccesssor()!=null){
			getSuccesssor().handleRequest();
		}
		if(successor != null){
			successor.handleRequest();
		}
	}
}