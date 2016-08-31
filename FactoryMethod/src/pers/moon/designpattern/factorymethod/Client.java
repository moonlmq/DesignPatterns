package pers.moon.designpattern.factorymethod;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryMethod factorymethod = new FactoryMethod1();
		Product product = factorymethod.factorymethod();
		product.Operation();
	}

}
