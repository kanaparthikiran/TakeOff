/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
public class AllPermutationsOfString {

	private static int counter = 0;
		  public static void main(String args[]) {
		//	  permuteString("", "ab");
		     int counter = 0;
		   permutation("abc");
		  }

		  public static void permuteString(String beginningString, String endingString) {
		    if (endingString.length() == 0)  {
		    	//System.out.println("Base Case " +beginningString + endingString);
		    	//return beginningString + endingString;
		    }
		    else {
			      for (int i = 0; i < endingString.length(); i++) {
			        try {
			          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
			          
			   //       System.out.println("new String at step "+i+" is "+newString);
			          
			          permuteString(beginningString + endingString.charAt(i), newString);
			        } catch (StringIndexOutOfBoundsException exception) {
			          exception.printStackTrace();
			        }
			      }
		    	}
		}
		  
		  
		  public static void permutation(String str) { 
			    permutation("", str); 
			}

			private static void permutation(String prefix, String str) {
			    int n = str.length();
			    counter++;
			    if (n == 0) System.out.println(prefix+" counter "+counter);
			    else {
			        for (int i = 0; i < n; i++)
			            permutation(prefix + str.charAt(i), str.substring(0, i) 
			            		+ str.substring(i+1, n));
			    }
			}
}

