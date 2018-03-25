/**
 * 
 */
package com.test.doublylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class DoublyLinkedList {
	
	
	
	public static void main(String a[]) {
//		String abc[] = new Object[]{}; 
		List<Object> l1 = new ArrayList<Object>();
	}
	
	Node headNode;
	Node tailNode;
	

	/**
	 * 
	 */
	public DoublyLinkedList() {
	}

	
	/**
	 * This method adds the Node at the Head
	 * 
	 * @param data
	 */
	public void addNodeHead(int data) {
		Node node = new Node(data);
		if(headNode==null) {
			headNode = node;
		} else {
			node.nextNode = headNode;
			headNode = node;
		}
	}
	
	/**
	 * This method removes the Node from the 
	 * tail of the Node
	 * 
	 */
	public void removeNodeTail() {
		if(tailNode==null) {
			return;
		} else if(headNode.nextNode==null) {
			headNode = null;
		} else {
			
		}
	}
	
	
}


/**
 * 
 * @author kkanaparthi
 * 
 * This is the Node class that is used 
 * for Cache implementation using 
 * DoublyLinkedList
 * 
 */
class Node {
	
	Node prevNode;
	Node nextNode;
	
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}