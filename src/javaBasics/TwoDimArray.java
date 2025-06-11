package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object  x [][] = new Object [3][4];

		
// first row		
x[0][0] = "Namachivaya";

x[0][1] = "Vaalga";

x[0][2] = "Naathan";

x[0][3] = "Thaal";



// Second row

x[1][0]=  "Vaalga";
x[1][1]=  "Thiruchitrambalam";
x[1][2]=  "Namachivaya";

System.out.println("The total no of row is "+x.length);

System.out.println("The tyotal numbert of column is"+x[1].length);



for(int row=0;row<x.length;row++) {
	
	for(int col=0;col<x[1].length;col++)
	{
		System.out.println(x[row][col]);
	}

}
 
		
		


		

	}

}
