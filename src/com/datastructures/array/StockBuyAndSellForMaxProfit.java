/**
 * 
 */
package com.datastructures.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author kkanaparthi
 * 
 * This class finds the Stocks Buy and Sell 
 * Prices for making Maximum Profit.
 * 
 * Find the pairs of LocalMinima and LocalMaxima
 * and Return all those pairs at the end.
 * 
 * LocalMinima - If the element is less than the next element
 * LocalMaxima - If the element is more than the next element
 * 
 *
 */
public class StockBuyAndSellForMaxProfit {

	
	private static Collection<Price> buyAndSell(int[] prices) {
		List<Price> allItems = new ArrayList<>();
		
		if(prices==null || prices.length==0) {
			return Collections.unmodifiableCollection(allItems);
		}
//		int localMinima = prices[0];
		int n  = prices.length;
//		int localMaxima = prices[n-1];
		int count = 0;
		int i = 0;
		while(i<n-1) {
			while((i<n-1) && prices[i]>=prices[i+1]) {
				i++;
			}
			Price price = new Price();
			price.buyPrice = prices[i++];
			if(i==n-1) {
				break;
			}
			while((i<n) && prices[i]>=prices[i-1]) {
				i++;
			}
			price.sellPrice = prices[i-1];
			allItems.add(price);
			count++;
		}
		System.out.println(" All Items Size "+ allItems+" count "+count);
		return allItems;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = new int[]{100,180,260,310,40,535,695};
		Collection<Price> listOfStocks =
				buyAndSell(input);
		System.out.println(" Unmodifyable collection "+listOfStocks);
		listOfStocks.stream().forEach(elem->System.out.println (" "+elem));
		}
}

/**
 * 
 * @author kkanaparthi
 *
 */
class Price {
	
	public Price() {
		super();
	}
	public Price(int buyPrice, int sellPrice) {
		super();
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	 int buyPrice;
	int sellPrice;
	/**
	 * @return the buyPrice
	 */
	public int getBuyPrice() {
		return buyPrice;
	}
	/**
	 * @param pBuyPrice the buyPrice to set
	 */
	public void setBuyPrice(int pBuyPrice) {
		buyPrice = pBuyPrice;
	}
	/**
	 * @return the sellPrice
	 */
	public int getSellPrice() {
		return sellPrice;
	}
	/**
	 * @param pSellPrice the sellPrice to set
	 */
	public void setSellPrice(int pSellPrice) {
		sellPrice = pSellPrice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Price [buyPrice=" + buyPrice + ", sellPrice=" + sellPrice + "]";
	}
	
}