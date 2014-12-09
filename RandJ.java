/**
 * PA07: Romeo and Juliet Concordance Generators
 * Prompts the user for a word or phrase and finds every line in Romeo and Juliet
 * containing that phrase and prints it out on the console, preceded by the line number.
 * It also prints it into a file called log.txt
 *
 * Author: Maria Altebarmakian
 * Due: 12/4/2014
 **/

import java.net.URL;
import java.io.*;
import java.util.*;

public class RandJ{

    public static void main(String[] args){
        boolean stillSearching = true;
        while(stillSearching){
            Scanner console = new Scanner(System.in);
            System.out.println("Which word or phrase do you want to look for?");
            String searchWord = console.nextLine();
            
            String[] lines = getInput();
            String[] matches = findMatches(searchWord, lines);
            int[] lineOfMatch = findLineNumberOfMatch(searchWord, lines);
            
            printMatches(searchWord, matches, lineOfMatch);
            System.out.println("Do you want to look for another word? (yes or no)");
            if(console.next().equals("no")){
                stillSearching = false;
            }
        }
    }

    
    public static String[] getInput(){
        //Sets up the file to be read line by line and returns an array of Strings
        Scanner scanRandJ;
        try {
            URL gutenbergURL = new URL("http://moore.cs-i.brandeis.edu/CS11aAut14/RandJ.txt");
            scanRandJ = new Scanner(gutenbergURL.openStream());
        }catch(IOException e){
            System.out.println("The file isn't there"+e);
            return null;
        }
        
        String[] lines = new String[1000000];
        int nextIndex = 0;
        
        while(scanRandJ.hasNext() && nextIndex < lines.length){
            lines[nextIndex++] = scanRandJ.nextLine();
        }
        
        return Arrays.copyOfRange(lines,0,nextIndex);
    }
    
    
    public static String[] findMatches(String searchWord, String[] lines){
        //Checks each line to see if it contains the search word
        //If it does, it adds it to an array of matches and returns that array
        String[] matchesArray = new String[1000000];
        int positionInMatchArray = 0;
        for(int i = 0; i< lines.length; i++){
            if(lines[i].contains(searchWord)){
                matchesArray[positionInMatchArray++] = lines[i];
            }
        }
        return Arrays.copyOfRange(matchesArray,0,positionInMatchArray);
    }
    
    public static int[] findLineNumberOfMatch(String searchWord, String[] lines){
        //Finds and stores the line numbers of matches into an array
        int[] matchLines = new int[1000000];
        int nextIndex = 0;
        for(int i = 0; i< lines.length; i++){
            if(lines[i].contains(searchWord)){
                matchLines[nextIndex++] = i+1;
            }
        }
        return Arrays.copyOfRange(matchLines,0,nextIndex);
    }
    
    public static void printMatches(String searchWord, String[] matches, int[] lineOfMatch){
        //Prints out the matches with line numbers to the console and log.txt file
        PrintStream output;
        try{
            output = new PrintStream(new File("log.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Can't print to file"+e);
            return;
        }
        for(int i=0; i<matches.length; i++){
            System.out.printf("%10d %s\n", lineOfMatch[i],matches[i]);
            output.printf("%10d %s\n", lineOfMatch[i],matches[i]);
        }
        
        System.out.printf("Found %d occurrences of %s\n", matches.length, searchWord);
        output.printf("Found %d occurrences of %s\n", matches.length, searchWord);
    }
    
    
}

