/**
 * 
 */
package com.datastructures.queue;

import java.util.NoSuchElementException;

import org.apache.batik.apps.svgbrowser.HistoryBrowserInterface.RemoveChildCommand;

/**
 * @author kkanaparthi
 *
 */
public class TestQueue {

	TestQueueNode firstNode;
	TestQueueNode lastNode;
	
	public void add(TestQueueNode node) {
		if(firstNode==null) {
			firstNode = node;
		} 
		if(lastNode==null) {
			lastNode = node;
		} else {
			lastNode.nextNode = node;
			lastNode = node;
		}
	}
	
	public void remove() {
		if(firstNode==null) {
			throw new NoSuchElementException("No such element ");
		}
		if(firstNode.nextNode==null) {
			firstNode = null;
			lastNode = null;
		} else {
			firstNode = firstNode.nextNode;
		}
	}

	public TestQueueNode poll() {
		TestQueueNode firstNode = null;
		
		return firstNode;
	}
	
	public void printAllNodes() {
		TestQueueNode headPointer = firstNode;
		TestQueueNode tailPointer = lastNode;
		
		if(headPointer == null) {
			throw new NoSuchElementException("There is no such element");
		}
		if(tailPointer==null) {
			System.out.println(headPointer);
		} else {
			while(headPointer!=null) {
				System.out.println(headPointer);
				headPointer = headPointer.nextNode;
			}
		}
	}
	
	public static void main(String a[]) {
		TestQueue testQueue = new TestQueue();
		testQueue.add(new TestQueueNode(1));
		testQueue.add(new TestQueueNode(2));
		testQueue.add(new TestQueueNode(3));
		testQueue.add(new TestQueueNode(4));
		testQueue.remove();
		testQueue.remove();
		testQueue.remove();
		testQueue.remove();
		testQueue.printAllNodes();
	}
}


class TestQueueNode {

	public TestQueueNode(int data) {
		super();
		this.data = data;
	}
	public TestQueueNode(int data, TestQueueNode nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	int data;
	TestQueueNode nextNode;
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the nextNode
	 */
	public TestQueueNode getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(TestQueueNode nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString() {
		return "data=" + data;
	}
}