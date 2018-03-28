/**
 * 
 */
package com.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class SortingMultipleAttributesExample {

	public static final String NODE_STATUS_ONHAND="onhand";
	public static final String NODE_STATUS_BACKORDER="backOrder";
	public static final String NODE_STATUS_BOTH="both";

	public static final String NODE_STATUS_ALLOW_WEB_ORDERS="allowWebOrders";
	

	public static final int ALLOW_WEB_ORDERS_QUANTITY=99999;
	
	
	public static void main(String[] args) {
		 
        System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");
 
        List<Edge> listEdges = new ArrayList<Edge>();
// 
//        listEdges.add(new Edge("Tom", "Developer", 45, 80000));
//        listEdges.add(new Edge("Sam", "Designer", 40, 75000));
//        listEdges.add(new Edge("Bob", "Designer", 45, 134000));
//        listEdges.add(new Edge("Peter", "Programmer", 25, 60000));
//        listEdges.add(new Edge("Tim", "Designer", 45, 130000));
//        listEdges.add(new Edge("Craig", "Programmer", 30, 52000));
//        listEdges.add(new Edge("Anne", "Programmer", 25, 51000));
//        listEdges.add(new Edge("Alex", "Designer", 30, 120000));
//        listEdges.add(new Edge("Bill", "Programmer", 22, 30000));
//        listEdges.add(new Edge("Samuel", "Developer", 28, 80000));
//        listEdges.add(new Edge("John", "Developer", 35, 67000));
//        listEdges.add(new Edge("Patrick", "Developer", 35, 140000));
//        listEdges.add(new Edge("Alice", "Programmer", 35, 80000));
//        listEdges.add(new Edge("David", "Developer", 35, 99000));
//        listEdges.add(new Edge("Jane", "Designer", 30, 82000));
 
    	
		NodeData n1= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"98", "96", "5", "98", 10l, 5, 
				1, 2, 10, 10, 13);
		NodeData n2= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"97", "96", "5", "98", 10l, 5, 
				2, 2, 10, 999, 13);
		NodeData n3= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"96", "96", "5", "98", 10l, 5, 
				3, 2, 10, 999, 13);
		NodeData n4= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"95", "96", "5", "98", 10l, 5, 
				4, 2, 10, 999, 13);
		
		
		NodeData n5= new NodeData(NODE_STATUS_BOTH, 20l, 10l, true, false, 
				"98", "96", "5", "98", 10l, 5, 
				1, 3, 10, 999, 3);
		NodeData n6= new NodeData(NODE_STATUS_BOTH, 20l, 10l, true, false, 
				"97", "96", "5", "98", 10l, 5, 
				2, 3, 10, 51, 5);
		NodeData n7= new NodeData(NODE_STATUS_BOTH, 20l, 10l, true, false, 
				"96", "96", "5", "98", 10l, 5, 
				3, 3, 10, 61, 3);
		NodeData n8= new NodeData(NODE_STATUS_BOTH, 20l, 10l, true, false, 
				"95", "96", "5", "98", 10l, 5, 
				4, 3, 10, 11, 3);
		

		
//		public NodeData(String nodeType, long quantity, long offset, boolean webEnabled, boolean backOrderNegativeOffset,
//				String bestETAWH, String consolidatedWH, String shipVia, String scfWh, long scfOffset, long transitOffset,
//				int warehousePriority, int stockingLevel, long poOffset, int poWaitFactor1, int poWaitFactor2) {
		NodeData n9= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"98", "96", "5", "98", 10l, 5, 
				1, 2, 10, 999, 13);
		NodeData n10= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"97", "96", "5", "98", 10l, 5, 
				2, 2, 10, 999, 13);
		NodeData n11= new NodeData(NODE_STATUS_BACKORDER, 20l, 10l, true, false, 
				"96", "96", "5", "98", 10l, 5, 
				3, 2, 10, 999, 13);
		NodeData n12= new NodeData(NODE_STATUS_ONHAND, 20l, 10l, true, false, 
				"95", "96", "5", "98", 10l, 5, 
				4, 1, 10, 0, 0);
		
		
		
		Edge edge1 = new Edge(n1,n1.getOffset());
		Edge edge2 = new Edge(n2,n2.getOffset());
		Edge edge3 = new Edge(n3,n3.getOffset());
		Edge edge4 = new Edge(n4,n4.getOffset());
		
		Edge edge5 = new Edge(n5,n5.getOffset());
		Edge edge6 = new Edge(n6,n6.getOffset());
		Edge edge7 = new Edge(n7,n7.getOffset());
		Edge edge8 = new Edge(n8,n8.getOffset());

		Edge edge9 = new Edge(n9,n9.getOffset());
		Edge edge10 = new Edge(n10,n10.getOffset());
		Edge edge11 = new Edge(n11,n11.getOffset());

		Edge edge12 = new Edge(n12,n12.getOffset());

        System.out.println("*** Before sorting:");
 
        listEdges.add(edge1);listEdges.add(edge2);listEdges.add(edge3);listEdges.add(edge4);
        listEdges.add(edge5);listEdges.add(edge6);listEdges.add(edge7);listEdges.add(edge8);
        listEdges.add(edge9);listEdges.add(edge10);listEdges.add(edge11);
        listEdges.add(edge12);
        for (Edge emp : listEdges) {
            System.out.println(emp);
        }
 
//        new WarehouseStockingLevelComparator(),new POWaitFactorOneComparator(),
//		new WarehouseStockingLevelComparator(),new POWaitFactorTwoComparator(),new WarehouseStockingLevelComparator())

        Collections.sort(listEdges, new 
        		WarehouseChainedComparator(new POWaitFactorOneComparator(),new POWaitFactorTwoComparator(),
        		new WarehouseStockingLevelComparator(), new WarehourPriorityComparator()));
 
        System.out.println("\n*** After sorting:");
 
        for (Edge emp : listEdges) {
            System.out.println("Node Type  " + emp.getStartNode().getNodeType()+"  Stocking Level "
            		+emp.getStartNode().getStockingLevel()
            		+"  Warehouse Priority "+emp.getStartNode().getWarehousePriority()+" Wait Factor1 "
            		+emp.getStartNode().getPoWaitFactor1()+"  Wait Factor2 "+emp.getStartNode().getPoWaitFactor2());
        }
 
    }
}
