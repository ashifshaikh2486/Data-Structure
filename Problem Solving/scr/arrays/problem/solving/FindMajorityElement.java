package arrays.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {2,8,7,2,2,1,2};
		boolean flag = true;
		
		// O(n^2)
		
//		for (int i = 0; i < ar.length/2; i++) {
//			int count = 1;
//			for (int j = i+1; j < ar.length; j++) {
//				if(ar[i]==ar[j]) {
//					count++;
//				}
//			}
//			if(count > ar.length/2) {
//				System.out.println(ar[i]);
//				flag = false;
//				break;
//			}
//			
//		}
//		
//		if(flag) {
//			System.out.println("No majority element present");
//		}
		
		
		// Time = O(n) Space  = O(n)
		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < ar.length; i++) {
//			if(map.containsKey(ar[i])) {
//				map.put(ar[i],map.get(ar[i])+1);
//			}else {
//				map.put(ar[i], 1);
//			}
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			
//			if(entry.getValue() > ar.length/2) {
//				System.out.println(entry.getKey());
//				flag = false;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("No majority element present");
//		}

		// Boyer - Moore Algorithm   Time = O(n) Space = O(1)
		
		int count = 1;
		int majority = ar[0];
		
		for (int i = 1; i < ar.length; i++) {
			if(count == 0) {
				majority = ar[i];
				count += 1;
			}else if(majority == ar[i]) {
				count += 1;
			}else {
				count--;
			}
		}
		
		count = 0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == majority) {
				count++;
			}
		}
		
		if(count>ar.length/2) {
			System.out.println(majority);
		}else {
			System.out.println("No Majority element ");
		}
	}

}
