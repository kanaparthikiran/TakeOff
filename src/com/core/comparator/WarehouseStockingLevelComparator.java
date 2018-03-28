/**
 * 
 */
package com.core.comparator;

import java.util.Comparator;

/**
 * @author kkanaparthi
 *
 */
public class WarehouseStockingLevelComparator implements Comparator<Edge> {
 
    @Override
    public int compare(Edge e1, Edge e2) {
        return e1.getStartNode().getStockingLevel() - e2.getStartNode().getStockingLevel();
    }
}