package com.Creational.SingletonPattern;

//从Singleton类中获取唯一的对象
public class SingleObjectPatternDemo {
	public static void main(String[] args) {
		//SingleObject object=new SingleObject();
		//以上构造方法不合法，因为SingleObject构造函数是private属性，不可见
		SingleObject object=SingleObject.getInstance();
		object.ShowMessage();
	}
}
