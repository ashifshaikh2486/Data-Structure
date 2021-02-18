package string.matching.algorithms;

public class NaivePatternMatchingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "This is a text test text";
		String pattern = "text";
		
		int n = text.length();
		int m = pattern.length();
		
		for(int i=0;i<n-m+1;i++) {
			int j = 0;
			while(j<m) {
				if(! (text.charAt(i+j) == pattern.charAt(j))) {
					break;
				}
				j++;
			}
			if(j==m) {
				System.out.println("Pattern is found at "+ i);
			}
			
		}

	}

}
