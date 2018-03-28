/**
 * 
 */
package com.core.comparator;

import java.util.Comparator;

/**
 * @author kkanaparthi
 *
 */
public class WarehourPriorityComparator implements Comparator<Edge> {

	/**
	 * 
	 */
	public WarehourPriorityComparator() {
	}

	  @Override
	    public int compare(Edge emp1, Edge emp2) {
	        return emp1.getStartNode().getWarehousePriority() -
	        		emp1.getStartNode().getWarehousePriority();
	    }

}
