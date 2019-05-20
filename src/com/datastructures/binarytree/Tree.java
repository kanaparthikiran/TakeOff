/**
 * 
 */
package com.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kkanaparthi
 *
 */
public class Tree {

	private Node[] children;
	private Node rootNode;
	
	
	public  static void main(String a[]) {
		Tree tree = new Tree();
		
		Node node = new Node(1);
		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		
		Node nodeFour = new Node(4);
		Node nodeFive = new Node(5);
		Node nodeSix = new Node(6);
		Node nodeSeven = new Node(7);

		node.setLeftNode(nodeTwo);
		node.setRightNode(nodeThree);
		
		nodeTwo.setLeftNode(nodeFour);
		nodeTwo.setRightNode(nodeFive);

		nodeThree.setLeftNode(nodeSix);
		nodeThree.setRightNode(nodeSeven);

//		int x = 1;
//		for (int i = 0; i < 3; i++) {
//		  x += 5 * i;
//		  
//		  System.out.println(" x at each step is "+ x );
//		}
//		System.out.println("x value is "+ x);
//		inOrder(node);
//		System.out.println();
//		preOrder(node);
//		System.out.println();
//		postOrder(node);
	//	breadthFirst(node);
		System.out.println(" The half nodes count is "+
				countHalfNodes(node)
			+" Leaf Nodes "+countLeafNodes(node));

	}

	
	private static int countHalfNodes(Node node) {
		int halfNodes = 0;
		if(node==null) {
			return -1;
		}
		Queue<Node>  queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println("^"+element.getData());
			if( (element.getLeftNode()==null&&element.getRightNode()!=null)||
					(element.getLeftNode()!=null&&element.getRightNode()==null)
					) {
				halfNodes++;
				System.out.println(" Increased the half "
						+ "nodes count for the node "+element.getData());
			} 
			if(element.getLeftNode()!=null) {
				queue.add(element.getLeftNode());
			}
			if(element.getRightNode()!=null) {
					queue.add(element.getRightNode());
			}
		} 
		return halfNodes;
	}
	
	

	private static int countLeafNodes(Node node) {
		int leafNodes = 0;
		if(node==null) {
			return -1;
		}
		Queue<Node>  queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println("^"+element.getData());
			if((element.getLeftNode()==null&&element.getRightNode()==null)) {
				leafNodes++;
				System.out.println(" Increased the half "
						+ "nodes count for the node "+element.getData());
			} 
			if(element.getLeftNode()!=null) {
				queue.add(element.getLeftNode());
			}
			if(element.getRightNode()!=null) {
					queue.add(element.getRightNode());
			}
		} 
		return leafNodes;
	}
	private static void breadthFirst(Node node) {
		if(node==null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println("^"+element.getData());
			if(element.getLeftNode()!=null) {
				queue.add(element.getLeftNode());
			}
			if(element.getRightNode()!=null) {
				queue.add(element.getRightNode());
			}
		}
	}

	
	
	private static void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.getLeftNode());
		System.out.println("^"+ node.getData());
		inOrder(node.getRightNode());
	}
	

	private static void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.getLeftNode());
		postOrder(node.getRightNode());
		System.out.println("^"+ node.getData());
	}
	

	private static void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println("^"+ node.getData());
		preOrder(node.getLeftNode());
		preOrder(node.getRightNode());
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
			Node node = new Node(data);
			rootNode = node;
			rootNode.getLeftNode().setData(leftNodeData);
			rootNode.getRightNode().setData(rightNodeData);
		} else {
			rootNode.setLeftNode(new Node(leftNodeData));
			rootNode.setRightNode(new Node(rightNodeData));
		}
	}
	
	
	
}
