package linkedlist.problem.solving;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for(int i =1;i<6;i++) {
			linkedList.insertAtEnd(i);
		}
		
		linkedList.display();
		System.out.println();
		
		Node odd = linkedList.getHead();
		Node evenhead = linkedList.getHead().next;
		Node even = linkedList.getHead().next;
		
		while(even != null && even.next != null ) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
			
		}
		
		
		
		odd.next = evenhead;		
		linkedList.display();

	}

}
