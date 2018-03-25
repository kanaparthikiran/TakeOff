/**
 * 
 */
package com.resto.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author kkanaparthi
 *
 */
public class TestUnModified {

	@SuppressWarnings("unchecked")
	private ArrayList<CommerceItem> mArray = new ArrayList(5);

	/**
	 * 
	 */
	public TestUnModified() {
		
	}
	
	/**
	 * 
	 */
	public void setCommerceItems() {
		
		CommerceItem item1 = new CommerceItem();
		CommerceItem item2 = new CommerceItem();
		CommerceItem item3 = new CommerceItem();
		CommerceItem item4 = new CommerceItem();
		CommerceItem item5 = new CommerceItem();
		
		item1.setId(1);item1.setName("item1");
		item2.setId(2);item2.setName("item2");
		item3.setId(3);item3.setName("item3");
		item4.setId(4);item4.setName("item4");
		item5.setId(5);item5.setName("item5");
		
		mArray.add(item1);
		mArray.add(item2);
		mArray.add(item3);
		mArray.add(item4);
		mArray.add(item5);
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestUnModified test  = new TestUnModified();
		test.setCommerceItems();
		List<CommerceItem> commItems =  test.getCommerceItems();
		int count = 100;
		for(CommerceItem commItemsElem : commItems) {
			System.out.println("The Commerce Items are as"
					+ "   follows "+commItemsElem);
			commItemsElem.setId(count);
			count++;
		}
		
//		Iterator iter = commItems.iterator();
//		int counter =1;
//		while (iter.hasNext()) {
//		  if (counter==3) {
//			  System.out.println("NOW Trying to remove ");
//
//			  commItems.remove(iter.next());
//		  } else {
//			  System.out.println("The Counter Element is NOT removed ");
//		  }
//		}
		List<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("world");
		//List<String> unmodifiable = Collections.unmodifiableList(words);
		
		List<String> unmodifiable = new CopyOnWriteArrayList<>();
		unmodifiable.addAll(words);
		List<String> copy = new ArrayList<String>(words);

		System.out.println("Before modification");
		System.out.println("words: " + words);
		System.out.println("unmodifiable: " + unmodifiable);
		System.out.println("copy: " + copy);

//		words.remove("hello");
//		words.add("hi");

		
//		for(String wordsElem : unmodifiable) {
//			System.out.println("NEW LOOP  The Commerce Items are as"
//					+ "   follows "+wordsElem);
//			unmodifiable.remove("hello");
//			unmodifiable.add("hi");
//			count++;
//		}
		
		System.out.println("\nAfter modification");
		System.out.println("words: " + words);
		System.out.println("unmodifiable: " + unmodifiable);
		System.out.println("copy: " + copy);	
	}
	
	public List getCommerceItems() {
		return Collections.unmodifiableList(this.mArray);
	}

}

/**
 * 
 * @author kkanaparthi
 *
 */
class CommerceItem {
	int id;
	String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommerceItem [id=" + id + ", name=" + name + "]";
	}
}
