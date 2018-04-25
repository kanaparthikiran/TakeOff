/**
 * 
 */
package com.datastructures.search;

import java.util.BitSet;

/**
 * @author Kiran Kanaparthi
 *
 */
public class BitSetTest {

	
	/**
	 * 
	 * @return
	 */
	private BitSet getBitSet(BitSet inputBits) {
		if(inputBits!=null && inputBits.length()>0) {
			System.out.println(" input Bits "+inputBits);
		}
		return inputBits;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitSetTest bitSetTest =
				new BitSetTest();
		BitSet bitSet = new BitSet();
		bitSet.set(5);
		bitSet.set(6);
		BitSet responseBitSet = 
				bitSetTest.getBitSet(bitSet);
		System.out.println(" The response bits are "+ responseBitSet);
	}

}
