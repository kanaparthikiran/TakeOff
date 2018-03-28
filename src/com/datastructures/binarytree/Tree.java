/**
 * 
 */
package com.datastructures.binarytree;

/**
 * @author kkanaparthi
 *
 */
public class Tree {

	private Node[] children;
	private Node rootNode;
	
	
	public  static void main(String a[]) {
		Tree tree = new Tree();
		
		int x = 1;
		for (int i = 0; i < 3; i++) {
		  x += 5 * i;
		  
		  System.out.println(" x at each step is "+ x );
		}
		System.out.println("x value is "+ x);
		
	}

	/**
	 * This method prints the Elements of the 
	 * Tree in InOrder Order
	 */
	public void printInOrder(Node rootNode) {
		if(rootNode==null) {
			return;
		} else {
			if(rootNode.getLeftNode()!=null) {
				printInOrder(rootNode.getLeftNode());
			}
			System.out.println(" ^ "+rootNode.getData());
			
			if(rootNode.getRightNode()!=null) {
				printInOrder(rootNode.getRightNode());
			}
		}
	}
	
	/**
	 * 
	 */
	public void addTreeElements(int data,int leftNodeData,int rightNodeData) {
		if(rootNode==null) {
			rootNode.setData(data);
			rootNode.getLeftNode().setData(leftNodeData);
			rootNode.getRightNode().setData(rightNodeData);
		}
	}
	
	
	
}
