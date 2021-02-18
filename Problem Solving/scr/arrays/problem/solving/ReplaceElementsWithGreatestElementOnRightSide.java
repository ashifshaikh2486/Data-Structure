package arrays.problem.solving;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {17,18,5,4,6,1};
		
		
		//Brute Force Time O(n^2 ) & Space O(1)  
		
//		for(int i=0;i<ar.length;i++) {
//			int rightMax = -1;
//			for(int j = i+1; j < ar.length; j++) {
//				if(ar[j] > rightMax) {
//					rightMax = ar[j];
//				}
//			}
//			ar[i] = rightMax;
//			System.out.print(ar[i]+" ");
//			
//		}

		
		
		//Time O(n) & Space O(1)
		
		
		int rightMax = -1;
		
		for(int i=ar.length-1;i>=0;i--) {
			if(rightMax <= ar[i]) {
				int temp = ar[i];
				ar[i] = rightMax;
				rightMax = temp;
			}else {
				ar[i] = rightMax;
			}
		}
		
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
		
	}

}
