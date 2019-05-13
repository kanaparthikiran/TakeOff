package Q1_03_URLify;

import CtCILibrary.AssortedMethods;

public class Question {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		System.out.println(" spaceCount  is "+spaceCount);
		index = trueLength + spaceCount * 2;
		System.out.println(" index  is "+index);

		if (trueLength < str.length) str[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String replaceStringValues(String input) {
		String response = null;
		if(input!=null && input.isEmpty()) {
			String remainingString =
					replaceStringValues(input).trim();
			char[] elements = remainingString.toCharArray();
			for(char element : elements) {
				
			}
		}
		return response;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		System.out.println(" str length  is "+str.length());

		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		System.out.println(" trueLength  is "+trueLength);

		replaceSpaces(arr, trueLength);	
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
		
		
	    LinkedList linkedList = new LinkedList(); 
	    Node headNode = new Node(3);
	    linkedList.addNode(headNode);
	    linkedList.addNode(new Node(5));
	    linkedList.addNode(new Node(1));
	    linkedList.addNode(new Node(2));
	    linkedList.addNode(new Node(4));
	    linkedList.addNode(new Node(6));
	    linkedList.addNode(new Node(9));
	    System.out.println(" Linked List elements are ");
	    linkedList.printList();
	}
}

class LinkedList {
	  Node headNode;
	  public void addNode(Node addNode) {
	    if(headNode==null) {
	       headNode  = addNode;
	      System.out.println(" Set up Node head ");
	    }
	    // }else if(headNode!=null && headNode.nextNode==null) {
	    //   headNode.nextNode = addNode;
	    //   System.out.println(" Added next node to the head Node ");
	    // } 
	    else {
	      Node currentNode = headNode;
	      while(currentNode!=null && currentNode.nextNode!=null) {
	        System.out.println(" Traversing through the linkedlist currentNode data "+currentNode.data);

	        currentNode = currentNode.nextNode; 
	      }
	      currentNode.nextNode = addNode;
	      System.out.println(" Added next node after  the last Node ");

	    }
	      
	  }
	  public void printList() {
	    if(headNode==null) {
	      System.out.println(" There are no nodes in the linkedlist");
	    } else {
	      Node currentNode = headNode;
	     while(currentNode!=null) {
	         System.out.print(" "+currentNode.data);
	       currentNode = currentNode.nextNode;
	     }
	    }
	  }
	}
	class Node {
	 Node nextNode;
	 int data;
	  Node(int data) {
	    this.data = data;
	  }
	  Node(Node node,int data) {
	    this.nextNode = node;
	    this.data = data;
	  }
	}

