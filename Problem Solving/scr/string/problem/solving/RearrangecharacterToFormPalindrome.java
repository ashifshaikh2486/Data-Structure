package string.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class RearrangecharacterToFormPalindrome {
	
	public static void main(String[] args) {
		
		
		String s = "carrace";
		
		Map<Character,Integer> map = new HashMap<>();
		
		int oddCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				if(map.get(ch) % 2 ==0 ) {
					oddCount--;
				}else {
					oddCount++;
				}
			}else {
				map.put(s.charAt(i), 1);
				oddCount++;
			}
			
		}
		
		if(oddCount == 0 || oddCount == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
