package dp.problem.solving;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s = "aaa";
		int n = s.length();
		
		
		
		// Brute Force Solution Time O(n^3) and O(1) Space
		
//		int start = 0;
//		int end = s.length();
//		for(int len = 1;len<=n;len++) {
//			for(int i=0;i<=n-len;i++) {
//				int j = i+len;
//				boolean flag = isPalindrom(s.substring(i, j));
//				if(flag) {
//					start = i;
//					end = j;
//					break;
//				}
//			}
//		}
//		
//		System.out.println(s.substring(start, end));
		
		// Using Bottom-Up DP Time O(n^2) and Space O(n^2)
//		
//		int[][] dp = new int[n][n];
//		
//		int start = 0;
//		int end = n;
//		
//		for(int i=0;i<n;i++) {
//			dp[i][i] = 1;
//			if(i==n-1) {
//				break;
//			}
//			int j =  i+1;
//			if(s.charAt(i) == s.charAt(j)) {
//				start = i;
//				end = j+1;
//				dp[i][j] = 1;
//			}
//		}
//		
//	
//		
//		for(int diff = 2;diff<n;diff++) {
//			
//			for(int i=0;i<n-diff;i++) {
//				int j = i+diff;
//				if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]  == 1) {
//					start = i;
//					end = j+1;
//					dp[i][j] = 1;
//				}
//			}
//			
//		}
//		
//		System.out.println(s.substring(start, end));
	
		
		
		// Solution with Time O(n^2) Space O(1) with palindrom logic
		
		
		if(n==0) {
			System.out.println("");
			return ;
		}
		
		if (n==1) {
			System.out.println(s);
			return ;
		}

		int maxLen = 1;
		String result = s.substring(0, 1) ;
		
		for(int i=1;i<n-1;i++) {
			
			// Even Length 
			
			int left = i-1;
			int right = i;
			
			while(left >=0 && right < n && s.charAt(left) ==s.charAt(right)) {
				 int len = right - left + 1;
				 if(len > maxLen) {
					 maxLen = len;
					 result = s.substring(left, right+1);
				 }
				 
				 left -= 1;
				 right +=1;
				
			}
			
			
			// odd length
			
			left = i-1;
			right = i+1;
			
			while(left >= 0 && right < n  && s.charAt(left) == s.charAt(right)) {
				int len = right - left + 1;
				
				if(len>maxLen) {
					maxLen = len;
					result = s.substring(left, right+1);
				}
				
				left -= 1;
				right += 1; 
			}
			
		}
		
		System.out.println(result);
		
		
	}

	private static boolean isPalindrom(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		
		if(s.compareTo(rev) == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
