package linkedlist.problem.solving;

public class MergeSortForLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		linkedList.insertAtEnd(5);
		linkedList.insertAtEnd(3);
		linkedList.insertAtEnd(1);
		linkedList.insertAtEnd(4);
		linkedList.insertAtEnd(2);
		linkedList.insertAtEnd(6);
		
		linkedList.display();
		System.out.println();
		
		Node start_merge = mergeSort(linkedList.getHead());
		
		linkedList.setHead(start_merge);
		
		linkedList.display();
		
	}

	private static Node mergeSort(Node head) {
		// TODO Auto-generated method stub
		Node start_first = null;
		Node start_second = null;
		Node start_merge = null;
		
		if(head != null & head.getNext() != null) {
			start_first = head;
			start_second = divide(head);
			start_first = mergeSort(start_first);
			start_second = mergeSort(start_second);
			start_merge = merge(start_first,start_second);
			return start_merge;
		}else {
			return head;
		}
		
		
		
	}

	private static Node merge(Node start_frist, Node start_second) {
		// TODO Auto-generated method stub
		
		
	
		if(start_frist == null) {
			return start_second;
		}
		
		if(start_second == null) {
		return start_frist;
		}
		
		Node head = null;
		Node temp = null;
		
		if(start_frist.getData() <= start_second.getData()) {
			head = start_frist;
			start_frist = start_frist.getNext();
		}else {
			head = start_second;
			start_second = start_second.getNext();
		}
		
		temp = head;
		
		while(start_frist != null && start_second != null) {
			
			if(start_frist.getData() <= start_second.getData()) {
				temp.setNext(start_frist);
				temp = temp.getNext();
				start_frist = start_frist.getNext();
			}else {
				temp.setNext(start_second);
				temp = temp.getNext();
				start_second = start_second.getNext();
			}
		}
		
		temp.setNext((start_frist != null)? start_frist : start_second);
		
		return head;
	}

	private static Node divide(Node head) {
		// TODO Auto-generated method stub
		
		Node fast = head;
		Node slow = head;
		Node temp = null;
		
		
		while(fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			temp = slow;
			slow = slow.getNext();
		}
		
		if(fast != null) {
			temp = slow.getNext();
			slow.setNext(null);
		}else {
			temp.setNext(null);
			temp = slow;
		}
		
		return temp;
	}

}
