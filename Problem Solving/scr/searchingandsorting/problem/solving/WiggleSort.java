package searchingandsorting.problem.solving;

import java.util.Arrays;

public class WiggleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {3,5,2,1,6,4,7};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		
		// Using Sorting Time O(nlogn)
		
		
//		Arrays.sort(ar);
//		
//		int i = 1;
//		while(i<ar.length-1) {
//			int temp = ar[i];
//			ar[i] = ar[i+1];
//			ar[i+1] = temp;
//			i +=2;
//		}
		
		
		// Using Even index TIme O(n)
		
		int i =1;
		while(i<ar.length) {
			
			if(ar[i]<ar[i-1]) {
				int temp = ar[i];
				ar[i] = ar[i-1];
				ar[i-1] = temp;
			}
			if(i<ar.length-1) {
				if(ar[i]<ar[i+1]) {
					int temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
				}
			}
			i +=2;
		}
		
		
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j]+" ");
		}
		System.out.println();

	}

	

}
