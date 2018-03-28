/**
 * 
 */
package com.core.comparator.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

/**
 * @author kkanaparthi
 *
 */
public class WorkerPoolClient {

	/**
	 * 
	 */
	public WorkerPoolClient() {
	}
	
	public static void main(String a[]) throws InterruptedException {
		
		CallerRunsPolicy rejectionHandler = 
				new RejectedExecutionHandlerImpl();
		
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		
		
		ThreadPoolExecutor executorPool = new 
				ThreadPoolExecutor
				(5, 5, 
						12, TimeUnit.SECONDS, 
						(BlockingQueue<Runnable>) new LinkedBlockingDeque<Runnable>(600000),
						threadFactory,rejectionHandler);
		executorPool.allowCoreThreadTimeOut(true);
		

		
		ThreadPoolMonitorThread monitorThreadObj = new ThreadPoolMonitorThread(executorPool,3);
		
		Thread monitorThread = new Thread(monitorThreadObj);
		monitorThread.setName("RH-Monitor-Thread");
		monitorThread.start();
		
		
		for(int i=0;i<100;i++) {
			executorPool.execute(new WorkerThread("command "+i));
		}
		
//		MembershipOrderRenewalMessageHandler memberShipRenewal = new MembershipOrderRenewalMessageHandler();
//		Thread.sleep(30000);
		
//		for(int i=2;i<4;i++) {
//			executorPool.execute(new WorkerThread("command"+i));
//		}
		
	//	Thread.sleep(3000);
		
	//	executorPool.shutdown();
		
	//	Thread.sleep(5000);
		
		
		//executorPool.awaitTermination(2, TimeUnit.SECONDS);

		if(executorPool.isShutdown()  ||
				   executorPool.isTerminated() ||
				   executorPool.isTerminating()) {
			System.out.println("The executorPool.isShutdown() is " + executorPool.isShutdown()
			+"  executorPool.isTerminated() "+executorPool.isTerminated()+ "  executorPool.isTerminating()  "+executorPool.isTerminating());
		}
		
		
		
		
		monitorThreadObj.shutdown();
		

	}
}
