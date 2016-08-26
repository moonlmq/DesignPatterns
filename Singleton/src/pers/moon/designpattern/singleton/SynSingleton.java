package pers.moon.designpattern.singleton;
//��Զ��̵߳�Ӧ��
public class SynSingleton {
	private static SynSingleton instance = null;
	private SynSingleton(){
		
	}
	//����ͬ������
	public static SynSingleton getInstance(){
		if (instance == null){
			synchronized(SynSingleton.class){//����ͬ������
				if(instance == null){//���Ƿ�null�ٴ��ж�
			instance = new SynSingleton();
			}
			}
		}
		return instance;
	}
}
