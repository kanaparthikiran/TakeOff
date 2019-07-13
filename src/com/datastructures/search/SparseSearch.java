/**
 * 
 */
package com.datastructures.search;

/**
 * @author kkanaparthi
 *
 */
public class SparseSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String element = findElement(0, 5, "hello", new String[] {"hi","","","hello","welcome"});
		System.out.println(" element "+ element);
	}
	
	private static String findElement(int start,int end,String search,String[] data) {
		if(start>end) {
			return null;
		}
		int middle  = findNonEmptyMiddleElement(start, end, data);
		if(search.equals(data[middle])) {
			return data[middle];
		} else if(search.compareTo(data[middle])>0) {
			return findElement(middle+1, end, search, data);
		} else {
			return findElement(start, middle+1, search, data);
		}
	}

	/**
	 * @param start
	 * @param end
	 * @param data
	 * @param middle
	 */
	private static int findNonEmptyMiddleElement(int start, int end, String[] data) {
		int middle = (start+end)/2;
		if(data[middle].isEmpty()) {
			int left = middle-1;
			int right = middle+1;
			while(true) {
				if(left<start && right>end) {
					return -1;
				} else if(right<=end && !data[middle].isEmpty()) {
					middle = right;
					break;
				} else if(left>=start && !data[middle].isEmpty()) {
					middle =left;
					break;
				}
				right++;
				left--;
			}
		}
		return middle;
	}

}
