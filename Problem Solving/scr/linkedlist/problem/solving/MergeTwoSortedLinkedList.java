package linkedlist.problem.solving;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList a = new SinglyLinkedList();
		SinglyLinkedList b = new SinglyLinkedList();
		
		for (int i = 1; i < 10 ; i++) {
			if(i%2 == 0) {
				a.insertAtEnd(i);
			}else {
				b.insertAtEnd(i);
			}
		}
		
		a.display();
		System.out.println();
		
		b.display();
		System.out.println();
		
		Node headOfA = a.getHead();
		Node headOfB = b.getHead();
		
		Node head = merge(headOfA,headOfB);
		
				
		a.setHead(head);
		
		a.display();
		
	}

	private static Node merge(Node headOfA, Node headOfB) {
		// TODO Auto-generated method stub
		
		if(headOfA == null) {
			return headOfB;
		}
		
		if(headOfB == null) {
			return headOfA;
		}
		
		Node head = null;
		Node temp = null;
		
		if(headOfA.getData() <= headOfB.getData()) {
			head = headOfA;
			headOfA = headOfA.getNext();
		}else {
			head = headOfB;
			headOfB = headOfB.getNext();
		}
		
		temp = head;
		
		while(headOfA  != null && headOfB != null) {
			
			if(headOfA.getData() <= headOfB.getData()) {
				temp.setNext(headOfA);
				temp = temp.getNext();
				headOfA = headOfA.getNext();
			}else {
				temp.setNext(headOfB);
				temp = temp.getNext();
				headOfB = headOfB.getNext();
			}
			
		}
		
		
		temp.setNext((headOfA != null) ? headOfA : headOfB);
		return head;
	}	

}
