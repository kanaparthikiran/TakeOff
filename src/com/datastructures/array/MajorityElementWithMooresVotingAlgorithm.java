/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 *	This class finds the Majority Element, which occurs
 *  at least n/2 times, if no such element is present return 0
 *  
 *  First It finds the MajorityElement candidate by using the 
 *  Moore's Voting Algorithm, which assumes a default Majority
 *  Element, and iterates through all the elements of the Array.
 *  Increases the count if the same element is found, if same element
 *  is not found, the count is decreased, whenever the count becomes 0
 *  the majorityElementCandidate is replaced with the current iterating 
 *  element, and the count is also reinitialized to 1. After this iteration
 *  is completed, if an element is remaining treat that as the Majority 
 *  Element candidate.
 *  
 *  The Next steps finds out if the MajorityElement candidate is actually
 *  a MajorityElement.(It is like Primary and Major elections). Iterate 
 *  through all the elements of the Array and look for the MajorityElement
 *  candidate, if the count is greater than or equal to the n/2 then the
 *  MajorityElement candidate is the Majority Element of the Array
 *  
 */
public class MajorityElementWithMooresVotingAlgorithm {

	/**
	 * This method finds the Majority Element from 
	 * the Array
	 * 
	 * @return
	 */
	private int getMajorityElement(int[] input) {
		int candidateForMajorityElement = 0;
		int maxCountForMajorityElement =  0; 
		int elementCount = 1;
		
		if(input!=null && input.length>0) {
			candidateForMajorityElement = input[0];
			maxCountForMajorityElement =
					input.length/2;
			for(int i=1;i<input.length;i++) {
				if(input[i]==candidateForMajorityElement) {
					elementCount++;
				} else {
					elementCount--;
				}
				if(elementCount==0) {
					candidateForMajorityElement = input[i];
					elementCount = 1;
				}
			}
		}
		int totalCounts =
				findMajorityCandidateOccurancesHelper
				(input, candidateForMajorityElement);
		
		System.out.println("  elementCount  "+elementCount
				+" totalCounts "+totalCounts
				+" maxCountForMajorityElement "+maxCountForMajorityElement);

		if((totalCounts<maxCountForMajorityElement)) {
			candidateForMajorityElement = -1;
		} 
		return candidateForMajorityElement;
	}
	
	/**
	 * This method is a helper method to find
	 * the occurrences of the given number
	 * 
	 * @return
	 */
	private int findMajorityCandidateOccurancesHelper(int[] array,int element) {
		int elementCount = 0;
		if(array!=null && array.length>0) {
			for(int elem : array) {
				if(elem==element) {
					elementCount++;
				}
			}
		}
		return elementCount;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MajorityElementWithMooresVotingAlgorithm majorityElement =
				new MajorityElementWithMooresVotingAlgorithm();
		
		int [] inputGood = new int[]{1,2,2,4,5,3,2,2,2,6,2};
		int resultElement = majorityElement.getMajorityElement(inputGood);
		
		System.out.println(" The Majority Element is "+resultElement);
		
		int [] inputError = new int[]{1,2,2,4,5,3,2,2,2,6,2,1,3,4};
		int resultElementError = majorityElement.getMajorityElement(inputError);

		System.out.println(" The Majority Element is "+resultElementError);


	}

}
