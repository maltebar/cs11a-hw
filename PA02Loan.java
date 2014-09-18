/**
 * This prints out the details of a loan payment
 * Author: Maria Altebarmakian 
 * Date: 9/28/2014 
 **/


public class PA02Loan {
	public static void main(String[] args) {
		double p = 30000 ;
		double i = 6.5 ;
		int n = 60 ;
		double r = 1 + (i/1200) ;
		double a = p*((r-1)/(1-(Math.pow(r,(-n))))) ;
		double totalInterest = a*n-p ;

		
		System.out.println("Loan Amount: $" + p) ;
		System.out.println("Number of Months: " + n) ;
		System.out.println("Annual Interest rate: " + i) ;
		System.out.println("Monthly Payment on Loan will be $" + a) ;
		System.out.println("The total interest paid will be $" + totalInterest) ;
	}
}

