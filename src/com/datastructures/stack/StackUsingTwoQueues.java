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
public class StackUsingTwoQueues {
	
	public static void main(String a[]) {
		StackUsingQueues stackUsingTwoQueues =
				 new StackUsingQueues();
		stackUsingTwoQueues.push(1);
		stackUsingTwoQueues.push(2);
		stackUsingTwoQueues.push(3);
		int poppedElement = 
				stackUsingTwoQueues.pop();
		System.out.println(" poppedElement "+poppedElement);
		int poppedElement2 = 
				stackUsingTwoQueues.pop();
		System.out.println(" poppedElement "+poppedElement2);
		int poppedElement3 = 
				stackUsingTwoQueues.pop();
		System.out.println(" poppedElement "+poppedElement3);

	}
}

class StackUsingQueues {
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	public StackUsingQueues() {}
	public void push(int element) {
		q1.add(element);
	}
	public int pop() {
		if(q2.isEmpty()) {
			if(!q1.isEmpty()) {
				for(int i=0;i<q1.size();i++) {
					q2.add(q1.poll());
				}
				int element =  -1;
				if(!q1.isEmpty()) {
					element = q1.poll();
				} else {
					return q2.poll();
				}
				swapQueues();
				return element;
			}
		} else {
			return q2.poll();
		}
		return -1;
	}
	private void swapQueues() {
		Queue<Integer> temp  = null;
		temp = q1;
		q1 = q2;
		q2 = temp;
	}
}
