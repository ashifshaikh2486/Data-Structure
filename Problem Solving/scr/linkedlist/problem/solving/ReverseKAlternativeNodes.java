package linkedlist.problem.solving;

public class ReverseKAlternativeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SinglyLinkedList SLL = new SinglyLinkedList();
		int k = 3;
		
		for(int i=1;i<10;i++) {
			SLL.insertAtEnd(i);
		}
		
		SLL.display();
		
		Node head = SLL.getHead();
		System.out.println();
		
		SLL.setHead(kAlternativeReverse(head,k));
		SLL.display();
		System.out.println();
		

	}

	private static Node kAlternativeReverse(Node head, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		Node prev = null;
		Node next = null;
		Node curr = head;
		while(curr != null && count < k) {
			next = curr.next;
			curr.next  = prev;
			prev = curr;
			curr = next;
			count++;
		}
		
		if(head != null) {
			head.next = curr;
		}
		
		count = 0;
		
		while(curr != null && count<k-1) {
			curr = curr.next;
			count++;
		}
		
		if(curr != null) {
			curr.next = kAlternativeReverse(curr.next, k);
		}
		return prev;
	}

}
