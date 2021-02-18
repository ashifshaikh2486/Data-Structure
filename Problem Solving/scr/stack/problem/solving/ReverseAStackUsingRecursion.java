package stack.problem.solving;

public class ReverseAStackUsingRecursion {
	
	private static ArrayStack stack =  new ArrayStack(5);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i = 1; i <= 5; i++ ) {
			stack.push(i);
		}
		
		stack.display();
		
		reverse();
		
		System.out.println();
		
		stack.display();
		
	}

	private static void reverse() {
		// TODO Auto-generated method stub
		
		if(stack.isEmpty()) {
			return;
		}else {
			int x = stack.pop();
			reverse();
			insert(x);
		}
		
		
	}

	private static void insert(int x) {
		// TODO Auto-generated method stub
		
		if(stack.isEmpty()) {
			stack.push(x);
		}else {
			int temp = stack.pop();
			insert(x);
			stack.push(temp);
		}
		
	}

}
