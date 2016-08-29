package pers.moon.designpattern.singleton;
/饿汉单例模式
    //在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){
		System.out.println("come into the Eager construct");
	}
	public static LazySingleton getInstance(){
		return instance;
	}
}