/**
 * 
 */
package com.datastructures.doublylinkedlist;

/**
 * @author kkanaparthi
 *
 */
public class DoublyLinkedListMergeNodes  {

	private static Node headNode;
	private static Node node1;
	private static Node node2;


	
	public static void main(String a[]) {
		DoublyLinkedListMergeNodes doublyLinkedListMergeNodes = new DoublyLinkedListMergeNodes();
		headNode = new Node(1);
		headNode.nextNode = new Node(3);
		headNode.nextNode.prevNode = headNode;
		
		headNode.nextNode.nextNode =  new Node(5);
		headNode.nextNode.nextNode.prevNode =  headNode.nextNode;

		headNode.nextNode.nextNode.nextNode =  new Node(9);
		headNode.nextNode.nextNode.nextNode.prevNode =  headNode.nextNode.nextNode;

		Node headNodeReturned = doublyLinkedListMergeNodes.mergeNodes(headNode, node1, node2);
		
		System.out.println(" Head Node returned is "+ headNodeReturned.data);
	}


	
	public Node mergeNodes(Node headNode, Node node1, Node node2) {
		Node currentNode = headNode;
		if(headNode==null)  {
			return null;
		} else if( headNode.nextNode.nextNode==null)  {
			return headNode;
		} else {
			while(currentNode.nextNode!=null)  {
					headNode = currentNode.nextNode;
				if(currentNode.data==node1.data && (currentNode.prevNode==node1.prevNode) 
				&& (currentNode.nextNode ==node1.nextNode)) {
					int valueOfNextNode = node1.nextNode.nextNode.data;
					if(valueOfNextNode==node1.data)  {
						Node newNode = new Node(valueOfNextNode/2);
						currentNode.nextNode.nextNode  = newNode;
						newNode.prevNode = currentNode;
					}
				} else if(currentNode.data == node2.data)  {
				 	int valueOfNextNode = node2.nextNode.nextNode.data;
					if(valueOfNextNode==node2.data)  {
							Node newNode = new Node(valueOfNextNode/2);
						newNode.prevNode = headNode;
						currentNode.nextNode.nextNode  = newNode;
					}
				} else {
					System.out.println("Node is not matched ");
					return headNode;
				}
			}
		
		}	
		return headNode;
	}


}


