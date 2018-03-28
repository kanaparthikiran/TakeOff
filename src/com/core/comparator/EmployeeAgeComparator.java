/**
 * 
 */
package com.core.comparator;

import java.util.Comparator;

/**
 * @author kkanaparthi
 *
 */
public class EmployeeAgeComparator implements Comparator<Employee> {

	/**
	 * 
	 */
	public EmployeeAgeComparator() {
	}

	  @Override
	    public int compare(Employee emp1, Employee emp2) {
	        return emp1.getAge() - emp2.getAge();
	    }

}
