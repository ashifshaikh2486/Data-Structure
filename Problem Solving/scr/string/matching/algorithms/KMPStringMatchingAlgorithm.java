package string.matching.algorithms;

public class KMPStringMatchingAlgorithm {
	
	public static void  KMPSearch(String pattern, String text) {
		int n = text.length();
		int m = pattern.length();
		
		int[] lps = new int[m];
		
		computLPSArray(pattern, lps);
		
		int i = 0;
		int j = 0;
		
		while(i<n) {
			
			
			if(pattern.charAt(j) == text.charAt(i)) {
				i++;
				j++;
			}
			
			if(j==m) {
				System.out.println("Found pattern "+ "at index " + (i - j));
				j = lps[j-1];
			}else if( i<n && pattern.charAt(j) != text.charAt(i)) {
				
				if(j !=0 ) {
					j = lps[j-1];
				}else {
					i++;
				}
				
			}
			
		}
		
		
	}

	private static void computLPSArray(String patter, int[] lps) {
		// TODO Auto-generated method stub
		
		int m = patter.length();
		int i = 1;
		lps[0] = 0;
		int len = 0;
		
		while(i<m) {
			
			if(patter.charAt(i) == patter.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}else {
				
				if(len == 0) {
					lps[i] = len;
					i++;
				}else {
					len = lps[len-1];
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "abcdacbabcdf"; 
		String pattern = "abcdf"; 
		
		new KMPStringMatchingAlgorithm().KMPSearch(pattern, text);	
		

	}

}
