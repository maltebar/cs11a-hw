/**
 * Practice problems for HW08
 * Author: Maria Altebarmakian 
 * Checked by: Can Nahum
 * Date: 11/2/14
 **/


public class Solution{
	public static void main(String[] args){
		int test = 12;
		System.out.printf("%d has %d factors\n", test, countFactors(test)); //tests countFactors
		
		int[] numbers = {1,-1,3,5,-2};
		System.out.println(minimumElement(numbers)); //test minimumElement
	}
	
	public static int countFactors(int num){ 
		
		/**Write a method that takes in an integer as a parameter and 
		returns the number of factors that integer has. testing: cumulative sums
		**/

		int numberOfFactors = 0;
		for(int i=1; i<=num; i++){
			if(num%i == 0){
				numberOfFactors = numberOfFactors + 1;
			}
		}
		return numberOfFactors;
	}
	
	
	public static int minimumElement(int[] numbers){
		
		/**Write a method that takes in an integer array and 
		returns the smallest element of that array. testing: arrays
		**/
		
		int currentMinimum = numbers[0];
		for(int i=0; i<numbers.length; i++){
			if(numbers[i] < currentMinimum){
				currentMinimum = numbers[i];
			}
		}
		return currentMinimum;
	}
	
}
