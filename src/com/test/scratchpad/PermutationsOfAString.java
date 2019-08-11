/**
 * 
 */
package com.test.scratchpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.output.ThresholdingOutputStream;

/**
 * @author Kiran Kanaparthi
 *
 */
public class PermutationsOfAString {
	
	
	
	private int gcd(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return gcd(b,a%b);
		}
	}
	

	
	 public static List<List<Integer>> threeSum(int[] nums) {
	        if(nums==null || nums.length<3) {
	            return new ArrayList<>();
	        }
	        List<List<Integer>> allSets = new ArrayList<>();
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++) {
	            if(i>0 && nums[i]==nums[i-1]) {
	                continue;
	            }
	            int left = i+1;
	            int right = nums.length-1;
	            int x = nums[i];
	            while(left<right) {
	                int sum = nums[left]+nums[right]+x;
	                if(sum==0) {
	                    List<Integer> innerData = new ArrayList<>();
	                    innerData.add(x);
	                    innerData.add(nums[left]);
	                    innerData.add(nums[right]);
	                    allSets.add(innerData);
	System.out.println(" i "+i+" x "+x+" nums[left] "+nums[left]+" nums[right] "+ nums[right]+"left  "+left+"right "+right);
	                    left++;
	                    right--;
	                } else if(sum<0) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	        }
	        return allSets;
	    }
	
	/**
	 * 
	 * @return
	 */
	private List<String> getAllPermutations(String input,
			String prefix,String suffix,
			List<String> allPermutations) {
		if(suffix!=null && suffix.length()==0) {
			allPermutations.add(prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String element = suffix.substring(0, i)+
						suffix.substring(i+1,suffix.length());
				getAllPermutations(input,
						prefix+suffix.charAt(i),
						element, allPermutations);
			}
		}
	return allPermutations;	
	}
	
	
	private static List<String> getAllPermutationsOf(String data,String prefix,String suffix,List<String> results) {
		if(data!=null) {
			if(suffix!=null && suffix.length()==0) {
				results.add(prefix+suffix);
			} else {
				for(int i=0;i<suffix.length();i++) {
					String suffixElement = suffix.substring(0,i)+suffix.substring(i+1);
					getAllPermutationsOf(data,prefix+suffix.charAt(i),
							suffixElement,results);
				}
			}
		}
		return results;
	}
	
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String getReverseOfAString(String input)  {
		String reversedString = null;
		if(input!=null) {
			if(input.length()==0) {
				return input;
			} else {
				reversedString =
						getReverseOfAString
						(input.substring(1))+input.charAt(0);
			}
		}
		return reversedString;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String reverseArrayUsingCharArray(String input) {
		char[] arrayOfChars = null;
		if(input!=null && input.length()>0) {
			arrayOfChars = input.toCharArray();
			for(int i =0;i<arrayOfChars.length/2;i++) {
				char temp = arrayOfChars[i];
				arrayOfChars[i] = arrayOfChars[arrayOfChars.length-1-i];
				arrayOfChars[arrayOfChars.length-1-i] = temp;
			}
		}
		return String.valueOf(arrayOfChars);
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	private String convertDecimalToBinary(int number) {
		StringBuilder binaryNumber = new StringBuilder();
		while(number>0) {
			int binaryRemainder = number%2;
			binaryNumber.append(binaryRemainder);
			number = number/2;
		}
		return String.valueOf(binaryNumber.reverse());
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String compressString(String input)  {
		StringBuilder compressedString = new StringBuilder();
		if(input!=null && input.length()>0) {
			int count = 0;
			for(int i=0;i<input.length();i++) {
				count++;
				if(((i+1)>=input.length()) ||
						input.charAt(i)!=input.charAt(i+1)) {
					compressedString.append
					(input.charAt(i)).append(count);
					count = 0;
				}
			}
		}
		return String.valueOf(compressedString);
	}
	
	
	/**
	 * 
	 * @param input
	 */
	private void printRepeatingElements(int[] input) {
		if(input!=null && input.length>0) {
			for(int element : input) {
				if(input[Math.abs(element)-1]>0) {
					input[Math.abs(element-1)] *= -1;
				} else {
					System.out.print(Math.abs(element)+"  ");
				}
			}
		}
	}
	/**
	 * 
	 * 
	 * @param a
	 * 
	 */
	public static void main(String a[]) {
		PermutationsOfAString permutationsOfAString  =
				new PermutationsOfAString();
		String input  ="abc";
		
		int[] threeSumTest = new int[] {-2,0,0,2,2};
		threeSum(threeSumTest).forEach(element->System.out.println(" element "+element));
		
//		int gcdOfNumbers =
//				permutationsOfAString.gcd(10, 15);
//		System.out.println(" gcd of numbers is "+gcdOfNumbers);
//		
//		List<String> allPermutations =
//				permutationsOfAString.getAllPermutationsOf(input, "", 
//						input, new ArrayList<String>());
//		allPermutations.forEach(element->System.out.println(element));
////		if(allPermutations!=null && allPermutations.size()>0) {
////			allPermutations.forEach(element->System.out.println(element+" "));
////		}
//		
//		String reverseString = permutationsOfAString.getReverseOfAString(input);
//		System.out.println(" The Reverse of a String is "+ reverseString);
//		
//		String reverseUsingCharArray =
//				permutationsOfAString.reverseArrayUsingCharArray(input);
//		System.out.println(" The Reverse of the String using Char Array is "
//				+ reverseUsingCharArray);
//		
//		String binaryNumber =
//				permutationsOfAString.convertDecimalToBinary(15);
//		System.out.println(" The Binary Represenation "
//				+ "of the Decimal Number "+15 +" is "+binaryNumber);
//		
//		String compressedString  =
//				permutationsOfAString.compressString("hello");
//		System.out.println(" The compressed String  "+compressedString);
//		
//		int[] inputArray = new int[] {1,4,4,3,2};
//		permutationsOfAString.printRepeatingElements(inputArray);
	}
	
}
