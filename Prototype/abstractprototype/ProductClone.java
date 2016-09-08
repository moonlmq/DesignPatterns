package pers.moon.desinpattern.abstractprototype;
// 解决关联另一个类复制
public class ProductClone extends Clone{
	public Clone clone(){
		Clone obj = new ProductClone();
		try{
			obj.setNum(super.getNum());
			obj.setPrice(super.getPrice());
			obj.setRebate(super.getRebate());
			Address address = new Address();
			obj.setAddress(address);
		}catch(Exception ex){
			System.out.println(ex);
		}
		return obj;
	}
}