package dp.problem.solving;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 4;
		int n = 4;
		
		if(n==0||m==0) {
			System.out.println(-1);
			return ;
		}
		
		// Brute force recursion Time O(2^max(n,m)) Space -> Stack Space O(max(n,m))
		
//		int res = getUniquePaths(n,m);
//		System.out.println(res);
		
		// Top-Down DP Time O(n*m) Space O(n*m) + stack space O(max(n,m))
		
//		int[][] dp = new int[n][m];
//		int res = getUniquePaths(dp,n-1,m-1);
//		System.out.println(res);
		
		
		// Bottom-Up DP Time O(n*m) Space O(n*m)
		
		int[][] dp = new int [n][m];
		
		for(int i=0;i<n;i++) {
			dp[i][0] = 1;
		}
		for(int j=0;j<m;j++) {
			dp[0][j] = 1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		
		System.out.println(dp[n-1][m-1]);

	}

	private static int getUniquePaths(int[][] dp, int n, int m) {
		// TODO Auto-generated method stub
		if(n==0 || m==0) {
			dp[n][m] =1;
			return 1;
		}
		if(dp[n][m] == 0) {
			dp[n][m] = getUniquePaths(dp, n-1, m) + getUniquePaths(dp, n, m-1);
		}
		return dp[n][m];
	}

	private static int getUniquePaths(int n, int m) {
		// TODO Auto-generated method stub
		if(n==1 || m==1) {
			return 1;
		}
		return getUniquePaths(n-1, m) +  getUniquePaths(n, m-1);
	}

}
