/**
 * 
 */
package com.datastructures.stack;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class SortStackUsingAnotherStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(1);
		stack.push(2);
		System.out.println(" Stack Before Sorting "+stack);
		Stack<Integer> sortedStack = sortStack(stack);
		System.out.println(" Stack After Sorting "+sortedStack);
	}

	private static Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<>();
		if(stack!=null) {
			while(!stack.isEmpty()) {
				Integer poppedElement = stack.pop();
				while(!tempStack.isEmpty() && poppedElement<tempStack.peek()) {
						int tempPop = tempStack.pop();
						stack.push(tempPop);
				}
				tempStack.push(poppedElement);
			}
		}
		return tempStack;
	}
	

}
