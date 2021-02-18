package backtracking.problem.solving;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		List<String> res =  generateParenthesis(n);
		System.out.println(res);
	}

	private static List<String> generateParenthesis(int n) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();

//		recursion(list,n,n,"");
		getAllParanthesis(list,n,0,"");
		
		return list;
	}

	private static void getAllParanthesis(List<String> list, int openStock, int closeStock, String string) {
		// TODO Auto-generated method stub
		
		
		if(openStock==0 && closeStock==0) {
			list.add(string);
			return;
		}
		
		if(openStock>0) {
			getAllParanthesis(list, openStock-1, closeStock+1, string+"(");
		}
		if(closeStock>0) {
			getAllParanthesis(list, openStock, closeStock-1, string+")");
		}
		
	}

	private static void recursion(List<String> list, int n, int m, String str) {
		// TODO Auto-generated method stub
		if(n==0 && m==0) {
			list.add(str);
			return;
		}
		
		if(n<0 || m<0 || n>m) {
			return;
		}
		
		recursion(list, n-1, m, str+"(");
		recursion(list, n, m-1, str+")");
		
	}

}
