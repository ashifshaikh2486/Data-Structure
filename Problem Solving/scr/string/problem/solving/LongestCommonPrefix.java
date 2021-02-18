package string.problem.solving;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	
	public static void main(String args[]) {
		
		
		// Time O(N*L) Space O(1)
		
//		String[] strs = {"flower","flow","flight"};
//		String res = strs[0];
//		
//		int i=1;
//		while(i<strs.length) {
//			int j = 0;
//			while(j<res.length() && j<strs[i].length()) {
//				if(res.charAt(j) != strs[i].charAt(j)) {
//					break;
//				}
//				j++;
//			}
//			res = res.substring(0,j);
//			i++;
//			
//		}
//		
//		System.out.println(res);
		
		
		// Time O(N*L) Space O(1)
		
//		String[] strs = {"flower","flow","flight"};
//		String res = "";
//		
//		String s = strs[0];
//		int i = 0;
//		
//	
//		while(i<s.length()) {
//			
//			int j = 1;
//			boolean flag = true;
//			while(j<strs.length) {
//				if(i >= strs[i].length() || s.charAt(i) != strs[i].charAt(i)) {
//					flag = false;
//					break;
//				}
//				
//				j++;
//			}
//			
//			if(flag) {
//				res+=s.charAt(i);
//			}else {
//				break;
//			}
//			
//			i++;
//		}
//		
//		System.out.println(res);

		
		
		//Time O(N*L*log(L)) Space O(Log(L))
		
//		String[] strs = {"flower","flow","flight"};
//		
//		String res = "";
//		
//		int minLen = strs[0].length();
//		
//		for(int i=1;i<strs.length;i++) {
//			if(minLen > strs[i].length()) {
//				minLen = strs[i].length();
//			}
//		}
//		
//		int low = 0;
//		int high = minLen-1;
//		
//		while(low <= high) {
//			int mid = (low+high)/2;
//			if(allCommonPrefix(strs,low,mid)) {
//				res += strs[0].substring(low,mid+1);
//				low = mid+1;
//			}else {
//				high = mid-1;
//			}
//		}
//		
//		System.out.println(res);
		
		//Time O(L*N*log(N)) Space O(1)
		
		String[] strs = {"flower","flow","flight"};
		
		Arrays.sort(strs);
		
		
		int minLen = strs[0].length() < strs[strs.length-1].length()  ? strs[0].length() : strs[strs.length-1].length() ;
		
		int i = 0;
		while(i<minLen) {
			if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)) {
				break;
			}
			i++;
		}
		
		System.out.println(strs[0].substring(0, i));
		
		
	}

	private static boolean allCommonPrefix(String[] strs, int low, int high) {
		// TODO Auto-generated method stub
		String p = strs[0].substring(low, high+1);
		
		for(int i =1;i<strs.length;i++) {
			if( !(p.equals(strs[i].substring(low, high+1)))) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	
	
	
	
	
}
