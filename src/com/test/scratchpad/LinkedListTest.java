package com.test.scratchpad;

/**
 * 
 * @author Kiran Kanaparthi
 *
 */
class NodeTest {
	int data;
	NodeTest nextNode;
	
	NodeTest(int data) {
		this.data = data;
	}
	
}

/**
 * 
 * @author Kiran Kanaparthi
 *
 */
public class LinkedListTest {
	
	/**
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		LinkedListTest linkedListTest = 
				new LinkedListTest();
		NodeTest headNode = null;
		headNode = linkedListTest.addNode(headNode,1);
//		headNode = linkedListTest.addNode(headNode,2);
//		headNode = linkedListTest.addNode(headNode,3);
		
//		headNode.nextNode
//		headNode.nextNode=headNode;

	//	headNode = linkedListTest.addNode(headNode,1);
		
	//	linkedListTest.printNodes(headNode);
		
//		System.out.println("\n Started to delete the Node");
//		linkedListTest.deleteNode(headNode,3);
//
//		linkedListTest.printNodes(headNode);

//		System.out.println("\n Started to Reverse the LinkedList");
//
//		headNode = linkedListTest.reverseListTOFix(headNode);
//		
//		linkedListTest.printNodes(headNode);

		
//		
//		int decimalValue = linkedListTest.convertbinaryToDecimal(headNode);
//		System.out.println(" Decimal Value is "+ decimalValue);
		
		boolean isLoopPresent = linkedListTest.isLoopPresent(headNode);
		System.out.println("\n Is Loop present "+ isLoopPresent);
	}
	
	/**
	 * 
	 * @param l1
	 * @param l2
	 */
	public NodeTest mergeList(NodeTest l1, NodeTest l2) {
		NodeTest dummyNode = null;
		NodeTest startNodel1 = l1;
		NodeTest startNode2 = l2;
		
		while(startNodel1!=null && startNode2!=null ) {
			
			if(startNodel1.data<startNode2.data) {
				dummyNode = startNodel1;
				startNodel1 = startNodel1.nextNode;
				System.out.println( "11 dummyNode at each step "+dummyNode.data);
				dummyNode = dummyNode.nextNode;

			} else if(startNode2.data<startNodel1.data) {
				dummyNode = startNode2;
				startNode2 = startNode2.nextNode;
				System.out.println( "222 dummyNode at each step "+dummyNode.data);
				dummyNode = dummyNode.nextNode;

			} else {
				dummyNode = startNodel1;
				startNodel1 = startNodel1.nextNode;
				startNode2 = startNode2.nextNode;
				dummyNode = dummyNode.nextNode;
				System.out.println( "333 dummyNode at each step "+dummyNode.data);

			}

		}
		return dummyNode;
	}
	
	
	/**
	 * 
	 * @param headNode
	 * @param data
	 */
	public NodeTest addNode(NodeTest headNode,int data) {
		NodeTest nodeTest = new NodeTest(data);
		if(headNode==null) {
			headNode = nodeTest;
			System.out.println(" Added Node to the LinkedList "+data);
		} else {
			NodeTest startNode = headNode;
			while(startNode!=null && startNode.nextNode!=null) {
				startNode = startNode.nextNode;
			}
			startNode.nextNode = nodeTest;
		}
		return headNode;
	}
	
	/**
	 * 
	 * @param headNode
	 */
	public void printNodes(NodeTest headNode) {
		NodeTest startNode = headNode;
		if(headNode==null) {
		//	System.out.println(" There are  no nodes in the LinkedList");
		} else {
			while(startNode!=null && startNode.nextNode!=null) {
				System.out.print(" "+ startNode.data+" -> ");
				startNode = startNode.nextNode;
			}
			System.out.print(" "+ startNode.data+" -> ");
		}
	}
	
	/**
	 * 
	 * @param node
	 */
	public void deleteNode(NodeTest headNode,int data) {
		NodeTest nodeTest = new NodeTest(data);
		if(headNode==null) {
			System.out.println(" There are no elements in "
					+ " the LinkedList");
			return;
		} else {
			NodeTest startNode = headNode;
			while(startNode!=null && startNode.nextNode!=null) {
				if(startNode.nextNode.data == nodeTest.data ) {
					//delete the node by changing the link
					startNode.nextNode = startNode.nextNode.nextNode;
				}
				startNode = startNode.nextNode;
			}
		}
	}
	
	
	/**
	 * 
	 * @param headNode
	 */
	public NodeTest reverseListTOFix(NodeTest headNode) {
		if(headNode==null) {
			return null;
		} else {
			NodeTest currentNode = headNode;
			NodeTest prev = null;
			NodeTest next = null;
			while(currentNode!=null) {
				next = currentNode.nextNode;
				currentNode.nextNode = prev;
				prev = currentNode;
				currentNode = next;
			}
			return prev;
		}
	}
	
	
	public int convertbinaryToDecimal(NodeTest headNode) {
		int sum = 0;
		NodeTest currentNode = headNode;
		
		while(currentNode!=null) {
			sum = (sum<<1) + currentNode.data;
			System.out.println(" sum at each step "+ sum);
			currentNode = currentNode.nextNode;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param headNode
	 * @return
	 */
	private boolean isLoopPresent(NodeTest headNode) {
		boolean loopPresent = false;
		NodeTest startNode = headNode;
		NodeTest nextNode = startNode.nextNode;
		
		while(nextNode!=null && nextNode!=headNode) {
			nextNode = nextNode.nextNode;
			System.out.println("\n startNode==headNode  "+ (startNode==headNode)
					+" startNode "+startNode.data+"  nextNode "+nextNode.data);
			loopPresent = (startNode==headNode);
			System.out.println("  loopPresent  "+loopPresent);
			return loopPresent;
		}
		return loopPresent;
	}
	
	
}
