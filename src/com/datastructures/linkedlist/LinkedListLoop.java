/**
 * 
 */
package com.datastructures.linkedlist;

import org.apache.batik.apps.svgbrowser.JSVGViewerFrame.PreviousTransformAction;

/**
 * @author kkanaparthi
 *
 */
public class LinkedListLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LLList lLLlist = new LLList();
		lLLlist.addNode(1);
		lLLlist.addNode(2);
		lLLlist.addNode(3);
		lLLlist.printNodes();
		
		lLLlist.reverseListRec();
		System.out.println("\n List after reversal ");
		lLLlist.printNodes();

	}
}


class LLLNode {
	public LLLNode(int data) {
		super();
		this.data = data;
	}
	LLLNode next;
	int data;
}

class LLList {
	LLLNode head;
	
	
	public void addNode(int data) {
		if(head==null) {
			LLLNode element = new LLLNode(data);
			head = element;
			return;
		} else {
			LLLNode current = head;
			while(current!=null && current.next!=null) {
				current = current.next;
			}
			current.next = new LLLNode(data);
		}
	}
	
	public void printNodes() {
		if(head==null) {
			return;
		}
		LLLNode current = head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current = current.next;
		}
	}
	
	
	public void reverseListRec() {
		reverseListRec(head);
	}
	
	public void reverseListRec(LLLNode current) {
		if(current==null) {
			return;
		}
		if(current.next==null) {
			head = current;
			return;
		}
		reverseListRec(current.next);
		current.next.next = current;
		current.next = null;
	}
	
	public void reverseList() {
		LLLNode current = head;
		LLLNode prev = null;
		LLLNode next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head  = prev;
	}
}