/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 * 
 * This class Performs the String Compression
 * It prints the character count of the same character,
 * that are next to each other.
 *  
 *
 */
public class StringCompression {
	

	/**
	 * 
	 * @param input
	 * @return
	 */
	private String compressString(String input) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				count++;
				if((i+1>=input.length()) || 
						input.charAt(i)!=input.charAt(i+1)) {
					compressed.append(input.charAt(i));
					compressed.append(count);
					count = 0;
				} 
			}
		}
		System.out.println("  compressed.toString()  "
				+compressed.toString());
		return compressed.length()<input.length()?
				compressed.toString():input;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringCompression stringCompression = new StringCompression();
		String compressedString = stringCompression.compressString("helllo");
		System.out.println(" The Compressed String is "+compressedString);
	}

}
