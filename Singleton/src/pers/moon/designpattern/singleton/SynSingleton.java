package pers.moon.designpattern.singleton;
//针对多线程的应用
public class SynSingleton {
	private static SynSingleton instance = null;
	private SynSingleton(){
		
	}
	//增加同步机制
	public static SynSingleton getInstance(){
		if (instance == null){
			synchronized(SynSingleton.class){//增加同步机制
				if(instance == null){//对是否null再次判断
			instance = new SynSingleton();
			}
			}
		}
		return instance;
	}
}
