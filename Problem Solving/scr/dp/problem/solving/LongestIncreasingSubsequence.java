package dp.problem.solving;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] args) {
		
	
	int[] ar =  {0,8,4,12,2,10,6,14,-1,9,5,13};//{2,4,6,3,5,7,9};

	// Using DP Time O(n^2) Space O(n)
	
//	int[] lis = new int[ar.length];
//	lis[0] = 1;
//	
//	for(int i =1;i<ar.length;i++) {
//		for(int j=0;j<i;j++) {
//			if(ar[j] < ar[i] && lis[i] < lis[j]) {
//				lis[i] = lis[j];
//			}
//		}
//		lis[i] += 1;
//	}
//
//	System.out.println(lis[ar.length-1]);

	
	// Using Binary Search Algorithm Time O(nlogn) Space O(n) 
	
	List<Integer> maxElements = new ArrayList<>();
	maxElements.add(ar[0]);
	
	for(int i=1;i<ar.length;i++) {
		
		if(ar[i] < maxElements.get(0)) {
			maxElements.set(0, ar[i]);
		}else if(ar[i] > maxElements.get(maxElements.size()-1)) {
			maxElements.add(ar[i]);
		}else {
			int j = binarySearch(maxElements,ar[i],0,maxElements.size()-1);
			maxElements.set(j, ar[i]);
		}
		
	}
	
	System.out.println(maxElements.size());
	
	System.out.println(maxElements.toString());
	
	
	}

	private static int binarySearch(List<Integer> maxElements, int num, int l, int r) {
		// TODO Auto-generated method stub
		if(l==r) {
			return l;
		}
		
		int mid = (l+r)/2;
		if(maxElements.get(mid) > num) {
			return mid;
		}else {
			return binarySearch(maxElements, num, mid+1, r);
		}
		
	}
}
