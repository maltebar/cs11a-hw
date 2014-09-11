/**
 * This prints out the lyrics to the Twelve Days of Christmas
 * Author: Maria Altebarmakian 
 * Date: 9/16/2014 
 **/

public class PA01 {
	public static void main (String[] args) {
		firstDay() ;
		secondDay() ;
		thirdDay() ;
		fourthDay() ;
		fifthDay() ; 
		sixthDay() ;
		seventhDay() ;
		eighthDay() ; 
		ninthDay() ;
		tenthDay() ;
		eleventhDay() ;
		twelfthDay() ;
	}
	
	public static void firstDay() {
		firstDayIntro() ;
		firstDayGiftList() ;
	}
		
	public static void secondDay() {
		secondDayIntro() ;
		secondDayGiftList() ; 
	}	
	
	public static void thirdDay() {
		thirdDayIntro() ;
		thirdDayGiftList() ;
	}
	
	public static void fourthDay() {
		fourthDayIntro() ;
		fourthDayGiftList() ;
	}
		
	public static void fifthDay() {
		fifthDayIntro() ;
		fifthDayGiftList() ;
	}
	
	public static void sixthDay() {
		sixthDayIntro() ;
		sixthDayGiftList() ;
	}
		
	public static void seventhDay() {
		seventhDayIntro() ;
		seventhDayGiftList() ;
	}
			
	public static void eighthDay() {
		eighthDayIntro() ;
		eighthDayGiftList() ;
	}
	
	public static void ninthDay() {
		ninthDayIntro() ;
		ninthDayGiftList() ;
	}
	
	public static void tenthDay() {
		tenthDayIntro() ;
		tenthDayGiftList() ;
	}
	
	public static void eleventhDay() {
		eleventhDayIntro() ;
		eleventhDayGiftList() ;
	}
	
	public static void twelfthDay() {
		twelfthDayIntro() ;
		twelfthDayGiftList() ;
	}

	public static void firstDayIntro() {
		System.out.println ("On the first day of Christmas\nmy true love sent to me") ;
	}
	
	public static void secondDayIntro() {
		System.out.println ("On the second day of Christmas\nmy true love sent to me") ;
	}
	
	public static void thirdDayIntro() {
		System.out.println ("On the third day of Christmas\nmy true love sent to me") ;
	}
	
	public static void fourthDayIntro() {
		System.out.println ("On the fourth day of Christmas\nmy true love sent to me") ;
	}
	
	public static void fifthDayIntro() {
		System.out.println ("On the fifth day of Christmas\nmy true love sent to me") ;
	}
	
	public static void sixthDayIntro() {
		System.out.println ("On the sixth day of Christmas\nmy true love sent to me") ;
	}
	
	public static void seventhDayIntro() {
		System.out.println ("On the seventh day of Christmas\nmy true love sent to me") ;
	}
	
	public static void eighthDayIntro() {
		System.out.println ("On the eighth day of Christmas\nmy true love sent to me") ;
	}
	
	public static void ninthDayIntro() {
		System.out.println ("On the ninth day of Christmas\nmy true love sent to me") ;
	}
	
	public static void tenthDayIntro() {
		System.out.println ("On the tenth day of Christmas\nmy true love sent to me") ;
	}
	
	public static void eleventhDayIntro() {
		System.out.println ("On the eleventh day of Christmas\nmy true love sent to me") ;
	}
	
	public static void twelfthDayIntro() {
		System.out.println ("On the twelfth day of Christmas\nmy true love sent to me") ;
	}
		
	public static void firstDayGiftList() {
		System.out.println ("A Partridge in a pear tree!") ;
		System.out.println() ;
	}
		
	public static void secondDayGiftList() {
		System.out.println ("Two turtle doves, and ") ;
		firstDayGiftList() ;
	}	
	
	public static void thirdDayGiftList() {
		System.out.println ("Three French hens") ;
		secondDayGiftList() ;
	}
	
	public static void fourthDayGiftList() {
		System.out.println ("Four calling birds") ;
		thirdDayGiftList() ;
	}
		
	public static void fifthDayGiftList() {
		System.out.println ("Five golden rings") ;
		fourthDayGiftList() ;
	}
	
	public static void sixthDayGiftList() {
		System.out.println ("Six geese a-laying") ;
		fifthDayGiftList() ;
	}
		
	public static void seventhDayGiftList() {
		System.out.println ("Seven Swans a-swimming") ;
		sixthDayGiftList() ;
	}
			
	public static void eighthDayGiftList() {
		System.out.println ("Eight maids a-milking") ;
		seventhDayGiftList() ;
	}
	
	public static void ninthDayGiftList() {
		System.out.println ("Nine ladies dancing") ;
		eighthDayGiftList() ;
	}
	
	public static void tenthDayGiftList() {
		System.out.println ("Ten lords a-leaping") ;
		ninthDayGiftList() ;
	}
	
	public static void eleventhDayGiftList() {
		System.out.println ("Eleven pipers piping") ;
		tenthDayGiftList() ;
	}
	
	public static void twelfthDayGiftList() {
		System.out.println ("Twelve drummers drumming") ;
		eleventhDayGiftList() ;
	}
	
}
