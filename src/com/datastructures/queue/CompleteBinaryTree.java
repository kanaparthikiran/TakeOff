/**
 * 
 */
package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kkanaparthi
 *
 */
public class CompleteBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BNode rootNode = new BNode(1);
		BNode node2 = new BNode(2);
		BNode node3 = new BNode(3);
		BNode node4 = new BNode(4);
//		BNode node5 = new BNode(5);
		BNode node6 = new BNode(6);
		BNode node7 = new BNode(7);
		rootNode.left = node2;
		rootNode.right = node3;
		
		node2.left = node4;
//		node2.right = node5;

		node3.left = node6;
		node3.right = node7;

		int countNodes = countNodes(rootNode);
		System.out.println("Total Nodes in the Tree "+countNodes);
		
		boolean isCompleteBT = 
				isCompleteRec(rootNode,0,countNodes);
		System.out.println("Is complete Binary Tree "+isCompleteBT);
		
	}

	/**
	 * Finds if the given tree is complete or not,
	 * If complete returns true, else return false.
	 * 
	 * @param node
	 * @return
	 */
	private static boolean isCompleteBinaryTree(BNode node) {
		boolean isComplete = false;
		Queue<BNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			BNode temp = queue.poll();
			if(temp.left!=null) {
				if(isComplete) return false;
				queue.add(temp.left);
			} else {
				isComplete = true;
			}
			if(temp.right!=null) {
				if(isComplete) return false;
				queue.add(temp.right);
			} else {
				isComplete = true;
			}
		}
		return isComplete;
	}
	
	/**
	 * 
	 * @param node
	 * @param index
	 * @param numOfNodes
	 * @return
	 */
	private static boolean isCompleteRec(BNode node,int index,int numOfNodes) {
        // An empty tree is complete 
		if(node==null) {
			return true;
		}
        // If index assigned to current node is more than 
        // number of nodes in tree, then tree is not complete 
		if(index>=numOfNodes) {
			return false;
		}
        // Recur for left and right subtrees 
		return isCompleteRec(node.left,2*index+1,numOfNodes
				) && isCompleteRec(node.right,2*index+1,numOfNodes);
	}
	
	
	private static int countNodes(BNode node) {
		if(node==null) {
			return 0;
		}
		return 1+countNodes(node.left)+
				countNodes(node.right);
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