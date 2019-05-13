/**
 * 
 */
package com.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kiran Kanaparthi
 * 
 * This class sorts the input using BubbleSort
 * We start the beginning of the array, and  swap the 
 * first two elements, if the first is greater than the 
 * second, Then We go the next pair, and make swaps as needed
 * until the Array is sorted.
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] input = new int[]{3,5,7,2,8,9,1};
		
		System.out.println(" Before Sorting the Elements are ");
		System.out.println(Arrays.toString(input));
		Arrays.stream(input).forEachOrdered(System.out::println);
		input = bubbleSort.bubbleSortElements(input);
		System.out.println("\n\n\n After Sorting the Elements are ");
			Arrays.toString(input);
		int[] response = bubbleSort(input);
		System.out.println(Arrays.toString(response));
		String in ="ab";
//		List<String> allPermutations = bubbleSort.
//				printAllPermutations("",in,new ArrayList<String>());
		bubbleSort.printAllPerm("",in,new ArrayList<String>()).stream().
			forEach(element->System.out.println(element));
//		System.out.println("\n=====================================\n");
//		allPermutations.forEach(elem->System.out.println(" "+elem));
	}

	
	private static int[] bubbleSort(int[] elements) {
		if(elements!=null && elements.length>0) {
			for(int i=0;i<elements.length-1;i++) {
				for(int j=0;j<elements.length-i-1;j++) {
					if(elements[j]>elements[j+1]) {
						int temp = elements[j];
						elements[j] = elements[j+1];
						elements[j+1] = temp;
					}
				}
			}
		}
		return elements;
	}
	
	
	private List<String> printAllPerm(String prefix,String suffix,List<String> allItems) {
		if(suffix==null || suffix.length()==0) {
			allItems.add(prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String print = suffix.substring(0,i)+suffix.substring(i+1);
				printAllPerm(prefix+suffix.charAt(i), print, allItems);
			}
		}
		return allItems;
	}
	
	
	private List<String> printAllPermutations(String prefix,String suffix,
			List<String> allStrings) {
		if(suffix==null || suffix.length()==0) {
			allStrings.add(prefix+suffix);
		} else {
				 for(int i=0;i<suffix.length();i++) {
					 String s = suffix.substring(0, i)+
							 suffix.substring(i+1,suffix.length());
					 printAllPermutations(prefix+suffix.charAt(i),
							 s,allStrings);
				 }
		}
		return allStrings;
	}
	
	
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] bubbleSortElements(int input[]) {
		if(input!=null) {
			for(int i=0;i<input.length-1;i++) {
				for(int j=0;j<input.length-1-i;j++) {
					if(input[j]>input[j+1]) {
						int temp = input[j+1];
						input[j+1] = input[j];
						input[j] = temp;
					}
				}
				System.out.println("After Each Iteration, the Elements are "+
						Arrays.toString(input));
			}
		}
		return input;
	}
}
