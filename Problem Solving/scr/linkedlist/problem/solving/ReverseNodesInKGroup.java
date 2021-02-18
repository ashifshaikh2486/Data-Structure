package linkedlist.problem.solving;

public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SinglyLinkedList SLL = new SinglyLinkedList();
		
		for(int i = 1;i < 10;i++) {
			SLL.insertAtEnd(i);
		}
		
		int k = 3;
		
		SLL.display();
		System.out.println();
		
		SLL.setHead(reverseKGroup(SLL.getHead(),k));
		
		SLL.display();
		System.out.println();

	}

	private static Node reverseKGroup(Node head, int k) {
		// TODO Auto-generated method stub
		
		if(k == 1) {
			return head;
		}
		
		int count = 0;
		Node temp = head;
		while(count < k && temp != null ) {
			count++;
			temp = temp.next;
		}
		
		
		if(count == k && head != null && head.next != null) {
			Node prev = head;
			Node curr = head.next;
			Node next = curr.next;
			
			int i = 1;
			while(i < k) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				i++;
			}
			
			head.next = reverseKGroup(next, k);
			return prev;
			
		}else {
			return head;
		}
		
	}

	

}
