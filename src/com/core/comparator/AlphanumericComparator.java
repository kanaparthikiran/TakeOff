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
 */
public class AlphanumericComparator {


	public static void main(String[] args) {
		
		AlphanumericComparator alphanumericComparator = new AlphanumericComparator();
		
		Person person1 = new Person("1Kiran",20);
		Person person2 = new Person("10Akhil",3);
		Person person3 = new Person("2Vasu",18);
		Person person4 = new Person("3Apple",25);
		Person person5 = new Person("9Akshay",40);
		Person person6 = new Person("Ram",45);
		Person person7 = new Person("Puppy",30);
		
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
		Collections.sort(personsList,new AgeComparator());

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
		if(pO1!=null && pO2!=null&& pO1.getName()!=null && pO2.getName()!=null) {
			return pO1.getName().compareToIgnoreCase(pO2.getName());
		} 
		return 0;
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