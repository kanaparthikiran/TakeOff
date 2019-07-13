/**
 * 
 */
package com.ccivw.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author kkanaparthi
 *
 */
public class MergeKSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] {1,3,5,7};
		int[] b = new int[] {2,4,8};

		int[] mergedResult = 
				merge(new int[][] {a,b});
		
		int[] response = mergedResult;
		System.out.println(" Response "+ Arrays.toString(mergedResult));
	

	}
	
	
	 
	public static int[] merge(int[][] arrays) {
	    PriorityQueue<QueueNode> pq = new PriorityQueue<>();
	 
	    int size = 0;
	    for (int i = 0; i < arrays.length; i++) {
	        size += arrays[i].length;
	        if (arrays[i].length > 0) {
	            pq.add(new QueueNode(i, 0, arrays[i][0]));
	        }
	    }
	 
	    int[] result = new int[size];
	    for (int i = 0; !pq.isEmpty(); i++) {
	        QueueNode n = pq.poll();
	        result[i] = n.value;
	        int newIndex = n.index + 1;
	        if (newIndex < arrays[n.array].length) {
	            pq.add(new QueueNode(n.array, newIndex, 
	            arrays[n.array][newIndex]));
	        }
	    }
	 
	    return result;
	}
	
	
}
 class QueueNode implements Comparable<QueueNode> {
	    int array, index, value;
	 
	 
	    public QueueNode(int array, int index, int value) {
	        this.array = array;
	        this.index = index;
	        this.value = value;
	    }
	 
	    public int compareTo(QueueNode n) {
	        if (value > n.value) return 1;
	        if (value < n.value) return -1;
	        return 0;
	    }
	}
//	private static int [] mergeSortedArrays(int[][] arrays) {
//		PriorityQueue<QueueNode> queue = new PriorityQueue<>();
//		int size = 0;
//		for(int i=0;i<arrays.length;i++) {
//			size +=  arrays[i].length;
//			if(arrays[i].length>0) {
//				queue.add(new QueueNode(i,0,arrays[i][0]));
//			}
//		}
//		int[] result = new int[size];	
//		for(int i=0;!queue.isEmpty();i++) {
//			QueueNode node = queue.poll();
//			result[i] = node.value;
//			int newIndex = node.index+1;
//			if(newIndex<arrays[node.array].length) {
//				queue.add(new QueueNode(node.array, newIndex, arrays[node.array][newIndex]));
//			}
//			
//		}
//		
//		return result;	
//	}
//}
//
//
//class QueueNode implements Comparable<QueueNode> {
//	
//	public QueueNode(int array, int index, int value) {
//		super();
//		this.array = array;
//		this.index = index;
//		this.value = value;
//	}
//
//	int array,index,value;
//
//
//
//	@Override
//	public int compareTo(QueueNode o) {
//		return this.value - o.value;
//	}
//}