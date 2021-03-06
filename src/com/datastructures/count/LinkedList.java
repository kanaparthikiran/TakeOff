package com.datastructures.count;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Kiran
 *
 */
public class LinkedList {

	Node headNode;
	
	
	/**
	 *  This method appends the Node at the end of the List
	 *  
	 * @param data
	 */
	public void appendNode(int data) {
		Node currentNode = headNode;
		if(currentNode == null) {
			Node newNode = new Node(data);
			headNode = newNode;
			return;
		}
		while(currentNode.getNextNode()!=null) {
			currentNode = currentNode.getNextNode();
		}
		currentNode.setNextNode(new Node(data));
	}

	
	/**
	 * This method adds the Node at the Head of the LinkedList
	 * 
	 * @param data
	 */
	public void prependNode(int data) {
		Node currentNode = headNode;
		if(currentNode == null) {
			Node newNode = new Node(data);
			headNode = newNode;
		} else {
			if(currentNode!=null) {
				Node newNode = new Node(data);
				headNode = newNode;
				newNode.setNextNode(currentNode);
			}
		}
	}
	
	/**
	 * This method prints all the Nodes/Values of the 
	 * LinkedList
	 * 
	 */
	public void printNodes() {
		Node currentNode = headNode;
		if(currentNode==null) {
			System.out.println(" The Node is Null");
			return;
		} else {
			System.out.print("   "+ currentNode.getData());
			while(currentNode.getNextNode()!=null) {
				currentNode = currentNode.getNextNode();
				System.out.print("=>  "+ currentNode.getData());
				
			}
		}
	}
	
	
//	private Node getNextNodeRecursive(Node currentNode) {
//		if(currentNode==null) {
//			return null;
//		} else {
//			while() {
//				
//			}
//		}
//	}
	
	/**
	 * This method deletes the Duplicates from the
	 * already Sorted LinkedList
	 */
	public void deleteDuplicates() {
		Node currentNode = headNode;
		Node previousNode = headNode;
		if(currentNode==null) {
			return;
		} else {
			if(currentNode.getNextNode()==null) {
				System.out.println(" There are NO duplictaes in the list, "
						+ " only one element is present in the List ");
			} else {
				while(currentNode.getNextNode()!=null) {
					previousNode = currentNode;
					currentNode = currentNode.getNextNode();
					if(previousNode.getData()==currentNode.getData()) {
						previousNode.setNextNode(currentNode.getNextNode());
					}
				}
			}
		}
		
	}
	
	
	
	/**
	 * This method reverses the Given Linked List
	 * 
	 */
	public void reverseLinkedList() {
		System.out.println(" Started reverseLinkedList () "); 
		Node currentNode = headNode;
	//	Node reverseHeadNode = null;
		Node previousNode = null;
		
		// Node prev = null; 
		// Node current = headNode; 
			Node next = currentNode.getNextNode();
			
		    while(currentNode.getNextNode() != null) {
		    	currentNode.setNextNode(previousNode);
		    	previousNode = currentNode;
		        currentNode = next;
		      //  System.out.println("next.data Before "+next.getData());
		        next = currentNode.getNextNode();
		      //  System.out.println("next.data After "+next.getData());
		    }
		 //   System.out.println(" previousNode  is "+previousNode);
		    currentNode.setNextNode(previousNode);
		    headNode = currentNode;
		    
//		if(headNode==null) {
//			return;
//		} else {
//			if(currentNode.getNextNode()==null) {
//				return;
//			} else {
//				while(currentNode.getNextNode()!=null) {
//					previousNode = currentNode;
//				//	System.out.println(" previousNode  Data "+previousNode.getData());
//					currentNode = currentNode.getNextNode();
//
//					System.out.println("1111 currentNode  Data "+currentNode.getData()
//							+" previousNode  Data "+previousNode.getData());
//					
//					//currentNode = currentNode.getNextNode();
//					
//					currentNode.setNextNode(previousNode);
//					
//					currentNode = currentNode.getNextNode();
//					
//					System.out.println("2222 currentNode  Data "+currentNode.getData()
//					+" previousNode  Data "+previousNode.getData()
//					+" currentNode.getNextNode() Data "+currentNode.getNextNode().getData());
//
//				//	currentNode = currentNode.getNextNode();
//					
//
//					lullaby();
//
//
//				}
//				
//				//headNode = previousNode;
//				
//			}
//		}
		System.out.println(" Completed reverseLinkedList () "); 
	}


