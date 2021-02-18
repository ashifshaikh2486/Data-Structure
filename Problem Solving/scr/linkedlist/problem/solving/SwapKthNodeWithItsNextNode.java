package linkedlist.problem.solving;

public class SwapKthNodeWithItsNextNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for (int i = 1; i <9 ; i++) {
			linkedList.insertAtEnd(i);
		}
		
		linkedList.display();
		System.out.println();
		
		
		int k = 8;
		int i = 1;
		
		Node fast = linkedList.getHead();
		Node slow = linkedList.getHead();
		Node prev = null;
		
		while(fast != null) {
			
			if(i > k) {
				prev = slow;
				slow = slow.getNext();
			}
			fast = fast.getNext();
			i++;
		}
		
		
		
		Node temp = null;
		
		if(k == 1) {
			System.out.println("Swaping is not possible ");
		}else {
			
			if(slow == linkedList.getHead()) {
				temp = slow;
				slow = slow.getNext();
				temp.setNext(slow.getNext());
				slow.setNext(temp);
				linkedList.setHead(slow);
			}else {
				temp = slow;
				slow = slow.getNext();
				temp.setNext(slow.getNext());
				slow.setNext(temp);
				prev.setNext(slow);
				
			}
			
		}
		
		linkedList.display();
		System.out.println();
		
	}

}
