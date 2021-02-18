package dp.problem.solving;

public class LongestPalindromicSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCBCA";
		
		if(str.length() == 0) {
			System.out.println(0);
			return ;
		}
		
		int[][] dp = new int[str.length()][str.length()];
		
		// Using recursion(top-down DP) with TIme O(n) Space O(n^2)+StackSpace

//		for(int i=0;i<dp.length;i++) {
//			for(int j=0;j<dp.length;j++) {
//				if(i==j) {
//					dp[i][j] = 1;
//				}else {
//					dp[i][j] = -1;
//				}
//			}
//		}
//		
//		int res = getLargestPalindromicSunSequenceLength(str,dp,0,dp.length-1);
		
//		System.out.println(res);
	
		// Using (bottom-up DP) with TIme O(n) Space O(n^2)
		
		
		for(int i=0;i<dp.length;i++) {
			dp[i][i] = 1;
		}
		
		
		for(int diff = 1;diff<dp.length;diff++) {
			
			for(int i=0;i<dp.length-diff;i++) {
				int j = i+diff;
				if(str.charAt(i) == str.charAt(j)) {
					dp[i][j] = 2 + dp[i+1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]) ;
				}
			}
			
		}
		
		System.out.println(dp[0][dp.length-1]);
		
		
		
		
	
	}

	
	
	
	
	private static int getLargestPalindromicSunSequenceLength(String str, int[][] dp, int i, int j) {
		// TODO Auto-generated method stub
		
		if(j<i) {
			 dp[i][j] = 0;
			 return 0;
		}
		if(i==j) {
			return dp[i][j];
		}
		
		if(dp[i][j] == -1) {
			if(str.charAt(i) == str.charAt(j)) {
				dp[i][j] = 2 + getLargestPalindromicSunSequenceLength(str, dp, i+1, j-1);
			}else {
				dp[i][j] =  Math.max(getLargestPalindromicSunSequenceLength(str, dp, i, j-1), getLargestPalindromicSunSequenceLength(str, dp, i+1, j));
			}
		}
		
		return dp[i][j];
	}

}
