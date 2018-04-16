/**
 * 
 */
package com.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * @author kkanaparthi
 * 
 * This class performs Alphanumeric Comparison for the 
 * given input Strings, such that if two strings are equal 
 * alphabetically, they should be sorted by their Alphabetic 
 * Values, and then by their Numerical Order in increasing Order.
 *
 */
public class AlphanumericComparator {

	
	public static void main(String[] args) {
		
		Person person1 = new Person("Apple1",20);
		Person person2 = new Person("Apple10",3);
		Person person3 = new Person("2Google",18);
		Person person4 = new Person("Apple6",25);
		Person person5 = new Person("Apple3",21);
		Person person6 = new Person("Amazon",45);
		Person person7 = new Person("Apple2",20);
		
		
		List<Person> personsList = new ArrayList<>();
		personsList.add(person1);
		personsList.add(person2);
		personsList.add(person3);
		personsList.add(person4);
		personsList.add(person5);
		personsList.add(person6);
		personsList.add(person7);
		System.out.println(" Printing the List Elements Before sort ");
		Collections.sort(personsList,new NameComparator());
		//Collections.sort(personsList,new AgeComparator());

		System.out.println(" Printing the List Elements After sort ");
		
		for(Person  person: personsList) {
			System.out.println(" The Person is "+person);
		}
		
	}

	
	
	
	
}

/**
 * 
 * @author kkanaparthi
 *
 */
class NameComparator implements Comparator<Person>  {

	@Override
	public int compare(Person pO1, Person pO2) {
		int compareValue = 0;
		if(pO1!=null && pO2!=null &&
				pO1.getName()!= null && pO2.getName()!= null) {
				if(areDigitsPresent(pO1.getName()) && areDigitsPresent(pO2.getName())) {
					
					String nonDigitString1 = getNonDigitString(pO1.getName());
					String nonDigitString2 = getNonDigitString(pO2.getName());
					
					System.out.println(" nonDigitString1 " + nonDigitString1
							+" nonDigitString2 "+nonDigitString2
							+" pO1.getName() "+pO1.getName()
							+" pO2.getName() "+pO2.getName());
					
					compareValue =
							nonDigitString1.compareToIgnoreCase(nonDigitString2);
					if(compareValue==0) {
						int digit1 = getDigitsPresent(pO1.getName());
						int digit2 = getDigitsPresent(pO2.getName());
						compareValue = digit1 - digit2;
						System.out.println("\n\n pO1.getName() "+pO1.getName()
						+" pO2.getName() "+pO2.getName()
						+" digit1 "+
						digit1
						+" digit2 "+
						digit2
						+" compareValue "+compareValue);
					}
				} else {
					compareValue = pO1.getName().compareToIgnoreCase(pO2.getName());
				}
		}
		return compareValue;
	}

	/**
	 * This methods finds if the given character is Alphabetic 
	 * Character
	 * @param input
	 * @return
	 */
	private String getNonDigitString(String  input) {
		String nonDigitString = "";
		StringBuilder sb = new StringBuilder();
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				char charElem = input.charAt(i);
				if(Character.isLetter((charElem))) {
					sb.append(charElem);
				}
			}
		}
			nonDigitString = sb.toString();
		return nonDigitString;
	}
	
	
	/**
	 * This methods finds if the given character is Alphabetic 
	 * Character
	 * @param input
	 * @return
	 */
	private int getDigitsPresent(String  input) {
		int digitPresent =0;
		StringBuilder stirngBuffer = new StringBuilder();
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				char charElem = input.charAt(i);
				 if(Character.isDigit(charElem)) {
					stirngBuffer.append(charElem);
				} 
			}
		}
			digitPresent = Integer.parseInt(stirngBuffer.toString());
		return digitPresent;
	}
	
	/**
	 * This methods finds if the given character is Alphabetic 
	 * Character
	 * @param input
	 * @return
	 */
	public boolean areDigitsPresent(String  input) {
		boolean digitPresent = false;
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				char charElem = input.charAt(i);
				if(Character.isLetter((charElem))) {
				} else if(Character.isDigit(charElem)) {
					digitPresent = true;
					break;
				} 
			}
		}
		return digitPresent;
	}
	
}

class AgeComparator implements Comparator<Person>  {

	@Override
	public int compare(Person pO1,Person pO2) {
		if(pO1!=null && pO2!=null) {
			return pO1.getAge()-pO2.getAge();
		} 
		return 0;
	}
}



/**
 * 
 * @author kkanaparthi
 *
 */
class Person {

	/**
	 * @param pName
	 * @param pAge
	 */
	public Person(String pName, int pAge) {
		super();
		name = pName;
		age = pAge;
	}
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param pName the name to set
	 */
	public void setName(String pName) {
		name = pName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param pAge the age to set
	 */
	public void setAge(int pAge) {
		age = pAge;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}