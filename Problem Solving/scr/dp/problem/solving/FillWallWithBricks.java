package dp.problem.solving;

public class FillWallWithBricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		
		// Brute Force Recursion TIme(2^n) and Space -> Stack Space O(n)
//		int res = numberOfWaysToPannel(n);
//		System.out.println(res);
		
		// TOP-DOWN DP Time O(N) and Space O(N) + Stack Space
//		int[] dp = new int[n+1];
//		int res = numberOfWaysToPannel(dp,n);
//		System.out.println(dp[n]);
		
		// BOTTOM-UP DP Time O(N) and Space O(N)
		int[] dp = new int[n+1];
		if(n < 0) {
			System.out.println(-1);
			return;
		}else if(n<4) {
			System.out.println(1);
			return;
		}
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i=4;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-4];
		}

		System.out.println(dp[n]);
	}

	private static int numberOfWaysToPannel(int[] dp, int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1 || n==2 || n==3 ) {
			dp[n] = 1;
			return 1;
		}
		if(dp[n] == 0) {
			dp[n] = numberOfWaysToPannel(n-1) + numberOfWaysToPannel(n-4);
		}
		return dp[n];
	}

	private static int numberOfWaysToPannel(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1 || n==2 || n==3 ) {
			return 1;
		}
		return numberOfWaysToPannel(n-1) + numberOfWaysToPannel(n-4);
	}

}
