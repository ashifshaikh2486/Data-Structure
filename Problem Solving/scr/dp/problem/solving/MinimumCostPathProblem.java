package dp.problem.solving;

public class MinimumCostPathProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] cost = {{2,1,5,1},{3,4,2,2},{1,2,3,3},{1,3,2,4}};
		
		
		if(cost.length == 0) {
			System.out.println(-1);
			return;
		}
		
		int n = cost.length;
		int m = cost[0].length;
	
		// Brute Force Recursion Time (2^n) and Stack Space O(n)	
//		int res = minCost(cost,n,m);
//		System.out.println(res);
		
		// Top-Down DP Time O(n*m) Space O(n*m) + Stack Space 
		int[][] dp = new int[n][m];
		int res = minCost(dp,cost,n,m);
		System.out.println(res);
		
		
		
		// Bottom-Up DP Time(n*m) and Space (n*m)
//		int[][] dp = new int[n][m];
//		
//		dp[0][0] = cost[0][0];
//		
//		for(int i=1;i<n;i++) {
//			dp[i][0] = dp[i-1][0]+cost[i][0];
//		}
//		
//		for(int j=1;j<n;j++) {
//			dp[0][j] = dp[0][j-1]+cost[j][0];
//		}
//		
//		for(int i=1;i<n;i++) {
//			for(int j=1;j<m;j++) {
//				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + cost[i][j];
//			}
//		}
//		
//		System.out.println(dp[n-1][m-1]);
	}

	

	private static int minCost(int[][] cost, int n, int m) {
		// TODO Auto-generated method stub
		if(n<=0 || m<=0) {
			return 0;
		}
		
		if(n==1 && m==1) {
			return cost[n-1][m-1];
		}
		
		int l = minCost(cost, n-1, m);
		int r = minCost(cost, n, m-1);
		if(l==0) {
			return r+cost[n-1][m-1];
		}else if(r==0) {
			return l+cost[n-1][m-1];
		}else {
			return Math.min(l,r)+cost[n-1][m-1];
		}
		
	}
	
	private static int minCost(int[][] dp, int[][] cost, int n, int m) {
		// TODO Auto-generated method stub
		if(n<=0 || m <= 0) {
			return 0;
		}
		if(n==1 && m==1) {
			dp[n-1][m-1] = cost[n-1][m-1];
			return dp[n-1][m-1];
		}
		
		if(dp[n-1][m-1] == 0) {
			int l = minCost(dp, cost, n-1, m);
			int r = minCost(dp, cost, n, m-1);
			if(l==0) {
				dp[n-1][m-1] = r+cost[n-1][m-1];
			}else if(r==0) {
				dp[n-1][m-1] = l+cost[n-1][m-1];
			}else {
				dp[n-1][m-1] = Math.min(l, r)+cost[n-1][m-1];
			}
		}
		
		return dp[n-1][m-1];
	}

}
