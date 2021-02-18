package arrays.problem.solving;

public class InversionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Time Complexity O(n^2) 
		
		int[] ar = {1,2,5,7,9};
		
		int count = 0;
		
//		for (int i = 0; i < ar.length-1; i++) {
//			for (int j = i+1; j < ar.length; j++) {
//				if(ar[i] > ar[j]) {
//					count += 1;
//				}
//				
//			}
//		}
//		
//		System.out.println(count);
		
		
		// O(nlogn)  Time Complexity
		
		count = mergeSort(ar,0,ar.length-1);
		System.out.println(count);
		
		
		

	}

	private static int mergeSort(int[] ar, int l, int r) {
		// TODO Auto-generated method stub
		if (l<r) {
			int m = (l+r)/2;
			int left = mergeSort(ar,l,m);
			int right = mergeSort(ar, m+1, r);
			int combine = merge(ar,l,m,r);
			return left + right + combine;
		}else {
			return 0;
		}
	}

	private static int merge(int[] ar, int l, int m, int r) {
		// TODO Auto-generated method stub
		int[] left = new int[m-l+1];
		int[] right = new int[r-m];
		
		for (int i = 0; i < left.length; i++) {
			left[i] = ar[l+i];
		}
		
		for (int i = 0; i < right.length; i++) {
			right[i] = ar[m+1+i];
		}
		int i =0 ;
		int j =0;
		int k = l;
		int count = 0;
		
		while(i < left.length && j<right.length) {
			if(left[i]<=right[j]) {
				ar[k] = left[i];
				i++;
			}else {
				ar[k] =  right[j];
				j++;
				count += (m-i+1);
			}
			k++;
		}
		
		while(i <left.length) {
			ar[k] = left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			ar[k] = right[j];
			j++;
			k++;
		}
		
		return count;
	}

}
