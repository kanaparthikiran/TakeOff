package com.algorithms.factorial;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Set;

public class Phone {

	public static void main(String[] args) {
		Map<String, String> phonelist = new HashMap<String, String>(); // create a hashmap
		phonelist.put("Amy", "235-125-2352"); // load values
		phonelist.put("Jamie", "235-255-2333");
		phonelist.put("Carol", "516-235-2332");
		phonelist.put("Ted", "235-125-2352");
		System.out.println("print phone list from Hashmap");
		for (String name : phonelist.keySet()) { // get a list of names from the map and iterate
			System.out.println(name + " has phone number " + phonelist.get(name)); // get the phone number now that you
																					// have the value
		}
		Map<String, String> phonelistTree = new TreeMap<String, String>(phonelist); // create a treemap from the hashmap
		System.out.println("print phone list from Treemap");
		for (String name : phonelistTree.keySet()) { // get a list of names from the map and iterate
			System.out.println(name + " has phone number " + phonelist.get(name)); // get the phone numbers from the map
		}
		Set<String> pkset = phonelistTree.keySet(); // get a list of names from the map
		LinkedList<String> pk = new LinkedList<String>(pkset); // turn that set of names into a linked list
		System.out.println("print phone list using recursion");
		printPhoneList(pk, phonelistTree); // use recursion to print out the list - stop when the keyset is empty

	}

	public static void printPhoneList(LinkedList<String> phonekey, Map<String, String> m) {
		if (phonekey.size() == 0) {
			return;
		} else {
			String name = phonekey.get(0);
			phonekey.remove(0);
			System.out.println(name + " has a phone number " + m.get(name));
			printPhoneList(phonekey, m);
		}
	}

}