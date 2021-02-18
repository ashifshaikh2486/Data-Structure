package linkedlist.problem.solving;

public class SplitACircularLinkedListIntoTwoHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		
		for(int i = 1;i<7;i++) {
			linkedList.insertAtEnd(i);	
		}
		
		linkedList.display();
		System.out.println();
		
		Node temp = linkedList.getHead();
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(linkedList.getHead());
		
		
		Node fast = linkedList.getHead();
		Node slow = linkedList.getHead();
		
		while(fast.getNext() != linkedList.getHead()) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(fast.getNext().getNext() == linkedList.getHead()) {
				fast = fast.getNext();
			}
		}
		
		System.out.println(slow.getData());
		System.out.println(fast.getData());
		
		Node head1 = linkedList.getHead();
		Node head2 = slow.getNext();
		
		slow.setNext(head1);
		fast.setNext(head2);
		
		while(head1.getNext() != linkedList.getHead()) {
			System.out.print(head1.getData() + " ");
			head1 = head1.getNext();
		}
		
		System.out.print(head1.getData());
		System.out.println();
		
		linkedList.setHead(head2);
		
		while(head2.getNext() != linkedList.getHead()) {
			System.out.print(head2.getData()+" ");
			head2 = head2.getNext();
		}
		
		System.out.println(head2.getData());

	}

}
