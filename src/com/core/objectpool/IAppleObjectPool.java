/**
 * 
 */
package com.core.objectpool;

/**
 * @author kkanaparthi
 *
 */
public interface IAppleObjectPool {
	
	public Object borrowObject();
	public void returnObject();

}
