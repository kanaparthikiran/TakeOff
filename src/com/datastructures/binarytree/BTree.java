/**
 * 
 */
package com.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import Q17_22_Word_Transformer.BFSData;

/**
 * @author kkanaparthi
 *
 */
public class BTree {

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
		
		preOrder(rootNode);
		
		System.out.println(" BFS started from here ");
		bfs(rootNode);
	}
	
	
	public static void preOrder(BNode node) {
		if(node==null) return;
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public static void bfs(BNode node) {
		Queue<BNode> queue = new LinkedList<>(); 
		System.out.println(node.data);
		queue.add(node);
		while(!queue.isEmpty()) {
			BNode element = queue.poll();
			if(element!=null) {
				System.out.println(element.data);
				queue.add(element.left);
				queue.add(element.right);
			}
			

		}
	}

}
class BNode {
	BNode left;
	BNode right;
	int data;
	
	BNode(int data) {
		this.data = data;
	}
}