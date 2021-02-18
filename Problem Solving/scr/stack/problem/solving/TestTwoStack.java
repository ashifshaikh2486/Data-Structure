package stack.problem.solving;

public class TestTwoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoStackInSingleArray twoStack = new TwoStackInSingleArray(10);

		for (int i = 1; i < 6; i++) {
			twoStack.push1(i);
		}
		
		
		for (int i = 10; i > 5; i--) {
			twoStack.push2(i);
		}
		
		twoStack.pop1();
		twoStack.push2(5);

		twoStack.display1();
		System.out.println();
		twoStack.display2();

	}

}
