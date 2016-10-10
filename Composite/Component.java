package com.composite;
//给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象。
public interface Component{
	Composite getComposite();
	void sampleOperation();
}