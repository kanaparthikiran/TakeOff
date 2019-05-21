/**
 * 
 */
package com.datastructures.linkedlist;

/**
 * @author kkanaparthi
 *
 */
public class LinkedListA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListHelper linkedList = new LinkedListHelper();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);
		linkedList.printList();
		linkedList.reverseLinkedList();
		System.out.println("\n After Reversal of the List ");
		linkedList.printList();
//		linkedList.reverseRecursive();
//		System.out.println("\n After Recursive Reversal of the List ");
//		linkedList.printList();
//		linkedList.deleteNode(1);
//		System.out.println("\n After Deletion  of the Node from the List ");
//		linkedList.printList();
		linkedList.addOne();
		System.out.println("\n After Adding 1 to the List ");
		linkedList.printList();
	}
}

class LinkedListHelper {
	private NodeA head;
	
	public void addNode(int data) {
		NodeA node = new NodeA(data);
		if(head==null) {
			head = new NodeA(data);
		} else if(head.next==null) {
			head.next = node;
		} else {
			NodeA currentNode = head;
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
	}
	
	public void printList() {
		NodeA currentNode = head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"  -> ");
			currentNode = currentNode.next;
		}
	}
	public void reverseRecursive() {
		reverseRecurse(head);
	}
	private void reverseRecurse(NodeA currentNode) {
		if(currentNode==null) {
			return;
		}
		if(currentNode.next==null) {
			head = currentNode;
			return;
		}
		reverseRecurse(currentNode.next);
		currentNode.next.next = currentNode;
		currentNode.next = null;
	}
	
	void addOne() {
		reverseLinkedList();
		addOneHelper();
		reverseLinkedList();
	}
	
	private NodeA addOneHelper() {
		NodeA currentNode = head;
		NodeA temp = null;
		int carry = 1;
		int sum = 0;
		while(currentNode!=null) {
			sum += carry+currentNode.data;
			carry = (sum>=10)?1:0;
			sum%= 10;
			currentNode.data = sum;
			temp = currentNode;
			currentNode = currentNode.next;
		}
		if(carry>0) {
			temp.next = new NodeA(carry);
		}
		return currentNode;
	}
	public void reverseLinkedList() {
		NodeA currentNode = head;
		NodeA previousNode = null;
		NodeA nextNode = null;
		if(currentNode==null) {
			return;
		}
		while(currentNode!=null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
			head = previousNode;
	} 
	
	public void deleteNode(int data) {
		NodeA currentNode = head;
		if(currentNode==null) {
			return;
		}
		if(currentNode.data==data) {
			head = currentNode.next;
		}
		while(currentNode!=null && currentNode.next!=null) {
			if(currentNode.next.data==data) {
				currentNode.next = currentNode.next.next;
			}
			currentNode = currentNode.next;
		}
	}
}

class NodeA {
	NodeA next;
	int data;
	NodeA() {
	}
	NodeA(int data) {
		this.data = data;
	}
}