package com.Creational.SingletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		Singleton object=Singleton.getSingleton();
		object.ShowMesage();
	}
}
