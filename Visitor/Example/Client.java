package com.visitor;
public class Client{
	public static void main(String[] args){
		Window window1 = new window1();
		Window window2 = new window2();
		Visitor visitor = new Visitor();
		visitor.visit(window1);
		visitor.visit(window2);
	}
}