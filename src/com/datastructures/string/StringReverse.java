/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class StringReverse {


	
	/**
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		StringReverse stringReverse = new StringReverse();
		String result = stringReverse.getReverse("Hello");
		System.out.println(" The result is "+ result);
		
		int factorialResult  = stringReverse.factorial(5);
		System.out.println(" factorialResult  is "+factorialResult);
		int factorialIterative = stringReverse.factorialIterative(5);
		System.out.println(" factorialIterative  "+ factorialIterative);
		stringReverse.printFiboNumbersIterative(10);
		int n1=1,n2=1,n3=0;
		System.out.print("\n From here "+n1+" "+n2+" ");
		for(int x=2;x<10;x++) {
			System.out.print("  "+stringReverse.printFiboRecursive(x));
		}
		
		 String original = "edcba";
		 int j=0;
		   char temp=0;
		 
		     char[] chars = original.toCharArray();
		     for (int i = 0; i <chars.length; i++) {
		         for ( j = 0; j < chars.length; j++) {
		         if(chars[j]>chars[i]){
		             temp=chars[i];
		             chars[i]=chars[j];
		              chars[j]=temp;
		          }
		     }
		  }
		 
		    for(int k=0;k<chars.length;k++){
		    System.out.println("\n"+chars[k]);
		   }
		    
		    

		    Integer i1 = 128;
		  
		    Integer i2 = 128;
		  
		      System.out.println(i1 == i2);
		  
		    Integer i3 = 127;
		    Integer i4 = 127;
		    
		    int aa[] =null;
		    int bb[] = null;
		    bb=aa;
		  String s = "a";
		  s.length();
		       System.out.println(i3 == i4);
	}
	
	

	
	/**
	 * This method prints the Fibonacci 
	 * numbers Iteratively
	 * 
	 */
	private void printFiboNumbersIterative(int maxLimit) {
		int a=1,b=1,n3=0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<maxLimit;i++) {
			n3 = a+b;
			System.out.print(n3+" ");
			a = b;
			b = n3;
		}
	}
	
	/**
	 * This method prints the Fibonacci numbers in 
	 * recursive format
	 * 
	 * @param maxValue
	 */
	private int printFiboRecursive(int maxValue) {
		if(maxValue<=1) {
			return maxValue;
		} else {
			return printFiboRecursive(maxValue-1)+
					printFiboRecursive(maxValue-2);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private String getReverse(String input) {
		String reverseString;
		if(input==null || input.length()==0) {
			return input;
		} else {
			reverseString = getReverse(input.substring(1))+input.charAt(0);
			System.out.println(" Reverse String at each Point "+ reverseString
					+" input.substring(1) "+input.substring(1));
		}
		return reverseString;
	}
	
	
	private int factorialIterative(int number) {
		int result = 1;
		if(number<=0) {
			return 1;
		} else {
			for(int i=1;i<=number;i++) {
				result = result*i;	
				System.out.println(" Result Calculated as "
						+ result+" number "+number);
			}
		}
		return result;
	}
	
	private int factorial(int fact) {
		if(fact<=0) {
			return 1;
		} else {
			return fact*factorial(fact-1);
		}
	}
}
