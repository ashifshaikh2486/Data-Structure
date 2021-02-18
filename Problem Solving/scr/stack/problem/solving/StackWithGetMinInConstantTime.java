package stack.problem.solving;

public class StackWithGetMinInConstantTime {
	
	Node top = null;
	int min ;

	public void push(int data) {
		Node temp ;
		if(top == null) {
			temp  = new Node(data);
			top = temp;
			min = data;
		}else {
			if(data < min) {
				temp = new  Node(2*data - min);
				temp.setNext(top);
				top = temp;
				min = data;
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
			if(temp.getData() < min) {
				n = min;
				min = 2*min -  temp.getData();
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
	
	public int getMin() {
		if(top == null) {
			min = Integer.MIN_VALUE;
		}
		return min;
	}
	
}




class Node{
	private int data ;
	private Node next;
	
	Node(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}


