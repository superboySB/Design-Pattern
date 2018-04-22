package com.Creational.SingletonPattern;

//采用最安全高性能的DCL(double-checked locking)方法实现单例模式
public class Singleton {
	private volatile static Singleton singleton;
	private Singleton() {}
	public static Singleton getSingleton() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}
	public void ShowMesage() {
		System.out.println("Hello World!");
	}
}
