package com.template;
//薪资类
public class Salary{
	private SalaryComputer salaryComputer;
	public Salary(SalaryComputer salaryComputer){
		this.salaryComputer = salaryComputer;
	}
	public void doSalary(){
		salaryComputer.doSalary();
	}
}