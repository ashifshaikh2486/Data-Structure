package searchingandsorting.problem.solving;

import java.util.Arrays;

public class KthSmallestElementInUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {13,12,11,14,15,17,18,20,19,16};
		int k = 1;
		
		
		// Using Merge Sort Time -> O(nlogn) and Space O(n)
		
//		Arrays.sort(ar);
//		System.out.println(ar[k-1]);
		
		
		// Using Min Heap Time -> O(klogn)
		
//		getKthSmallestElement(ar,k);
//		System.out.println(ar[ar.length-k]);
//		
		
		
		// Using Quick Sort Best & AvgTime O(n)  but Worst Time O(n^2)
		
		int res = getKthSmallestElement(ar,0,ar.length-1,k-1);
		System.out.println(res);
		
		
	}

	private static int getKthSmallestElement(int[] ar, int l, int r, int k) {
		// TODO Auto-generated method stub
		
		int partition = partition(ar,l,r);
		
		if(partition == k) {
			return ar[partition];
		}else if(partition < k) {
			return getKthSmallestElement(ar, partition+1,r , k);
		}else {
			return getKthSmallestElement(ar, l, partition-1, k);
		}
	}

	private static int partition(int[] ar, int l, int r) {
		// TODO Auto-generated method stub
		
		int pivot = ar[l];
		int i = l;
		int j = i+1;
		
		while(j<=r) {
			if(pivot > ar[j]) {
				i++;
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
			j++;
		}
		int temp = ar[i];
		ar[i] = ar[l];
		ar[l] = temp;
		return i;
	}

	private static void getKthSmallestElement(int[] ar, int k) {
		// TODO Auto-generated method stub
	
		buildMinHeap(ar);
		int n = ar.length-1;
		while(n>0 && k>0) {
			int temp = ar[0];
			ar[0] = ar[n];
			ar[n] = temp;
			n--;
			minHeapify(ar,n, 0);
			k--;
		}
	}

	private static void minHeapify(int[] ar, int n, int i) {
		// TODO Auto-generated method stub
		
		int left = 2*i + 1;
		int right = 2*i +2;
		
		int lowest = i;
		
		if(left <= n && ar[lowest] > ar[left]) {
			lowest = left;
		}
		if(right <= n && ar[lowest] > ar[right]) {
			lowest = right;
		}
		
		if( lowest != i) {
			int temp = ar[i];
			ar[i] = ar[lowest];
			ar[lowest] = temp;
			minHeapify(ar,n,lowest);
		}
		
		
		
	}

	private static void buildMinHeap(int[] ar) {
		// TODO Auto-generated method stub
		int n = ar.length/2 -1;
		while(n>=0) {
			minHeapify(ar,n);
			n--;
		}
		
		
	}

	private static void minHeapify(int[] ar, int i) {
		// TODO Auto-generated method stub
		
		int left = 2*i + 1;
		int right = 2*i +2;
		
		int lowest = i;
		
		if(left < ar.length && ar[lowest] > ar[left]) {
			lowest = left;
		}
		if(right< ar.length && ar[lowest] > ar[right]) {
			lowest = right;
		}
		
		if(i != lowest) {
			int temp = ar[i];
			ar[i] = ar[lowest];
			ar[lowest] = temp;
			minHeapify(ar,lowest);
		}
		
	}

}
 