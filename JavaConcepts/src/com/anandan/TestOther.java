package com.anandan;

public class TestOther {
	
	class A {
		A(){
			System.out.println("A");
		}
		A me() {
			return this;
		}
	 
		public void doA() {
			System.out.println("Do A");
		}
	}
	 
	class B extends A {
		B(){
			System.out.println("B");
		}
		public void doB() {
			System.out.println("Do B");
		}
	}
	public static void main(String[] args) {
		Test t=new Test();
		(
				(B)t.new B().me().doB();
	}

}
