package stack.problem.solving;

public class StackWithGetMaxInConstantTime {
	

	Node top = null;
	int max ;

	public void push(int data) {
		Node temp ;
		if(top == null) {
			temp  = new Node(data);
			top = temp;
			max = data;
		}else {
			if(data > max) {
				temp = new  Node(2*data - max);
				temp.setNext(top);
				top = temp;
				max = data;
			}else {
				temp = new Node(data);
				temp.setNext(top);
				top = temp;
			}
		}
	}
	
	
	public int pop() {
		int n = -1;
		if(top == null) {
			System.out.println("Stack is empty");
			return n;
		}else {
			Node temp = top;
			if(temp.getData() > max) {
				n = max;
				max = 2*max -  temp.getData();
			}else {
				n = temp.getData();
			}
			top = top.getNext();
			temp = null;
		}
		
		return n;
	}
	
	
	public void display() {
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}
	
	public int getMax() {
		if(top == null) {
			max = Integer.MAX_VALUE;
		}
		return max;
	}


}
