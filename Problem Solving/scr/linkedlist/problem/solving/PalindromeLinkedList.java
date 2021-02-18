package linkedlist.problem.solving;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList linkedList = new SinglyLinkedList();

		
		// Using Stack with O(n) Time and O(n) Sapce

//		Stack<Integer> st = new Stack<Integer>();
//		
//		Node temp = linkedList.getHead();
//		
//		while(temp != null) {
//			
//			st.push(temp.getData());
//			temp = temp.getNext();
//			
//		}
//		
//		boolean flag = true ;
//		
//		temp = linkedList.getHead();
//	
//		
//while(temp != null) {
//			
//			if(temp.getData() != st.pop()) {
//				flag = false;
//				break;
//			}
//			temp = temp.getNext();
//			
//		}
//
//	if(flag) {
//		System.out.println("Linked List is palimdrom");
//	}else {
//		System.out.println("Linked List is not palimdrom");
//	}

		
		
		
		
		// Using HashMap with O(N) Time and O(1) Space

//		Map<Character, Integer> map = new HashMap<>();
//
//		int oddCount = 0;
//
//		Node temp = linkedList.getHead();
//
//		while (temp != null) {
//			char ch = (char) temp.getData();
//			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//				if (map.get(ch) % 2 == 0) {
//					oddCount -= 1;
//				} else {
//					oddCount += 1;
//				}
//			} else {
//				map.put(ch, 1);
//				oddCount += 1;
//			}
//			temp = temp.getNext();
//		}
//
//		if (oddCount == 0 || oddCount == 1) {
//			System.out.println("Linked List is palimdrom");
//		} else {
//			System.out.println("Linked List is not palimdrom");
//		}

		
		
		
		// Without Any DS With O(n) TIme and O(1) space
		
		linkedList.insertAtEnd(1);
		linkedList.insertAtEnd(2);
		linkedList.insertAtEnd(3);
		linkedList.insertAtEnd(3);
		linkedList.insertAtEnd(2);
		linkedList.insertAtEnd(1);

		// 1-> 2->3 ->3->2->1
		
		Node fast = linkedList.getHead();
		Node slow = linkedList.getHead();
		Node prev = null;
		Node secondHalfHead =null;
		Node midNode = null;
		
		
		while(fast != null && fast.getNext() != null && slow != null) {
			
			fast = fast.getNext().getNext();
			prev = slow;
			slow = slow.getNext(); 
			
		}
		
		if(fast != null) {
			secondHalfHead = slow.getNext();
			midNode = slow;
			prev.setNext(null);
		}else {
			secondHalfHead = slow;
			prev.setNext(null); 
		}
		
		secondHalfHead = reverseLinkedList(secondHalfHead);
		
		
		boolean flag = compare(linkedList.getHead(),secondHalfHead);
		
		System.out.println(flag);
		
		secondHalfHead = reverseLinkedList(secondHalfHead);
		
		if(midNode != null) {
		prev.setNext(midNode);
		midNode.setNext(secondHalfHead);
		}else {
			prev.setNext(secondHalfHead);
		}
		linkedList.display();
	
		
	}
	
	private static boolean compare(Node head, Node secondHalfHead) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		while(head != null && secondHalfHead != null) {
			if(head.getData() != secondHalfHead.getData()) {
				flag = false;
			}
			
			head = head.getNext();
			secondHalfHead = secondHalfHead.getNext();
			
		}
		
		return flag;
		
	}

	public static Node  reverseLinkedList(Node current) {
		
		Node prev = null;
		Node next;
		while(current != null) {
			
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
			
		}
		
		return prev;
		
	}

}
