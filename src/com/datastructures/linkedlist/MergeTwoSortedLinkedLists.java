/**
 * 
 */
package com.datastructures.linkedlist;

/**
 * @author kkanaparthi
 *
 */
public class MergeTwoSortedLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LList list = new LList();
		list.appendNode(1);
		list.appendNode(2);
		list.appendNode(3);
		
		list.printLNodes();
		
		list.reverseList();
		System.out.println("\n After Reverse ");
		list.printLNodes();
		
		LNode m1 = new LNode(1);
		LNode m3= new LNode(3);
		LNode m5 = new LNode(5);
		m1.next = m3;
		m3.next = m5;
		
		LNode m2 = new LNode(2);
		LNode m4= new LNode(4);
		LNode m6 = new LNode(6);
		m2.next = m4;
		m4.next = m6;
		LNode mergedListNode = mergeLists(m1, m2);
		
		System.out.println("\n After Merge"
				+ " ");

		list.printLNodesFromCurrent(mergedListNode);
		//System.out.println(" Merged List is "+ );
		
	}

	
	private static LNode mergeLists(LNode l1,LNode l2) {
		LNode dummyNode = new LNode(0);
		LNode l3 = dummyNode;
		while(l1!=null && l2!=null) {
			if(l1.data<=l2.data) {
				l3.next = l1;
				l1 = l1.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		
		if(l1!=null) {
			l3.next = l1;
		}
		if(l2!=null) {
			l3.next = l2;
		}
		return dummyNode.next;
	}
}

class LList {
	LNode head;
	
	public void appendNode(int data) {
		LNode dataNode = new LNode(data);
		LNode currentNode = head;
		if(head==null) {
			head = dataNode;
			return;
		}
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next = dataNode;
	}
	

	public void printLNodesFromCurrent(LNode node) {
		LNode currentNode = node;
		if(node==null) {
			return;
		}
		
		while(currentNode!=null) {
			System.out.print(currentNode.data+" -> ");
			currentNode = currentNode.next;
		}
		
	}
	
	public void printLNodes() {
		LNode currentNode = head;
		if(head==null) {
			return;
		}
		
		while(currentNode!=null) {
			System.out.print(currentNode.data+" -> ");
			currentNode = currentNode.next;
		}
		
	}
	
	
	public void reverseList() {
		LNode currentNode = head;
		LNode previous = null;
		LNode next = null;
		while(currentNode!=null) {
			next = currentNode.next;
			currentNode.next = previous;
			previous = currentNode;
			currentNode = next;
		}
		head = previous;
	}
	
}

class LNode {
	int data;
	LNode next;
	
	public LNode(int data) {
		this.data = data;
	}
	
	
	
}