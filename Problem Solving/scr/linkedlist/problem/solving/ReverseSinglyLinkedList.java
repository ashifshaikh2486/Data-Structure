package linkedlist.problem.solving;

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for (int i = 1; i < 9; i++) {
			linkedList.insertAtEnd(i);
		}
		
		linkedList.display();
		System.out.println();
		
		Node current = linkedList.getHead();
		Node previous =  null;
		Node next ;
		
		while(current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		
		linkedList.setHead(previous);
		
		linkedList.display();
		System.out.println();
		
		

	}

}
