package com.basic;

public class Basic {

	public static void main(String[] args) {
	
		Basic b=new Basic();
		Child c=b.new Child();
		c.m1();
		
       
		}
	  class Parent {
	 void m2(){
		System.out.println("Priya");
	}
	}
	 class Child extends Parent{
		  void m1(){
			super.m2();
			
		}
	
	}	
	
	}

