/**
 * 
 */
package com.test.scratchpad;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kiran Kanaparthi
 *
 */
public class BubbleSortTestAndDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSortTestAndDelete bubbleSortTestAndDelete = new BubbleSortTestAndDelete();
		int numbers [] = {7,9,1,4,6,2,0};
		int [] sortedElements =  bubbleSortTestAndDelete.sortElements(numbers);
		System.out.println(" The Numbers are "+ Arrays.toString(sortedElements));
	}

	/**
	 * 
	 * @param numbers
	 * @return
	 */
	private int[] sortElements(int[] numbers) {
		if(numbers!=null && numbers.length>0) {
			for(int i=0;i<numbers.length;i++) {
				System.out.println( "i "+i);
				for(int j=0;j<numbers.length-1;j++) {
					System.out.println(" j "+j);
					if(numbers[j]>numbers[j+1]) {
						int temp = numbers[j];
						numbers[j] =  numbers[j+1];
						numbers[j+1] = temp;
					}

				}
				List<Integer> inArrayList = 
						Arrays.stream(numbers).boxed().collect(Collectors.toList());
				
				inArrayList.forEach(name -> System.out.print("   "+ name));
			}
		}
		return numbers;
	}
	
	
}
