
/**
 * 
 */
package com.resto.comparator.memory;

/**
 * @author kkanaparthi
 *
 */
import java.util.Map;
import java.util.TreeMap;

public abstract class ObjectCounter {

    private static Map<String, Long> classNameCount = new TreeMap<String, Long>();
    
    private static String[] oomSuspects = new String[]{"java.lang.String","javax.xml.bind.JAXBContext"};

    public ObjectCounter() {
        String key = String.class.getName();
        		//this.getClass().getName();
        if (classNameCount.containsKey(key)) {
        	System.out.println("Adding in if clause for the class AS "+key);
            classNameCount.put(key, classNameCount.get(key) + 1);
        } else {
        	System.out.println("Adding in ELSE clause for the class AS "+key);
            classNameCount.put(key, 1L);
        }
    }

    public static <T extends Object> long getCount(Class<T> c) {
        String key = c.getName();
        System.out.println("The Key Name is "+key+"  classNameCount  "+classNameCount);
        
        if (classNameCount.containsKey(key)) {
            return classNameCount.get(key);
        } else {
            return 0;
        }
    }

    public static long totalObjectsCreated() {
        long totalCount = 0;

        for (long count : classNameCount.values()) {
            totalCount += count;
        }
        return totalCount;
    }

} 
