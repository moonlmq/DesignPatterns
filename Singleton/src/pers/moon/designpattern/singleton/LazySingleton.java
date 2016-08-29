package pers.moon.designpattern.singleton;
//懒汉式单例模式
    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
public class LazySingleton {
	private static LazySingleton instance = null;
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
