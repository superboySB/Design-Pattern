package com.Creational.SingletonPattern;

//这是比较基础的自身调用实例化的小例子，还没有单例模式
public class SingleObject {
	
	private static SingleObject instance =new SingleObject();
	
	//让构造函数为private属性，这样该类就不会被实例化
	private SingleObject() {}
	
	//获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void ShowMessage() {
		System.out.println("Hello World!");
	}
	
}
