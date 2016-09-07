package pers.moon.designpattern.prototype;

public class ConcretePrototype2 implements Prototype{
	public Object clone(){
		Object obj = null;
		try{
			obj = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex);
		}
		return obj;
	}
}