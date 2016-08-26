package pers.moon.designpattern.singleton;
//懒汉模式在类需要获取时才进行创建
public class LazySingleton {
	private static LazySingleton instance = new LazySingleton();
	private LazySingleton(){
		System.out.println("come into the Lazy construct");
	}
	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
