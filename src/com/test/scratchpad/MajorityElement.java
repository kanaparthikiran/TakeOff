/**
 * 
 */
package com.test.scratchpad;

/**
 * @author Kiran
 *
 */
public class MajorityElement {

	private int getMajorityElement(int[] elements) {
		int majorityElementCandidate=0;
		int count  = 0;
		int majorityCountNumber = 0;
		if(elements!=null && elements.length>0) {
			majorityElementCandidate = elements[0];
			majorityCountNumber = elements.length/2;
			for(int i=1;i<elements.length;i++) {
				if(elements[i]==majorityElementCandidate) {
					count++;
				} else {
					count--;
				}
				if(count==0) {
					count = 1;
					majorityElementCandidate = elements[i];
				}
			}
			
			System.out.println(" majorityCountNumber "+majorityCountNumber);
			int majorityCounter = 0;
			for(int element:elements) {
				if(element==majorityElementCandidate) {
					majorityCounter++;
					if(majorityCounter==majorityCountNumber) {
						majorityElementCandidate = element;
						break;
					} else {
						majorityElementCandidate = -1;
					}
				}
			}
		}
		
		return majorityElementCandidate;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement majorityElementObject = new MajorityElement();
		int[] elements = new int[] {1,2,3,4,1};
		int majorityElement = majorityElementObject.getMajorityElement(elements);
		int majorityElementValue = majorityElement>0?majorityElement:-1;
		System.out.println(" The Majority Element is "+ majorityElementValue);
	}

}
