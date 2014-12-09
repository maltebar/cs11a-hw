/**
 * PA07: Pretty Printer
 * Expects to see the name of a Java file as args[0] when it's called
 * and reads the program and writes to a file called indentedprogram.txt
 * It appropriately indents the java file, adding 4 spaces after an open curly brace
 * and decreasing 4 spaces after a closed curly brace.
 * 
 * Author: Maria Altebarmakian
 * Due: 12/4/2014
**/

import java.util.Scanner;
import java.io.*;

public class PrettyPrinter{
	public static void main(String[] args){
		Scanner input; 
		PrintWriter output;
		try{
			input = new Scanner(new File(args[0])); 
			output = new PrintWriter(new File("indentedprogram.txt"));
		}catch(FileNotFoundException e){
			System.out.printf("The file %s does not exist\n", args[0]);
			return; 
		}
		trimWhiteSpace(input, output);
	}
	
	public static void trimWhiteSpace(Scanner input, PrintWriter output){
        //Method to remove all whitespace before and after a line
		while(input.hasNext()){
			String line = input.nextLine();
			String trimmedLine = line.trim();
			addSpaces(trimmedLine, output);
		}
		output.close();
	}
	
	public static int NUMOFSPACES = 0; //Global variable keeping track of indentation
	
	public static void addSpaces(String line, PrintWriter output){
        //Method to add appropriate number of spaces based on NUMOFSPACES variable
        //Decrements early for a line starting with a closed curly brace,
        //otherwise increments/decrements after print
        
		String extraSpaces = "";
        if(line.length() >0 && line.charAt(0) == '}'){
            NUMOFSPACES = NUMOFSPACES - 4;
        }
        for(int i = 0; i<NUMOFSPACES; i++){
			extraSpaces = extraSpaces + " ";
		}
        output.println(extraSpaces + line);
		if(line.contains("{")){
			NUMOFSPACES = NUMOFSPACES + 4;
		}
		else if(line.contains("}") && line.charAt(0) != '}'){
			NUMOFSPACES = NUMOFSPACES - 4;
		}
	}
		
}
