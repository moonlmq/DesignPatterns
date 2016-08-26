package pers.moon.designpattern.singleton;
//����ģʽ������Ҫ��ȡʱ�Ž��д���
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
