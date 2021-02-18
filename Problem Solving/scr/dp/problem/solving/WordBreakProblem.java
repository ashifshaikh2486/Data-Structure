package dp.problem.solving;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "appliedisgoodcourse";
		
		Set<String> dict = new HashSet<>(); 
		dict.add("appliedis");
		dict.add("course");
		dict.add("good");
		
		
//		boolean res = wordBreak(s,dict);
//		System.out.println(res);
		
		
		
		// Bottom-UP DP Time O(n^2) Space O(n)
		int n = s.length();
		boolean[] dp = new boolean[n+1];
		dp[0] = true;
		
		for(int i=1;i<=n;i++) {
			 boolean flag = false;
			for(int j=0;j<i;j++) {
				flag = dp[j] && dict.contains(s.substring(j, i));
				if(flag) {
					break;
				}
			}
			dp[i] = flag;
			
		}
		
		System.out.println(dp[n]);
		
	}

	private static boolean wordBreak(String s, Set<String> dict) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			return true;
		}
		if(dict.contains(s)) {
			return true;
		}
		
		boolean flag = false;
		
		for(int i=s.length()-1;i>=0;i--) {
			flag = dict.contains(s.substring(i)) && wordBreak(s.substring(0, i), dict) ;
			if(flag) {
				break;
			}
		}
		
		return flag;
	
	}

}
