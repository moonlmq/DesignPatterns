package pers.moon.designpattern.abstractfactory;

public class ConcreteFactory implements AbstractFactory {

	@Override
	public AbstractProduct CreateAbstractProduct() {
		// TODO Auto-generated method stub
		return new ConcreteProduct1();
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub

	}

}
