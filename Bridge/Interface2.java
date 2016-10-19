package com.bridge;
public class Interface2 implements Interface{
	public Interface2(implement impl){
		super(impl);
	}
	public void operation1(){
		impl.operation1();
	}
}