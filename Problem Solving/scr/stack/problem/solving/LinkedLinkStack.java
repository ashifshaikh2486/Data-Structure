package stack.problem.solving;

public class LinkedLinkStack {
	
	private Node top = null;
	
	public void push(int data) {
		Node temp = new Node(data);
		temp.setNext(top);
		top = temp;
	}
	
	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public int pop() {
		int item = -1;
		if(top==null) {
			System.out.print("Stack Underflow ");
		}else {
			Node temp = top;
			item = temp.getData();
			top = temp.getNext();
			temp = null;
		}
		return item;
	}
	
	public void display() {
		if(top == null) {
			System.out.println("Stack is Empty");
		}else {
			Node n = top;
			while(n != null) {
				System.out.println(n.getData());
				n = n.getNext();
			}
		}
	}
	

}