	/**
	 * 
	 */
	private void lullaby() {
		try {
			Thread.sleep(1000);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

	/**
	 * This method prints the LinkedList 
	 * Elements in Reverse Order
	 * 
	 */
	public void printInReverseOrder() {
		Node currentNode = headNode;
		Node previousNode = headNode;
		
		if(currentNode==null) {
			return;
		} else {
			List<Node> listOfNodes = new ArrayList<Node>();
			//deal One element LinkedList
			if(currentNode.getNextNode()==null) {
				System.out.println(currentNode.getData());
			} else {
				
				while(currentNode.getNextNode()!=null) {
					previousNode = currentNode;
					currentNode = currentNode.getNextNode();
					listOfNodes.add(previousNode);
					System.out.println(" Adding Node value to the List as "+currentNode.getData());
				}
				if(currentNode!=null) {
					System.out.println(" The Last Node is "+currentNode.getData());
					currentNode = previousNode.getNextNode();
					System.out.println(" The Last Node's Next Node is "+currentNode.getData());

					listOfNodes.add(currentNode);
				}
				
				if(listOfNodes!=null && listOfNodes.size()>0) {
					Collections.reverse(listOfNodes);
					listOfNodes.stream().forEach(elem->System.out.print(elem.data+" =>"));
				}
			}
			
		}
		
	}
	
	/**
	 *  This method deletes the Node with the given Data
	 *  
	 * @param data
	 */
	public void deleteNode(int data) {
		Node currentNode = headNode;
		Node previousNode = headNode;
		if(currentNode.getData()==data) {
			headNode = currentNode.getNextNode(); 
			return;
		} else {
			while(currentNode.getNextNode()!=null) {
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
				
				if(currentNode.getData()==data) {
					previousNode.setNextNode(currentNode.getNextNode());
				}
			}
			//if the last element is the element we are looking for 
			if(currentNode.getData()==data) {
				currentNode = null;
			}
		}
	}

	
	/**
	 * This method finds the given element Index in the list
	 * If the Element is Not found, it will return -1
	 * 
	 * @return
	 */
	private int findNodeLocation(int data) {
		int index = -1;
		Node currentElement = headNode;
		int counter =  0;
		if(currentElement!=null) {
			if(currentElement.getData()==data) {
				System.out.println(" Found the Element, "
						+ " which is at the Head of the LinkedList ");
				return 0;
			} else {
				while(currentElement.getNextNode()!=null) {
					currentElement = currentElement.getNextNode();
					counter++;
					if(currentElement.getData()==data) {
						System.out.println(" The Element is Found at the Index "+ counter);
						return counter;
					}
				}
				//If the Element is found at the Last Element, return the Last Element's index
				if(currentElement.getData()==data) {
					return counter++;
				}
			}
		}
		return index;
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.appendNode(1);
		linkedList.appendNode(2);
		linkedList.appendNode(3);
		linkedList.appendNode(4);
		linkedList.appendNode(5);
		linkedList.appendNode(6);
		linkedList.appendNode(7);
		linkedList.printNodes();
		
		  String s = new String("tst");

		
		System.out.println("\n ****  After Removing the Elements from the LinkedList *******");
		
		linkedList.deleteNode(6);
		
	//	linkedList.prependNode(1);
		
		linkedList.printNodes();
		System.out.println("**** Print of Current Nodes is Completed*****");
//		int indexOfTheElement = linkedList.findNodeLocation(20);
//		
//		System.out.println("\n The Index Of the Element Searching is "+ indexOfTheElement);
//		
//	//	linkedList.printInReverseOrder();
//		
//		System.out.println("\n Before Deleting the Duplicates ");
//		linkedList.printNodes();
//
//		
//		
//		System.out.println("\n Ater Deleting the Duplicates \n");
//		linkedList.deleteDuplicates();

		System.out.println("\n\n Now the LinkedList is Reversed, and Printing the Elements \n\n ");
		
		linkedList.reverseLinkedList();
		
		linkedList.printNodes();
		
	}

}


