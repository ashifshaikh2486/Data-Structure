
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeapSort hs = new HeapSort();
		
		int[] ar  = {16,14,10,8,7,9,3,2,4,1};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
		hs.heapBuilder(ar);
		
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
		hs.heapSort(ar);
		
		
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		

	}
	
	public void maxHeapify(int[] ar, int i ) {
		
		int l = 2*i +1;
		int r = 2*i +2;
		
		int largest =i;
		
		if(l < ar.length && ar[l] > ar[i]) {
			largest = l;
		}
		if( r <ar.length && ar[r] > ar[largest]) {
			largest = r;
		}
		
		if (largest != i) {
			int temp = ar[i];
			ar[i] = ar[largest];
			ar[largest] = temp;
			maxHeapify(ar,largest);
			
		}
		
	}
	
public void maxHeapify(int[] ar,int n, int i ) {
		
		int l = 2*i +1;
		int r = 2*i +2;
		
		int largest =i;
		
		if(l <= n && ar[l] > ar[i]) {
			largest = l;
		}
		if( r <=n && ar[r] > ar[largest]) {
			largest = r;
		}
		
		if (largest != i) {
			int temp = ar[i];
			ar[i] = ar[largest];
			ar[largest] = temp;
			maxHeapify(ar,n,largest);
			
		}
		
	}
	
	public void heapBuilder(int[] ar) {
		
		int n = ar.length/2 -1;
		
		while(n>=0) {	
			maxHeapify(ar, n);
			n--;
		}
		
	}
	
	
	public void heapSort(int[] ar) {
		
		heapBuilder(ar);
		
		int n = ar.length-1;
		
		while(n>0) {
			int temp = ar[0];
			ar[0] = ar[n];
			ar[n] = temp;
			n--;
			maxHeapify(ar, n, 0);
		}
		
	}

}
