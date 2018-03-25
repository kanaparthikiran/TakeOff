/**
 * 
 */
package com.test.string;

import java.util.Scanner;

public class StringInterleaving {
	
	/**
	 * 
	 * @param input
	 */
	private void printChars(String input,int stringsCount,int startIndex,int increment) {
       if(stringsCount>=2) {
	        if(input!=null && input.length()>0) {
	            for(int i=startIndex;i<input.length();) {
	                if(i<input.length()) {
	                   System.out.print(input.charAt(i));
	                }
	                i=i+increment;
	            }
	        }  
          } 
	            
	      else {
	            
	        }
	}
	
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int totalStrings = scanner.nextInt();
        String nextString1 = scanner.next();
        String nextString2 = scanner.next();
        int stringsCount = totalStrings;
        StringInterleaving stringInterleaving = new StringInterleaving();
        int startIndexEven=0,incrementEven=2;
        int startIndexOdd=1,incrementOdd=2;
        
        
        stringInterleaving.printChars(nextString1, stringsCount,startIndexEven,incrementEven);
        stringInterleaving.printChars(nextString1, stringsCount,startIndexOdd,incrementOdd);

        System.out.println();
        
        stringInterleaving.printChars(nextString2, stringsCount,startIndexEven,incrementEven);
        stringInterleaving.printChars(nextString2, stringsCount,startIndexOdd,incrementOdd);

        if(scanner!=null) {
        	scanner.close();   
        }
    }
}