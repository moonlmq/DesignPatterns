package com.iterator;
//容器角色负责提供创建具体迭代器角色的接口
public interface Aggregate{
	iterator CreateIterator();
}