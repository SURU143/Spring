package com.basic;

public class SuperKeyword {
	
	public static void main(String[] args) {
		SuperKeyword s= new SuperKeyword();
		B obj= s.new B();
		obj.show(30);
	}
class A {
	
	int a=10;
}
class B extends A{
	int a=20;
	void show(int a){
		
		System.out.println(this.a);
	}
}
}
