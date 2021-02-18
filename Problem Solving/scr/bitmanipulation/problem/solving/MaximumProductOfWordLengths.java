package bitmanipulation.problem.solving;

public class MaximumProductOfWordLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
		
//		System.out.println((int)words[0].charAt(0) - (int)'a');
		
		int res =  maxProduct(words);
		System.out.println(res);
	}

	private static int maxProduct(String[] words) {
		// TODO Auto-generated method stub
		int maxProduct = 0;
		
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(no_common_letters(words[i],words[j])) {
					maxProduct = Math.max(maxProduct, words[i].length()*words[j].length());
				}
			}
		}
		
		return maxProduct;
	}
	
	
	// Time O(l + m)
	
	private static boolean no_common_letters(String word1, String word2) {
		// TODO Auto-generated method stub
		
		
		int bitMask1 = 0;
		int bitMask2 = 0;
		
		for(int i=0;i<word1.length();i++) {
			bitMask1 |= 1<<(int)word1.charAt(i) - (int)'a';
		}
		
		for(int i=0;i<word2.length();i++) {
			bitMask2 |= 1<<(int)word2.charAt(i) - (int)'a';
		}
		
		if((bitMask1 & bitMask2) == 0) {
			return true;
		}else {
			return false;
		}
	}

	
	// Time O(l * m)
	
//	private static boolean no_common_letters(String word1, String word2) {
//		// TODO Auto-generated method stub
//		boolean flag = true;
//		
//		for(int i=0;i<word1.length();i++) {
//			for(int j=0;j<word2.length();j++){
//				if(word1.charAt(i) == word2.charAt(j)) {
//					return false;
//				}
//			}
//		}
//		
//		return flag;
//	}
	
	

}
