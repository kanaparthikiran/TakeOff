/**
 * 
 */
package com.datastructures.array;


/**
 * @author kkanaparthi
 *
 */
public class FindConsecutiveNumberCountInArray {


	private int findConsecutiveNumbersCount(String binaryString) {
		int count = 0;
		int currentCount = 1;
		char result=' ';
		if(binaryString!=null && binaryString.length()>0) {
			for(int i=0;i<binaryString.length();i++) {
				if(i<binaryString.length()-1 &&
						binaryString.charAt(i)=='1' && binaryString.charAt(i+1)=='1') {
					currentCount++;
				} else {
					if(currentCount>count){
						count = currentCount; 					
					}
					currentCount = 1;
				} 
			}
		}
		
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindConsecutiveNumberCountInArray findConsecutiveNumberCountInArray =
				new FindConsecutiveNumberCountInArray();
		int consectuveNumbersCount  =
				findConsecutiveNumberCountInArray.
				findConsecutiveNumbersCount("00");
		System.out.println(" consectuveNumbersCount   "+consectuveNumbersCount);
		
	    int numberOfOnes =	findConsecutiveNumberCountInArray.findOccurences("0000001111");
	    System.out.println(" number of one's are "+numberOfOnes);
	}

	
	private int findOccurences(String input) {
		int count = 0;
		int currentCount  = 1;
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				if(i<input.length()-1  && input.charAt(i)=='1' && input.charAt(i+1)=='1') {
					currentCount++;
				} else {
					if(currentCount>count) {
						count = currentCount;
					}
					currentCount = 1;
				}
			}
		}
		return count;
	}
	
	
}
