/**
 * 
 */
package com.test.core;

/**
 * @author kkanaparthi
 *
 */
public class BinaryTree {

	private static TreeNode rootNode;
	
	/**
	 * 
	 */
	public BinaryTree() {
	}
	
	private static void addNode(int key,int name)  {
		TreeNode newNode  = new TreeNode(key,name);
		
		if(rootNode==null) {
			rootNode = newNode;
		} else {
			TreeNode focusNode = rootNode;
			TreeNode parentNode;
			
			while(true) {
				if(key<focusNode.getKey()) {
					focusNode  = focusNode.getLeftChild();
				
					if(focusNode  == null ) {
						
					} 
				}  else  {
					focusNode = focusNode.getRightChild();
					
				}
			}
		}
	}
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}



class TreeNode {
	
	public TreeNode(int key, int name) {
		super();
		this.key = key;
		this.name = name;
	}
	public TreeNode(int key, int name, TreeNode leftChild, TreeNode rightChild) {
		super();
		this.key = key;
		this.name = name;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	private int key;
	
	private int name;

	private TreeNode leftChild;
	private TreeNode rightChild;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TreeNode [key=" + key + ", name=" + name + "]";
	}
	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
	/**
	 * @return the name
	 */
	public int getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(int name) {
		this.name = name;
	}
	/**
	 * @return the leftChild
	 */
	public TreeNode getLeftChild() {
		return leftChild;
	}
	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	/**
	 * @return the rightChild
	 */
	public TreeNode getRightChild() {
		return rightChild;
	}
	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	


	
}
