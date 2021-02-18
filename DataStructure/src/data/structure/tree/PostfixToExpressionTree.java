package data.structure.tree;

import java.util.Scanner;

public class PostfixToExpressionTree {
	
	public static void main(String args[]) {
		
		String str ="";
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter valid  Postfix Expression : ");
			str = sc.nextLine();
			
		}
		
		PostfixToExpresionTreeStack st = new PostfixToExpresionTreeStack();
		
		for(int i = 0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
				
				Node n = new Node(ch);
				
				n.setLeft(null);
				n.setRight(null);
				
				st.push(n);
				
			}else if(ch =='+' || ch =='-' || ch =='*' || ch == '/') {
				
				Node temp = new Node(ch);
				temp.setRight(st.pop());
				temp.setLeft(st.pop());
				
				st.push(temp);
			}
			
		}
		
		Node root = st.pop();
		
		System.out.println(root.getInfo());
		postorder(root);
		System.out.println();
		
		int res = Eval(root);		
		System.out.println(res);
	}

	private static int Eval(Node root) {
		// TODO Auto-generated method stub
		System.out.println(root.getInfo());
		
		if(Character.isDigit(root.getInfo())){
			return root.getInfo();
		}else {
		

		root.getLeft().setInfo((char)Eval(root.getLeft()));
		root.getRight().setInfo((char)Eval(root.getRight()));
		System.out.println(root.getRight().getInfo());
		System.out.println(root.getInfo());
		System.out.println(Character.getNumericValue(root.getLeft().getInfo())+" "+Character.getNumericValue(root.getRight().getInfo()));
		if(root.getInfo() == '+') {
			System.out.println(Character.getNumericValue(root.getLeft().getInfo()) +Character.getNumericValue(root.getRight().getInfo()));
			return (Character.getNumericValue(root.getLeft().getInfo()) +Character.getNumericValue(root.getRight().getInfo()));
			
		}else if(root.getInfo() == '-') {
			System.out.println(Character.getNumericValue(root.getLeft().getInfo()) - Character.getNumericValue(root.getRight().getInfo()));
			return Character.getNumericValue(root.getLeft().getInfo()) - Character.getNumericValue(root.getRight().getInfo());
			
		}else if(root.getInfo() == '*') {
			System.out.println(Character.getNumericValue(root.getLeft().getInfo()) * Character.getNumericValue(root.getRight().getInfo()));
			return Character.getNumericValue(root.getLeft().getInfo()) * Character.getNumericValue(root.getRight().getInfo());
			
		}else {
			System.out.println(Character.getNumericValue(root.getLeft().getInfo()) / Character.getNumericValue(root.getRight().getInfo()));
			return Character.getNumericValue(root.getLeft().getInfo()) / Character.getNumericValue(root.getRight().getInfo());
		}
		}
		
	}

	private static void postorder(Node root) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			return ;
		}
		
		postorder(root.getLeft());
		postorder(root.getRight());
		System.out.print(root.getInfo());
	}

}
