/**
 * 
 */
package com.datastructures.queue;

import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class QueueUsingStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueWithStack queue = new QueueWithStack();
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		
		//queue.print(queue);
		//java.util.Queue a = null;
		System.out.println(queue);
		queue.deque();
		System.out.println("After Deque "+ queue);
		
	}
}


class QueueWithStack {
	private Stack<Integer> stack = new Stack<>();
	
	public void enque(int element) {
		stack.push(element);
	}
	
	public void deque() {
		if(stack.isEmpty()) {
			System.out.println(" Stack is Empty ");
			return;
		}
		//if(stack.size()==1) {
			Integer element = stack.pop();
			//System.out.println(" Element when size is one "+element);
			System.out.println("aaa "+element);
	//		return;
		//}
		Integer elementPopped = stack.pop();
		//System.out.println(" Element when size is more than one "+elementPopped);
		System.out.println(" bb "+elementPopped);

		deque();
		stack.push(elementPopped);
	}
	
//	
//	public void print(QueueWithStack queue) {
//		if(stack==null||stack.isEmpty()) {
//			System.out.println(" No more elements to print ");
//			return;
//		}
//		if(stack.size()==1) {
//			Integer element = stack.peek();
//			System.out.print(" "+element);
//		}
//		Integer poppedElement = stack.peek();
//		System.out.print(" "+poppedElement);
//		stack.push(poppedElement);
//	}
	
}