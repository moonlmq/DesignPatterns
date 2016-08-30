package pers.moon.designpattern.simplefacory;
//采用JAVA反射来创建类实例
public class Factory2 {
	public Product getProduct(String type){
		Product product = null;
		try{
			product = (Product)Class.forName(type).newInstance();
		} catch (InstantiationException e){
			e.printStackTrace();
		} catch (IllegalAccessException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		return product;
	}
}
