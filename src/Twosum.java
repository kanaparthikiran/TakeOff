import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author kkanaparthi
 *
 */

class Pair {
	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	int first;
	int second;
}
public class Twosum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] results = getTwoIndices(new int[] {1,3,5,4,6,9}, 10);
		System.out.println(" Arrays To String "+ Arrays.toString(results));
		
		int[] input = new int[] {6,3,-1,-3,4,-2,2,4,6,12,-7};
	}

	
	private static List<Pair> findSubArrays(int[] input) {
		if(input==null || input.length==0) {
			return new ArrayList<>();
		}
		Map<Integer,ArrayList<Integer>> map = new HashMap<>();
		List<Pair> list = new ArrayList<>();
		int sum = 0;
			for(int i=0;i<input.length;i++) {
				sum += input[i];
				if(sum==0) {
					list.add(new Pair(0, i));
				}
			List<Integer> al = new ArrayList<>();
			
			if(map.containsKey(sum)) {
				al = map.get(sum);
				for(int it = 0;it<al.size();it++) {
					list.add(new Pair(al.get(it)+1, i));
				}
			}
		}
		
		return list;
		
	}
	
	private static int[] getTwoIndices(int[] input, int target) {
		if(input==null || input.length==0) {
			return new int[] {};
		}
		int[] result = new int[2];
		Map<Integer,Integer> hashMap = new HashMap<>();
		for(int i = 0 ; i<input.length; i++) {
			int complement = target-input[i];
			if(hashMap.containsKey(complement)) {
				result[0]= hashMap.get(complement);
				result[1] = i;
			} else {
				hashMap.put(input[i],i);
			}
		}
		return result;
	}
}
