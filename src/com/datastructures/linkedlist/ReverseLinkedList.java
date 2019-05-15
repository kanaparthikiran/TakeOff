/**
 * 
 */
package com.datastructures.linkedlist;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author kkanaparthi
 *
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.printElements();
		System.out.println("\n After LinkedList Reverse ");
//		ll.reverseLinkedList();
//		ll.printElements();
		ll.reverseLinkedListRecursive();
		ll.printElements();
		PriorityQueue pq = null;
	}
	
	

}


class MyLinkedList {
	LLNode headNode;
	
	public void reverseLinkedListRecursive() {
		rev(headNode);
	}
	private void reverseRecursive(LLNode headNode) {
		LLNode currentNode = headNode;
		if(currentNode==null) {
			return;
		}
		if(currentNode.next==null) {
			this.headNode = headNode;
			return;
		}
		reverseRecursive(currentNode.next);
		currentNode.next.next = currentNode;
		currentNode.next = null;
	}
	
	
	private static List<String> getAllPermutations(String prefix,
			String suffix,List<String> all) {
		if(suffix==null||suffix.length()==0) {
			all.add(prefix+suffix);
		} else {
			
		}
		return all;
	}
	
	private void rev(LLNode currentNode) {
		if(currentNode==null) {
			return;
		}
		if(currentNode.next==null) {
			this.headNode = currentNode;
			return;
		}
		rev(currentNode.next);
		currentNode.next.next = currentNode;
		currentNode.next = null;
	}

	public void reverseLinkedList() {
		LLNode currentNode = headNode;
		LLNode previousNode = null;
		LLNode nextNode = null;
		if(headNode==null) {
			return;
		} else {
			while(currentNode!=null) {
				nextNode = currentNode.next;	
				currentNode.next = previousNode;
				previousNode = currentNode;
				currentNode = nextNode;
			}
			headNode = previousNode;
			return;
		}
	}
	public void add(int data) {
		LLNode newNode = new LLNode(data);
		LLNode currentNode = headNode;
		if(headNode==null) {
			headNode = newNode;
		} else if(headNode.next==null) {
			headNode.next = newNode;
		} else {
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	public void remove(LLNode node) {
		
	}
	
	public void printElements() {
		LLNode currentNode = headNode;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ->");
			currentNode = currentNode.next;
		}
	}
}


class LLNode {
	public LLNode(int data) {
		super();
		this.data = data;
	}
	int data;
	LLNode  next;
}