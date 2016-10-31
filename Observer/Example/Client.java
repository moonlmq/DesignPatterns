package com.observer;
public class Client{
	public static void main(String[] args){
		Customer1 customer1 = new Customer1();
		customer1.setEmail("1");
		Customer2 customer2 = new Customer2();
		customer2.setEmail("2");
		Customer3 customer3 = new Customer1();
		customer3.setEmail("3");
		Product product = new Product();
		product.adddObserver(customer1);
		product.adddObserver(customer2);
		product.adddObserver(customer3);
		product.setPrice(1);
	}
}