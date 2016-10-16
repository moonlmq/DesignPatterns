package com.decorator;
public class Decorator implements Component{
	public Decorator(Component component){
		super();
		this.component = component;
	}
	public void Operation(){
		component.Operation();
	}
	private Component component;
}