package com.Responsibility;
public class Handler{
	public void handleRequest(){
		if (successpr !=null){
			successor.handleRequest();
		}
		//code
	}
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	public Handler getSuccessor(){
		return successor;
	}
	private Handler successor;
}