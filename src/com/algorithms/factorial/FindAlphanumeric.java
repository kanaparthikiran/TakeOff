/**
 * 
 */
package com.algorithms.factorial;

/**
 * @author kkanaparthi
 *
 */
public class FindAlphanumeric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindAlphanumeric findAlphanumeric = new FindAlphanumeric();
		String data = "he2llo1";
		boolean response = findAlphanumeric.isNumric(data);
		System.out.println(" The response is "+response);
	}
	
	private static boolean isNumric(String data) {
		boolean result = false;
		for(char element : data.toCharArray()) {
			if(element>=48&&element<=57) {
				return true;
			}
			System.out.println(" element "+element+"  element-a "+ (element-'a'));

		}
		return result;
	}

}
