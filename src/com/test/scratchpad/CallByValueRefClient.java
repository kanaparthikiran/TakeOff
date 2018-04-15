/**
 * 
 */
package com.test.scratchpad;

/**
 * @author kkanaparthi
 *
 */
public class CallByValueRefClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Customer customer = new Customer(1, "Kiran");
		renameCustomer(customer);
		System.out.println(" customer in caller "+ customer);
	}
	
	private static void renameCustomer(Customer customer) {
		customer.setName("Akhil");
		System.out.println(" customer in callee "+ customer);
	}

}
