/**
 * 
 */
package com.test.scratchpad;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class QueueReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new LinkedList<>();
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		System.out.println(queue);
		Queue<String> response = reverseQueue(queue);
		System.out.println(" After Reversal of the Queue ");
		System.out.println(queue);
	}

	private static Queue<String> reverseQueue(Queue<String> input) {
		if(input!=null && input.size()>0) {
			Stack<String> backup = new Stack<>();

			while(!input.isEmpty()) {
				String firstItem = input.remove();
				backup.push(firstItem);
			}
			while(!backup.isEmpty()) {
				String tos = backup.pop();
				input.add(tos);
			}
		}
		return input;
	}
}
