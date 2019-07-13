/**
 * 
 */
package com.datastructures.binarysearchtree;

/**
 * @author kkanaparthi
 *
 */
public class LinkedListLocal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListImpl linkedListImpl = 
				new LinkedListImpl();
		linkedListImpl.addNode(1);
		linkedListImpl.addNode(2);
		linkedListImpl.addNode(3);
		linkedListImpl.addNode(4);
		linkedListImpl.addNode(5);
		linkedListImpl.deleteNode(4);
		linkedListImpl.printNodes();
		
	}

}



class LinkedListImpl {
	LLNode headNode;
	
	public void addNode(int data) {
		LLNode currentNode = headNode;
		if(headNode==null) {
			headNode = new LLNode(data);
		} else {
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = new LLNode(data);
		}
	}

	public void printNodes() {
		LLNode currentNode = headNode;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void deleteNode(int data) {
		LLNode currentNode = headNode;
		LLNode previousNode = currentNode;
		while(currentNode!=null) {
			if(currentNode.data==data) {
				currentNode = previousNode.next.next;
			} else {
				previousNode = currentNode.next;
			}
		}
		
	}
}

class LLNode {
	public LLNode(int data) {
		super();
		this.data = data;
	}
	public LLNode(int data, LLNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	int data;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LLNode getNext() {
		return next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	LLNode next;
}