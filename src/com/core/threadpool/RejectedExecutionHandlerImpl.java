/**
 * 
 */
package com.core.threadpool;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

/**
 * @author kkanaparthi
 *
 */
public class RejectedExecutionHandlerImpl extends CallerRunsPolicy {

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
		System.out.println( " is rejected, and Will"
				+ "  be Re-Submitted for Execution  ");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pExecutor.execute(pR);
	}

}
