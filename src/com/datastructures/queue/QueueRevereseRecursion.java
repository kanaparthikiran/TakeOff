/**
 * 
 */
package com.datastructures.queue;
import java.util.LinkedList;
import java.util.Queue;
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
		reverse(queue);
		System.out.println(" Queue After Reverse "+queue);
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
}
