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
		stack.push(6);

		System.out.println(" Stack Before Sorting "+stack);
//		Stack<Integer> sortedStack = sortUsingAnother(stack);
//		System.out.println(" Stack After Sorting "+sortedStack);
		Stack<Integer> sortedReponse = sortUsingSS(stack);
		System.out.println(" Stack After sortedReponse "+sortedReponse);
		System.out.println(" Stack After sortedReponse "+sortedReponse);
		sortedReponse = sortUsingSS(stack);
		System.out.println(" Stack After sortedReponse "+stack);

	}

//	private static Stack<Integer> sortStack(Stack<Integer> stack) {
//		Stack<Integer> tempStack = new Stack<>();
//		if(stack!=null) {
//			while(!stack.isEmpty()) {
//				Integer poppedElement = stack.pop();
//				while(!tempStack.isEmpty() && poppedElement<tempStack.peek()) {
//						int tempPop = tempStack.pop();
//						stack.push(tempPop);
//				}
//				tempStack.push(poppedElement);
//			}
//		}
//		return tempStack;
//	}
	

	private static Stack<Integer> sortUsingSS(Stack<Integer> source) {
		Stack<Integer> backupStack = new Stack<>();
		while(!source.isEmpty()) {
			int temp = source.pop();
			while(!backupStack.isEmpty()&& backupStack.peek()>temp) {
				source.push(backupStack.pop());
			} 
			backupStack.push(temp);
		} 
		return backupStack;
	}
	 
	private static Stack<Integer> sortUsingAnother(Stack<Integer> source) {
		Stack<Integer> backupStack = new Stack<>();
		while(!source.isEmpty()) {
			int temp = source.pop();
			while(!backupStack.isEmpty() && backupStack.peek()>temp) {
				source.push(backupStack.pop());
			}
			backupStack.push(temp);
		} 
		return backupStack;
	}
}
