package stack.problem.solving;


public class TwoStackInSingleArray {

	private int size;
	private int top1;
	private int top2;
	private int[] ar;

	public TwoStackInSingleArray(int size) {
		// TODO Auto-generated constructor stub

		this.size = size;
		ar = new int[size];
		top1 = -1;
		top2 = size;

	}

	public int getTop1() {
		return top1;
	}

	public int getTop2() {
		return top2;
	}


	public void push1(int data) {
		if (top1 + 1 == top2) {
			System.out.println("Stack One is Overflow");
		}else {
			top1 = top1 + 1;
			ar[top1] = data;
		}
	}

	public void push2(int data) {
		if (top2 - 1 == top1) {
			System.out.println("Stack Two is Overflow");
		} else {
			top2 = top2 - 1;
			ar[top2] = data;
		}
	}

	public int pop1() {
		int temp = 0;
		if (top1 == -1) {
			System.out.println("Stack One is Underflow");
		} else {
			temp = ar[top1];
			top1--;
		}
		return temp;
	}

	public int pop2() {
		int temp = 0;

		if (top2 == size) {
			System.out.println("Stack Two is Underflow");
		} else {
			temp = ar[top2];
			top2++;
		}
		return temp;
	}

	public void display1() {
		if (top1 == -1) {
			System.out.println("Stack One is Empty");
		} else {
			int temp = top1;
			while (temp >= 0) {
				System.out.println(ar[temp]);
				temp--;
			}
		}
	}

	public void display2() {
		if (top2 == size) {
			System.out.println("Stack Two is Empty");
		} else {
			int temp = top2;
			while(temp < size) {
				System.out.println(ar[temp]);
				temp++;
			}
		}
	}
	
	public boolean isEmpty1() {
		if(top1==-1) {
			return true;
		}else {
			return false;
		}
	}

	public boolean isEmpty2() {
		if(top2==size) {
			return true;
		}else {
			return false;
		}
	}
	
}



