package com.observer;
//目标类
import java.util.Vector;
import java.util.Enumeration;
public class ConcreteSubject implements Subject{
	//添加
	public void attach(Observer observer){
		observersVector.addElement(observer);
	}
	//删除
	public void detach(Observer observer){
		observersVector.removeElement(observer);
	}
	//通知
	public void Notify(){
		java.util.Enumeration enmueration = observers();
		while (enmueration.hasMoreElements()){
			((Observer)enmueration.nextElement()).update();
		}
	}
	public Enumeration observers(){
		return ((java.util.Vector) observersVector.clone()).elements();
	}
	private Vector observersVector = new java.util.Vector();
}