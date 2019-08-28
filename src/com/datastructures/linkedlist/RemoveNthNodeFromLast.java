/**
 * 
 */
package com.datastructures.linkedlist;

/**
 * @author kkanaparthi
 *
 */
public class RemoveNthNodeFromLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.setNextNode(n2);
//		n2.setNextNode(n3);
//		n3.setNextNode(n4);
//		n4.setNextNode(n5);
//		printListNodes(n1);
//		Node reversedNode = reverseList(n1);
//		Node latest = removeNthFromEnd(n1, 2);
//		printListNodes(latest);
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//		System.out.println("\n List Nodes after reversal ");
//		printListNodes(reversedNode);

	}

	private static void printListNodes(Node head) {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+"=>");
			currentNode = currentNode.nextNode;
		}
	}
	
	private static Node reverseList(Node head) {
		Node currentNode = head;
		Node prevNode = null;
		Node nextNode = null;
		while(currentNode!=null) {
			nextNode = currentNode.nextNode;
			currentNode.nextNode = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}
	
	
	
    public static boolean isPalindrome(String s) {
        if(s==null || s.length()==0) {
            return true;
        }
        for(int i=0,j=0;i<s.length()/2&&j<s.length()/2;i++,j++) {
            if(!isValidAphebetic(s.charAt(s.length()-1-j))) {
            	j++;
                continue;
            }
            if(!isValidAphebetic(s.charAt(i))) {
            	i++;
                continue;
            }
            char before = s.charAt(i);
            char after = s.charAt(s.length()-1-i);
            System.out.println("before "+ before);
            System.out.println("after "+ after);
            if( 
     Character.toUpperCase(before)!=Character.toUpperCase(after)) {
              return false;  
            } 
        }
        return true;
    }
    private static  boolean  isValidAphebetic(char elem) {
        if((elem>='a' && elem<='z') || (elem>='A' && elem<='Z') ) {
            return true;
        }
        return false;
    }
    
	 public static Node removeNthFromEnd(Node head, int n) {
	        if(head == null || n<0) {
	            return null;
	        }
	        if(n==1 && head.nextNode==null) {
	            return null;
	        }
	        Node currentNode = head;
	        Node fastPointer = head;
	        int i = 1;
	        while(fastPointer!=null && i<n) {
	            fastPointer = fastPointer.nextNode;
	            i++;
	        }
	        while(fastPointer!=null && fastPointer.nextNode!=null) {
	            fastPointer = fastPointer.nextNode;
	            currentNode = currentNode.nextNode;
	        }
	        currentNode.nextNode = currentNode.nextNode.nextNode;
	        return head;
	    }
}
