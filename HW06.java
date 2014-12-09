/**
 * Practice problems for Quiz 2
 * Author: Maria Altebarmakian 
 * Checked by: Solomon Garber and Can Nahum
 **/

import java.util.Scanner;

public class HW06{
	public static void main(String[] args){
		testProblem2();
		testProblem491();
        testProblem492();
        testProblem191();
        testProblem137();
        testProblem447();

	}
	
	public static void testProblem2(){
		System.out.println(capitalize("hello world"));
		System.out.println(capitalize("HELLO WORLD"));
		System.out.println(capitalize("hello"));
		System.out.println(capitalize("The rise and fall of the roman empire"));
	}
	
	public static void testProblem491(){
		System.out.println(wordChecker("Jump the shark"));
		System.out.println(wordChecker("Jump"));
		System.out.println(wordChecker("I love computer science!"));
		System.out.println(wordChecker("Java!"));
	}
    
    public static void testProblem492(){
        System.out.println(palindromeChecker("racecar"));
        System.out.println(palindromeChecker("jump"));
        System.out.println(palindromeChecker("birthday"));
        System.out.println(palindromeChecker("kayak"));
    }
	
    public static void testProblem191(){
        System.out.printf("you have $%.2f\n",convertMoney(5,10));
        System.out.printf("you have $%.2f\n",convertMoney(3,7));
        System.out.printf("you have $%.2f\n",convertMoney(0,0));
        System.out.printf("you have $%.2f\n",convertMoney(100,250));
    }
    
    public static void testProblem137(){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the number of dollars you'd like to convert");
        double dollars = console.nextDouble();
        System.out.printf("that is equal to %.2f euros\n",convertToEuro(dollars));
    }
    
    public static void testProblem447(){
        System.out.println(convertYearstoDays(5));
        System.out.println(convertYearstoDays(55));
        System.out.println(convertYearstoDays(20));
        System.out.println(convertYearstoDays(0));
    }
    
	public static String capitalize(String s){ // Problem 2: Write a method that takes a sentence and converts it into title form where the first letter of each word is Capitalized. You can assume that there is exactly one space before each word, except the first.
		String capitalizedString = s.substring(0,1).toUpperCase(); //capitalize the first letter
		for(int i=1; i<s.length(); i++){
			if(s.charAt(i-1) == ' '){ //if you're at the beginning of a new word, capitalize the first letter
				capitalizedString = capitalizedString + s.substring(i,i+1).toUpperCase();
			}
			else{
				capitalizedString = capitalizedString + s.substring(i,i+1).toLowerCase();
			}
		}
		return capitalizedString;
	}

	
	public static String wordChecker(String s){ //Problem 491: Write a method which tells you if a string contains more than one word.
		if(s.indexOf(' ') != -1){ //if there are spaces, there is more than one word
			return "There is more than one word!";
		}
		else{
			return "Only one word";
		}
	}
	
    public static String palindromeChecker(String s){ //Problem 492: Write a problem which checks if a string is a palindrome.
        String reversedString = "";
        for(int i = s.length()-1; i>=0; i--){ //create a reversed string of the original
            reversedString = reversedString + s.charAt(i);
        }
        if(s.equals(reversedString)){ //if the reversed string and the original string are the same, you have a palindrome
            return "this is a palindrome!";
        }
        else{
            return "not a palindrome!";
        }
    }
    
    public static double convertMoney(int quarters, int dimes){ // Problem 191: Write a method that changes numbers of quarters and dimes into a total monetary value
        double totalMoney = quarters * .25 + dimes* .1; //calculate how much money you have from the number of quarters and dimes you have
        return totalMoney;
    }
    
    public static double convertToEuro(double dollars){ //Problem 137: Write a method to convert a dollar amount to a euro amount where the user should be prompted for and must input the dollar amount to convert. Monetary amounts should print with two decimal places.
        double euros = dollars * 0.7920416; //convert dollars to euros
        return euros;
    }
    
    public static int convertYearstoDays(int years){ //Problem 447: Write a method which converts years (an int) to days (excluding leap years).
        int days = years * 365; //calculate days from years
        return days;
    }

}
