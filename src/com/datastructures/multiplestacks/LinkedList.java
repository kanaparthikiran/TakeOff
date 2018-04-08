/**
 * 
 */
package com.datastructures.multiplestacks;

/**
 * @author kkanaparthi
 *
 */
public class LinkedList {

	Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new
				LinkedList();
		linkedList.appendNode(1);
		linkedList.appendNode(2);
		linkedList.appendNode(3);
		linkedList.appendNode(4);
		linkedList.appendNode(5);
		
		linkedList.removeNode(new Node(1));

		linkedList.prependNode(new Node(8));
		linkedList.printAllNodes();
		
		Node lastNode = linkedList.getLastNode(new Node(1));

		System.out.println(" Last Node in the LinkedList is "+ lastNode);
	}


	
	
	private void printAllNodes() {
		Node headNode = head;
		if(headNode==null) {
			System.out.println
			(" There are No Nodes Found in the LinkedList");
			return;
		} else {
			System.out.print(" "+head.data);

			while(headNode.next!=null) {
				headNode = headNode.next;
				System.out.print(" "+headNode.data);

			}
		}
	}
	
	/**
	 * This method adds node to the LinkedList
	 * @param data
	 */
	private void appendNode(int data) {
		Node currentNode = head;
		Node newNode = new Node(data);

		if(currentNode==null) {
			head = newNode;
			return;
		}
		if(currentNode.next==null) {
			currentNode.next=newNode;
		} else {
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		System.out.println(" Added new Node to the linkedList ");
	}
	
	

	/**
	 * This method prepends the Node
	 * to the head of the linkedlist
	 */
	private void prependNode(Node prependNode) {
		Node currentNode = head;
		if(currentNode==null) {
			head = prependNode;
		} else {
			prependNode.next = currentNode;
			head = prependNode;
		}
	}
	
	
	private Node getLastNode(Node headNode) {
		Node currentNode = head;
		if(currentNode==null) {
			return null;
		}  else {
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			return currentNode;
		}
	}
	
	
	/**
	 * 
	 * @param node
	 */
	private void removeNode(Node node) {
		Node currentNode = head;
		Node previousNode = null;
		if(currentNode==null) {
			return;
		} else {
			if(currentNode.data==node.data) {
				head = currentNode.next;
				return;
			} else {
				while(currentNode.next!=null) {
					previousNode = currentNode;
					currentNode = currentNode.next;
					if(currentNode.data==node.data) {
						previousNode.next = currentNode.next;
					}
				}
				if(currentNode.data==node.data) {
					currentNode = null;
				}
			}
		}
	}
}


class Node {
	
	/**
	 * @param pData
	 */
	public Node(int pData) {
		super();
		data = pData;
	}
	int data;
	Node next;
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param pData the data to set
	 */
	public void setData(int pData) {
		data = pData;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param pNext the next to set
	 */
	public void setNext(Node pNext) {
		next = pNext;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [data=" + data + "] => "+ next + "]";
	}
}