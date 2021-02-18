package arrays.problem.solving;

public class SliptAnArrayIntoTwoEqualSumSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,5,5};
		
		
		// O(n^2)
		
//		for (int i = 0; i < ar.length; i++) {
//			int leftSum = 0;
//			int rightSum = 0;
//			
//			for (int j = i-1; j >= 0; j--) {
//				leftSum += ar[j];
//			}
//			
//			for (int k = i; k < ar.length; k++) {
//				rightSum += ar[k];
//			}
//			
//			if(leftSum == rightSum) {
//				for (int j = 0; j < ar.length; j++) {
//					if(j==i) {
//						System.out.println();
//					}
//					System.out.print(ar[j]+" ");
//				}
//			}
//			
//		}
		

		
		// O(n)
		
//		int leftSum = ar[0];
//		int rightSum = 0;
//		boolean flag = false;
//		
//		for (int i = 1; i < ar.length; i++) {
//			leftSum += ar[i];
//		}
//		
//		for (int i = ar.length-1; i >=0; i--) {
//			rightSum += ar[i];
//			leftSum -= ar[i];
//			
//			if(leftSum == rightSum) {
//				flag = true;
//				break;
//			}
//		}
//		
//		System.out.println(flag);
		
		
		
		
		// My Solution O(n)
		
		int l = 0;
		int r = ar.length-1;
		
		int leftSum = ar[l];
		int rightSum = ar[r];
		
		while(l +1 != r) {
			if(leftSum >= rightSum) {
				r--;
				rightSum += ar[r];
			}else {
				l++;
				leftSum += ar[l];
			}
		}
		
		if(leftSum == rightSum) {
			for (int j = 0; j < ar.length; j++) {
				if(j==l+1) {
					System.out.println();
				}
				System.out.print(ar[j]+" ");
			}
		}
		}
		
	
}
