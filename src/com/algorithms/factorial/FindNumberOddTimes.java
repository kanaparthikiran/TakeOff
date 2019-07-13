///**
// * 
// */
//package com.algorithms.factorial;
//
///**
// * @author kkanaparthi
// *
// */
//public class FindNumberOddTimes {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		int [] data = new int[] {3,2,1,2,3,0};
//		int result = numberOdd(data);
//		System.out.println(" Result is "+result);
//	}
//	
//	
//	private static int numberOdd(int[] data) {
//		int result = 0;
//		
//		if(data!=null && data.length>0) {
//			for(int element :data) {
//				
//				String test = "123";
//			//	System.out.println(" Parsed value "+Integer.parseInt(test));
//				spiltInteger(test);
//				result ^= element; 
//			}
//		}
//		return result;
//	}
//
//	
//	private static void spiltInteger(String number) {
//		if(number!=null) {
//			for(int i=number.length()-1;i>=0;i--) {
//				char charElement = number.charAt(i);
//				System.out.println(" charElement "+ Integer.parseUnsignedInt(charElement));
//			}
//		}
//		System.out.println(" \n");
//	}
//}
