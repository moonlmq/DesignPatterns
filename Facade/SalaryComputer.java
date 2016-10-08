package com.facade;
public class SalaryComputer implements Computer{
	public double doSalary(String name){
		Salary salary = new Salary();
		Holiday holiday = new Holiday();
		Tax tax = new Tax();
		double money = salary.getSalary(name) * holiday.getHoliday(name)/ 30
		- tax.getTax(name);
		return money;
	}
}