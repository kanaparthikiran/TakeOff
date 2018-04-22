/**
 * 
 */
package com.alogorithms.dynamicprogramming;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Kiran Kanaparthi
 * 
 * This class Solves the Coin Change Problem
 * to find the number of Ways the change can be
 * made for the given Total, using the Coins.
 *
 */
public class CoinChangeProblem {


	/**
	 * 
	 * @param amount
	 * @param denominations
	 * @param index
	 * @return
	 */
	private int makeChange(int amount,int[] denominations,
			int index,Map<String,Integer> cacheMap) {
		
//		System.out.println(" index at each step "+ index);
		if(index>=denominations.length-1) { return 1;}
		int denominationAmount = denominations[index];
//		System.out.println(" index "+index
//				+" denominationAmount "+denominationAmount);
		String preComputedKey = amount+"_"+index;
		if(cacheMap.containsKey(preComputedKey)) {
			return cacheMap.get(preComputedKey);
		}
		int waysToMakeChange = 0;
		for(int i=0;i*denominationAmount<amount;i++) {
			int amountRemaining = amount - i*denominationAmount;
//			System.out.println(" amountRemaining "+amountRemaining
//					+" denominations "+denominations[index]+"  index "+index );
			waysToMakeChange += makeChange
					(amountRemaining, denominations, index+1,cacheMap);
		}
		cacheMap.put(preComputedKey, waysToMakeChange);
		return waysToMakeChange;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoinChangeProblem coinChangeProblem =
				new CoinChangeProblem();
		int n = 6;
		int[] denominations = new int[] {25,10,5,1};
		int index = 0;
		Map<String,Integer> cacheMap = new ConcurrentHashMap<String,Integer>();
		int waysToMakeChange =
				coinChangeProblem.makeChange(n, denominations, index,cacheMap);
		System.out.println(" The Number of Ways "
				+ "  to Make change are "+waysToMakeChange);
	}

}
