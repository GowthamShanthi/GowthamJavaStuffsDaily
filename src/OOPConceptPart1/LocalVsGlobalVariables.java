package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	
	//lobal variable or class variable
	
	String name = "Tom";
	
	int age = 25;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int i =10; //local var for main method

System.out.println(i);

int g =10;

LocalVsGlobalVariables obj = new LocalVsGlobalVariables();


int k =  obj.sum(g);
System.out.println(k);


		
		

	}

	
	public int sum(int a) {
		
		//local variable for sum method
		int i =15; 
		int j = 20;
		
		return i;
		
	}
	
}

