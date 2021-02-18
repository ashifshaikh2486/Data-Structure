package string.problem.solving;

import java.util.List;
import java.util.Stack;

public class RemoveAllAdjcentDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abbacaa";
		
		// ******* My Solution ******** //
		
//		String temp = removeDuplicates(s);
//		
//		while(!s.equals(temp)) {
//			s = temp;
//			temp = removeDuplicates(s);
//		}
		

		
		
		
		// *********Using Stack Time O(n) Space O(n)
		
//		Stack<Character> st = new Stack<Character>();	
//		
//		st.push(s.charAt(0));
//		int i =1;
//		while( i < s.length()) {
//			if(st.isEmpty()) {
//				st.push(s.charAt(i));
//				i++;
//			}else {
//			if(s.charAt(i) != st.peek()) {
//				i++;
//				st.push(s.charAt(i));
//			}else {
//				char ch = st.pop();
//				i++;
//				while(i<s.length() && s.charAt(i) == ch) {
//					i++;
//				}
//			}
//			}
//			
//		}
//		
//		char[] temp = new char[st.size()];
//		for(i = temp.length-1;i>=0;i--) {
//			temp[i] = st.pop();
//		}
//		
//		s = String.valueOf(temp);
//		System.out.println(s); 
		
		
		
		
		
		// Using Recursion 
		
//		String res  = removeDup(s); 
//		System.out.println(res);
		
		
		
		
		
		//  O(n) Time  O(n) Space
				
		
		char[] ar = s.toCharArray();
		
		int l = 0;
		
		for (int f=0 ; f < ar.length; f++) {
			
			if(l==0 || ar[l-1] != ar[f]) {
				ar[l++] = ar[f];
			}else {
				l--;
			}
		}
		
		for (int i = 0; i < l; i++) {
			System.out.print(ar[i]+" ");
		}
		
		
		
		
		
		}

	private static String removeDup(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		for (int i = 0; i < s.length()-1; i++) {
			System.out.println(s.charAt(i)+" "+s.charAt(i+1));
			if(s.charAt(i) == s.charAt(i+1)) {
				return removeDup(s.substring(0,i) + s.substring(i+2,s.length()));
			}
		}
		
		return s;
	}

	private static String removeDuplicates(String s) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < s.length()-1; i++) {
			char temp = s.charAt(i);
			int flag = 0;
			int count = 0;
			while(temp == s.charAt(i+1)) {
				flag =1;
				count++;
				i++;
			}
			
			if(flag == 1) {
				return s.substring(0,i-count) + s.substring(i+1, s.length());
			}
			
			
		}
		return s;
	}

}
