/**
 * 
 */
package com.datastructures.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    @Override
    public String toString() {
    	return "start "+start+" end "+end;
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

class IntervalsComparator implements Comparator<Interval> {
	@Override
	public int compare(Interval o1, Interval o2) {
		return o1.start-o2.start;
	}
}


public class MergeIntervals  {
    public static void main(String a[]) {
    	
    		System.out.println(" Reverse of the number is "+ reverse(1534236469));
    	
            List<Interval> list = new ArrayList<>();
            Interval i1 = new Interval(2,8);
            Interval i2 = new Interval(4,10);
            Interval i3 = new Interval(5,24);
            Interval i4 = new Interval(30,35);
            
            list.add(i1);
            list.add(i2);
            list.add(i3);
            list.add(i4);
            
            int[][] input = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}}; 
            		//{{1,3},{2,6},{8,10},{9,12},{15,18}};
            //[[1,3],[2,6],[8,10],[15,18]]
           List<Interval> listData = createInterval(input);
           Collections.sort(listData,new IntervalsComparator());
           System.out.println(" After Sorting the elements ");
           
           List<Interval> resultData = new ArrayList<>();
           int prevStart = Integer.MIN_VALUE;
           int prevEnd = Integer.MIN_VALUE;
           listData.forEach(element->System.out.println(element));

           for(Interval element : listData) {
        	   int currentStart = element.start;
        	   int currentEnd = element.end;
        	   if(currentStart<=prevEnd) {
        		   resultData.remove(resultData.size()-1);
                   Interval newData = new Interval(prevStart,Math.max(currentEnd,prevEnd));
        		   resultData.add(newData);
        		   prevEnd = Math.max(currentEnd,prevEnd);
        	   } else {
        		   prevStart = currentStart;
        		   prevEnd = currentEnd;
        		   Interval newData = new Interval(prevStart,prevEnd);
        		   resultData.add(newData);
        	   }
           }
           System.out.println(" After merging the intervals ");
           resultData.forEach(element->System.out.println(element));

           //.forEach(element->System.out.println(element));
//            MergeIntervals mergeIntervals = new MergeIntervals();
//            List<Interval> mergedArrays = mergeIntervals.mergedArrays(list);
//            if(mergedArrays!=null && mergedArrays.size()>0) {
//            	for(Interval interval : mergedArrays) {
//            		System.out.println(" interval Element "
//            				+ " Start "+interval.start+" end "+interval.end);
//            	}
//            }
    }

    
//    private static int[][] mergeIntervalsData(List<Interval> intervals) {
//        int[][] result = new int[intervals.size()][2];
//        for(int i=0;i<intervals.size();i++) {
//            result[i][0] = intervals.get(i).getStart();
//            result[i][1] = intervals.get(i).getEnd();
//        }   
//        return result;
//    }
//    
    private static List<Interval> createInterval(int[][] inputs) {
    	List<Interval> allLists = new ArrayList<>();
    	for(int i=0;i<inputs.length;i++) {
    		Interval interval = new Interval(inputs[i][0],inputs[i][1]);
    		allLists.add(interval);
    	}
    	return allLists;
    }
    
//    //
//    //  [2,18] [4,10] [5,24]   [30,35] [1,2]
//    //[2,24] [30,35]
//    private List<Interval> mergedArrays(List<Interval> in)  {
//            Interval buffer = null;
//            List<Interval> listOfIntervals = new ArrayList<>();
//            if(in!=null && in.size()>0) {
//                buffer = in.get(0);
//                for(Interval inElement : in){
//                	Interval inForCopy = null;
//                    if(inElement!=null)  {
//                    	
//                    	System.out.println(" Interval Element Start "
//                    			+ " "+inElement.start+" inElement End "
//                    			+ inElement.end);
//                    	if(inElement.start<=buffer.start 
//                        		&& inElement.end<=buffer.end) {
//                        } else if(inElement.start>buffer.end)  {
//                            buffer.start = inElement.start;
//                            buffer.end = inElement.end;
//                        } else {
//                            buffer.end = inElement.end;
//                        }
//                    }
//                    if(buffer!=null) {
//                        listOfIntervals.add(buffer);
//                        for(Interval interval : listOfIntervals) {
//                            if(interval.start==buffer.start) {
//                                listOfIntervals.clear();
//                                listOfIntervals.add(buffer);
//                            }
//                        }
//                    }
//                }
//            }   
//            return listOfIntervals;
//    }
    
    public static int reverse(int x) {
        if(x==0) {
            return  0;
        }
        boolean isNegative = false;
        if(x<0) {
            isNegative = true;
            x = -1*x;
        }
        int rev =  0;
        while(x>0) {
            int remainder = x%10;
            rev = rev*10+remainder;
            x = x/10;
            System.out.println(" x at each step "+x+" rev "+rev);
        }
        if(isNegative) {
            rev = -1*rev;
        }
        return (int)rev;
    }
}

