/**
 * 
 */
package com.resto.comparator.threadpool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author kkanaparthi
 *
 */
public class ThreadPoolMonitorThread implements Runnable {

	
	private ThreadPoolExecutor executor;
	private int seconds;
	private boolean run = true;
	
	
	/**
	 * 
	 */
	public ThreadPoolMonitorThread() {
	}
	
	public ThreadPoolMonitorThread(ThreadPoolExecutor executor, int delay) {
		this.executor = executor ;
		this.seconds = delay ;
	}

	public void shutdown() {
		this.run = false;
	}
	
	
	@Override
	public void run() {
		while(run) {
			System.out.println(" Pool Size "+this.executor.getPoolSize() +
			"\n Core Pool Size "+this.executor.getCorePoolSize() +
			" \n Active Threads Count "+this.executor.getActiveCount() +
			" \n Completed Task Count "+this.executor.getCompletedTaskCount() +
			"\n Task Count "+this.executor.getTaskCount() +
			"\n Is ShutDown "+this.executor.isShutdown() +
			"\n Is Pool Terminating "+this.executor.isTerminating()
			+"\n Queue Remaining Capacity "+this.executor.getQueue().remainingCapacity()
			+"\n Queue Elements as "+this.executor.getQueue());
			System.out.println("Total Memory Used By the Threads -"
					+ "\n Free Memory " + java.lang.Runtime.getRuntime().freeMemory()+"  "
					+ "\n Total Memory " + java.lang.Runtime.getRuntime().totalMemory()+"  "
					+ "\n Max Memory " + java.lang.Runtime.getRuntime().maxMemory()+"  "
					+ "\n Available Processors " + java.lang.Runtime.getRuntime().availableProcessors()+"  ");
			try {
				Thread.sleep(seconds*1000);
				
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	
}
