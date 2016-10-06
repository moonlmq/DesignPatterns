package com.adapter;
public class Adapter implements Target{
	public void Request(){

	}
	private Adaptee adaptee;
	public void Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
}