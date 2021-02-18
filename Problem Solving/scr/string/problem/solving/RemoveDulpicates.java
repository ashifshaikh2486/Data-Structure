package string.problem.solving;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDulpicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbaccdefatafaz";
		
		StringBuilder sb = new StringBuilder("bbaccdefatafaz");
		
		System.out.println(sb);
		
		// Time O(n^2) Space O(n)

//		String s1 = String.valueOf(s.charAt(0));
//		
//		for (int i = 1; i < s.length(); i++) {
//			boolean flag = true;
//			for (int j = 0; j < s1.length(); j++) {
//				if(s.charAt(i) == s1.charAt(j)) {
//					flag = false;
//					break;
//				}
//			}
//			if(flag) {
//				s1 += String.valueOf(s.charAt(i));
//			}
//			
//		}
//				
//		System.out.println(s);
//		System.out.println(s1);

		
		
		
		// Time O(n^2) Space O(1)
		
//		for (int i = 0; i < sb.length(); i++) {
//			char ch = sb.charAt(i);
//			if(Character.isWhitespace(ch)) {
//				continue;
//			}
//			for (int j = i+1; j < sb.length(); j++) {
//				if(ch == sb.charAt(j)) {
//					sb.deleteCharAt(j);
//				}
//			}
//		}
//		
//		
//		s = new String(sb);
//		
//		System.out.println(sb);
		
		
		
		

		// Sorted output Time O(nlogn) Space O(n)
		
//		s  = s.trim();
//		char[] temp = s.toCharArray();
//		
//		System.out.println(temp);
//		
//		mergeSort(temp, 0, temp.length - 1);
//
//		System.out.println(temp);
//		
//		StringBuilder sb = new StringBuilder();
//		
//		
//		sb.append(temp[0]);
//		char ch = sb.charAt(0);
//		for (int i = 1; i < temp.length; i++) {
//			if(ch != temp[i]) {
//				sb.append(temp[i]);
//				ch = temp[i];
//			}
//		}
//		
//		System.out.println(sb);
//		
		
		
		
// Time O(n) Space O(n)
		
//		Set<Character> set = new LinkedHashSet<>();
//		
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		
//		s = set.toString();
//		System.out.println(s);
		
		
		
		
// Using Counting Sort // Time O(n+k) Space O(k)
		
//		char[] A = s.toCharArray();
//		
//		char[] B = new char[A.length];
//		
//		int[] C = new int[26];
//		
//		char ch  = 'a';
//		int a = ch;
//		
//		for (int i = 0; i < A.length; i++) {
//			C[A[i] - 97] = C[A[i]-97] + 1;
//		}
//		
//		for (int i = 0; i < A.length; i++) {
//			System.out.print(A[i]+" ");
//		}
//		
//		System.out.println();
//		for (int i = 0; i < C.length; i++) {
//			System.out.print(C[i]+" ");
//		}
//		
//		System.out.println();
//		for (int i = 0; i < C.length; i++) {
//			if(C[i] != 0) {
//			System.out.print((char)(i+97)+" ");
//			}
		
		
//		C[0] -= 1;
//		
//		for (int i = 1; i < C.length; i++) {
//			C[i] += C[i-1];
//		}
//		
//		System.out.println();
//		for (int i = 0; i < C.length; i++) {
//			System.out.print(C[i]+" ");
//		}
//		
//		for (int i = A.length-1; i >=0  ; i--) {
//				
//			B[C[A[i]-97]] = A[i];
//			C[A[i]-97] -= 1;
//		}
//		
//		System.out.println();
//		for (int i = 0; i < B.length; i++) {
//			System.out.print(B[i]+" ");
//		}
	
		
		
// ********************************************************************************//
		// Using Bitwise Operation  Sort with O(n) Time and O(1)  space
		
//		int l = 0;
//		int b = 0;
//		
//		for(int i=0;i<sb.length();i++) {
//			int x = sb.charAt(i)-97;
//			if((b & 1<<x) == 0) {
//				sb.setCharAt(l, sb.charAt(i));
//				b = b | 1<<x;
//				l++;
//			}
//		}
//		
//		
//		System.out.println(sb.substring(0, l));
		
// ********************************************************************************//		
		
	}
	
	
		
	//}

	private static void mergeSort(char[] temp, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(temp, l, m);
			mergeSort(temp, m + 1, r);
			merge(temp, l, m, r);
		}

	}

	private static void merge(char[] temp, int l, int m, int r) {
		// TODO Auto-generated method stub

		char[] s1 = new char[m - l + 1];
		char[] s2 = new char[r - m];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = temp[l + i];
		}

		for (int i = 0; i < s2.length; i++) {
			s2[i] = temp[m + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = l;

		while (i < s1.length && j < s2.length) {

			if (s1[i] <= s2[j]) {
				temp[k] = s1[i];
				i++;
			} else {
				temp[k] = s2[j];
				j++;
			}
			k++;
		}

		while (i < s1.length) {
			temp[k] = s1[i];
			i++;
			k++;
		}
		
		while(j < s2.length) {
			temp[k] = s2[j];
			k++;
			j++;
		}

	}

}
