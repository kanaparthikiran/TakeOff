/**
 * 
 */
package com.test.count;

/**
 * @author kkanaparthi
 *
 */
public class Node {

	int data;
	Node nextNode;

	 /**
	 * @param pData
	 */
	public Node(int pData) {
		super();
		data = pData;
	}
	 
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
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}
	/**
	 * @param pNextNode the nextNode to set
	 */
	public void setNextNode(Node pNextNode) {
		nextNode = pNextNode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}

}
