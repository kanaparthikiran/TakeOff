/**
 * 
 */
package com.datastructures.heap;

/**
 * @author kkanaparthi
 *
 */
public class MinHeap {

	private int capacity;
	private int heapSize;
	private int elements[];
	
	public MinHeap(int capacity) {
		heapSize = 0;
		elements = new int[capacity];
		this.capacity = capacity;
	}
	
	public int parent(int i) {
		return (i-1)/2;
	}
	
	public int left(int i) {
		return (2*i+1);
	}
	
	public int right(int i) {
		return (2*i+2);
	}
	
	public int extractMin() {
		return elements[0];
	}
	 
	public void decreaseKey(int i, int newValue) {
		
	}
	
	public int getMin() {
		return elements[0];
	}
	
	public void deleteKey(int k) {
		
	}
	
	public void insertKey(int k) {
		
	}
}
