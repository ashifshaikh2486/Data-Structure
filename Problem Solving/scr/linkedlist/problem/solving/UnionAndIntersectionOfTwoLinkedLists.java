package linkedlist.problem.solving;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnionAndIntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SinglyLinkedList list1 = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();
		
		list1.insertAtEnd(6);
		list1.insertAtEnd(4);
		list1.insertAtEnd(2);
		list1.insertAtEnd(8);
		list1.insertAtEnd(10);
		
		list2.insertAtEnd(2);
		list2.insertAtEnd(1);
		list2.insertAtEnd(3);
		list2.insertAtEnd(4);
		
		Node head1 = list1.getHead();
		Node head2 = list2.getHead();
		
		
		list1.display();
		System.out.println();
		
		list2.display();
		System.out.println();
	

		SinglyLinkedList union = getUnion(head1,head2);
		
		union.display();
		System.out.println();
		
		System.out.println();
		
		list1.display();
		System.out.println();
		
		list2.display();
		System.out.println();
		
		SinglyLinkedList intersection = getIntersection(head1, head2);
		intersection.display();
		System.out.println();
		
		
//		list1.setHead(mergeSort(head1));
//		list2.setHead(mergeSort(head2));
//		
//		System.out.println();
//		
//		list1.display();
//		System.out.println();
//		
//		list2.display();
//		System.out.println();
//		
//		SinglyLinkedList union = new SinglyLinkedList();
//		SinglyLinkedList intersection = new SinglyLinkedList();
//		
//		System.out.println();
//		
//		union(list1.getHead(),list2.getHead(),union);
//		union.display();
//		System.out.println();
//		
//		System.out.println();
//		
//		list1.display();
//		System.out.println();
//		
//		list2.display();
//		System.out.println();
//
//		System.out.println();
//		
//	   intersection(list1.getHead(),list2.getHead(),intersection);	
//		intersection.display();
//		System.out.println();
		
	}
	
	
	private static SinglyLinkedList getIntersection(Node head1, Node head2) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList intersection = new SinglyLinkedList();
		
		Set<Integer> set = new HashSet<>();
		
		while(head2 != null) {
			set.add(head2.data);
			head2 = head2.next;
		}
		
		while(head1 != null) {
			if(set.contains(head1.data)) {
				intersection.insertAtEnd(head1.data);
				set.remove(head1.data);
			}
			head1 = head1.next;
		}
		
		set.clear();
		
		return intersection;
	}


	private static SinglyLinkedList getUnion(Node head1, Node head2) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList union = new SinglyLinkedList();
		
		Set<Integer> set = new HashSet<>();
		
		while(head2 != null) {
			set.add(head2.data);
			head2 = head2.next;
		}
		
		while(head1 != null) {
			if(set.contains(head1.data)) {
				union.insertAtEnd(head1.data);
				set.remove(head1.getData());
			}else {
				union.insertAtEnd(head1.data);
			}
			head1 = head1.next;
		}
		
		for(Integer data : set) {
			union.insertAtEnd(data);
		}
		
		set.clear();
		
		return union;
	}


	private static void intersection(Node head1, Node head2,SinglyLinkedList intersection) {
		// TODO Auto-generated method stub
		
		
		while(head1 != null && head2 != null) {
			if(head1.data == head2.data) {
				intersection.insertAtEnd(head1.data);
				head1 = head1.next;
				head2 = head2.next;
			}else if(head1.data < head2.data) {
				head1 = head1.next;
			}else {
				head2 = head2.next;
			}
		}
		
	}


	private static void union(Node head1, Node head2, SinglyLinkedList union) {
		// TODO Auto-generated method stub
		
				
		while(head1 != null && head2 != null) {
			if(head1.data == head2.data) {
				union.insertAtEnd(head1.data);
				head1 = head1.next;
				head2 = head2.next;
			}else if(head1.data < head2.data) {
				union.insertAtEnd(head1.data);
				head1 = head1.next;
			}else {
				union.insertAtEnd(head2.data);
				head2 = head2.next;
			}
		
		}
		
		//curr.next = (head1 != null) ? head1 : head2;
		
		while(head1 != null) {
			union.insertAtEnd(head1.data);
			head1 = head1.next;
		}
		while(head2 != null) {
			union.insertAtEnd(head2.data);
			head2 = head2.next;
		}

	}


	public static Node mergeSort(Node head) {
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

	


	private static Node divide(Node head) {
		// TODO Auto-generated method stub
		
		Node fast = head;
		Node slow = head;
		Node slow_prev = null;
		
		while(fast != null && fast.next != null) {
			slow_prev = slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		
		if(fast == null) {
			slow_prev.next = null;
			return slow;
		}else {
			slow_prev = slow;
			slow = slow.next;
			slow_prev.next = null;
			return slow;
		}
		
	}
	
	
	
	private static Node merge(Node head1, Node head2) {
		// TODO Auto-generated method stub
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		
		Node head ;
		if(head1.data <= head2.data) {
			head = head1;
			head1 = head1.next;
		}else {
			head = head2;
			head2 = head2.next;
		}
		
		Node curr = head;
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				curr.next = head1;
				head1 = head1.next;
			}else {
				curr.next = head2;
				head2 = head2.next;
			}
			curr = curr.next;
		}
		
		curr.next = (head1 != null) ? head1 : head2;
		
		return head;
	}

}
