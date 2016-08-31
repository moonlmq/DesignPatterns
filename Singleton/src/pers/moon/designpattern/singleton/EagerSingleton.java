package pers.moon.designpattern.singleton;
///楗挎眽鍗曚緥妯″紡
    //鍦ㄧ被鍔犺浇鏃跺氨瀹屾垚浜嗗垵濮嬪寲锛屾墍浠ョ被鍔犺浇杈冩參锛屼絾鑾峰彇瀵硅薄鐨勯�熷害蹇�
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){
		System.out.println("come into the Eager construct");
	}
	public static EagerSingleton getInstance(){
		return instance;
	}
}