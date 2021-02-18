package data.structure.stack;

import java.util.Scanner;

public class PostfixExpressionEvaluatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PostfixExpressionEvaluatorStack ps = new PostfixExpressionEvaluatorStack();
		
		String expr = "";
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the Postfix Expression : ");
			expr = sc.nextLine();
		}
		
		char ch;
		
		for(int i=0;i<expr.length();i++) {
			ch = expr.charAt(i);
			if(Character.isDigit(ch)) {
				ps.push(Character.getNumericValue(ch));
			}else {
				int a = ps.pop();
				int b = ps.pop();
				
				if(ch == '+') {
					ps.push(a+b);
				}
				if(ch == '-') {
					ps.push(a-b);
				}
				if(ch == '*') {
					ps.push(a*b);
				}
				if(ch == '/') {
					ps.push(a/b);
				}
			}
		}

		System.out.println(ps.pop());
		
	}

}
