  package OOPConceptPart1;

public class MethodOverloadingExample {
	

//	Main method can be overloaded - But we never overlaod main method	
	
public static void main(String[] args,int a ) {
	
	System.out.println("This is overloaded main method");
	
	
	
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.out.println("Namachivaya Vaalga");
	
	
	MethodOverloadingExample obj = new MethodOverloadingExample();
	obj.sum();
	obj.sum(10);
	obj.sum(20, 30);
		

	}
	
	
	//we can overload main method also 
	//you cannot create a method inside a method
	//duplicate methods - ie same method with same number of arguments are not allowed
	
	
	//method overloading --> when the method name is same with different arguments or parameters within the same class 
	
	
	
	
	public void sum() {
		
		System.out.println("SUM method with zero param");
		
		
		
	}
	
	public void sum(double d) {
		
		System.out.println("SUM method with --1  param");
		
		
		
	}
	
	

	
public void sum(int k, int l) {
		
		System.out.println("SUM method with -2  param");
		System.out.println(k+l);
		
		
		
	}
	

	


}
