package com.template;
public abstract class Template{
	public abstract void operation1();
	public abstract void operation2();
	public abstract void operation3();
	public void TemplateMethod(){
		operation1();
		operation2();
		operation3();
	}
}