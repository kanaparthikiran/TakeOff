/**
 * 
 */
package com.datastructures.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kkanaparthi
 *
 */
public class StackUsingSingleQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackUsingQueue stackUsingQueue = 
				new StackUsingQueue();
		stackUsingQueue.push(1);
		stackUsingQueue.push(2);
		stackUsingQueue.push(3);

		System.out.println("Popped Element First "+ stackUsingQueue.pop());
		System.out.println("Popped Element Second "+ stackUsingQueue.pop());
		System.out.println("Popped Element Third "+ stackUsingQueue.pop());

	}
	
	

}


class StackUsingQueue {
	Queue<Integer> queue = new LinkedList<>();
	
	public void push(int element) {
		queue.add(element);
		for(int i=0;i<=queue.size()-1;i++) {
			queue.add(queue.poll());
		}
	}
	
	public int pop() {
		if(!queue.isEmpty()) {
			return queue.poll();
		}
		return -1;
	}
	
}