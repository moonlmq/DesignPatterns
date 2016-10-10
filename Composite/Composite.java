package com.composite;
//树枝构件代表参加组合的下级子对象的对象。给出所有的管理子对象的方法
//如add(),remove(),getChild()等。

import java.util.Vector;
import java.util.Enumeration;

public class Composite implements Component{
	public Composite getComposite{
		return this;
	}

	public void sampleOperation(){
		java.util.Enumeration components = components();
		while (components.hasMoreElements()){
			((Component)components.nextElement()).sampleOperation();
		}
	}

	public void add(Component component){
		componentVector.addElement(component);
	}

	public void remove(Component component){
		componentVector.removeElement(component)
	}

	public Enumeration components(){
		return componentVector.elements();
	}

	private Vector componentVector = new java.util.Vector();
}