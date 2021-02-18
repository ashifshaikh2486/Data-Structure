package data.structure.stack;

import java.util.Scanner;

public class InfixToPrefixConvertorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InfixToPostfixConvertorStack ip = new InfixToPostfixConvertorStack();
		StringBuilder sb = new StringBuilder("");
		String expr = "";
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the Infix Expression : ");
			expr = sc.nextLine();
		}
		
		char[] bytes = expr.toCharArray();
		char[] rev_expr = new char[bytes.length];
		int j = 0;
		for(int i = bytes.length-1;i>=0;i--) {
			if(bytes[i]  ==  ')') {
				rev_expr[j] ='('; 
			}else if(bytes[i] == '(') {
				rev_expr[j] = ')';
			}else {
				rev_expr[j] = bytes[i];
			}
			j++;
		}
		
		
		char ch;
		for(int i=0;i<rev_expr.length;i++) {
			ch = rev_expr[i];
			
			if(Character.isDigit(ch) || Character.isLetter(ch)) {
				sb.append(ch);
			}else if(ch=='(') {
				ip.push(ch);
			}else if(ch == ')') {
				char ch1 = ip.pop();
				while(ch1 != '(') {
					sb.append(ch1);
					ch1 = ip.pop();
				}
			}else {
				while(ip.priority(ip.peek()) > ip.priority(ch)) {
					sb.append(ip.pop());
				}
				ip.push(ch);
			}
			
		}
		char ch2 = ip.pop();
		while(ch2 != '@') {
			sb.append(ch2);
			ch2 = ip.pop();
		}
		
		String pre_expr = sb.reverse().toString();
		System.out.println(pre_expr);

	}

}
