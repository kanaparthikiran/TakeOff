/**
 * 
 */
package com.test.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class LinkedListImpl {

	TestNode testNode = null;
	/**
	 * 
	 */
	public LinkedListImpl(String data) {
		testNode =  new TestNode(null, data);
	}
	
	public void printLinkedListNodes() {
		
	}
	
	public void addNode(TestNode currentNode, TestNode nextNode) {
		if(testNode.getNextNode()==null) {
			testNode.setNextNode(currentNode);
			currentNode.setNextNode(nextNode);
		} else {
			currentNode.setNextNode(nextNode);
		}
	}
	
	public TestNode getNextLinkedListNode() {
		if(testNode!=null &&testNode.getNextNode()!=null) {
			return testNode.getNextNode();
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		LinkedListImpl linkedList = new LinkedListImpl("1");
		//linkedList = null;
		//testNode
		TestNode nextNode1 = new TestNode();
		nextNode1.setData("2");
		
		TestNode nextNode2 = new TestNode();
		nextNode2.setData("3");
		linkedList.addNode(nextNode1,nextNode2);

		TestNode nextNode3 = new TestNode();
		nextNode3.setData("4");
		linkedList.addNode(nextNode2,nextNode3);

		TestNode nextNode4 = new TestNode();
		nextNode4.setData("5");
		linkedList.addNode(nextNode3,nextNode4);

		
		System.out.println("PRINTING THE NODES OF THE LINKEDLIST AS "
				+linkedList.testNode+"---> "
				+ linkedList.testNode.getNextNode()+"--->"+
				 linkedList.testNode.getNextNode().getNextNode()
				 +" ---> "+linkedList.testNode.getNextNode().getNextNode().getNextNode());
	
		TestNode toPrint = linkedList.getTestNode();
		
//		int i=0;
//		while(i<=5) {
//			System.out.println("i "+i);
//			i++;
//		}
		while(toPrint!=null) {
			// toPrint = toPrint;
			//toPrint = toPrint.getNextNode();
		//	Instrumentation instrument = new ClassDefinition();
			System.out.println("\n  LinkedList Element toPrint "+toPrint);
			toPrint = toPrint.getNextNode();
		}
		LinkedListImpl reverseLinkedList = linkedList.reverseLinkedList(linkedList);

		TestNode toPrintInReverse = reverseLinkedList.getTestNode();

		while(toPrintInReverse!=null) {
			// toPrint = toPrint;
			//toPrint = toPrint.getNextNode();
		//	Instrumentation instrument = new ClassDefinition();
			System.out.println("\n  LinkedList Element toPrintInReverse "+toPrintInReverse);
			toPrintInReverse = toPrintInReverse.getNextNode();
		}
		
	}

	/**
	 * 
	 * @param inLinkedList
	 * @return
	 */
	public LinkedListImpl reverseLinkedList (LinkedListImpl inLinkedList) {
		
		TestNode testNodeForReverse = inLinkedList.getTestNode();
		List<TestNode> testNodeElems = new ArrayList<TestNode>();
		TestNode nextNode = testNodeForReverse;
		
		while(nextNode!=null) {
			//nextNode = testNodeForReverse;
			if(nextNode!=null) {
				if(nextNode.getNextNode()==null) {
					inLinkedList.setTestNode(nextNode);
					System.out.println("Adding the Element to the List as First Node "+nextNode);
				} else {
					System.out.println("Adding the Element to the List as "+nextNode);
					testNodeElems.add(nextNode);
				}
				nextNode = nextNode.getNextNode();
			} else {
				System.out.println("Exiting the Loop ");
				break;
			}
		}
		
		System.out.println(" Adding All Elements to the LinkedList is Completed ");
		
			if(!testNodeElems.isEmpty()) {
				Collections.reverse(testNodeElems);
				TestNode secondNode = new TestNode();
				for(int i=0;i<testNodeElems.size();i++) {
					//inLinkedList.addNode(testNodeElem,testNodeElem.getNextNode());
					//testNodeElem = testNodeElem.getNextNode();
					TestNode testNodeElem =  testNodeElems.get(i);
					secondNode.setNextNode(testNodeElem);
					secondNode = testNodeElem;
				}
			}
			
			return inLinkedList;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LinkedListImpl [toString()=" + super.toString() + "]";
	}

	/**
	 * @return the testNode
	 */
	public TestNode getTestNode() {
		return testNode;
	}

	/**
	 * @param testNode the testNode to set
	 */
	public void setTestNode(TestNode testNode) {
		this.testNode = testNode;
	}

}


class TestNode {
	
	public void printData(TestNode testNode) {
			toString();
	}

	public TestNode() {

	}
	
	public TestNode(TestNode nextNode, String data) {
		super();
		this.nextNode = nextNode;
		this.data = data;
	}
	
	private TestNode nextNode;
	private String data;
	/**
	 * @return the nextNode
	 */
	public TestNode getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(TestNode nextNode) {
		this.nextNode = nextNode;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestNode [ data=" + data +" nextNode=" + 
				System.identityHashCode(nextNode) + " ]";
	}
	
}