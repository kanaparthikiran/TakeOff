/**
 * 
 */
package com.core.objectpool;

/**
 * @author kkanaparthi
 *
 */
public interface IRHObjectPool {
	
	public Object borrowObject();
	public void returnObject();

}
