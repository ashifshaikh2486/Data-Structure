import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of elements : ");
		int num = sc.nextInt();
		
		int[] ar = new int[num];
		
		System.out.println("Enter " + num + " elements : ");
		for(int i=0; i<num;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		
		MergeSort m = new MergeSort();
		m.mergeSort(ar,0,ar.length-1);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

	private void mergeSort(int[] ar, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int m = (r+l)/2;
			mergeSort(ar,l,m);
			mergeSort(ar,m+1,r);
			merge(ar,l,m,r);
			
		}
		
		
	}

	private void merge(int[] ar, int l, int m, int r) {
		// TODO Auto-generated method stub
		
		int s1 = m-l+1;
		int s2 = r-m;
		
		int[] left = new int[s1];
		int[] right = new int[s2];
		
		for(int i=0;i<left.length;i++) {
			left[i] = ar[l+i];
		}
		
		for(int j=0;j<right.length;j++) {
			right[j] = ar[m+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < s1 && j <s2) {
			
			if(left[i] <= right[j]) {
				ar[k] = left[i];
				i++;
			}else {
				ar[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < s1) {
			ar[k] = left[i];
			i++;
			k++;
		}
		
		while(j < s2) {
			ar[k] = right[j];
			j++;
			k++;
		}
	}


}
