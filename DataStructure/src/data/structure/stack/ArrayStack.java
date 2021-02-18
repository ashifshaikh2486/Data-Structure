package data.structure.stack;

public class ArrayStack {
	
	int[ ] s = new int[5];
	private int top = -1;
	
	public void push(int data) {
		
		if(top+1 == s.length) {
			System.out.println("Stack Overflow");
		}else {
			top +=  1;
			s[top] = data;
		}
	}
	
	public int pop() {
		int temp = -1;
		if(top == -1) {
			System.out.print("Stack Underflow ");
		}else {
			temp = s[top];
			top -= 1;
		}
		return temp;
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		}else {
			for(int i=top;i>=0;i--) {
				System.out.println(s[i]);
			}
		}
	}

}
