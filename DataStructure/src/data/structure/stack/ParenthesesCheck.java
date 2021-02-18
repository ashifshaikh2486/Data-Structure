package data.structure.stack;

import java.util.Scanner;

public class ParenthesesCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Expression : ");
		String s = sc.nextLine();		
		sc.close();
		ParenthesesCheckStack ps = new ParenthesesCheckStack();
		
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch=='{'  || ch == '(' || ch=='[') {
				ps.push(ch);
				ps.display();
				System.out.println("----------------------------");
			}
			
			if(ch=='}' || ch == ')' || ch == ']') {
				char ch1 = ps.pop();
				System.out.println("POP "+ch1);
				if(!(ch1=='(' && ch==')' || ch1=='[' && ch==']' || ch1=='{' && ch=='}' )) {
					System.out.println("Error at index "+i);
					break;
				}
			}
			
		}
		
		ps.display();
		
		if(ps.pop()=='0') {
			System.out.println("Valid Expression");
		}else {
			System.out.println("Invalid Expression");
		}

	}

}
