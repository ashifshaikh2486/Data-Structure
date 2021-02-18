package linkedlist.problem.solving;

public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList linkedList = new SinglyLinkedList();

		linkedList.insertAtEnd(1);
		linkedList.insertAtEnd(2);
		linkedList.insertAtEnd(3);
		linkedList.insertAtEnd(3);
		linkedList.insertAtEnd(4);
		linkedList.insertAtEnd(5);
		linkedList.insertAtEnd(5);

		linkedList.display();
		System.out.println();

		Node head = linkedList.getHead();
		Node current = linkedList.getHead();
		Node prev = null;
		boolean flag ;

		while (current != null && current.next != null) {
			flag = false;
			
			while(current.data == current.next.data) {
				current.next = current.next.next;
				flag = true;
				if(current.next== null) {
					break;
				}
			}
			
			if(flag) {
				if(prev == null) {
					linkedList.setHead(current.next);
				}else {
					prev.next =  current.next;
				}
			}else {
				prev = current;
			}
			current = current.next;
		}

		linkedList.display();

	}

}
