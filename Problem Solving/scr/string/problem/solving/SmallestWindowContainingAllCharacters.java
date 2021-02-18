package string.problem.solving;

public class SmallestWindowContainingAllCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Time O(n^2 * m)
		
//		String s = "Applied Course";
//		String p = "oeu";
//		
//		int n = p.length();
//		String res = "";
//		int minLen = Integer.MAX_VALUE;
//		for(int i=0;i<=s.length()-n;i++) {
//			boolean flag= true;
//			for(int j = i+n-1;j<s.length();j++) {
//				flag = true;
//				if(minLen < j+1-i) {
//					flag = false;
//					break;
//				}
//				
//				for(int k=0;k<n;k++) {
//					boolean flag2 = false;
//					for(int m=i;m<=j;m++) {
//						if(p.charAt(k) == s.charAt(m)) {
//							flag2 = true;
//							break;
//						}
//					}
//					
//					if(!flag2) {
//						flag = false;
//						break;
//					}
//					
//				}
//				
//				if(flag) {
//					res = s.substring(i,j+1);
//					minLen = j+1-i;
//				}
//				
//			}
//			
//			
//		}
//		System.out.println(res);	

		
		String s = "Applied Course";
		String p = "oeu";
		
		if(p.length()>s.length()) {
			System.out.println("No such window exists");
			return;
		}
		
		int minLen = Integer.MAX_VALUE;
		
		int[] hs = new int[256];
		int[] hp = new int[256];
		
		
		
		int count = 0;
		int start = 0;
		int start_index = -1;
		
		
		for(int i=0;i<p.length();i++) {
			hp[p.charAt(i)] += 1;
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			hs[ch] += 1;
			
			if(count<p.length() && hp[ch] != 0 &&  hs[ch] <= hp[ch]) {
				count++;
			}
			
			if(count == p.length()) {
				while(hp[s.charAt(start)] == 0 || hs[s.charAt(start)] > hp[s.charAt(start)] ) {
					
					if(hs[s.charAt(start)] > hp[s.charAt(start)]) {
						hs[s.charAt(start)] -= 1;
					}
					start++;
				}
			
			
			int winLen = i-start+1;
			
			if(minLen > winLen ) {
				minLen = winLen;
				start_index = start;
			}
			
			}
			
		}
		
		
		if(start_index == -1) {
			System.out.println("No such window exists");
		}else {
			System.out.println(s.substring(start_index,start_index +minLen));
		}
		
		
		
	}

}
