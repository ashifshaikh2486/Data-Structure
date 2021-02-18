package dp.problem.solving;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {2,7,9,3,1};
		int n = ar.length;
		// Brute force recursion  Time O(2^n) Space -> Stack Space O(n)
//		int res = rob(ar,ar.length);
//		System.out.println(res);
		
		// Top-Down DP Time O(n) Space-> O(n)+Stack Space O(n)
		
//		int[] dp = new int[n+1];
//		
//		int res = rob(ar,dp,n);
//		System.out.println(res);
		
		// Bottom-Up DP TIme O(n) Space -> O(n)
		
//		int[] dp = new int[n+1];
//		
//		dp[1] = ar[0];
//		
//		for(int i=2;i<=n;i++) {
//			dp[i] = Math.max(dp[i-1], ar[i-1] + dp[i-2]);
//		}
//		
//		System.out.println(dp[n]);
		
		
		// Bottom-Up dp with time O(n) and Space O(1)
		
		if(n==0) {
			System.out.println(0);
			return ;
		}
		
		if(n==1) {
			System.out.println(ar[0]);
			return ;
		}
		
		if(n==2) {
			System.out.println(Math.max(ar[0], ar[1]));
		}
		
		int a = ar[0];
		int b = Math.max(ar[0], ar[1]);
		
		for(int i=2;i<n;i++) {
			int temp = Math.max(a+ar[i], b);
			a = b;
			b = temp;
		}
		
		System.out.println(b);
	}

	private static int rob(int[] ar, int[] dp, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		if(n==1) {
			dp[n] = ar[n-1];
			return ar[n-1];
		}
		
		if(dp[n] == 0) {
			dp[n] = Math.max(rob(ar,dp,n-1), ar[n-1]+rob(ar,dp,n-2));
		}
	
		return dp[n];
	}

	private static int rob(int[] ar, int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return ar[0];
		}
		
		return Math.max(rob(ar,n-1),ar[n-1]+rob(ar,n-2));
	}


}


