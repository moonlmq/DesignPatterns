package pers.moon.desinpattern.abstractprototype;

public class ProductClone extends Clone{
	public Clone clone(){
		Clone obj = new ProductClone();
		try{
			obj.setNum(super.getNum());
			obj.setPrice(super.getPrice());
			obj.setRebate(super.getRebate());

		}catch(Exception ex){
			System.out.println(ex);
		}
		return obj;
	}
}