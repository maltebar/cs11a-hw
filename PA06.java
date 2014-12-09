/** 
 *  PA06: test problems for quiz 3
 *  Author: Maria Altebarmakian
 *  Groupmates: Can Nahum and Solomon Garber
 *  Due: 11/13/14
**/

import java.util.Arrays;
import java.util.Scanner;

public class PA06{
	public static void main(String[] args){
		/**tests for endsOfArray method**/
		int[] endsArrayTest1 = {1,2,3};
		int[] endsArrayTest2 = {2,4,6};
		int[] endsArrayTest3 = {100,200,300};
		int[] endsArrayTest4 = {3,5,7,9};
		System.out.println(Arrays.toString(endsOfArray(endsArrayTest1)));
		System.out.println(Arrays.toString(endsOfArray(endsArrayTest2)));
		System.out.println(Arrays.toString(endsOfArray(endsArrayTest3)));
		System.out.println(Arrays.toString(endsOfArray(endsArrayTest4)));
		
		/**tests for numEvens **/
		int[] numEvensTest1 = {1,2,3,4,5};
		int[] numEvensTest2 = {2,2,2,2};
		int[] numEvensTest3 = {1,1,3,5,7,9};
		int[] numEvensTest4 = {1111,2342,23526};
		System.out.println(numEvens(numEvensTest1));
		System.out.println(numEvens(numEvensTest2));
		System.out.println(numEvens(numEvensTest3));
		System.out.println(numEvens(numEvensTest4));
		
		/**tests for mathBot **/
		mathBot();
		
	}
	
	public static int[] endsOfArray(int[] nums){
		/** Question 61: Given an array, write a method that returns an array with the 
		first and last numbers in the original array. **/
		
		int[] firstAndLast = new int[2];
		firstAndLast[0] = nums[0]; //find and save the first element of array
		firstAndLast[1] = nums[nums.length-1]; //find and save the last element of array
		return firstAndLast;
	}
	
	public static int numEvens(int[] nums){
		/** Question 58: Write a method that returns the number of even entries 
		in an integer array. **/
		int numOfEvens = 0; 
		for(int i=0; i<nums.length; i++){
			if(nums[i] % 2 == 0){ //check if an element of an array is divisible by 2
				numOfEvens = numOfEvens + 1;
			}
		}
		return numOfEvens;
	}
	
	public static void mathBot(){
		/** Question 314: Write a class that will print out the following: 
		Hello my name is Apple Macintosh. I am a program that multiplies for you!
		Then prompt the user to type in the amount of numbers that they want to multiply. 
		Then have the program multiply all of the numbers together. **/
		
		System.out.println("Hello my name is Apple Macintosh.");
		System.out.println("I am a program that multiplies for you!");
		Scanner console = new Scanner(System.in);
		System.out.println("How many numbers would you like to multiply together?");
		int numberOfNums = console.nextInt(); //ask user for number of numbers being multiplied
		double multipliedNumbers = 1;
		for(int i=1; i<=numberOfNums; i++){
			System.out.printf("What is number %d?\n", i);
			double nextNum = console.nextDouble();
			multipliedNumbers = multipliedNumbers * nextNum; //multiply the numbers, running total
		}
		System.out.println("Multiplicative total = " + multipliedNumbers);
	}

}
