package pers.moon.designpattern.simplefacory;

public class Factory1 {
//	���ݲ���������ͬ�Ķ���
	public static Product createProduct(String productName){
		if("1".equals(productName))
			return new Product1();
		else if ("2".equals(productName))
			return new Product2();
		return null;
	}
}
