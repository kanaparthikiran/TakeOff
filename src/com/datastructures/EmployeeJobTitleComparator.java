/**
 * 
 */
package com.datastructures;

import java.util.Comparator;

/**
 * @author kkanaparthi
 *
 */
public class EmployeeJobTitleComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getJobTitle().compareTo(emp2.getJobTitle());
    }

	/**
	 * 
	 */
	public EmployeeJobTitleComparator() {
		// TODO Auto-generated constructor stub
	}

}
