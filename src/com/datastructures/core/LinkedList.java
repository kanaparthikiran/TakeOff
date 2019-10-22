/**
 * 
 */
package com.datastructures.core;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 */
public class LinkedList{  
	  
	 private Node head;  
	  
	 private static class Node {  
	  private int value;  
	  private Node next;  
	  
	  Node(int value) {  
	   this.value = value;  
	  
	  }  
	 }  
	  
	 public void addToTheLast(Node node) {  
	  if (head == null) {  
	   head = node;  
	  } else {  
	   Node temp = head;  
	   while (temp.next != null)  
	    temp = temp.next;  
	  
	   temp.next = node;  
	  }  
	 }  
	  
	  
	 public void printList(Node head) {  
	  Node temp = head;  
	  while (temp != null) {  
	   System.out.format("%d ", temp.value);  
	   temp = temp.next;  
	  }  
	  System.out.println();  
	 }  
	  
	 // Reverse linkedlist using this function   
	public static Node reverseLinkedList(Node currentNode)  
	 {  
	// For first node, previousNode will be null  
	Node previousNode=null;  
	  Node nextNode;  
	  while(currentNode!=null)  
	  {  
	   nextNode=currentNode.next;  
	  // reversing the link  
	   currentNode.next=previousNode;  
	  // moving currentNode and previousNode by 1 node  
	   previousNode=currentNode;  
	   currentNode=nextNode;  
	  }  
	  return previousNode;  
	 }  
	  
	private static boolean isPalindrome(Node l) {
		 if(l==null || l.next==null) {
		        return true;
		    }
		    boolean isPalindrome = true;
		    Node slowPointer = l;
		    Node fastPointer = l;
		    while(fastPointer!=null && fastPointer.next!=null) {
		        fastPointer = fastPointer.next.next;
		        slowPointer = slowPointer.next;
		    }

		    slowPointer = reverseTest(slowPointer);
		    fastPointer = l;
		    while(slowPointer!=null) {
		     if(slowPointer.value!=fastPointer.value) {
		         return false;
		     }
		     slowPointer = slowPointer.next;
		     fastPointer = fastPointer.next; 
		    }
		    return isPalindrome;
	}
	
	private static Node reverseTest(Node head) {
		Node prev = null;
		Node next = null;
		Node currentNode = head;
	    while(currentNode!=null) {
	        next = currentNode.next;
	        currentNode.next = prev;
	        prev = currentNode;
	        currentNode = next;
	    }
	    return prev;
	}
	
	private static int[] rotateArray(int[] A, int K) {
	    for(int i=0;i<K;i++) {
	        int temp = A[A.length-1];
	        for(int j=A.length-1;j>0;j--) {
	             A[j] = A[j-1];  
	        }
	        A[0] = temp;
	    }
	    return A;
		}	


	
	 public static void main(String[] args) {  
	  LinkedList list = new LinkedList();  
	  int[] response  = list.rotateArray(new int[] {3, 8, 9, 7, 6}, 1);
	  System.out.println(" Array Response is "+ Arrays.toString(response));
	  // Creating a linked list  
	  Node head=new Node(1);  
	  list.addToTheLast(head);  
	  list.addToTheLast(new Node(1000000000));  
	  list.addToTheLast(new Node(-1000000000));  
	  list.addToTheLast(new Node(-1000000000));  
	  list.addToTheLast(new Node(1000000000));  
	   list.addToTheLast(new Node(1));
	  list.printList(head);  
	  System.out.println(" Is Palindrome response "+ list.isPalindrome(head));
	  //Reversing LinkedList  
//	  Node reverseHead=reverseLinkedList(head);  
//	  System.out.println("After reversing");  
//	  list.printList(reverseHead);  
	   
	 }  
	  
	}  

