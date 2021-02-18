package dp.problem.solving;

public class SubsetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {2,4,3,5};
		int sum = 13;
		int n = ar.length;
		// Using brute force recursion Time O(2^n) And Stack Space
		
//		boolean res = subsetSum(ar,ar.length-1,sum);
//		System.out.println(res);
		
		// Top-Down DP Time O(n*m) Space O(n*m) and stack space
		
//		int[][] dp = new int[sum+1][ar.length];
//		for(int i =0;i<=sum;i++) {
//			for(int j = 0;j<n;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		int res = subsetSum(dp,ar,n-1,sum);
//		System.out.println(res);
		
		
		// Bottom-Up DP Time O(n*m) Space O(n*m)
		
		boolean[][] dp = new boolean [sum+1][n];
		
		for(int i=0;i<n;i++) {
			dp[0][i] = true;
		}
		
		for(int i=1;i<=sum;i++) {
			dp[i][0] = ar[0]==i ? true : false;
		}
		
		for(int i=1;i<=sum;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j] = dp[i][j-1];
				if(i>=ar[j]) {
					dp[i][j] = dp[i][j] | dp[i-ar[j]][j-1];
				}
			}
		}
		
		System.out.println(dp[sum][n-1]);
		
	}

	private static int subsetSum(int[][] dp, int[] ar, int i, int sum) {
		// TODO Auto-generated method stub
		if(i==0) {
			dp[sum][0] = ar[i]==sum  ? 1  : 0;
			return dp[sum][0];
		}
		
		if(dp[sum][i] == -1) {
			if(ar[i] > sum) {
				dp[sum][i] = subsetSum(dp, ar, i-1, sum);
			}else {
				dp[sum][i] = subsetSum(dp, ar, i-1, sum-ar[i]) | subsetSum(dp, ar, i-1, sum); 
			}
		}
		return dp[sum][i];
	}

	private static boolean subsetSum(int[] ar, int i, int sum) {
		// TODO Auto-generated method stub
		if(sum < 0) {
			return false;
		}
		
		if(sum == 0) {
			return true;
		}
		if(i==0) {
			if(ar[i] == sum) {
				return true;
			}else {
				return false;
			}
		}
		
		return subsetSum(ar, i-1, sum) || subsetSum(ar, i-1, sum-ar[i]);
		
	}

}
