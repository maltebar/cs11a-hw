/**
 * This prints out the html code for a multiplication table mod N 
 * Author: Maria Altebarmakian 
 * Date: 10/7/2014 
 **/

import java.util.Scanner;
 
public class PA03Table {
	
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the PA03 Table Generator");
		System.out.println("This will generate a multiplication table modulo N.");
        System.out.println("Please enter the value of N to use for this table: ");
        int N = console.nextInt();
        drawTable(N);
        System.out.println("\nThank you!");
    }
		
	
	public static void drawTable(int N) {
		System.out.println("The html for the table is the following");
		System.out.println("<html>");
		System.out.println("<body>");
		System.out.println("    <h1>Multiplication table mod " + N + "</h1>");
		System.out.println("    <table cellpadding= '5' border='2'>");
		
		for (int j = 1; j <= (N-1); j++){ //outer for loop creates N-1 rows
			System.out.print("        <tr> ");
			
			for (int i = 1; i <= (N-1); i++) { //inner for loop creates one row of N-1 cells
				System.out.print("<td>");
				System.out.print((i*j)%N + "</td> ");
			}
			
			System.out.println("</tr>");
		}
		
		System.out.println("    </table>");
		System.out.println("<p>The value in row i and col j is (i*j)%" + N + "</p>");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}

