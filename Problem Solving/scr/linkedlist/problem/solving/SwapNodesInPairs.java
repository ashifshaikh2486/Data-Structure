package linkedlist.problem.solving;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList SLL = new SinglyLinkedList();
		
		for(int i = 1;i < 6;i++) {
			SLL.insertAtEnd(i);
		}
		
		
		SLL.display();
		System.out.println();
		
		SLL.setHead(swapPairs(SLL.getHead()));
		
		SLL.display();
		System.out.println();

	}

	private static Node swapPairs(Node head) {
		// TODO Auto-generated method stub
		
		
		if(head != null && head.next != null) {
			Node prev = head;
			Node curr = head.next;
			Node next = curr.next;
			
			curr.next = prev;
			prev.next = swapPairs(next);
			return curr;
		}else {
			return head;
		}
		
		
	}

}
