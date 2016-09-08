package pers.moon.designpattern.protoype;

public class ConcretePrototype1 implements Prototype{
	private InObject inobject;
	public void setInObject(InObject inobject){
		this.inobject = inobject;
	}
	public InObject GetInObject(){
		return inobject;
	}
	public Object clone(){
		Object obj = null;
		try{
			obj = (Product)super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex);
		}
		return obj;
	}
}