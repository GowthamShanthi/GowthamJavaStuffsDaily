package OOPConceptPart1;

public class Car {
	
	
	String model;
	int year;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Car() - This is the object of car class
		
		// new keyword is used to create the object 
		
		//a,b,c ----> These are object refernvce variable
		
		
		

Car a = new Car();

Car b = new Car();

Car c = new Car();



a.model = "maruthi800";
a.year = 1990;

b.model = "alto800";
b.year = 2000;

c.model = "swift";
c.year = 2010;

System.out.println("The car 'a' data is "+a.model+ "\t" +a.year);

System.out.println("The car 'b' data is "+b.model+ "\t" +b.year);

System.out.println("The car 'c' data is "+c.model+ "\t" +c.year);



a=b;
b=c;
c=a;
System.out.println(a.year);
System.out.println(b.year);
System.out.println(c.year);

a.year = 1980;
System.out.println("Now the a year is"+a.year);

c.year = 1970;

System.out.println("now the a year is"+ a.year);




int x,y,z;

x = 10;
y=20;
z = 30;

x=y;
y=z;
z=x;


System.out.println("the x , y , and z values are"+ x+y+z);

z = 40;

System.out.println("Now the value of x is"+z);


		
		
		
	}

}
