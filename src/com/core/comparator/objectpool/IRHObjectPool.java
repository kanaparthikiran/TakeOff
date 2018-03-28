/**
 * 
 */
package com.core.comparator.objectpool;

/**
 * @author kkanaparthi
 *
 */
public interface IRHObjectPool {
	
	public Object borrowObject();
	public void returnObject();

}
