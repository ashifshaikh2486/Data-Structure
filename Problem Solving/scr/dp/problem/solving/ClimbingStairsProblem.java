package dp.problem.solving;

public class ClimbingStairsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		
		// Using recursion(top-down DP) with TIme O(n) Space O(n)+StackSpace
		
//		int[] dp = new int[n+1];
//		int res = getNumberOfWays(n,dp);
//		System.out.println(res);
		
		
		// Using recursion(bottom-up DP) with TIme O(n) Space O(n)
		
		int[ ] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i =3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		System.out.println(dp[n]);

	}

	private static int getNumberOfWays(int n, int[] dp) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			dp[n] = 0; 
			return 0;
		}
		
		if(n == 1) {
			dp[1] = 1;
			return 1;
		}
		
		if(n == 2) {
			dp[2] = 2;
			return 2;
		}
		
		if(dp[n] == 0){
			dp[n] = getNumberOfWays(n-1, dp) + getNumberOfWays(n-2, dp);
		}
		return dp[n];
	}

}
