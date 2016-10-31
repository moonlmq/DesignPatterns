package com.oberver;
import java.util.Observable;
import java.util.Observer;
public class Customer2 implements Observer{
	private String email;
	public String getEmail();{
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	@override
	public void update(Observable obj, Object arg){
		double price = Double.parseDouble(arg.toString());
		System.out.println("该货物降价了，发送邮件到"+email+",变动价格为："+price);
	}
}