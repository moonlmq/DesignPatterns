package com.builder;
public class Director{
	private Builder lnkBuilder;
	public void Director(Builder builder){
		this.lnkBuilder = builder;
	}
	public Product assembleProduct(){
		return new Product();
	}
}