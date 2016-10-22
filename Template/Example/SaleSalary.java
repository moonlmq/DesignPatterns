package com.template;
public class SaleSalary extends SalaryComputer{
	@override
	public void doBase(){
		System.out.println("对于销售人员，计算基本工资");
	}
	@override
	public void doBonus(){
		System.out.println("对于销售人员，计算奖金");
	}
	@override
	public void doTax(){
		System.out.println("对于销售人员，计算所得税");
	}
}