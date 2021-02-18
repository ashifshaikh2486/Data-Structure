package arrays.problem.solving;

import java.util.ArrayList;
import java.util.List;

public class FindSortedTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// O(n^2)
		
		int[] ar = {5,4,3,7,6,1,9};
		List<Integer> triplet = new ArrayList<>(); 
		
		
//		
//		for (int i = 0; i < ar.length-1; i++) {
//			int max = ar[i];
//			int count = 1;
//			triplet.add(max);
//			for (int j = i+1; j < ar.length; j++) {
//				if(ar[j] > max && count <3) {
//					count += 1;
//					max = ar[j];
//					triplet.add(max);
//				}
//			}
//			if(count == 3) {
//				break;
//			}else {
//				triplet.clear();
//			}
//		}
//		
//		System.out.println(triplet);
		
		
		
//		for (int i = 0; i < ar.length; i++) {
//			List<Integer> triplet = new ArrayList<>(); 
//			
//			for (int j = i-1; j >= 0; j--) {
//				if(ar[j] < ar[i]) {
//					triplet.add(ar[j]);
//					break;
//				}
//			}
//			
//			triplet.add(ar[i]);
//			
//			for (int k = i+1; k < ar.length; k++) {
//				if(ar[k] > ar[i] ) {
//					triplet.add(ar[k]);
//					break;
//				}
//			}
//			
//			if(triplet.size() == 3) {
//				System.out.println(triplet);
//			}
//			
//			triplet.clear();
//			
//		}
		
		
		//  ***** O(n) ****** //
		
		triplet = findTriplet(ar);
		
		if(triplet != null) {
			System.out.println(triplet);
		}

		
	}

	private static List<Integer> findTriplet(int[] ar) {
		// TODO Auto-generated method stub
		if(ar.length < 3) {
			return null;
		}
		
		int min_index = 0;
		int low = -1;
		int mid = -1;
		List<Integer> triplet = new ArrayList<>(); 
		
		for (int i = 1; i < ar.length; i++) {
			
			if(ar[i] < ar[min_index]) {
				min_index = i;
			}else if(mid == -1) {
				low = min_index;
				mid = i;
			}else if(ar[i] < ar[mid]) {
				low = min_index;
				mid = i;
			}else {
				triplet.add(ar[low]);
				triplet.add(mid);
				triplet.add(ar[i]);
			}
			
		}
		return triplet;
	}

}
