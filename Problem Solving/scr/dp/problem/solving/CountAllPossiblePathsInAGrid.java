package dp.problem.solving;

public class CountAllPossiblePathsInAGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int m = 4;
		
		
		// Brute Force Recursion Time O(3^n) and Stack Space  
//		int res = allPossiblePaths(n,m);
//		System.out.println(res);
		
		// TOP-DOWN DP Time O(n*m) and Space O(n*m) and Stack Space  
//		int[][] dp = new int[n][m];
//		int res = allPossiblePaths(dp, n-1, m-1);
//		System.out.println(res);
		
//		Bottom - UP  DP Time O(n*m) and Space O(n*m) 
		
		int[][] dp = new int[n][m];
		
		for(int i=0;i<n;i++) {
			dp[i][0] = 1;
		}
		
		for(int i=0;i<m;i++) {
			dp[0][i] = 1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				dp[i][j] = dp[i-1][j]+dp[i][j-1]+dp[i-1][j-1];
			}
		}
		
		System.out.println(dp[n-1][m-1]);
		

	}

	private static int allPossiblePaths(int[][] dp, int n, int m) {
		// TODO Auto-generated method stub
		
		
		
		if(n==0 || m ==0) {
			dp[n][m] = 1;
			return 1;
		}
		
		if(dp[n][m] != 0) {
			return dp[n][m];
		}
		
		dp[n][m] = allPossiblePaths(dp, n-1, m) + allPossiblePaths(dp, n, m-1) + allPossiblePaths(dp, n-1, m-1);
		
		return dp[n][m];
	}

	private static int allPossiblePaths(int n, int m) {
		// TODO Auto-generated method stub
		
		if(n==1 || m == 1) {
			return 1;
		}
		
		return allPossiblePaths(n-1, m) + allPossiblePaths(n, m-1) + allPossiblePaths(n-1, m-1);
	}

}
