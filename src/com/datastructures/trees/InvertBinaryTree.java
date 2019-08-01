/**
 * 
 */
package com.datastructures.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class InvertBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		root.left = node2;
		root.right = node3;
		node2.left =node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		Tree tree = new Tree();
		tree.inOrder(root);
		
		tree.invertTree(root);
		System.out.println(" After Binary Tree Reversal ");
		tree.inOrder(root);
		Stack<Integer> data = new Stack<>();
		data.push(1);
		data.push(3);
		data.push(2);
		data.push(5);
		data.push(4);
		System.out.println(" Stack Before Reversal is "+data);
//		reverseStack(data);
//		System.out.println(" Stack After Reversal is "+data);

		reverseStack(data);
		System.out.println(" Stack After Sorting is "+data);
	}

	private static void reverseStack(Stack<Integer> data) {
		if(data==null||data.isEmpty()) {
			return;
		} else {
			Integer element = data.pop();
			reverseStack(data);
			//insertElementAtBottom(data,element);
			sortStack(data, element);
		}

	}
	
	
	private static void sortStack(Stack<Integer> data,int element) {
		if(data.isEmpty()||element>data.peek()) {
			data.push(element);
			return;
		} else {
			Integer poppedElement = data.pop();
			sortStack(data, element);
			data.push(poppedElement);			
		}
	}
	
	private static void insertElementAtBottom(Stack<Integer> data,int element) {
		if(data.isEmpty()) {
			data.push(element);
			return;
		}
		Integer  poppedElement = data.pop();
		insertElementAtBottom(data, element);
		data.push(poppedElement);
	}
	
	private static List<String> phoneLetterCombinations(String data) {
		List<String> results = new ArrayList<>();
		
		if(data==null||data.length()==0) {
			return results;
		}
		
		return results;
	}
	
}



class Tree {
	public TreeNode invertTree(TreeNode root) {
		if(root==null) {
			return null;
		}
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		root.left = right;
		root.right = left;
		return root;
	}
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public void postOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
}