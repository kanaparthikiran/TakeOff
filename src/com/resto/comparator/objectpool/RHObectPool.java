/**
 * 
 */
package com.resto.comparator.objectpool;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author kkanaparthi
 *
 */
public class RHObectPool implements IRHObjectPool {

	private int i;
	
	private int totalObjects = 10;
	
	private Queue<Object> linkedBlockingQueue = null;
	
	private ThreadPoolExecutor threadPoolExecutor = null;
	private ExecutorService executorService = null;

	
	/**
	 * 
	 */
	public RHObectPool() {
		
	}
	
	/**
	 * 
	 */
	public RHObectPool(int i) {
		this.setI(i);
		System.out.println("Created Object with I  value as "+i);
	}
	
	
	/**
	 * 
	 */
	public RHObectPool(int i,int totalObjects, Queue<?> linkedBlockingQueue) {
		this.i = i ;
		this.totalObjects= totalObjects;
		this.linkedBlockingQueue = new LinkedBlockingDeque<>(totalObjects);
		
		ExecutorService executorService = Executors.newFixedThreadPool(totalObjects);
		
		System.out.println("Created Object with I  value as "+i);
		
		
	}

	

	@Override
	public Object borrowObject() {
		return null;
	}

	@Override
	public void returnObject() {
		
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param pI the i to set
	 */
	public void setI(int pI) {
		i = pI;
	}

	/**
	 * @return the totalObjects
	 */
	public int getTotalObjects() {
		return totalObjects;
	}

	/**
	 * @param pTotalObjects the totalObjects to set
	 */
	public void setTotalObjects(int pTotalObjects) {
		totalObjects = pTotalObjects;
	}

	/**
	 * @return the linkedBlockingQueue
	 */
	public Queue<?> getLinkedBlockingQueue() {
		return linkedBlockingQueue;
	}

	/**
	 * @param pLinkedBlockingQueue the linkedBlockingQueue to set
	 */
	public void setLinkedBlockingQueue(Queue<Object> pLinkedBlockingQueue) {
		linkedBlockingQueue = pLinkedBlockingQueue;
	}

	/**
	 * @param pE
	 * @return
	 * @see java.util.Queue#add(java.lang.Object)
	 */
	public boolean add(Object pE) {
		return linkedBlockingQueue.add(pE);
	}

	/**
	 * @return
	 * @see java.util.Collection#size()
	 */
	public int size() {
		return linkedBlockingQueue.size();
	}

	/**
	 * @return
	 * @see java.util.Collection#isEmpty()
	 */
	public boolean isEmpty() {
		return linkedBlockingQueue.isEmpty();
	}

	/**
	 * @param pO
	 * @return
	 * @see java.util.Collection#contains(java.lang.Object)
	 */
	public boolean contains(Object pO) {
		return linkedBlockingQueue.contains(pO);
	}

	/**
	 * @param pE
	 * @return
	 * @see java.util.Queue#offer(java.lang.Object)
	 */
	public boolean offer(Object pE) {
		return linkedBlockingQueue.offer(pE);
	}

	/**
	 * @return
	 * @see java.util.Collection#iterator()
	 */
	public Iterator<?> iterator() {
		return linkedBlockingQueue.iterator();
	}

	/**
	 * @return
	 * @see java.util.Queue#remove()
	 */public Object remove(){return linkedBlockingQueue.remove();}

	/**
	 * @return
	 * @see java.util.Queue#poll()
	 */public Object poll(){return linkedBlockingQueue.poll();}

	/**
	 * @return
	 * @see java.util.Collection#toArray()
	 */
	public Object[] toArray() {
		return linkedBlockingQueue.toArray();
	}

	/**
	 * @return
	 * @see java.util.Queue#element()
	 */public Object element(){return linkedBlockingQueue.element();}

	/**
	 * @return
	 * @see java.util.Queue#peek()
	 */public Object peek(){return linkedBlockingQueue.peek();}

	/**
	 * @param pA
	 * @return
	 * @see java.util.Collection#toArray(java.lang.Object[])
	 */
	public <T> T[] toArray(T[] pA) {
		return linkedBlockingQueue.toArray(pA);
	}

	/**
	 * @param pO
	 * @return
	 * @see java.util.Collection#remove(java.lang.Object)
	 */
	public boolean remove(Object pO) {
		return linkedBlockingQueue.remove(pO);
	}

	/**
	 * @param pC
	 * @return
	 * @see java.util.Collection#containsAll(java.util.Collection)
	 */
	public boolean containsAll(Collection<?> pC) {
		return linkedBlockingQueue.containsAll(pC);
	}

	/**
	 * @param pC
	 * @return
	 * @see java.util.Collection#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection<Object> pC) {
		return linkedBlockingQueue.addAll(pC);
	}

	/**
	 * @param pC
	 * @return
	 * @see java.util.Collection#removeAll(java.util.Collection)
	 */
	public boolean removeAll(Collection<?> pC) {
		return linkedBlockingQueue.removeAll(pC);
	}

	/**
	 * @param pC
	 * @return
	 * @see java.util.Collection#retainAll(java.util.Collection)
	 */
	public boolean retainAll(Collection<?> pC) {
		return linkedBlockingQueue.retainAll(pC);
	}

	/**
	 * 
	 * @see java.util.Collection#clear()
	 */
	public void clear() {
		linkedBlockingQueue.clear();
	}

	/**
	 * @param pO
	 * @return
	 * @see java.util.Collection#equals(java.lang.Object)
	 */
	public boolean equals(Object pO) {
		return linkedBlockingQueue.equals(pO);
	}

	/**
	 * @return
	 * @see java.util.Collection#hashCode()
	 */
	public int hashCode() {
		return linkedBlockingQueue.hashCode();
	}

	
}
