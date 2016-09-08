package pers.moon.desinpattern.abstractprototype;
public classs Client{
	public static void main(String[] args) {
		Clone product = new ProductClone();
		product.setNum(10);
		product.setPrice(12);
		product.setRebate(20);
		System.out.println("Former Object:num = "+product.getNum());
		Clone product1 = (Clone)product.clone();
		product.setNum(1000);
		System.out.println("new Object:num = "+product1.getNum());
		System.out.println("old Object:num = "+product.getNun());
	}
}