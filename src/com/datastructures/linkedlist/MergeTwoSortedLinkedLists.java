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
		m2.next = m6;
		m6.next = m4;
		LNode mergedListNode = mergeTwoLists(m1, m2);
		
		System.out.println("\n After Merge"
				+ " ");

		list.printLNodesFromCurrent(mergedListNode);
		//System.out.println(" Merged List is "+ );
		
	}

	
	private static LNode mergeTwoLists(LNode node1, LNode node2) {
		if(node1==null && node2==null) {
			return null;
		}
		if(node2==null) {
			return node1;
		}
		if(node1==null) {
			return node2;
		}
		LNode dummy = new LNode(0);
		LNode current = dummy;
		LNode firstPointer = node1;
		LNode secondPointer = node2;
		int prevFirst = 0;
		int prevSecond = 0;

		
		while(firstPointer!=null&& secondPointer!=null) {
			
			System.out.println(" prevFirst "+prevFirst+" prevSecond "+ prevSecond
					+" firstPointer.data "+firstPointer.data
					+" secondPointer.data "+secondPointer.data);
			if((prevFirst>firstPointer.data) || (prevSecond>secondPointer.data)) {
				throw new RuntimeException("Exception out of order elements");
			}
			if(firstPointer.data<=secondPointer.data) {
				prevFirst = firstPointer.data;
				current.next =  firstPointer;
				firstPointer = firstPointer.next;
			} else {
				prevSecond = secondPointer.data;
				current.next =  secondPointer;
				secondPointer = secondPointer.next;
			}
			current = current.next;
		}
		
		
		System.out.println("Outside node1 "+node1.data+" node 2 data "+node2.data);

		 

		if(firstPointer!=null) {
			System.out.println(" node1 "+firstPointer.data);
			current.next = firstPointer;
		}
		if(secondPointer!=null) {
			System.out.println(" node2 data  "+secondPointer.data);

			current.next = secondPointer;
		}
		return dummy.next;
	}
	
//	private static LNode mergeLists(LNode l1,LNode l2) {
//		LNode dummyNode = new LNode(0);
//		LNode l3 = dummyNode;
//		while(l1!=null && l2!=null) {
//			if(l1.data<=l2.data) {
//				l3.next = l1;
//				l1 = l1.next;
//			} else {
//				l3.next = l2;
//				l2 = l2.next;
//			}
//			l3 = l3.next;
//		}
//		
//		if(l1!=null) {
//			l3.next = l1;
//		}
//		if(l2!=null) {
//			l3.next = l2;
//		}
//		return dummyNode.next;
//	}
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