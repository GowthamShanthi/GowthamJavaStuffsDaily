package OOPConceptPart1;

import java.security.PublicKey;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.name();
		
		int g = obj.intexample();
		System.out.println(g);
		
		int k = obj.divmethod(30, 10);
		
System.out.println(k);
		
		 
		
	}
	
	//non static methods
	
	//void -- does not return any value
	
	public void name() {
		
		System.out.println("This is test mnethod");
		
	}
	
	
	//return type = int
	
	public int intexample() {
		
		
		System.err.println( "This is int example method");
		
		int a=10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}

	
	
	public int  divmethod(int x,int y) {
		
		System.out.println("This is div method");
		
		int z = x/y;
		
		return z;
		
		
		
	}
	
	

		
		
 

}
