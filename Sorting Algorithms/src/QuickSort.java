import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No of elements : ");
		int num = sc.nextInt();

		int[] ar = new int[num];

		System.out.println("Enter " + num + "elements : ");
		for (int i = 0; i < num; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
		
		QuickSort qs = new QuickSort();
		
		qs.quickSort(ar,0,ar.length-1);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		

	}

	private void quickSort(int[] ar, int p, int q) {
		// TODO Auto-generated method stub
		if(p<q) {
			int i = partision(ar,p,q);
			quickSort(ar,p,i-1);
			quickSort(ar,i+1,q);
			
		}
				
	}

	private int partision(int[] ar, int p, int q) {
		// TODO Auto-generated method stub
		int pivot = ar[p];  			// If the array is already sorted then the worst case time complexity
		int i = p;						// of quick sort is o(n^2) 
		int j = p+1;					// So make it O(nlogn) worst case chose pivot as a random element 
										// swap it with ar[p] and process
		while(j<=q) {
			if(ar[j]<pivot) {
				i++;
				int temp1 = ar[i];
				ar[i] = ar[j];
				ar[j] = temp1;
			}
			j++;
		}
		int temp2 = ar[p];
		ar[p] = ar[i];
		ar[i] = temp2;
		return i;
		
	}

	
}
