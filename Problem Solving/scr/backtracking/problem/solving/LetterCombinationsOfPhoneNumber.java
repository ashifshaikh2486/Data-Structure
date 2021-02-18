package backtracking.problem.solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> dict = new HashMap<>();
		
		dict.put(2, "abc");
		dict.put(3, "def");
		dict.put(4, "ghi");
		dict.put(5, "jkl");
		dict.put(6,"mno");
		dict.put(7, "pqrs");
		dict.put(8, "tuv");
		dict.put(9,"wxyz");
		
		String digits = "2";
		
		List<String> listOfCombination = new ArrayList<>();
		if(digits.length()==0) {
			System.out.println(listOfCombination);
			return ;
		}
		
		getLetterCombination(dict,listOfCombination,digits,0,"");
		System.out.println(listOfCombination);
		

	}

	private static void getLetterCombination(Map<Integer, String> dict, List<String> listOfCombination, String digits,
			int i,String comb) {
			
		
			if(i==digits.length()) {
				listOfCombination.add(comb);
				return;
			}
			
			String letters = dict.get(Integer.parseInt(String.valueOf(digits.charAt(i))));
			for(int j=0;j<letters.length();j++) {
				getLetterCombination(dict, listOfCombination, digits, i+1, comb+letters.substring(j, j+1));
			
			}
			
			
		
		// TODO Auto-generated method stub
		
	}

}
