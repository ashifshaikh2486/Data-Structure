package linkedlist.problem.solving;

public class RemoveKthNodeFromTheEndOfTheSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for (int i = 1; i < 8; i++) {
			linkedList.insertAtEnd(i);
		}
		
		
		int k = 1;
		
		
		Node fast = linkedList.getHead();
		Node slow = linkedList.getHead();
		Node prev = null;
		linkedList.display();
		
		int i = 1;
		
		
		while(fast != null) {
			
			if(i> k) {
				prev = slow;
				slow = slow.getNext();
			}
			
			fast = fast.getNext();
			i++;
		}
		
		if(prev == null) {
			linkedList.setHead(linkedList.getHead().getNext()); 
		}else {
			prev.setNext(slow.getNext());
		}
		System.out.println();
		linkedList.display();
		
	}

}
