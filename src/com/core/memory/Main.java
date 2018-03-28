/**

 * @author kkanaparthi
 *
 */
package com.core.memory;


public class Main {

    public static void main(String... a) {
        Bio b = new Bio();
        Bio b1 = new Bio();
        Bio b2 = new Bio();
        Bio b3 = new Bio();
        Bio b4 = new Bio();
        Bio bio = new Bio();
        
        try {
			Bio bioLocal = (Bio) Class.forName("com.core.memory.Bio").newInstance();
			Bio bioLocalA = (Bio) Class.forName("com.core.memory.Bio").newInstance();
			Bio bioLocalB = (Bio) Class.forName("com.core.memory.Bio").newInstance();
			Bio bioLocalC = (Bio) Class.forName("com.core.memory.Bio").newInstance();
			Bio bioLocalD = (Bio) Class.forName("com.core.memory.Bio").newInstance();
			Bio bioLocalE = (Bio) Class.forName("com.core.memory.Bio").newInstance();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
        
        Maths maths = new Maths();

        // Total Objects are created
        System.out.println("Total Objects Created By Application :" 
        + ObjectCounter.totalObjectsCreated());
        // Get Number Of Objects created for class.
        System.out.println("[" + Bio.class.getName() +
        		"] Objects Created :"
                + ObjectCounter.getCount(Bio.class));
        System.out.println("[" + Bio.class.getName() + 
        		"] Objects Created :" + ObjectCounter.getCount(Bio.class));
        System.out.println("[" + Maths.class.getName() +
        		"] Objects Created :" + ObjectCounter.getCount(Maths.class));
        String ab = "hello"+"world";
        String cd = ab+"world";

        String cdef = cd+"world";
        
        String k = "testworld";

        System.out.println("[" + String.class.getName() +
        		"] Objects Created :" + ObjectCounter.getCount(java.lang.String.class));

    }
    
}