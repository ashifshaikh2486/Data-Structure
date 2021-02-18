package linkedlist.problem.solving;

public class AlternativeSplitOfSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for (int i = 1; i < 7; i++) {
			linkedList.insertAtEnd(i);
		}
		
		
		linkedList.display();
		System.out.println();
		
		Node current = linkedList.getHead();
		
		

		
		// O(n) Time and O(1) Space But Order is not preserved
		
//		Node a = null;
//		Node b = null;
//		
//		while(current != null) {
//			
//			Node temp = current;
//			current = current.getNext();
//			temp.setNext(a);
//			a = temp;
//			if(current != null) {
//				temp = current;
//				current = current.getNext();
//				temp.setNext(b);
//				b = temp;
//			}
//				
//		}
		
		
		// O(n) Time and O(1) Space But Order is not preserved
		
		
//		Node a = current;
//		current = current.getNext();
//		
//		Node b = current;
//		current = current.getNext();
//		
//		a.setNext(null);
//		b.setNext(null);
//		
//		Node aTail = a;
//		Node bTail = b;
//		
//		while(current != null) {
//			
//			Node temp = current;
//			current = current.getNext();
//			
//			temp.setNext(null);
//			aTail.setNext(temp);
//			
//			aTail = temp;
//			
//			if(current != null) {
//				temp = current;
//				current = current.getNext();
//				
//				temp.setNext(null);
//				bTail.setNext(temp);
//				
//				bTail = temp;
//			}
//		}

		
		
		
		
		Node a = current;
		Node b = current.getNext();
		
		Node aTail = a;
		Node bTail = b;
		
		while(bTail != null && bTail.getNext() != null) {
			aTail.setNext(bTail.getNext());
			aTail = aTail.getNext();
			bTail.setNext(aTail.getNext());
			bTail = bTail.getNext();
		}
		
		aTail.setNext(null);
		
		linkedList.setHead(a);
		linkedList.display();
		System.out.println();
		
		linkedList.setHead(b);
		linkedList.display();
		System.out.println();

	}

}
