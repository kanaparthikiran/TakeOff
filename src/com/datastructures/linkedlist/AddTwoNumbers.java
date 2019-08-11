/**
 * 
 */
package com.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author kkanaparthi
 *
 */
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		LinkedList ll = new LinkedList();
//		ll.appendNode(1);
//		ll.appendNode(5);
//		ll.appendNode(7);
//
//		LinkedList ll2 = new LinkedList();
//		ll2.appendNode(4);
//		ll2.appendNode(6);
//		ll2.appendNode(2);
//		
//		Node mergedList = 
//				mergeLists(ll.headNode, ll2.headNode);
//		while(mergedList!=null) {
//			System.out.println(mergedList.data+"-> ");
		
		
		System.out.print("Top k Elements are "+ kThLargest(new int[] {1,2,6,3,4,5}, 2));
		
		List<String> allCombinations = 
				getAllCombinations("27753");
		System.out.println(" All Combinations "+allCombinations);
		
		getPermutationsA("abc").stream().forEach(element->System.out.println(element));
		
		}
	
	
	private static Integer kThLargest(int[] data, int k) {
		int result = 0;
		PriorityQueue<Integer> queueElements = new PriorityQueue<>();
		for(int element : data) {
			queueElements.add(element);
			if(queueElements.size()>k) {
				queueElements.poll();
			}		
		}
		System.out.println(" queueElements "+queueElements);
		return queueElements.peek();
	}

	
	
//	/**
//	 * 
//	 * @return
//	 */
//	private List<String> getAllPermutations(String input,
//			String prefix,String suffix,
//			List<String> allPermutations) {
//		if(suffix!=null && suffix.length()==0) {
//			allPermutations.add(prefix+suffix);
//		} else {
//			for(int i=0;i<suffix.length();i++) {
//				String element = suffix.substring(0, i)+
//						suffix.substring(i+1,suffix.length());
//				getAllPermutations(input,
//						prefix+suffix.charAt(i),
//						element, allPermutations);
//			}
//		}
//	return allPermutations;	
//	}
	
	private static List<String> permutations(String data) {
		List<String> response = new ArrayList<>();
		permutationsHelper(data, "", data, response);
		return response;
	}
	
	private static void permutationsHelper(String data,String prefix,
			String suffix,List<String> results) {
		if(suffix!=null&&suffix.length()==0) {
			results.add(prefix+suffix);
			return;
		}
		for(int i=0;i<suffix.length();i++) {
			String element = suffix.subSequence(0, i)+suffix.substring(i+1);
			permutationsHelper(data, 
					prefix+suffix.charAt(i), element, results);
		}
	}
	
	
	
	private static List<String> getPermutationsA(String input) {
		List<String> results = new ArrayList<>();
		getPermutationsHelperA(input,results,"",input);
		return results;
		
	}
	
	private static void getPermutationsHelperA(String input,List<String> results,
			String prefix,String suffix) {
		if(suffix!=null && suffix.length()==0) {
			results.add(prefix+suffix);
			return;
		}
		for(int i=0;i<suffix.length();i++) {
			String element = suffix.substring(0,i)+suffix.substring(i+1);
			getPermutationsHelperA(input, results, prefix+suffix.charAt(i), element);
		}
		
	}
	
	
	
	
	
	private static final List<String> getAllCombinations(String data) {
		List<String> response = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		Map<Character,char[]>  dialPad = createPhoneDialPad();
		//getAllCombinationsHelper(data,sb,dialPad,response);
		getAllCombinationsHelperA(data, response, sb, dialPad);
		return response;
	}

	private static Map<Character,char[]> createPhoneDialPad() {
		Map<Character,char[]> dialPad = new HashMap<>();
		dialPad.put('0', new char[] {});
		dialPad.put('1', new char[] {});
		dialPad.put('2', new char[] {'a','b','c'});
		dialPad.put('3', new char[] {'d','e','f'});
		dialPad.put('4', new char[] {'g','h','i'});
		dialPad.put('5', new char[] {'j','k','l'});
		dialPad.put('6', new char[] {'m','n','o'});
		dialPad.put('7', new char[] {'p','q','r','s'});
		dialPad.put('8', new char[] {'t','u','v'});
		dialPad.put('9', new char[] {'w','x','y','z'});
		return dialPad;
	}
	
	private static void getAllCombinationsHelper
		(String data,StringBuilder sb,Map<Character,char[]> dialPad , 
				List<String> response) {
		if(data.length()==sb.length()) {
			response.add(sb.toString());
			return;
		}
		for(Character element : dialPad.get(data.charAt(sb.length()))) {
			sb.append(element);
			getAllCombinationsHelper(data, sb, dialPad, response);
			sb.deleteCharAt(sb.length()-1);
		}
		
	}
	
	
	private static void getAllCombinationsHelperA(String input,List<String> results,
			StringBuilder sb,Map<Character,char[]> dialPad) {
		if(sb.length()==input.length()) {
			results.add(sb.toString());
			return;
		}
		for(char element : dialPad.get(input.charAt(sb.length()))) {
			sb.append(element);
			getAllCombinationsHelperA(input, results, sb, dialPad);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	

	
	
	private static Node mergeLists(Node l1,Node l2) {
		Node dummyNode = new Node(0);
		Node l3 = dummyNode;
		while(l1!=null && l2!=null) {
			if(l1.data<=l2.data) {
				l3.nextNode = l1;
				l1 = l1.nextNode;
			} else {
				l3.nextNode = l2;
				l2 = l2.nextNode;
			}
			l3 = l3.nextNode;
		}
		
		if(l1!=null) {
			l3.nextNode = l1;
		}
		if(l2!=null) {
			l3.nextNode = l2;
		}
		return dummyNode.nextNode;
	}
//	
//	private static Node mergeLists(Node node1,Node node2) {
//		Node temp = new Node(0);
//		Node node3 = temp;
//		while(node1!=null&&node2!=null) {
//			if(node1.data<=node2.data) {
//				node3.nextNode = node1;
//				node1 = node1.nextNode;
//			} else {
//				node3.nextNode = node2;
//				node2 = node2.nextNode;
//			} 
//			node3 = node3.nextNode;
//		}	
//		return node3.nextNode;
//	}
	
	
}


