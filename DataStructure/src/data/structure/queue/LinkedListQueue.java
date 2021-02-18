package data.structure.queue;

public class LinkedListQueue {
	private Node head=null;
	private Node tail=null;
	
	public void enqueue(int data) {
		
		Node temp = new Node(data);
		temp.setNext(null);
		
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	public void deqyeue() {
		
		if(head==null) {
			System.out.println("Queue is Empty");
		}else {
			Node temp = head;
			head = head.getNext();
			temp = null;
		}
	}
	
	public void display() {
		
		if(head == null) {
			System.out.println("Queue is Empty");
		}else {
			Node n = head;
			while(n!=null) {
				System.out.print(n.getData()+" ");
				n = n.getNext();
			}
		}
		System.out.println();
	}
	

}



class Node {
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