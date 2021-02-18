package arrays.problem.solving;

public class FindtwoMissingNumbersInASequenceofConsecutiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,3,5,6};
		int n = ar.length+2;
		
		// Time O(n^2)
		
//		for (int i = 1; i <= n; i++) {
//			boolean flag = true;
//			for (int j = 0; j < ar.length; j++) {
//				if(i==ar[j]) {
//					flag = false;
//				}
//			}
//			if(flag) {
//				System.out.println(i);
//			}
//		}
		
		
		// TIme O(n) Space O(n)
		
//		int[] temp = new int[n];
//		
//		for (int i = 0; i < ar.length; i++) {
//			temp[ar[i]-1] = 1;
//		}
//		
//		for (int i = 0; i < temp.length; i++) {
//			if(temp[i]==0) {
//				System.out.println(i+1);
//			}
//		}
		
		
		
		
		// Time O(n) Space O(1)
		// Problem : Integer Overflow
		
//		int s1 = n*(n+1)/2;
//		int s2 = 0;
//		
//		for (int i = 0; i < ar.length; i++) {
//			s2 += ar[i];
//		}
//		
//		int sum = s1 - s2;
//		int avg = sum/2;
//		
//		int a = 0;
//		for (int i = 1; i <= avg; i++) {
//			a += i;
//		}
//		
//		int b = 0;
//		for (int i = 0; i < ar.length; i++) {
//			if(ar[i] <= avg) {
//				b += ar[i];
//			}
//		}
//		
//		int first = a-b;
//		int second = sum - first;
//		
//		System.out.println(first + " " + second);
		
		
		
		
		// Time O(n) Space(1)
		
		int xor = 0;
		for (int i = 1; i <= n; i++) {
			xor = xor^ i;
		}
		
		for (int i = 0; i < ar.length; i++) {
			xor = xor^ar[i];
		}
		
		int count = Integer.lowestOneBit(xor);
		int a = 0;
		
		for (int i = 1; i <= n; i++) {
			if(Integer.lowestOneBit(i) == count) {
				a = a^i;
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			if(Integer.lowestOneBit(ar[i]) == count) {
				a = a^ar[i];
				}
		}
		
		int b = xor ^ a;
		
		System.out.println(a + " " + b );
			
	}

}
