/**
 * 
 */
package com.core.comparator;

import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListMap;


/**
 * @author kkanaparthi
 *
 */
public class OffsetMDBTest {

	/**
	 * 
	 */
	public OffsetMDBTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OffsetMDB mdb1 = new OffsetMDB("5", 10, 20, null,
				1000, false, "123 456AB", false, 100,
				20, 20,false, null,
				false, 20, 5, "95", null,
				null, null, null,
				null, "97", "96", "",
				"", "", "", "", "",20);
		OffsetMDB mdb2 = new OffsetMDB("5", 10, 20, null,
				1000, false, "123 456AC", false, 100,
				20, 20,false, null,
				false, 20, 5, "95", null,
				null, null, null,
				null, "97", "96", "",
				"", "", "", "", "",20);
		OffsetMDB mdb3 = new OffsetMDB("5", 10, 20, null,
				1000, false, "123 456AD", false, 100,
				20, 20,false, null,
				false, 20, 5, "95", null,
				null, null, null,
				null, "97", "96", "",
				"", "", "", "", "",20);
//		ConcurrentSkipListMap<OffsetMDB,OffsetMDB> inDoorOrOutDoorDefaultGroupingContents =
//				new ConcurrentSkipListMap<OffsetMDB,OffsetMDB>(new FullSKUIDComparator());
//		
		ConcurrentSkipListMap<OffsetMDB,OffsetMDB> inDoorOrOutDoorDefaultGroupingContents =
				new ConcurrentSkipListMap<OffsetMDB,OffsetMDB>();
//		
		inDoorOrOutDoorDefaultGroupingContents.put(mdb1, mdb1);
		inDoorOrOutDoorDefaultGroupingContents.put(mdb2, mdb2);
		inDoorOrOutDoorDefaultGroupingContents.put(mdb3, mdb3);
		
		
		System.out.println("The Size of the Map is "+ inDoorOrOutDoorDefaultGroupingContents.size());
		
	}

}


  

class FullSKUIDComparator implements Comparator<OffsetMDB> {
	 
    @Override
    public int compare(OffsetMDB emp1, OffsetMDB emp2) {
        return(emp1.getFullSkuId()).compareTo(emp2.getFullSkuId());
    }

	/**
	 * 
	 */
	public FullSKUIDComparator() {
	}

}