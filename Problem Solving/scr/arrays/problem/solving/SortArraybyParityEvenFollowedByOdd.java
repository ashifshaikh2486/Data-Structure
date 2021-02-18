package arrays.problem.solving;

public class SortArraybyParityEvenFollowedByOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {3,1,2,4,5};
		int[] res = new int[ar.length];
		
		//Time O(n) & Space O(n)
		
//		int i = 0;
//		int j = ar.length-1;
//		int k = 0;
//		
//		while(k<ar.length) {
//			if(ar[k]%2 == 0) {
//				res[i] = ar[k];
//				i++;
//			}else {
//				res[j] = ar[k];
//				j--;
//			}
//			k++;
//		}
//		
//		for(int l = 0; l < res.length; l++) {
//			System.out.print(res[l]+" ");
//		}
		
		
		
		
		// Time O(n) & Space O(1)
		
		int i = 0;
		int j = ar.length-1;
		int temp = 0;
		
		while(i<j) {
			if(ar[i]%2 == 0) {
				i++; 
			}else {
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				j--;
			}
		}
		
		for(int k = 0; k < res.length; k++) {
			System.out.print(ar[k]+" ");
		}

	}

}
