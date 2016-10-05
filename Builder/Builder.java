// 抽象工厂模式侧重于一系列对象的创建，
// 创建者模式侧重于一系列对象的组装，其质的区别在于对类的
// 单一职责的遵守程度

package com.builder;
public interface Builder{
	void BuilderPart();
}
