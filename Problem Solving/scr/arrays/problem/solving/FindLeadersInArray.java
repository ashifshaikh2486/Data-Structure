package arrays.problem.solving;

import java.util.ArrayList;
import java.util.List;

public class FindLeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {8,4,2,6,1,5,2};
		
		List<Integer> list = new ArrayList<>();
		
		// Brute Force O(n^2)
		
//		for (int i = 0; i < ar.length; i++) {
//			boolean flag = true;
//			for (int j = i+1; j < ar.length; j++) {
//				if(ar[i]<ar[j]) {
//					flag = false;
//					break;
//				}
//			}
//			
//			if(flag) {
//				list.add(ar[i]);
//			}
//			
//		}
//		
//		for (Integer i : list) {
//			System.out.print(i+" ");
//		}
		
		// O(n)

		int max = ar[ar.length-1];
		System.out.print(max+" ");
		for(int i=ar.length-2;i>=0;i--) {
			
			if(ar[i]>max) {
				System.out.print(ar[i]+ " ");
				max = ar[i];
			}
		}
		
		
	}

}
