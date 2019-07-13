/**
 * 
 */
package com.datastructures.stack;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class PrintStackInReverseOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(5);
		stack.push(3);
		System.out.println(" Stack elements "+stack);
		printSameOrder(stack);
		stackSort(stack);
		System.out.println(" Stack elements after reverse "+stack);


	}
	
	
	private static void stackSort(Stack<Integer> stack) {
		if(stack==null||stack.isEmpty()) {
			return;
		}
		Integer element = stack.pop();
		stackSort(stack);
		sortedInsertAtBot(stack,element);
	}
	
	private static void sortedInsertAtBot(Stack<Integer> stack,Integer element) {
		if(stack.isEmpty() || stack.peek()<element) {
			stack.push(element);
			return;
		} else {
			Integer poppedElement = stack.pop();
			sortedInsertAtBot(stack, element);
			stack.push(poppedElement);	
		}
		Math.sqrt(25);

	}
	

	
	
	
	private static void printSameOrder(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		} else {
			Integer poppedItem = stack.peek();
			stack.pop();
			printSameOrder(stack);
			System.out.println("x:"+poppedItem);
			stack.push(poppedItem);
		}
	}
	
	
	private static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		} else {
			Integer pop  = stack.pop();
			reverseStack(stack);
			insertAtBottom(stack,pop);
		}
	}
	
	private static void insertAtBottom(Stack<Integer> stack, Integer element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			Integer pop = stack.pop();
			insertAtBottom(stack, element);
			stack.push(pop);
		}
	}

}
