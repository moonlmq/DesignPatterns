package pers.moon.designpattern.protoype;

public class ConcretePrototype1 implements Prototype{
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