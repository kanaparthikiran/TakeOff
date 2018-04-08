/**
 * 
 */
package com.datastructures.multiplestacks;

import java.util.NoSuchElementException;

/**
 * @author kkanaparthi
 *
 */
public class Queue {

	private QueueNode firstNode;
	private QueueNode lastNode;

	
	/**
	 * 
	 * @param newNode
	 */
	private void add(QueueNode newNode) {
		if(lastNode==null) {
			lastNode = newNode;
		} else {
			lastNode.next = newNode;
		}
		lastNode = newNode; 

		if(firstNode==null) {
			firstNode = lastNode;
		}
	}
	
	/**
	 * 
	 * @param removedNode
	 */
	private QueueNode remove() {
		QueueNode removedNode = null;
		if(firstNode==null) {
			throw new NoSuchElementException("The Queue is Empty ");
		} else {
			removedNode = firstNode;
			firstNode  = firstNode.next;
			if(firstNode==null) {
				lastNode = null;
			}
		}
		return removedNode;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		QueueNode queueNode1 = new QueueNode(1);
		QueueNode queueNode2 = new QueueNode(2);
		QueueNode queueNode3 = new QueueNode(3);
		QueueNode queueNode4 = new QueueNode(5);
		QueueNode queueNode5 = new QueueNode(7);

		queue.add(queueNode1);
		queue.add(queueNode2);
		queue.add(queueNode3);
		queue.add(queueNode4);
		queue.add(queueNode5);
		
		QueueNode removedNode = 
				queue.remove();
		System.out.println(" Removed Node is "+ removedNode);
		QueueNode removedNode2 = 
				queue.remove();
		System.out.println(" Removed Node is "+ removedNode2);

		QueueNode removedNode3= 
				queue.remove();
		System.out.println(" Removed Node is "+ removedNode3);
		
		QueueNode removedNode5 = 
				queue.remove();
		System.out.println(" Removed Node is "+ removedNode5);
		
		QueueNode removedNode7 = 
				queue.remove();
		System.out.println(" Removed Node is "+ removedNode7);
		
		
		QueueNode removedNode8 = 
				queue.remove();
		System.out.println(" Removed Node is "+ removedNode8);

	}

	
}


class QueueNode {
	
	/**
	 * @param pData
	 */
	public QueueNode(int pData) {
		super();
		data = pData;
	}
	int data;
	QueueNode next;
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param pData the data to set
	 */
	public void setData(int pData) {
		data = pData;
	}
	/**
	 * @return the next
	 */
	public QueueNode getNext() {
		return next;
	}
	/**
	 * @param pNext the next to set
	 */
	public void setNext(QueueNode pNext) {
		next = pNext;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QueueNode [data=" + data +"]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueueNode other = (QueueNode) obj;
		if (data != other.data)
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}
	
}