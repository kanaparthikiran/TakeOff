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
public class QueueRevereseUsingStack {

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
		reverseQueue(queue);
		System.out.println("Queue After Reverse "+queue);
	}

	/**
	 * 
	 * @param queue
	 */
	private static void reverseQueue(Queue<Integer> queue) {
		Stack<Integer> temp = new Stack<>();
		if(queue!=null) {
			while(!queue.isEmpty()) {
				temp.push(queue.poll());
			}
			while(!temp.isEmpty()) {
				queue.add(temp.pop());
			}
		}
	}
	
}
