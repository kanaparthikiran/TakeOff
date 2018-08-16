/**
 * 
 */
package com.test.scratchpad;

/**
 * @author Kiran Kanaparthi
 *
 */
public class MergeLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListTest l1 = new LinkedListTest();
		NodeTest headNode = null;
		headNode =l1.addNode(headNode, 1);
		headNode = l1.addNode(headNode, 3);
		headNode = l1.addNode(headNode, 6);
		
		System.out.println(" l1 all nodes\n ");
		l1.printNodes(headNode);
		
		NodeTest headNodel2 = null;
		LinkedListTest l2 = new LinkedListTest();
		headNodel2 =l2.addNode(headNodel2, 2);
		headNodel2 = l2.addNode(headNodel2, 4);
		System.out.println(" l2 all nodes ");
		l2.printNodes(headNodel2);

		NodeTest mergedHeadNode = l1.mergeList(headNode, headNodel2);
		System.out.println(" Printing the merged/all nodes ");
		l2.printNodes(mergedHeadNode);

	}

	
	
}
