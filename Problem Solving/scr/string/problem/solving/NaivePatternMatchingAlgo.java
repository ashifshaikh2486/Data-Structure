package string.problem.solving;

public class NaivePatternMatchingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is a text test text";
		String p = "text";
		
		
		// Solution using for loop Best Case O(N) Worst Case O(n-m+1)  
		
//		int n = s.length();
//		int m = p.length();
//		
//		for (int i = 0; i < n-m+1; i++) {
//			
//			for (int j = 0; j < m; j++) {
//				if(s.charAt(i+j) != p.charAt(j)) {
//					break;
//				}
//				if(j==m) {
//					System.out.println("Pattern is found at "+ i);
//				}
//			}
//			
//		}
		
		
		
		
		
		
		
		// ****** My Solution using while loop (complicated)
		
//		int i = 0 ;
//		
//		while(i < s.length()-p.length()+1) {
//			
//			if(p.charAt(0) == s.charAt(i)) {
//				int j = 1;
//				
//				while(j<p.length()) {
//					if(! (p.charAt(j) == s.charAt(i+j))){
//						break;
//					}
//					j++;
//					if(j == p.length()) {
//						System.out.println("Pattern is found at "+ i);
//					}
//				}
//				
//				
//			}
//			i++;
//		}

	
	}

}
