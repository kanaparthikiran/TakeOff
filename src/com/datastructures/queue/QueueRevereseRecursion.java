/**
 * 
 */
package com.datastructures.queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * @author kkanaparthi
 *
 */
public class QueueRevereseRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(4);
		queue.add(6);
		queue.add(7);
		System.out.println("Queue Before Reverse "+queue);
		reverseQueueIt(queue);
		//reverse(queue);
		System.out.println(" Queue After Reverse "+queue);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println("Stack Before Reverse "+stack);
		stackReverse(stack);
		System.out.println("Stack After Reverse "+stack);

		StackUsingQueue stackUsingQueue = new StackUsingQueue(new LinkedList<Integer>(),new LinkedList<Integer>());
		
		stackUsingQueue.push(1);
		stackUsingQueue.push(2);
		stackUsingQueue.push(3);

		int poppedElement = stackUsingQueue.pop();
		System.out.println(" poppedElement "+poppedElement);
		int poppedElement2 = stackUsingQueue.pop();
		System.out.println(" poppedElement "+poppedElement2);
		int poppedElement3 = stackUsingQueue.pop();
		System.out.println(" poppedElement "+poppedElement3);

	}

	/**
	 * 
	 * @param queue
	 */
	private static void reverseQueue(Queue<Integer> queue) {
		if(queue!=null) {
			if(queue.isEmpty()) {
				return;
			} else {
				Integer element = queue.poll();
				reverseQueue(queue);
				queue.add(element);
			}
		}
	}
	
	
	private static void reverse(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return;
		} else {
			Integer element = queue.poll();
			reverse(queue);
			queue.add(element);
		}
	}
	
	
	private static void reverseQueueTest(Queue<Integer> queue) {
		if(queue==null||queue.isEmpty()) {
			return;
		} else {
			int element = queue.poll();
			reverseQueueTest(queue);
			queue.add(element);
		}
	}
	
	private static void reverseQueueIt(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		if(queue!=null) {
			while(!queue.isEmpty()) {
				stack.push(queue.poll());
			}
			while(!stack.isEmpty()) {
				queue.add(stack.pop());
			}
		}
	}
	
	private static void stackReverse(Stack<Integer> stack) {
		if(stack==null||stack.isEmpty()) {
			return;
		} else {
			int element = stack.pop();
			stackReverse(stack);
			stackReverseHelper(stack,element);
		}
	}
	
	private static void stackReverseHelper(Stack<Integer> stack, int element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			int data = stack.pop();
			stackReverseHelper(stack, element);
			stack.push(data);
		}
	}

	
	private static void stackUsingQueues(Stack<Integer> stack) {
		if(stack!=null) {
			Queue<Integer> q1 = new LinkedList<>();
			Queue<Integer> q2 = new LinkedList<>();

		}
		
	}
	
	
} 

class StackUsingQueue {
	
	private Queue<Integer> q1,q2;
	
	public StackUsingQueue(Queue<Integer> q1,Queue<Integer> q2) {
		this.q1 = q1;
		this.q2 = q2;
	}

	public void push(int element) {
		q1.add(element);
	}
	
	public int pop() {
		int element = 0;
		for(int i=0;i<q1.size();i++) {
			q2.add(q1.poll());
		}
		if(q1!=null && !q1.isEmpty() && q2!=null && !q2.isEmpty()) {
			element = q1.poll();
		}
		Queue<Integer> tempQueue = q1;
		q1 = q2;
		q2 = tempQueue;
		return element;
	}
	
}
