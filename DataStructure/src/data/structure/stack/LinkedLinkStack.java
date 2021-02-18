package data.structure.stack;

public class LinkedLinkStack {
	
	private Node top = null;
	
	public void push(int data) {
		Node temp = new Node(data);
		temp.setNext(top);
		top = temp;
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



class Node{
	private int data;
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
