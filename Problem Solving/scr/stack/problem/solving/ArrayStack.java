package stack.problem.solving;

public class ArrayStack {
	
	private int size ;
	private int top ;
	private int[] s;
	
	
	ArrayStack(int size){
		this.size = size;
		top = -1;
		s = new int[size];
	}
	

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
	
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}

}
