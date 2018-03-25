/**
 * 
 */
package com.test.arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kkanaparthi
 *
 */
public class DuplicatesFromASortedArray {

	/**
	 * 
	 */
	public DuplicatesFromASortedArray() {
	}

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
	            	System.out.println(" Match Found with the elements to next input[i] "
	            			+input[i]+" input[j]"+ input[j]);
	                i++;
	            }else{
	                input[++j] = input[i++];
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
	private int[] removeDups(int input[]) {
		int i=1;int j=0;
		int[] output = null;
		Set<Integer> elemSet = new LinkedHashSet();

		if(input==null || input.length<=2) {
			return input;
		} else {
			for(int k=0;k<input.length;k++) {
				elemSet.add(input[k]);
			}
		}
		System.out.println(" The Elements in the set are ");
		for(Integer elem : elemSet) {
		//	System.out.println("  "+elem);
			input[i] = elem;
		}
		
		for(int elem : input) {
			//	System.out.println("  "+elem);
			System.out.println("  "+elem);
			}
		return output;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuplicatesFromASortedArray duplicatesFromASortedArray = new DuplicatesFromASortedArray();
		int[] input1 = {2,3,6,6,8,9,10,10,11,12,12};
		int[] output = duplicatesFromASortedArray.removeDuplicates(input1);
		
		List<String> elem = new ArrayList<String>();
		elem.add("a");
		elem.add("1");
		elem.add("4");
		elem.forEach(name->System.out.print(name));

		for(int i: output) {
			System.out.print(i+" ");
		}
		duplicatesFromASortedArray.removeDups(input1);
	}
}