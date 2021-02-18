package linkedlist.problem.solving;

public class FindTheMiddleElementInSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		for (int i = 1; i < 7; i++) {
			linkedList.insertAtEnd(i);
		}
		
		linkedList.display();
		System.out.println();	
		
		Node fast = linkedList.getHead();
		Node slow =linkedList.getHead();
		
		while(fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		
		System.out.println(slow.getData());
		
	}

}
