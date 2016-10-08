package com.facade;
public class Client{
	public static void main(String[] args){
		Computer computer = (Computer)PropertiesUtil.getInstance();
		System.out.println(computer.doSalary("name"));
	}
}