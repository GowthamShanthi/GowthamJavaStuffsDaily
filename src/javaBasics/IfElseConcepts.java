package javaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String CustomerName = "John Doe";
		
		int  creditScore = 720;
		
		double income = 55000.0;
		
		boolean isEMployed = true;
		
		float debtToincome = 40f;
		
		
		//checking If the credit score is above 750
		if (creditScore > 750)
			
		{
			
			System.out.println("Loan Automatically approved as credit score is greater than 750");
			
			
		}
		
		// If the credit score is between 650 and 750, additional checks are performed below 
		
		else if(creditScore >= 650 &creditScore <=750 ) {
			
			System.out.println("Additonal checks performed  as credit score is Between 650 and 750 i.e "+creditScore);

			//Checking if  the customer’s income is at least 50,000,
			
			if (income >= 50000.0) {
				
				System.out.println("The customers income is atleast 50000.0 i.e "+income);
					
				
				//checking if  the customer is unemployed,
				
				if (isEMployed) {
					
					
					System.out.println("The customer is employeed employeed status >>> \t "+isEMployed);
				
					
					//If the customer is employed, the system checks the debt-to-income (DTI) ratio.
					
					//If the DTI ratio is less than 40%, the loan is approved.
					if (debtToincome < 40) {
						
						System.out.println("Congrats !"+CustomerName+"\tYour loan is Approved");
					}
					
					else if( debtToincome >= 40)
						
					{
						System.out.println("The loan is denied as the DTI is greater than or equal to 40 i.e " +debtToincome);
					}
				
				
				}
				
				//If the customer is unemployed, the loan is denied.
				else 
				
				{
					
					System.out.println("Customer not employeed so loan is denied ");
				}
				
				
				
				
				
			}
			
			else {
				
				System.out.println("The cutomers income is leass than 50,000, so loan is denied i.e "+ income);
			}
			
			
		}
		
		//If the credit score is below 650, the loan is denied.
		
		else if (creditScore < 650) {
			System.out.println("The loan is denied, as credit scores is less than 650");
		}
		

	}

}
