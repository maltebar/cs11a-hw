public class Dates{
	public static void main(String[] args){
		System.out.println(daysApart(1,1,2014,1,20,2014)); //equals 19
		System.out.println(daysApart(1,20,2014,1,1,2014)); //equals 19
		System.out.println(daysApart(1,1,1897,1,1,1898)); //equals 365          
		System.out.println(daysApart(2,30,1897,1,1,1898)); //equals -1
		System.out.println(daysApart(1,1,2000,1,2,2000)); //equals 1
		System.out.println(daysApart(1,1,2001,12,31,2001)); //equals 364
		System.out.println(daysApart(12,31,2002,1,1,2003)); //equals 1
		System.out.println(daysApart(10,10,1897,10,10,2014)); //equals 42733
		System.out.println(daysApart(5,2,1843,6,14,1945)); //equals 37298
		System.out.println(daysApart(5,30,1859,3,23,2064)); //equals 74808
		System.out.println(daysApart(2,14,1807,5,8,2183)); //equals 137415
		System.out.println(daysApart(2,14,1807,2,14,1807)); //equals 0
		
	}
	
	public static boolean isLeapYear(int year){
		if(year%4 == 0 && (year%100 != 0 || year%400==0)){//check if given year is a leap year
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int daysInMonth(int month, int year){
		if(month==4 || month==6 || month==9 || month== 11){ //months with 30 days
			return 30;
		}
		else if(month==2){ //for Feb you must check if it's a leap year
			return daysInMonth(month,isLeapYear(year));
		}
		else{ //all other months have 31 days
			return 31;
		}
	}
	
	public static int daysInMonth(int month, boolean isLeap){
		if(isLeap){ // returns appropriate number of days for Feb in leap year
			return 29;
		}
		else{
			return 28;
		}
	}
	
	public static boolean isValid(int month, int day, int year){ //checks if date is valid
		if(month>=1 && month<=12 && day>=1 && day<=daysInMonth(month,year) && year>=0){
			return true; //months btwn 1&12, days btwn 1&days in that month/yr, year is positive
		}
		else{
			return false;
		}
	}
	
	public static int daysInYear(int year){ //returns number of days in a given year
		if(isLeapYear(year)){
			return 366;
		}
		else{
			return 365;
		}
	}
	
	public static int dayOfYear(int month, int day, int year){
		int sumOfDays = 0; 
		for(int i=1; i<month; i++){ //adds up days from 1/1 to month before current month
			sumOfDays = sumOfDays + daysInMonth(i,year);
		}
		sumOfDays = sumOfDays + day; //adds in the days in the current month
		return sumOfDays;
	}
	
	public static int daysToEndOfYear(int month, int day, int year){ //days from current date to end 
		return daysInYear(year) - dayOfYear(month, day, year);
	}
	
	public static boolean isBefore(int m1, int d1, int y1, int m2, int d2, int y2){
		if(y1<y2){ //checks if year 1 is before year 2
			return true;
		}
		else if(y1>y2){ //checks if year 2 is before year 1
			return false;
		}
		else{ //this is the case if the years are equal
			if(m1<m2){ //checks if month 1 is before month 2
				return true;
			}
			else if(m1>m2){ //checks if month 2 is before month 1
				return false;
			}
			else{ //this is the case if years and months are equal
				if(d1<d2){ //checks if day 1 is before day 2
					return true;
				}
				else{
					return false;
				}
			}
		}
	}
	
	public static int daysApart(int m1, int d1, int y1, int m2, int d2, int y2){
		if(isValid(m1,d1,y1) && isValid(m2,d2,y2)){ //checks if both dates are valid
			if(m1==m2 && d1==d2 && y1==y2){ //if the dates are the same, return 0
				return 0;
			}
			if(isBefore(m1,d1,y1,m2,d2,y2)){ //checks if date 1 is before date 2
				int totalDaysApart = 0;
				if(y1!= y2){ //if they're not in the same year
					for(int i=y1+1; i<y2; i++){ //sum days of in between years
						totalDaysApart = totalDaysApart + daysInYear(i);
					}
				totalDaysApart = totalDaysApart + daysToEndOfYear(m1,d1,y1) + dayOfYear(m2,d2,y2);
				return totalDaysApart;
				}
				else{ //if they're in the same year find the days between them
					totalDaysApart = daysToEndOfYear(m1,d1,y1) - daysToEndOfYear(m2,d2,y2);
					return totalDaysApart;
				}
			}
			else{ //if date 1 isn't before date 2, call method with dates switched
				return daysApart(m2,d2,y2,m1,d1,y1);
			}
		}
		else{ //if both dates aren't valid, return -1 for invalid input
			return -1;
		}
	}
					
		
}
