/**
 * 
 */
package com.test.scratchpad;

import java.util.BitSet;

/**
 * @author Kiran Kanaparthi
 *
 */
public class FindDuplicatesMinMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindDuplicatesMinMemory findDuplicatesMinMemory =
				new FindDuplicatesMinMemory();
		int[] elements = {1,2,3,4,5,2};
		int duplicateElement = findDuplicatesMinMemory.duplicateElements(elements);
		System.out.println(" The Duplicate Element is "+ duplicateElement);
	}

	
	/**
	 * 
	 * @return
	 */
	private int duplicateElements(int[] elements) {
		int duplicateElement = -1;
		if(elements!=null && elements.length>0) {
			BitSet bitset = new BitSet(elements.length);
			for(int element : elements) {
				if(bitset.get(element)==true) {
					duplicateElement = element;
				} else {
					bitset.set(element);
				}
			}
		}
		return duplicateElement;
	}
}
