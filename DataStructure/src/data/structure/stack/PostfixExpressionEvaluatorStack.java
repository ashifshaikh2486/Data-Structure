package data.structure.stack;

public class PostfixExpressionEvaluatorStack {
	
	private int[] s = new int[20];
	private int top = -1;
	
	public void push(int data) {
		if(top+1 != s.length) {
			top = top+1;
			s[top] = data;
		}else {
			System.out.println("Stack OverFlow");
		}
	}
	
	public int pop() {
		int data = -1;
		if(top != -1) {
			data = s[top];
			top -= 1;
		}else {
			System.out.println("Stack UderFlow");
		}
		return data;
	}

}
