package com.visitor;
public abstract class Window{
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
	public abstract void service();
}