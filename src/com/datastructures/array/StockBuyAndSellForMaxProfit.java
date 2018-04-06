/**
 * 
 */
package com.datastructures.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kkanaparthi
 * 
 * This class finds the Stocks Buy and Sell 
 * Prices for making Maximum Profit.
 * 
 *
 */
public class StockBuyAndSellForMaxProfit {

	
	/**
	 * 
	 * @param a
	 * @return
	 */
	private List<Price> maxBuyAndSellPrices(int a[])  {
		List<Price> pricesList = new ArrayList<>();
		if(a!=null && a.length>0) {
			Price price = new Price();
			int startIndex = 0;
			int buyPrice = a[startIndex];
			while(startIndex<a.length-1) {
				if(a[startIndex]<a[startIndex+1]) {
					startIndex++;
				} else {
					System.out.println(" startIndex after the loop "+startIndex
							+"  a.length-1 "+(a.length-1));
					price.setBuyPrice(buyPrice);
					price.setSellPrice(a[startIndex]);
					pricesList.add(price);
					
					startIndex++;
					
					System.out.println(" New Start index after the "
							+ " element is added "+startIndex);
				}
				
			}
		}
		return pricesList;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StockBuyAndSellForMaxProfit stockBuyAndSellForMaxProfit = 
				new StockBuyAndSellForMaxProfit();
		int[] input = new int[]{100,180,260,310,40,535,695};
		List<Price> listOfStocks =
				stockBuyAndSellForMaxProfit.maxBuyAndSellPrices(input);
		if(listOfStocks!=null && listOfStocks.size()>0) {
			listOfStocks.forEach(elem->System.out.println (" "+elem));
		}
		
	}

}

/**
 * 
 * @author kkanaparthi
 *
 */
class Price {
	
	private int buyPrice;
	private int sellPrice;
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