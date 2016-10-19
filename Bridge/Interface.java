package com.bridge;
public abstract class Interface{
	public Interface(implement impl){
		this.impl = impl;
	}
	public void operation1(){
		this.impl.operation1();
	}
	implement impl;
}