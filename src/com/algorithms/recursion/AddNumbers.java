/**
 * 
 */
package com.algorithms.recursion;

/**
 * @author kkanaparthi
 *
 */
public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumOfNumbers = addNumbers(10);
		System.out.println(" Sum Of Numbers is "+sumOfNumbers);
		LLList list = new LLList();
		list.appendNode(1);
		list.appendNode(2);
		list.appendNode(3);
		list.appendNode(4);
		list.printNodes();
//		list.reverseList();
//		System.out.println("\n After Reversal of the Nodes the List is ");
//		list.printNodes();
		list.reverseRecursive();
		System.out.println("\n After Reversal of the Nodes the List Recursively is ");
		list.printNodes();
		
//		TreeNode root = new TreeNode(1);
//		TreeNode node2 = new TreeNode(2);
//		TreeNode node3 = new TreeNode(3);
//		TreeNode node4 = new TreeNode(4);
//		TreeNode node5 = new TreeNode(5);
//		TreeNode node6 = new TreeNode(6);
//		TreeNode node7 = new TreeNode(7);
//		
//		
//		root.left = node2;
//		root.right = node3;
//		node2.left =node4;
//		node2.right = node5;
//		node3.left = node6;
//		node3.right = node7;
//		Tree tree = new Tree();
//		tree.inOrder(root);
		
		int[] data = new int[] {1,2,3,4,5,6,7};
		TreeNode node = createBST(data, 0, data.length-1);
		Tree tree = new Tree();
		System.out.println("\n InOrder traversal of the Tree is ");

		tree.inOrder(node);	
		boolean isBalanced = isBalanced(node);
		System.out.println(" Is Balanced Tree is "+isBalanced);
}
	
	private static boolean isBalanced(TreeNode root) {
		if(root==null) {
			return true;
		}
		return 
		isBalanced(root.left) && isBalanced(root.right);
	}
	

	private static int addNumbers(int n) {
		if(n==0) {
			return 0;
		}
		return n+addNumbers(n-1);
	}
	
	private static TreeNode createBST(int[] data, int start, int end) {
		if(data==null||data.length==0) {
			return null;
		}
		if(start>end) return null;
		int middle = start+(end-start)/2;
		TreeNode rootNode = new TreeNode(data[middle]);
		rootNode.left = createBST(data, start, middle-1);
		rootNode.right = createBST(data, middle+1, end);
		return rootNode;
		
	}
	
}

class TreeNode {
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	TreeNode left;
	TreeNode right;
	int data;
}

class Tree {
	
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


class LLList {
	LLNode head;
	
	public void reverseList() {
		LLNode current = head;
		LLNode next = null;
		LLNode prev = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void reverseRecursive() {
		revRec(head);
	}
	
	private void revRec(LLNode node) {
		if(node==null) {
			return;
		}
		if(node.next==null) {
			head = node;
			return;
		}
		revRec(node.next);
		node.next.next = node;
		node.next = null;
	}
	
	public void appendNode(int data) {
		if(head==null) {
			LLNode node = new LLNode(data);
			head = node;
		} else {
			LLNode current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = new LLNode(data);
		}
	}
	
	public void printNodes() {
		LLNode current = head;
		while(current!=null) {
			System.out.print(current.data+" ->");
			current = current.next;
		}
	}
	
	
}



class LLNode {
	public LLNode(int data) {
		super();
		this.data = data;
	}
	LLNode next;
	int data;
}