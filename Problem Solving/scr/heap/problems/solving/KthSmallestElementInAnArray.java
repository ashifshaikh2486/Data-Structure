package heap.problems.solving;

public class KthSmallestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {13,12,11,14,15,17,18,20,19,16};
		int k = 10;
		if(k<1 || k>ar.length ) {
			System.out.println("Wrong value of k");
			return;
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
	 // Using Merge Sort Time O(nlogn) and Space O(n)
		
		int result;
//		result = getKthSmallestElementUsingMergeSort(ar,k);
//		System.out.println(result);
		
		
		// Using Mean Heap Time O(klogn) Space O(logn)
		
//		result = getKthSmallestElementUsingMeanHeap(ar,k);
//		System.out.println(result);
		

		
		// Using Quick Sort Best TIme O(n) Worst Time O(n^2)
		
		result = getKthSmallestElementUsingQuickSort(ar,0,ar.length-1,k-1);
		System.out.println(result);

	}

	private static int getKthSmallestElementUsingQuickSort(int[] ar, int l,int r, int k) {
		// TODO Auto-generated method stub
		
		int  partition = partition(ar,l,r);
		if(partition == k) {
			return ar[partition];
		}else if(partition < k) {
			return getKthSmallestElementUsingQuickSort(ar, partition+1,r , k);
		}else {
			return getKthSmallestElementUsingQuickSort(ar, l, partition-1, k);
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
		ar[i] = pivot;
		ar[l] = temp;
		return i;
	}

	private static int getKthSmallestElementUsingMeanHeap(int[] ar, int k) {
		// TODO Auto-generated method stub
		
		int result = -1;
		
		buildMeanHeap(ar); // Time O(n) Space O(logn)
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		int size = ar.length;
		
		while(k>1) {
			remove(ar,size);
			size--;
			k--;
		}
		
		result = ar[0];
		return result;
	}

	private static void remove(int[] ar, int size) {
		// TODO Auto-generated method stub
		
		ar[0] = ar[size-1];
		minHeapify(ar, 0,size);
		
	}

	

	private static void buildMeanHeap(int[] ar) {
		// TODO Auto-generated method stub
		int i = ar.length/2 - 1;
		while(i>=0) {
			minHeapify(ar,i,ar.length);
			i--;
		}
		
	}

	private static void minHeapify(int[] ar, int i,int n) {
		// TODO Auto-generated method stub
		
		int lowest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && ar[l] < ar[lowest]) {
			lowest = l;
		}
		
		if(r<n && ar[r] < ar[lowest]) {
			lowest = r;
		}
		
		if(lowest != i) {
			int temp= ar[i];
			ar[i] = ar[lowest];
			ar[lowest] = temp;
			minHeapify(ar, lowest,n);
		}
		
	}

	private static int getKthSmallestElementUsingMergeSort(int[] ar,int k) {
		// TODO Auto-generated method stub
		int result = -1;
		
		mergeSort(ar,0,ar.length-1);
		result = ar[k-1];
		
		return result;
		
	}

	private static void mergeSort(int[] ar, int l, int r) {
		// TODO Auto-generated method stub
		
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(ar,l,mid);
			mergeSort(ar,mid+1,r);
			merge(ar,l,mid,r);
		}
		
		
	}

	private static void merge(int[] ar, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int i = l;
		int j  = mid+1;
		int k = l;
		while(i <= mid && j <= r) {
			if(ar[i] <= ar[j]) {
				i++;
			}else {
				int temp = ar[j];
				int index = j;
				while(index>k) {
					ar[index] = ar[index-1];
					index--;
				}
				ar[index] = temp; 
				j++;
			}
			k++;
		}
		
		
	}

}



 								