package dp.problem.solving;

public class EggDroppingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		int k = 14;
		
		// Brute Force Recursion
		
//		int res = minTrial(n,k);
//		System.out.println(res);
		
		// TOP-DOWN DP 
//		int[][] dp = new  int[n+1][k+1];
//		
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=k;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		
//		int res = minTrial(n,k,dp);
//		System.out.println(res);
		
		
		// Bottom - UP DP
		
		int[][] dp = new int [n+1][k+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=k;j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=0;i<=k;i++) {
			dp[0][i] = -1;
			dp[1][i] = i;
		}
		for(int i=0;i<=n;i++) {
			dp[i][0] = 0;
			dp[i][1] = 1;
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=k;j++) {
				for(int x=1;x<=j;x++) {
					dp[i][j] = Math.min(dp[i][j], 1+Math.max(dp[i-1][x-1], dp[i][j-x]));
				}
			}
		}
		
		System.out.println(dp[n][k]);
	}

	private static int minTrial(int n, int k, int[][] dp) {
		// TODO Auto-generated method stub
		
		if(k==0) {
			dp[n][k] = 0;
			return 0;
		}
		
		if(k==1) {
			dp[n][k] = 1;
			return 1;
		}
		
		if(n==1) {
			
			dp[n][k] = k;
			return k;
		}
		
		
		
		if(dp[n][k] == -1) {
			int min = Integer.MAX_VALUE;
			
			for(int i=1;i<=k;i++) {
				min = Math.min(min,1 + Math.max(minTrial(n-1, i-1, dp), minTrial(n, k-i, dp)));
			}
			dp[n][k] = min;
			
		}
		return dp[n][k];
	}

	private static int minTrial(int n, int k) {
		// TODO Auto-generated method stub
		
		if(n==1) {
			return k;
		}
		
		if(k==0) {
			return 0;
		}
		
		if(k==1) {
			return 1;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<=k;i++) {
			min = Math.min(min,1+ Math.max(minTrial(n-1, i-1), minTrial(n, k-i)));
		}
		return min;
	}

}
