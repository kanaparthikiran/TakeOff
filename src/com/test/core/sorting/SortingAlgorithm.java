/**
 * 
 */
package com.test.core.sorting;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author kkanaparthi
 *
 */
public class SortingAlgorithm implements ISortingAlgorithm {

	private static final Logger log = Logger.getLogger(SortingAlgorithm.class.getName());
	
	/* (non-Javadoc)
	 * @see com.test.core.sorting.ISortingAlgorithm#sortElements(int[])
	 */
	@Override
	public int[] sortElements(int[] pInput) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.test.core.sorting.ISortingAlgorithm#printElements(int[])
	 */
	@Override
	public void printElements(int[] pInput) {
		if(pInput!=null && pInput.length>0) {
			
		} else {
			
		}
	}
	
	public static void main(String a[]) {
		SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
		List<Integer> testList = Arrays.asList(new Integer[]{1,-4,5,2,1});
		sortingAlgorithm.printListElements(testList);
	}

	@Override
	public void printListElements(List<Integer> pList) {
		if(pList!=null && pList.size()>0) {
			pList.forEach(item->log.info(item));
			
		//	pList.forEach(item->log.info(item));
			
			Integer minValueFromList = 
					pList.stream().min(Integer::compare).get();
			log.info(" minValueFromList  "+minValueFromList);
			
		} else {
			System.out.println(" There are No Elements in the List ");
		}
	}

}
