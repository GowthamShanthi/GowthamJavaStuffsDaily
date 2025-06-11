package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array - To store data with similar data types

		//Dis-advantage 
		// Size is limited,- This can be covered in COllections 
		// The size is fixed - This can be covered in Object array


		//int array

		int i [] = new int[5];
		i[0] = 1;
		i[1] =2;
		i[2] =20;
		i[3] =200;
		i[4] =2000;

		System.out.println("The first value in the array is \t"+i[0]);

			
		String st[] = new String[5];
		
		st[1] = "This is first string";
		st[2] = "This is second string";
		st[3] = "This is third string";
		st[4] = "This is fourth string";
		st[0] = "This is Zero value   string";
		
		

	for(int j=0;j<st.length;j++)
	{
		
		System.out.println("The string value now is "+st[j]);
		
	}
		
		
// Object array 
	
	Object objarr[] = new Object[5];
	
	objarr[0] = "This is first value in object array";
	
	objarr[1] = 10;
	
	objarr[3] = 12.44;
	
	objarr[2] = 12.99f;
	
	objarr[4] = 19d;
	
	for (int k=0;k<=objarr.length-1;k++ )
	{
		System.out.println("This is object array value now"+objarr[k]);
	}
	
	System.out.println();
	

	
	
	








	}

}
