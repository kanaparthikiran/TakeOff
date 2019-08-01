/**
 * 
 */
package com.alogorithms.dp;

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
	private long makeChange(int amount,int[] denominations,
			int index,Map<String,Long> cacheMap) {
		
		System.out.println(" index at each step "+ index);

		if(amount==0) { return 1;}
		
		if(index>=denominations.length) { return 0;}
		
		String preComputedKey = amount+"_"+index;
		
		if(cacheMap.containsKey(preComputedKey)) {
			return cacheMap.get(preComputedKey);
		}
		
		int denominationAmount = denominations[index];
		
		System.out.println(" index "+index
				+" denominationAmount "+denominationAmount);

		Long waysToMakeChange = 0l;
		for(int i=0;i*denominationAmount<=amount;i++) {
			int amountRemaining = amount - i*denominationAmount;
			System.out.println(" amountRemaining "+amountRemaining
					+" denominations "+denominations[index]
							+"  index "+index );
			waysToMakeChange += makeChange
					(amountRemaining, denominations, index+1,cacheMap);
			System.out.println("waysToMakeChange "+waysToMakeChange);

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
		int n = 250;
		int[] denominations = new int[] 
				{41,34,46,9,37,32,42,21,7,13,1,24,3,43,2,23,8,45,19,30,29,18,35,11};
		int index = 0;
		Map<String,Long> cacheMap = new ConcurrentHashMap<>();
		long waysToMakeChange =
				coinChangeProblem.makeChange(n, denominations, index,cacheMap);
		System.out.println(" The Number of Ways "
				+ "  to Make change are "+waysToMakeChange);
	}

}
