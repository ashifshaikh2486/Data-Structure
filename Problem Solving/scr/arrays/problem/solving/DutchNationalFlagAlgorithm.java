package arrays.problem.solving;

public class DutchNationalFlagAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {0,1,0,1,2,1,2,1};
		
		// O(n^2)
//		for(int i=1;i<ar.length;i++) {
//			int temp = ar[i];
//			int j = i-1;
//			while(j >=0 && temp <ar[j]) {
//				ar[j+1] = ar[j];
//				j--;
//			}
//			
//			ar[j+1] = temp;
//			
//		}
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i]+" ");
//		}

		
		
		// O(nlogn)
		
//		mergeSort(ar,0,ar.length-1);	
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i]+" ");
//			
//		}
		
		//O(n)
		
		int l = 0;
		int h = ar.length-1;
		int c = 0;
		
		while(c<h) {
			int temp = ar[c];
			if(temp==0) {
				ar[c] = ar[l];
				ar[l] = temp;
				c++;
				l++;
			}else if(temp==1) {
				c++;
			}else if(temp ==2) {
				ar[c] = ar[h];
				ar[h] = temp;
				h--;
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

//	private static void mergeSort(int[] ar, int l, int r) {
//		// TODO Auto-generated method stub
//		if(l<r) {
//			int m = (l+r)/2;
//			
//			mergeSort(ar, l, m);
//			mergeSort(ar, m+1, r);
//			merge(ar,l,m,r);
//		}
//		
//	}
//
//	private static void merge(int[] ar, int l, int m, int r) {
//		// TODO Auto-generated method stub
//		int s1 = m-l+1;
//		int s2 = r-m;
//		
//		int[] left = new int[s1];
//		int[] right = new int[s2];
//				
//		for (int i = 0; i < left.length; i++) {
//			left[i] = ar[l+i];
//		}
//		
//		for (int i = 0; i < right.length; i++) {
//			right[i] = ar[m+1+i];
//		}
//		
//		int i=0;
//		int j=0;
//		int k=l;
//		
//		while(i<left.length && j< right.length) {
//			
//			if(left[i]<=right[j]) {
//				ar[k] = left[i];
//				i++;
//			}else{
//				ar[k] = right[j];
//				j++;
//			}
//			k++;
//
//		}
//		
//		while(i<left.length){
//			ar[k] = left[i];
//			k++;
//			i++;
//		}
//		
//		while(j<right.length) {
//			ar[k] = right[j];
//			j++;
//			k++;
//		}
	
//	}

}
