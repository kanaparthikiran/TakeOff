/**
 * 
 */
package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class BSTSpiralForm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BNode rootNode = new BNode(1);
		BNode node2 = new BNode(2);
		BNode node3 = new BNode(3);
		BNode node4 = new BNode(4);
		BNode node5 = new BNode(5);
		BNode node6 = new BNode(6);
		BNode node7 = new BNode(7);
		rootNode.left = node2;
		rootNode.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		printInSpiralForm(rootNode);
	}

	/**
	 * 
	 * @param node
	 */
	private static void printInSpiralForm(BNode node) {
		Stack<BNode> S1 = new Stack<>();
		Stack<BNode> S2 = new Stack<>();
		S1.push(node);
		
		while(!S1.isEmpty() || !S2.isEmpty()) {

			while(!S1.isEmpty()) {
				//Print Nodes of currentLevel from S1 and push nodes from next level to S2
				BNode element = S1.pop();
				System.out.println(element.data);
				if(element.right!=null) {
					S2.push(element.right);
				} 
				if(element.left!=null) {
					S2.push(element.left);
				}
			}
			while(!S2.isEmpty()) {
				BNode element = S2.pop();
				System.out.println(element.data);
				if(element.left!=null) {
					S1.push(element.left);
				}
				if(element.right!=null) {
					S1.push(element.right);
				}
			}
		}
	}
}
