package com.resto.comparator;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

import com.resto.comparator.threadpool.WorkerThread;

import java.util.concurrent.TimeUnit;



/**
 * @author Kiran
 *
 */
public class MessageListenerTest {

	private String messageHandler="TESTNAME";
	private int maxThreads = 5;
	private int queueSize = 6000;
	private int maxMessages = 6000;
	private int keepAliveTime =120;
	
	
	
	/**
	 * 
	 */
	public MessageListenerTest() {
	
	}
	
	
	
	/**
	 * 
	 */
	public ThreadPoolExecutor submitTasks() {
		
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		
		ThreadPoolExecutor executorPool = new 
				ThreadPoolExecutor
				(getMaxThreads(), getMaxThreads(),getKeepAliveTime(), TimeUnit.SECONDS, 
				(BlockingQueue<Runnable>) new LinkedBlockingDeque<Runnable>(getQueueSize()),
				threadFactory,new RejectedExecutionHandlerImpl());
		
		executorPool.allowCoreThreadTimeOut(true);
		
		for(int i=0;i<getMaxMessages();i++) {
			executorPool.execute(new ClassUnderTestThreadTest());
		}
		return executorPool;
	}
	
	
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String args[]) throws InterruptedException {
		
		long startTime = System.currentTimeMillis();
		
		MessageListenerTest testThreadPool = new MessageListenerTest();
		
		ThreadPoolExecutor threadPoolExecutor = testThreadPool.submitTasks();
		
		//Optional Code from Here during Unit Test - to see Statistics
		Runtime runTime = Runtime.getRuntime(); 

		runTime.addShutdownHook(new Thread(new ShutdownThread(threadPoolExecutor,startTime)));
		//Optional Code To Here during Unit Test - to see Statistics
		
	}
	
	

	/**
	 * @return the messageHandler
	 */
	public String getMessageHandler() {
		return messageHandler;
	}

	/**
	 * @param pMessageHandler the messageHandler to set
	 */
	public void setMessageHandler(String pMessageHandler) {
		messageHandler = pMessageHandler;
	}

	/**
	 * @return the maxThreads
	 */
	public int getMaxThreads() {
		return maxThreads;
	}

	/**
	 * @param pMaxThreads the maxThreads to set
	 */
	public void setMaxThreads(int pMaxThreads) {
		maxThreads = pMaxThreads;
	}


	/**
	 * @return the maxMessages
	 */
	public int getMaxMessages() {
		return maxMessages;
	}


	/**
	 * @param pMaxMessages the maxMessages to set
	 */
	public void setMaxMessages(int pMaxMessages) {
		maxMessages = pMaxMessages;
	}


	/**
	 * @return the keepAliveTime
	 */
	public int getKeepAliveTime() {
		return keepAliveTime;
	}


	/**
	 * @param pKeepAliveTime the keepAliveTime to set
	 */
	public void setKeepAliveTime(int pKeepAliveTime) {
		keepAliveTime = pKeepAliveTime;
	}



	/**
	 * @return the queueSize
	 */
	public int getQueueSize() {
		return queueSize;
	}



	/**
	 * @param pQueueSize the queueSize to set
	 */
	public void setQueueSize(int pQueueSize) {
		queueSize = pQueueSize;
	}
}


/**
 * 
 * @author farhan
 *
 */
class ClassUnderTestThreadTest implements Runnable  {
	
	
	public void doSomeTask() {
		System.out.println("Start Theread Processing "+Thread.currentThread().getName()+"\n");
		
		System.out.println("Completed Theread Processing "+Thread.currentThread().getName()+"\n");
		
	}
	
	@Override
	public void run() {
		doSomeTask();
	}


}

/**
 * 
 * @author farhan
 *
 */
class ShutdownThread implements Runnable {
	
	private ThreadPoolExecutor executor;
	private long startTime;
	private long endTime;
	
	
	ShutdownThread(ThreadPoolExecutor executor,long startTime) {
		this.executor = executor ;
		this.startTime = startTime;
	}
	
	
	ShutdownThread(ThreadPoolExecutor executor,long startTime,long endTime) {
		this.executor = executor ;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	@Override
	public void run() {
	    System.out.println("Shutdown Hook task STARTED ");  
		endTime = System.currentTimeMillis();

	    System.out.println(" Pool Size "+this.executor.getPoolSize() +
		"\n Core Pool Size "+this.executor.getCorePoolSize() +
		" \n Active Threads Count "+this.executor.getActiveCount() +
		" \n Completed Task Count "+this.executor.getCompletedTaskCount() +
		"\n Task Count "+this.executor.getTaskCount() +
		"\n Is ShutDown "+this.executor.isShutdown() +
		"\n Is Pool Terminating "+this.executor.isTerminating()
		+"\n Queue Remaining Capacity "+this.executor.getQueue().remainingCapacity()
		+"\n Queue Elements as "+this.executor.getQueue());
	    
	    System.out.println("\n Total Memory Used By the Threads -"
				+ "\n Free Memory " + java.lang.Runtime.getRuntime().freeMemory()+"  "
				+ "\n Total Memory " + java.lang.Runtime.getRuntime().totalMemory()+"  "
				+ "\n Max Memory " + java.lang.Runtime.getRuntime().maxMemory()+"  "
				+ "\n Available Processors "
				+ java.lang.Runtime.getRuntime().availableProcessors()+"  "
				+" \n "+" Total Time Taken for Execution "+ ((endTime-startTime)/1000 )+"  Seconds ") ;

	    System.out.println("Shutdown Hook task COMPLETED ");  

	}

	/**
	 * @return the executor
	 */
	public ThreadPoolExecutor getExecutor() {
		return executor;
	}

	/**
	 * @param pExecutor the executor to set
	 */
	public void setExecutor(ThreadPoolExecutor pExecutor) {
		executor = pExecutor;
	}

	/**
	 * @return the startTime
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * @param pStartTime the startTime to set
	 */
	public void setStartTime(long pStartTime) {
		startTime = pStartTime;
	}

	/**
	 * @return the endTime
	 */
	public long getEndTime() {
		return endTime;
	}

	/**
	 * @param pEndTime the endTime to set
	 */
	public void setEndTime(long pEndTime) {
		endTime = pEndTime;
	}
	
}


/**
 * 
 * @author farhan
 *
 */
class RejectedExecutionHandlerImpl extends CallerRunsPolicy {

	/**
	 * 
	 */
	public RejectedExecutionHandlerImpl() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.concurrent.RejectedExecutionHandler#rejectedExecution
	 * (java.lang.Runnable, java.util.concurrent.ThreadPoolExecutor)
	 */
	@Override
	public void rejectedExecution(Runnable pR, ThreadPoolExecutor pExecutor) {
		System.out.println(((WorkerThread) pR) + " is rejected, and Will"
				+ "  be Re-Submitted for Execution  ");
		pExecutor.execute(pR);
	}
}

