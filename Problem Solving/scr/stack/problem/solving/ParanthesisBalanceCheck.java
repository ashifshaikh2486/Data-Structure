package stack.problem.solving;


import java.util.Stack;

public class ParanthesisBalanceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "{{([]))}}";

		check(str);
		
	}

	private static void check(String str) {
		// TODO Auto-generated method stub
		
		Stack<Character>st = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == '(' ||  ch == '[' || ch == '{' ) {
				st.push(ch);
			}else if( ch == ')' || ch == ']' || ch== '}') {
				if(st.empty()) {
					System.out.println("Right Paranthesis are more than Left Paranthesis");
					return;
				}else {
					char temp = st.pop();
					
					if(!match(ch,temp)) {
						System.out.println("Mismatched Paranthesis are : " + temp +" "+ch);
						return;
					}
					
				}
			}
				
		}
		
		if(st.empty()) {
			System.out.println("Balanced Paranthesis");
		}else{
			System.out.println("Left Paranthesis are more than Right Paranthesis");
		}
		
		
	}

	private static boolean match(char ch, char temp) {
		// TODO Auto-generated method stub
		
		if(temp == '(' && ch == ')' || temp == '[' && ch == ']' || temp == '{' && ch == '}'   ) {
			return true;
		}else {
			return false;
		}
	}

}
