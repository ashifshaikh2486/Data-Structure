package dp.problem.solving;

public class LevensteinOREditDistanceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "horse";
		String y = "ros";
		
		int m = x.length();
		int n = y.length();
		
		
		// Brute Force Recursion Time O(3^max(m,n)) Space -> Stack Space O(Max(m,n))
		
//		int res = editDistance(x,y,m,n);
//		System.out.println(res);
	
		
		//TOP-DOWN DP Time O(m*n) Space -> O(n*m) + Stack Space
//		int[][] dp = new int[m+1][n+1];
//		for(int i =0;i<=m;i++) {
//			for(int j=0;j<=n;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		int res = editDistance(dp,  x, y, m, n);
//		System.out.println(res);
		
		// Bottom-Up DP Time O(n*m) and Space O(m*n)
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i =0;i<=m;i++) {
			dp[i][0] = i;
		}
		for(int i =0;i<=n;i++) {
			dp[0][i] = i;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = 1+Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
				}
			}
			
		}
		
		System.out.println(dp[m][n]);
		
	
	
	}

	private static int editDistance(int[][] dp, String x, String y, int m, int n) {
		// TODO Auto-generated method stub
		if(m==0) {
			dp[m][n] = n;
			return n; 
		}
		
		if(n==0) {
			dp[m][n] = m;
			return m;
		}
		
		if(dp[m][n] == -1) {
			
			if(x.charAt(m-1) == y.charAt(n-1)) {
				dp[m][n] = editDistance(dp, x, y, m-1, n-1);
			}else {
				dp[m][n] = 1+Math.min(Math.min(editDistance(dp, x, y, m-1, n), editDistance(dp, x, y, m, n-1)),editDistance(dp, x, y, m-1, n-1));
			}
		}
		
		return dp[m][n];
		
	}

	private static int editDistance(String x, String y,int m, int n) {
		// TODO Auto-generated method stub
		
		if(m==0) {
			return n;
		}
		
		if(n == 0) {
			return m;
		}
		
		if(x.charAt(m-1) == y.charAt(n-1)) {
			return editDistance(x, y, m-1, n-1);
		}
		
		return 1 + Math.min(Math.min(editDistance(x, y, m-1, n), editDistance(x, y, m, n-1)),editDistance(x, y, m-1, n-1));
		
	}

}
