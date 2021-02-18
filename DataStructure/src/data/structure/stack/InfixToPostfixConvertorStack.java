package data.structure.stack;


public class InfixToPostfixConvertorStack {
	
	private char[] s = new char[20];
	private int top = -1;
	
	public void push(char ch) {
		if(top+1 < s.length) {
			top += 1;
			s[top] = ch; 
		}else {
			System.out.println("Stack OverFLow");
		}
	}
	
	public char pop() {
		char ch = '@';
		if(top != -1) {
			ch = s[top];
			top -=1;
		}
		return ch;
	}
	
	public int priority(char ch) {
		if(ch == '(')
			return 0;
		if (ch == '+' || ch=='-')
			return 1;
		if(ch == '*' || ch == '/')
			return 2;
		return -1;
	}
	
	public char peek() {
		return s[top];
	}
}


