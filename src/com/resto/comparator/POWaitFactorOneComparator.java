/**
 * 
 */
package com.resto.comparator;

import java.util.Comparator;

/**
 * @author kkanaparthi
 *
 */
public class POWaitFactorOneComparator implements Comparator<Edge> {
 
    @Override
    public int compare(Edge emp1, Edge emp2) {
        return emp1.getStartNode().getPoWaitFactor1()-emp2.getStartNode().getPoWaitFactor1();
    }

}
