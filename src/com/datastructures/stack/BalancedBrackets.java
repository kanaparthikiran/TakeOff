/**
 * 
 */
package com.datastructures.stack;


/**
 * @author kkanaparthi
 *
 */
public class BalancedBrackets {

	/**
	 * This is the main method that calls the Business methods
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		//BalancedBrackets balancedBrackets = new BalancedBrackets();
		BracketStack stack = new BracketStack();
		
//		stack.push("one");
//		stack.push("two");
//		stack.push("three");
//		stack.push("four");
		
		//stack.pop();
		
		String bracketString = "{[]}";
		boolean isBalanced = stack.findIfBalancedBrackets(bracketString);
		
		System.out.println(" isBalanced  Value is "+isBalanced);
	//	stack.printNodes();

	}
	
	

	
	private boolean isBalancedParentheses(String input) {
		boolean areBalanced = false;
		
		return areBalanced;
	}



}



/**
 * This inner class represents the Stack Class
 * It supports push,pop,peek and print operations.
 * 
 * @author kkanaparthi
 *
 */
 class BracketStack {
	
	private NodeString tosNode;
	
	/**
	 * This method adds node on top of the Top Of the Stack
	 * and becomes the new Top Of Stack
	 */
	public void push(String data) {
		NodeString newNode = new NodeString(data);
		
		if(tosNode==null) {
			tosNode = newNode;
			return;
		} else {
		//	System.out.println(" newNode  "+newNode.getData()+" tosNode "+tosNode.getData());
			newNode.setNext(tosNode);
			tosNode = newNode;
		}
	}
	
	/**
	 * This method prints the nodes of the Stack
	 * from Top Of Stack until the last element
	 */
	public void printNodes() {
		if(tosNode==null) {
			System.out.println(" There are No Nodes in the Stack ");
			return;
		}
		NodeString pointerNode = tosNode;
		
		if(pointerNode!=null) {
			System.out.println(" = "+pointerNode.getData());
		}
		while(pointerNode.getNext()!=null) {
			pointerNode = pointerNode.getNext();
			
//			System.out.println(" pointerNode  "+pointerNode.getData()
//				+" tosNode "+tosNode.getData());
			
			System.out.println(" = "+pointerNode.getData());
		}
	}

	/**
	 * This method finds the Top Of the Stack and simply returns it 
	 * without actually removing the Element
	 * @return
	 */
	public NodeString peek() {
		if(tosNode==null) {
			return null;
		} else {
			return tosNode;
		}
	
	}
	
	
	public boolean isEmpty() {
		return (tosNode==null);
	}
	
	
	/**
	 * This method removes the Node from the
	 * Top of the Stack
	 * 
	 * @return
	 */
	public NodeString pop() {
		NodeString poppedItem = null;
		if(tosNode == null) {
			return null;
		} else {
			poppedItem = tosNode;
			tosNode = tosNode.getNext();
			return poppedItem;
		}
	}
	
	/**
	 * 
	 * @param inString
	 * @return
	 */
	public boolean findIfBalancedBrackets(String inString) {
		boolean isBalanced = false;
		if(!inString.isEmpty()) {
			char[] array = inString.toCharArray();
			for(char charElem : array) {
				if(isStartBracketType(charElem)) {
					push(String.valueOf(charElem));
					System.out.println(" pushing element  "+charElem);
				} else if(isEndBracketType(charElem)) {
					if(isEmpty()) {
						return false;
					} else if(!isMatchFound(pop().getData().toCharArray()[0],inString.toCharArray()[0])) {
						return false;
//						NodeString removedElem = pop();
//						if(removedElem!=null) {
//							System.out.println(" removedElem is "+removedElem.getData());
//						} else {
//							System.out.println(" removedElem is  Null ");
//						}
					}

				} else {
					System.out.println(" The character is InValid for"
							+ " the given type "+charElem);
				}
			}
			if(peek()!=null) {
				isBalanced = false;
			} else {
				isBalanced = true;
			}
		}
		return isBalanced;
	}
	
	
	/**
	 * 
	 * @return
	 */
	private boolean isMatchFound(char inStackChar,char inStringChar) {
		if(inStackChar=='(' && inStackChar==')' ) {
			return true;
		} else if(inStackChar=='[' && inStackChar==']' ) {
			return true;
		} else if(inStackChar=='{' && inStackChar=='}' ) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * This method finds of the given bracket falls in the
	 * start Bracket Type
	 * @return
	 */
	public boolean isStartBracketType(char startChar) {
		System.out.println(" startChar   "+ startChar+" Is "+(startChar=='(' || startChar=='[' || startChar =='{'));
		if(startChar=='(' || startChar=='[' || startChar =='{') {
			return true;
		}
		return false;
	}
	
	/**
	 * This method finds of the given bracket falls in the
	 * start Bracket Type
	 * @return
	 */
	public boolean isEndBracketType(char startChar) {
		if(startChar==')' || startChar==']' || startChar =='}') {
			return true;
		}
		return false;
	}
	
}

 
 class NodeString {
	 
	 private String data;
	 private NodeString next;
	 
	 public NodeString(String nodeData) {
		 this.setData(nodeData);
	 }
	 
	
	/**
	 * @return the next
	 */
	public NodeString getNext() {
		return next;
	}
	/**
	 * @param pNext the next to set
	 */
	public void setNext(NodeString pNext) {
		next = pNext;
	}


	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}


	/**
	 * @param pData the data to set
	 */
	public void setData(String pData) {
		data = pData;
	}
 }

