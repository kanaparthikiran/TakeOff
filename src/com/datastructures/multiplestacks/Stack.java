/**
 * 
 */
package com.datastructures.multiplestacks;

import java.util.EmptyStackException;

/**
 * @author kkanaparthi
 *
 */
public class Stack {

	private StackNode topOfStack;
	
	/**
	 * 
	 * @param pushedNode
	 */
	private void push(StackNode pushedNode) {
		if(topOfStack==null) {
			topOfStack = pushedNode;
		} else {
			pushedNode.nextNode = topOfStack;
			topOfStack = pushedNode;
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	private StackNode pop() {
		if(topOfStack==null) {
			throw new EmptyStackException();
		}
		StackNode returnedNode = null;
		returnedNode = 
				new StackNode(topOfStack.data);
		topOfStack = topOfStack.nextNode;

		return returnedNode;
	}
	
	/**
	 * This method peeks the Node from the Stack
	 * @return
	 */
	public StackNode peek() {
		if(topOfStack==null) {
			throw new EmptyStackException();
		}
		return
				new StackNode(topOfStack.data);
	}
	
	
	public static void main(String a[]) {
		
		Stack stack = new Stack();
		stack.push(new StackNode(1));
		stack.push(new StackNode(3));
		stack.push(new StackNode(4));
		stack.push(new StackNode(5));
		
		System.out.println("  "+stack.pop());
		System.out.println("  "+stack.pop());
		System.out.println("  "+stack.pop());
		System.out.println("  "+stack.pop());
	}
}


class StackNode {
	
	int data;
	StackNode nextNode;
	
	/**
	 * @param pData
	 */
	public StackNode(int pData) {
		super();
		data = pData;
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
	 * @return the nextNode
	 */
	public StackNode getNextNode() {
		return nextNode;
	}
	/**
	 * @param pNextNode the nextNode to set
	 */
	public void setNextNode(StackNode pNextNode) {
		nextNode = pNextNode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StackNode [data=" + data + ", nextNode=" + nextNode + "]";
	}
}