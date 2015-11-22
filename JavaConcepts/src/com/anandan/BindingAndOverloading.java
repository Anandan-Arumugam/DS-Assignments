package com.anandan;

public class BindingAndOverloading {

	  public int equalsa( BindingAndOverloading other) {
	    System.out.println( "Inside of Class-BindingAndOverloading.equals" );
	    return -1;
	  }

	  public static void main( String [] args ) {
	    Object t1 = new BindingAndOverloading();
	    Object t2 = new BindingAndOverloading();
	    BindingAndOverloading t3 = new BindingAndOverloading();
	    Object o1 = new Object();

	    int count = 0;
	    System.out.println( count++ );// prints 0
	    System.out.println(t1.equals( t2 )) ;
	    System.out.println( count++ );// prints 1
	    System.out.println(t1.equals( t3 ));
	    System.out.println( count++ );// prints 2
	    System.out.println(t3.equals( o1 ));
	    System.out.println( count++ );// prints 3
	    System.out.println(t3.equalsa(t3));
	    System.out.println( count++ );// prints 4
	    System.out.println(t3.equals(t2));
	  }
	}
