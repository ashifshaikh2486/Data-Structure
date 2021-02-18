package arrays.problem.solving;

public class RotateAnArrayKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,5};
		int k = 2;
		
		if(k>ar.length) {
			k = k % ar.length;
		}
		
		
		// Time O(n*k) && Space O(1) 
		
//		for(int i=0;i<k;i++) {
//		arrayRotationOnce(ar);
//		}
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
		
		
		// ***** Time O(n+k) Space O(k) ******//
		
//		int[] temp = new int[k];
//		
//		for (int i = 0; i < temp.length; i++) {
//			temp[i] = ar[ar.length-k+i];
//		}
//		
//		for (int i = ar.length-k-1; i >=0; i--) {
//			ar[i+k] = ar[i];
//		}
//		for (int i = 0; i < temp.length; i++) {
//			ar[i] = temp[i];
//		}

		
		
			
		
		// ***** Algo Time O(n+k) Space O(1)
		// 1. Reverse the elements from n-k to n-1 
		// 2. Reverse the elements from 0 to n-k-1
		// 3. Reverse the whole array
		// 4. 0 <= k <= n
		
		reverse(ar,ar.length-k,ar.length-1);
		reverse(ar,0,ar.length-k-1);
		reverse(ar,0,ar.length-1);
		
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
		
	}

	private static void reverse(int[] ar, int l, int h) {
		// TODO Auto-generated method stub
		
		while(l<h) {
		int temp = ar[l];
		ar[l] = ar[h];
		ar[h] = temp;
		l++;
		h--;
		}
		
		
	}


//	private static void arrayRotationOnce(int[] ar) {
//		// TODO Auto-generated method stub
//		int temp = ar[ar.length-1];
//		for (int i = ar.length-2; i >=0; i--) {
//			ar[i+1] = ar[i];
//		}
//		ar[0] =temp;
//		
//	}
	
	

}
