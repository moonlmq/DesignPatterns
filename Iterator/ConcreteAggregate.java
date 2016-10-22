package com.iterator;
//具体容器角色实现创建具体迭代器角色的接口
public class ConcreteAggregate implements Aggregate{
	public Iterator CreateIterator(){
		return new ConcreteIterator();
	}
}