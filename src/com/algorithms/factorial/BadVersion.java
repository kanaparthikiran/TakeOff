/**
 * 
 */
package com.algorithms.factorial;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kkanaparthi
 *
 */
public class BadVersion extends VersionControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BadVersion badVersion = new BadVersion();
		int firstBadVersion = badVersion.firstBadVersion(10);
		int lastBadVersion = badVersion.lastBadVersion(10);
		System.out.println(" First Bad Version is " + firstBadVersion);
		System.out.println(" Last Bad Version is " + lastBadVersion);
		LLL lll = new LLL();
		lll.appendNode(1);
		lll.appendNode(2);
		lll.appendNode(3);
		lll.appendNode(4);
		lll.appendNode(3);

		lll.printNodes();
		
		lll.reverseList();
		
		lll.deleteDupBuffer();
		
		System.out.println();
		
		System.out.println(" Loop exists "+ lll.detectLoop());
		
		lll.printNodes();

	}

	
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int firstBadVersion(int n) {
		int badVersion = 0;
		if (n > 0) {
			int start = 1;
			int end = n;
			while (start <= end) {
				int middle = start + (end - start)/2;
				if (isBadVersion(middle)) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
			badVersion = start;
		}
		return badVersion;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int lastBadVersion(int n) {
		int badVersion = 0;
		if (n > 0) {
			int start = 1;
			int end = n;
			while (start <= end) {
				int middle = start + (end - start)/2;
				if (isBadVersion(middle)) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
			badVersion = end;
		}
		return badVersion;
	}

}

class VersionControl {
	public boolean isBadVersion(int n) {
		if(n >= 4 && n<=8) {
			return true;
		} else {
			return false;
		}
	}

}

class LLL {
	LLLN head;
	
	
	public void deleteDupNoBuffer() {
		LLLN  currentNode = head;
		while(currentNode!=null) {
			LLLN runner = currentNode;
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

	public void deleteDupBuffer() {
		LLLN currentNode = head;
		Set<Integer> data = new HashSet<>();
		LLLN previous = null;
		while(currentNode!=null) {
			if(!data.contains(currentNode.data)) {
				data.add(currentNode.data);
				previous = currentNode;
			} else {
				previous.next = currentNode.next;
			}
			currentNode = currentNode.next;
		}
	}
	
	
	public void printNodes() {
		if(head==null) {
			return;
		}
		LLLN currentNode = head;
		while(currentNode!=null) {
			System.out.print(" Data "+currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void appendNode(int data) {
		LLLN newNode = new LLLN(data);
		if(head==null) {
			head = newNode;
			return;
		} 
		LLLN currentNode = head;
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	public void reverseList() {
		if(head==null) {
			return;
		}
		LLLN currentNode = head;
		LLLN prev = null;
		LLLN next = null;
		while(currentNode!=null) {
			next = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = next;
		}
		head = prev;
	}
	
	public boolean detectLoop() {
		LLLN slowPointer = head;
		LLLN fastPointer = head;
		boolean loopExists = false;
		while(fastPointer!=null && fastPointer.next!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer==fastPointer) {
				loopExists = true;
				break;
			}
		}		
		return loopExists;
	}
	
}
class LLLN {
	@Override
	public String toString() {
		return "LLLN [data=" + data + "]";
	}
	public LLLN(int data) {
		super();
		this.data = data;
	}
	LLLN next;
	int data;
	
}