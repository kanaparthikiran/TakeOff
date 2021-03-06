/**
 * 
 */
package com.datastructures.binarytree;

/**
 * @author kkanaparthi
 *
 */
public class Node {

	private int data;
	private Node leftNode;
	private Node rightNode;
	public Node(int data) {
		this.data = data;
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
	 * @return the leftNode
	 */
	public Node getLeftNode() {
		return leftNode;
	}
	/**
	 * @param pLeftNode the leftNode to set
	 */
	public void setLeftNode(Node pLeftNode) {
		leftNode = pLeftNode;
	}
	/**
	 * @return the rightNode
	 */
	public Node getRightNode() {
		return rightNode;
	}
	/**
	 * @param pRightNode the rightNode to set
	 */
	public void setRightNode(Node pRightNode) {
		rightNode = pRightNode;
	}

}
