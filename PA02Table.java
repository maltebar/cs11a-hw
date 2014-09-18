/**
 * This prints out the html code for a multiplication table mod N with N=32
 * Author: Maria Altebarmakian 
 * Date: 9/28/2014 
 **/


public class PA02Table {
	public static final int N = 32 ;
	
	public static void main(String[] args) {
		System.out.println("<html>") ;
		System.out.println("<body>") ;
		System.out.println("    <h1>Multiplication table mod " + N + "</h1>") ;
		System.out.println("    <table cellpadding= '5' border='2'>") ;
		
		for (int j = 1; j <= (N-1); j++){
			System.out.print("        <tr> ") ;
			
			for (int i = 1; i <= (N-1); i++) {
				System.out.print("<td>") ;
				System.out.print((i*j)%N + "</td> ") ;
			}
			
			System.out.println("</tr>") ;
		}
		
		System.out.println("    </table>") ;
		System.out.println("<p>The value in row i and col j is (i*j)%" + N + "</p>") ;
		System.out.println("</body>") ;
		System.out.println("</html>") ;
	}
}

