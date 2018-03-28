/**
 * 
 */
package com.core.comparator.threadpool;

/**
 * @author kkanaparthi
 *
 */
public class WorkerThread implements Runnable {

	private String command;
	private int threadSleepTime = 5000;
	
	/**
	 * 
	 */
	public WorkerThread() {
		
	}

	
	/**
	 * 
	 */
	public WorkerThread(String command) {
		this.command = command;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		System.out.println("Start Thread "+Thread.currentThread().getName()+" And ID "
				+Thread.currentThread().getId()+"  With Command "+command);
		
		processCommand(command);
		
		System.out.println("Completed Thread "+Thread.currentThread().getName()+" And ID "
				+Thread.currentThread().getId()+"  With Command "+command);

	}

	/**
	 * 
	 */
	private void processCommand(String commandIn) {
		try {
			
//			System.out.println("Command Processed, and Contains a Length of "
//					+ command.length()+" Characters, Also Thread is going to SLEEP NOW ");
			
			Thread.sleep(getThreadSleepTime());
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * @param pCommand the command to set
	 */
	public void setCommand(String pCommand) {
		command = pCommand;
	}


	/**
	 * @return the threadSleepTime
	 */
	public int getThreadSleepTime() {
		return threadSleepTime;
	}


	/**
	 * @param pThreadSleepTime the threadSleepTime to set
	 */
	public void setThreadSleepTime(int pThreadSleepTime) {
		threadSleepTime = pThreadSleepTime;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkerThread [command=" + command 
				+ ", threadSleepTime=" + threadSleepTime 
				+"]";
	}

}
