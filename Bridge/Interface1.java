package com.bridge;
public class Interface1 implements Interface{
	public Interface1(implement impl){
		super(impl);
	}
	public void operation1(){
		impl.operation1();
	}
}