/**
 * 
 */
package com.alogorithms.dynamicprogramming;

/**
 * @author Kiran Kanaparthi
 * 
 * This class gets all the possible Solutions that 
 * are possible for a given StairCase, when a Child can 
 * Jump either 1 step, or 2 steps, or 3 steps up to the
 * nth Stair.
 *  As The possibilities are either one of these at a time,
 *  not one after the other, We simply add all the possibilities
 *  
 *  Using The Memoization technique the Previous results are cached
 *  and reused.
 * 
 *
 */
public class StairCaseForJumps {

	/**
	 * 
	 * @param n
	 * @param cache
	 * @return
	 */
	private int getAllJumpsForStaircaseMemoization(int n, int[] cache) {
		if(n<0) {
			return 0;
		} else if(n==0) {
			return 1;
		} else if(cache[n]!=0)  {
			return cache[n];
		} else { 
			cache[n] = getAllJumpsForStaircaseMemoization(n-1, cache)+
			getAllJumpsForStaircaseMemoization(n-2, cache)+
			getAllJumpsForStaircaseMemoization(n-3, cache);
			}
		return cache[n];
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	private int getAllJumpsForStairCaseRecursive(int n) {
		if(n<0) {
			return 0;
		} else if(n==0) {
			return 1;
		}
		return getAllJumpsForStairCaseRecursive(n-1)+
				getAllJumpsForStairCaseRecursive(n-2)+
				getAllJumpsForStairCaseRecursive(n-3);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StairCaseForJumps stairCaseForJumps =
				new StairCaseForJumps();
		int totalJumpsPossible = stairCaseForJumps.
				getAllJumpsForStairCaseRecursive(7);
		System.out.println(" Total Jumps Possible "+totalJumpsPossible);
		int totalJumpsForMemoizaton = 
				stairCaseForJumps.getAllJumpsForStaircaseMemoization(7, new int[101]);
		System.out.println(" totalJumpsForMemoizaton  "+totalJumpsForMemoizaton);
	}

}
