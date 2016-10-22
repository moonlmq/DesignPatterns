package com.template;
//抽象的薪资计算类
public abstract class SalaryComputer{
	public void doSalary(){
		doBase();
		doBonus();
		doTax();
	}
	public abstract void doBase();
	public abstract void doBonus();
	public abstract void doTax(); 
}