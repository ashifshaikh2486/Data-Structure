package linkedlist.problem.solving;

public class CircularSortedLinkedList {

	Node head=null;
	
	public void insert(int data){
		Node temp = new Node(data);
		if(head == null) {
			temp.next = temp;
			head = temp;
		}
		
		Node min = null;
		Node max = null;
		Node curr = head;
		
		while(curr.next != head) {
			if(curr.data > curr.next.data) {
				max = curr;
				min = curr.next;
				break;
			}
			curr = curr.next;
		}
		
		if( curr.next == head) {
			min = curr.next;
			max = curr;
		}
		
		curr = min;
		Node prev = max;
		while(curr.next != min && curr.data < data) {
			prev = curr;
			curr = curr.next;
			break;
		}
		
		prev.next = temp;
		temp.next = curr;
		
	}
	
	
	public void display() {
		if(this.head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		Node curr = head;
		while(curr.next != head) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.print(curr.data);
		System.out.println();
		
	}
	
	
}



