package arrays.problem.solving;

public class MissingNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 1, 2, 4, 3, 6, 7, 9, 8, 10 };

		int n = 10;
//		boolean flag;

// 	Brute Force O(n^2)  Solution 

//		for (int i = 1; i <= n; i++) {
//			flag = false;
//			for (int j = 0; j < ar.length; j++) {
//				if (i == ar[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if (!flag) {
//				System.out.println(i);
//			}
//
//		}

// O(n) Solution 

//		int sum = n * (n + 1) / 2; // Here is problem of overflow if n is very large then sum is not able to store
//									// the value of n*(n+1)/2
//
//		for (int i = 0; i < ar.length; i++) {
//			sum -= ar[i];
//		}
//		System.out.println(sum);
		

// O(n) solution 
		int a = 0;
		for(int i =1;i<=n;i++) {
			a = a^i;
		}
		for(int i=0;i<ar.length;i++) {
			a = a^ar[i];
		}
		
		System.out.println(a);

	}

}
