package com.anandan;

class Human{
	public void goShopping(Human a){
		System.out.println("Depends on Male/Female");
	}
}
class Male extends Human{
	//	@Override
	//	public void goShopping(Human a){
	//		System.out.println("Takes minutes");
	//	}
	public void goShopping(Male a){
		System.out.println("Takes minutes");
	}
}
class Female extends Human{
	//	@Override
	//	public void goShopping(Human a){
	//		System.out.println("Takes Years");
	//	}
	public void goShopping(Female a){
		System.out.println("Takes Years");
	}
}

public class Test {

	public static void main(String[] args) {
		//Test t = new Test();
		Human he=new Male();
		Human she=new Female();
		Female lucy=new Female();
		she.goShopping(lucy);


	}
}
