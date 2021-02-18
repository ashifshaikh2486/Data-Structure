package arrays.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOccuringOddNumberOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,2,3,1,3}; 
		
		// Time O(n^2)
		
//		Set<Integer> set = new HashSet<>();
//		
//		for (int i = 0; i < ar.length; i++) {
//			int count = 0;
//			
//			for (int j = 0; j < ar.length; j++) {
//				if(ar[i]==ar[j]) {
//					count++;
//				}
//			}
//			if(count%2 != 0) {
//				set.add(ar[i]);
//			}
//		}
//		
//		System.out.println(set.toString());
		
		
		
		
		
		// TIme O(n) Space O(n)'
		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < ar.length; i++) {
//			if(map.containsKey(ar[i])) {
//				map.put(ar[i], map.get(ar[i])+1);
//			}else {
//				map.put(ar[i],1);
//			}
//		}
//		
//		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
//			if(entry.getValue() % 2  != 0) {
//				System.out.println(entry.getKey());
//			}
//		}
		  
		// TIme O(n^2) Space O(1)
		// Assumption : There is only one element with odd number of occurrence 
		int xor = ar[0];
		for (int i = 1; i < ar.length; i++) {
			xor = xor ^ ar[i];
		}
		
		System.out.println(xor);

	}

}
