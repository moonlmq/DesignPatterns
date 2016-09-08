package pers.moon.designpattern.prototype;

public class InObject implements Cloneable{
	public Object clone(){
		Object obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException ex){
			Systtem.out.println(ex);
		}
		return obj;
	}
}