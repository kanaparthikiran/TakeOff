/**
 * 
 */
package com.ccivw.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author kkanaparthi
 *
 */
public class MergeKLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l1.next.next = l3;
		
		
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l4.next = l5;
		l4.next.next = l6;
		ListNode mergedList = merge(new ListNode[] {l1,l4});
		while(mergedList!=null) {
			System.out.println(  mergedList.data +" ->" );
		}
	}
	
	private static ListNode merge(ListNode[] lists) {
		if(lists==null||lists.length==0) {
			return null;
		}
		 PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
		        public int compare(ListNode l1, ListNode l2){
		            return l1.data - l2.data;
		        }
		 });
		 ListNode head = new ListNode(0);
		 ListNode p = head;

		 for(ListNode list: lists){
		        if(list!=null)
		            queue.offer(list);
		 }    
		 while(!queue.isEmpty()){
		        ListNode n = queue.poll();
		        p.next = n;
		        p=p.next;
		 
		        if(n.next!=null)
		            queue.offer(n.next);
		    }    
		 return head.next;			
	}
}


class ListNode {
	int data;
	public ListNode(int data) {
		super();
		this.data = data;
	}
	public ListNode(int data, ListNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	ListNode next;
	@Override
	public String toString() {
		return "ListNode [data=" + data +"]";
	}
}