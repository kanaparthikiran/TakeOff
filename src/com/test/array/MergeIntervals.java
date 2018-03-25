/**
 * 
 */
package com.test.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */

class Interval{ 
    int start;
    int end;

    Interval(int start,int end)  {
        this.start= start;
        this.end = end;
    }
}

/**
2        18
  4   10
    5        24
                 30 35
                 
                    
    
  first
  
[2,18] [4,10] [5,24][30,35]

[2,24] [30,35]

*/

class MergeIntervals  {


    public static void main(String a[]) {
            List<Interval> list = new ArrayList<>();
            Interval i1 = new Interval(2,8);
            Interval i2 = new Interval(4,10);
            Interval i3 = new Interval(5,24);
            Interval i4 = new Interval(30,35);
            
            list.add(i1);
            list.add(i2);
            list.add(i3);
            list.add(i4);
            
            MergeIntervals mergeIntervals = new MergeIntervals();
            List<Interval> mergedArrays = mergeIntervals.mergedArrays(list);
            
            if(mergedArrays!=null && mergedArrays.size()>0) {
            	for(Interval interval : mergedArrays) {
            		System.out.println(" interval Element "
            				+ " Start "+interval.start+" end "+interval.end);
            	}
            }
    }

    
    //
    //  [2,18] [4,10] [5,24]   [30,35] [1,2]
    //[2,24] [30,35]
    private List<Interval> mergedArrays(List<Interval> in)  {
            Interval buffer = null;
            List<Interval> listOfIntervals = new ArrayList<>();
            if(in!=null && in.size()>0) {
                buffer = in.get(0);
                for(Interval inElement : in){
                	Interval inForCopy = null;
                    if(inElement!=null)  {
                    	
                    	System.out.println(" Interval Element Start "
                    			+ " "+inElement.start+" inElement End "
                    			+ inElement.end);
                    	if(inElement.start<=buffer.start 
                        		&& inElement.end<=buffer.end) {
                        } else if(inElement.start>buffer.end)  {
                            buffer.start = inElement.start;
                            buffer.end = inElement.end;
                        } else {
                            buffer.end = inElement.end;
                        }
                    }
                    if(buffer!=null) {
                        listOfIntervals.add(buffer);
                        for(Interval interval : listOfIntervals) {
                            if(interval.start==buffer.start) {
                                listOfIntervals.clear();
                                listOfIntervals.add(buffer);
                            }
                        }
                    }
                }
            }   
            return listOfIntervals;
    }
}

