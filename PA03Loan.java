/**
 * This prints out the details of a loan payment
 * Author: Maria Altebarmakian 
 * Date: 10/7/2014 
 **/

import java.util.Scanner;
 
public class PA03Loan {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the amount of the loan: "); 
		double p = console.nextDouble(); 
		System.out.println("Please enter the annual interest rate: ");
		double i = console.nextDouble(); 
		System.out.println("Please enter the term of the loan (in months): ");
		int n = console.nextInt();
		calculateLoan(p,i,n);
	}
	
	public static void calculateLoan(double p, double i, int n){
		double r = 1 + (i/1200); //calculate r for amortization formula
		double a = p*((r-1)/(1-(Math.pow(r,(-n))))); //calculate amortization payment
		double totalInterest = a*n-p; //calculate total interest paid over the loan

		System.out.println("For a loan of $"+p+" dollars paid back over "+n);
		System.out.println("months at "+i+"% annual interest rate,");
		System.out.format("the monthly payment will be $%.2f and the total cost",a);
		System.out.format("\nof the loan will be $%.2f + $%.2f",p,totalInterest);
		System.out.println("\n\nThank you!");
	}
}

