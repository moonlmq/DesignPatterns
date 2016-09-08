package pers.moon.desinpattern.abstractprototype;

public abstract class Clone{
	private double num;
	private double price;
	private double rebate;
	public double getRebate(){
		return rebate;
	}
	public void setRebate(double rebate){
		this.rebate = rebate;
	}
	public double getNum(){
		return num;
	}
	public void setNum(double num){
		this.num = num;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price
	}

	public abstract Object clone();
}