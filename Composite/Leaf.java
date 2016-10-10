package com.composite;
//树叶对象是没有下级子对象的对象，定义出参加组合的原始对象的行为
public class Leaf implements Component{
	public Composite getComposite(){
		return null;
	}

	public void sampleOperation(){

	}
}