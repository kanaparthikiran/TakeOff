/**
 * 
 */
package com.datastructures.stack;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class SortStackRecusrsion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(5);
		stack.push(1);
		stack.push(4);
		System.out.println(" Stack elements before sorting "+stack);
		sortStack(stack);
		System.out.println(" Stack elements after sorting "+stack);
	}
	
	private static void sortStack(Stack<Integer> stack) {
		if(stack!=null) {
			if(stack.isEmpty()) {
				return;
			} else {
				Integer poppedElement = stack.pop();
				sortStack(stack);
				insertSorted(stack,poppedElement);
			}
		}
	}
	
	private static void insertSorted(Stack<Integer> stack,Integer element) {
		if(stack.isEmpty()||stack.peek()<element) {
			stack.push(element);
		} else {
			Integer poppedElement = stack.pop();
			insertSorted(stack, element);
			stack.push(poppedElement);
		}
	}
}
