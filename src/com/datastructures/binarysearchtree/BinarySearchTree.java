/**
 * 
 */
package com.datastructures.binarysearchtree;

/**
 * @author kkanaparthi
 *
 */
public class BinarySearchTree {

	private Node rootNode;
	

	/**
	 * 
	 * @param rootNode
	 */
	public void addNodes(int data,int leftNodeData,int rightNodeData) {
		Node node = new Node(data);
		if(rootNode==null) {
			rootNode = node;
			rootNode.setLeftNode(new Node(leftNodeData));
			rootNode.setRightNode(new Node(rightNodeData));
		} else {
			rootNode.setLeftNode(new Node(leftNodeData));
			rootNode.setRightNode(new Node(rightNodeData));
		}
	}
	
	
	private void inOrderTraversal(Node rootNodeParam) {
		rootNodeParam = this.rootNode;
		if(rootNodeParam==null) {
			return;
		} else {
			inOrderTraversal(rootNodeParam.getLeftNode());
			System.out.print(rootNodeParam.getData()
					+"  rootNode.getLeftNode() "+rootNode.getLeftNode());
			inOrderTraversal(rootNodeParam.getRightNode());
		}
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addNodes(3, 1, 5);
		binarySearchTree.inOrderTraversal(new Node(3));
	}

}
