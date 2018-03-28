/**
 * 
 */
package com.test.array;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author kkanaparthi
 *
 */
public class DuplicatesFromASortedArray {



	
	  private int a;
	  public double b;
	  
	  public DuplicatesFromASortedArray(int first, double second)
	  {
	    this.a = first;
	    this.b = second;
	  }
//	  public static void main(String[] args)
//	  {
		
	  //}
	  
	  
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] removeDuplicates(int[] input) {
		int i=1;int j=0;
		int[] output = null;
		if(input==null || input.length<=2) {
			return input;
		} else {
			while(i < input.length){
	            if(input[i] == input[j]){
	            	System.out.println(" Match Found with the "
	            			+ "elements to next input[i] "
	            			+input[i]+" input[j]"+ input[j]);
	                i++;
	            } else {
	                input[++j] = input[i++];
	                System.out.println(" j "+j+" i "+i);
	            }    
	        }
			output = new int[j+1];
	        for(int k=0; k<output.length; k++){
	            output[k] = input[k];
	        }
		}
		return output;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] removeDeplicatesSortedArrray(int[] input) {
		int output[] = null;
		if(input!=null && input.length>0) {
			if(input.length==1) {
				return input;
			}
			int j=0;
			output = new int[input.length];
			for(int i=0;j<input.length-1;i++,j++) {
				if(input[i]!=input[i+1]) {
					System.out.println(" input[i] "+ input[i]
							+" and input[j] "+input[j]
							+" are duplicates ");
					output[j++] = input[i];
				} else {
					System.out.println(" The Element is Not duplicate"
							+ " so copied to the new Array "+input[i]);
//					output[i] = input[i];
				}
				
				input[j++] = input[input.length-1];

			}
		} else {
			return input;
		}
		return output;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] removeDupsUsingCollection(int input[]) {
		int[] output = null;
		Set<Integer> elemSet = new LinkedHashSet<>();
		if(input==null || input.length<=2) {
			return input;
		} else {
			for(int k=0;k<input.length;k++) {
				elemSet.add(input[k]);
			}
		}
		System.out.println("\n The Elements in the set, "
				+ " after removing duplicates are  ");
		for(Integer elem : elemSet) {
			System.out.print(elem+" ");
		}
		return output;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuplicatesFromASortedArray duplicatesFromASortedArray = 
				new DuplicatesFromASortedArray(1,2);
		
		  DuplicatesFromASortedArray c1 = new DuplicatesFromASortedArray(10, 20.5);
		  DuplicatesFromASortedArray c2 = new DuplicatesFromASortedArray(10, 31.5);
	    // lines below are changed from the question above
	    c2 = c1;   
	    c1.a = 3;
	    System.out.println(c2.a);
	    
		int[] input1 = {2,3,6,6,8,9,10,10,11,12,12};
//		Arrays.sort(input1);
//		for(int elem : input1) {
//			System.out.println(" "+ elem);
//		}
		//int[] output = duplicatesFromASortedArray.removeDuplicates(input1);
		int[] output = duplicatesFromASortedArray.removeDeplicatesSortedArrray(input1);
		System.out.println(" Got the response from the array ");
		for(int i: output) {
			System.out.print(i+" ");
		}
		//duplicatesFromASortedArray.removeDupsUsingCollection(input1);
	}
}