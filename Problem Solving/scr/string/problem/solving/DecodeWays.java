package string.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Time O(2^n)
		
//		String s = "12";
//		int res = recurDecodings(s,0);
//		System.out.println(res);
		
		
		// Time O(n)
		
		String s = "226";
		
		Map<Integer,Integer> map = new HashMap<>();
		
		int res = recurDecodings(s,0,map);
		
		System.out.println(res);
		
		
	}
	
	
	
	
	

	private static int recurDecodings(String s, int i, Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		if(i == s.length()) {
			return 1;
		}
		
		if(s.charAt(i) == '0') {
			return 0;
		}
		
		if(i == s.length()-1) {
			return 1;
		}
		
		
		if(!map.containsKey(i)) {
			int res = ((recurDecodings(s, i+1,map) )+((Integer.parseInt(s.substring(i, i+2))) <= 26 ? recurDecodings(s, i+2,map) : 0));
			map.put(i, res);
		}
		
		return map.get(i);
		
				
		
	}






	private static int recurDecodings(String s, int i) {
		// TODO Auto-generated method stub
		
		
		if(i == s.length()) {
			return 1;
		}
		
		if(s.charAt(i) == '0') {
			return 0;
		}
		
		if(i == s.length()-1) {
			return 1;
		}
		
		return (recurDecodings(s, i+1) + (Integer.parseInt(s.substring(i, i+2)) <= 26 ?  recurDecodings(s, i+2) : 0));
		
	}

}
