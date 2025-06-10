package javaBasics;

public class IcrementAndDecrementOperaoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pre increment
		int i = 1;
		int j = ++i;

		System.out.println("The i value is"+i);
		System.out.println("The j value now is "+j);


		// Post increment

		int a = 1;
		int b= a++;


		System.out.println("The a value is"+a);
		System.out.println("The b value now is "+b);


		// pre decrement 

		int c = 2;
		int d = --c;


		System.out.println("The c value is"+c);
		System.out.println("The d value now is "+d);


		//post decrement 

		int e = 2;
		int f = e--;

		System.out.println("The c value is"+e);
		System.out.println("The d value now is "+f);

	}


}
