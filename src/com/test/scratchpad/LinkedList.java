/**
 * 
 */
package com.test.scratchpad;

import java.util.HashSet;
import java.util.Set;

import sun.security.krb5.internal.tools.Ktab;

/**
 * @author Kiran Kanaparthi
 *
 */
public class LinkedList  extends BinaryTree {
	Node head;
	
	private void addNode(int data) {
		Node addNode = new Node(data);
		Node currentNode = head;
		if(currentNode==null) {
			head = addNode;
		} else if(currentNode.next==null) {
			head.next = addNode;
		} else {
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = addNode;
		}
		System.out.println(" Completed add Node "+ data);
	}
	
	private void printAllNodes() {
		System.out.println(" Started printAllNodes ");

		Node currentNode = head;
		if(currentNode==null) {
			System.out.println(" head Node is null ");
			return;
		} else if(currentNode.next==null) {
			System.out.print("Node next to current Node is null "+ 
					currentNode.data+" ");
		} else {
			while(currentNode!=null) {
				System.out.println(" Printing the Nodes one by one ");
				System.out.print(currentNode.data+" ");
				currentNode = currentNode.next;
			}
		}
		System.out.println(" Exiting printAllNodes ");

	}
	
	
	/**
	 * 
	 */
	private void deleteDuplicatesHashing() {
		Node currentNode = head;
		Node previousNode = null;
		Set<Integer> nodesHash = new HashSet<Integer>();
		if(currentNode==null) {
			return;
		} else {
			while(currentNode!=null) {
				if(nodesHash.contains(currentNode.data)) {
					previousNode.next = currentNode.next;
				} else {
					nodesHash.add(currentNode.data);
					previousNode = currentNode;
				}
				currentNode = currentNode.next;
			}
		}
	}
	
	/**
	 * This method deletes the Duplicates
	 */
	private void deleteDuplicatesFastPointer() {
		Node currentNode = head;
		while(currentNode!=null) {
			Node runner = currentNode;
			while(runner.next!=null) {
				if(runner.next.data==currentNode.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
				currentNode = currentNode.next;
			}
	}
	
	public void deleteDuplicate() {
		Node currentNode = head;
		while(currentNode!=null) {
			Node nextNode = currentNode;
			while(nextNode.next!=null) {
				if(nextNode.next.data==currentNode.data) {
					nextNode.next = nextNode.next.next;
				} else {
					nextNode = nextNode.next;
				}
			}
			currentNode = currentNode.next;
		}
	}
	
	private Node getKthToLast(int k) {
		Node currentNode = head;
		Node fastPointer = head;
		
			for(int i=0;i<k;i++) {
	//			if(fastPointer==null) return null;
				fastPointer = fastPointer.next;
			}


			while(fastPointer!=null) {
				fastPointer = fastPointer.next;
				currentNode = currentNode.next;
			}
		return currentNode;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);
		linkedList.addNode(1);

		linkedList.deleteDuplicate();
		
		linkedList.printAllNodes();
		
		Node last2KthNode = 
				linkedList.getKthToLast(2);
		System.out.println(" Kth last Node is "+ last2KthNode.data);
		
	}

}


class Node {
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}


	 int data;
	 Node next;
	
	
	Node(int data) {
		this.data = data;
	}
	
}