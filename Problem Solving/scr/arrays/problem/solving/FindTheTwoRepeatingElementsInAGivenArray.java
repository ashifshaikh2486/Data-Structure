package arrays.problem.solving;

public class FindTheTwoRepeatingElementsInAGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  ar = {3,4,3,1,2,5,1};
		
		
		// Time O(n)  & Space O(n)
		
//		int[] temp = new int[ar.length - 2];
//		
//		for (int i = 0; i < ar.length; i++) {
//			temp[ar[i]-1] += 1;
//		}
//		
//		for (int i = 0; i < temp.length; i++) {
//			if(temp[i]==2) {
//				System.out.print(i+1 + " ");
//			}
//			
//		}
		
		
		// Time O(n)  Space O(1)
		// Problem : Integer OverFlow
		
//		int sum= 0;
//		for (int i = 0; i < ar.length; i++) {
//			sum += ar[i];
//		}
//		
//		for (int i = 1; i < ar.length-1; i++) {
//			sum -= i;
//		}
//		
//		int avg = sum / 2;
//		
//		int a = 0;
//		
//		for (int i = 0; i < ar.length; i++) {
//			if(ar[i] <= avg) {
//				a += ar[i];
//			}
//		}
//		
//		for (int i = 1; i <= avg; i++) {
//			a -= i;
//		}
//		
//		int b = sum - a;
//		System.out.println(a + "  " + b);

		
		
		
		// Time O(n) Space O(1)    
		
		int xor = 0;
		for (int i = 0; i < ar.length; i++) {
			xor = xor ^ ar[i];
		}
		
		for (int i = 1; i < ar.length-1; i++) {
			xor = xor ^ i;
		}
		
	
		System.out.println(Integer.toBinaryString(xor));
		int count = Integer.lowestOneBit(xor);
		System.out.println(count);
		
		int a = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(Integer.lowestOneBit(ar[i]>>count-1) == 1) {
				a = a ^ ar[i];
			}
		}
		
		for (int i = 1; i < ar.length-1; i++) {
			if(Integer.lowestOneBit(i>>count-1) == 1) {
				a = a ^ i;
			}
		}
		
		int b = a ^ xor;
		
		System.out.println(a + " "  + b);
		
	}

}
