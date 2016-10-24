package com.visitor;
//具体元素类
public class ConcreteElement implements Element{
	public void accept(Visitor visitor){
		visitor.visitConcreteeElement(this);
	}
}