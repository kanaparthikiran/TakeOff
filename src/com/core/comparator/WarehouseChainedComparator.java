/**
 * 
 */
package com.core.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class WarehouseChainedComparator implements Comparator<Edge> {
		 
	    private List<Comparator<Edge>> listComparators;
	 
	    @SafeVarargs
	    public WarehouseChainedComparator(Comparator<Edge>... comparators) {
	        this.listComparators = Arrays.asList(comparators);
	        String s;
	    }
	 
	    @Override
	    public int compare(Edge emp1, Edge emp2) {
	        for (Comparator<Edge> comparator : listComparators) {
	            int result = comparator.compare(emp1, emp2);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	    }
}
