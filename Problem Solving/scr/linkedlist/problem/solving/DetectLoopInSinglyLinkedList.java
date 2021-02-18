package linkedlist.problem.solving;

public class DetectLoopInSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for (int i = 1; i < 7; i++) {
			linkedList.insertAtEnd(i);
		}
		
		
		Node temp = linkedList.getHead();
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(linkedList.getHead().getNext().getNext());
		
		
		Node fast = linkedList.getHead();
		Node slow = linkedList.getHead();
		
		boolean flag = false;
		
		while(fast != null && fast.getNext() != null ) {
		
			fast = fast.getNext().getNext();
			slow = slow.getNext();

			if(fast == slow) {
				flag = true;
				break;
			}
								
		}
		
		if(flag) {
			System.out.println("Loop is present");
		}else {
			System.out.println("There is no loop");
		}

	}

}
