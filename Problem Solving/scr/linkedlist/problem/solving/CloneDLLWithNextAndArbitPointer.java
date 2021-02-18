package linkedlist.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class CloneDLLWithNextAndArbitPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList DLL = new DoublyLinkedList();
		
		for (int i = 1; i < 6; i++) {
			DLL.insertAtEnd(i);
		}
		
		DNode head = DLL.getHead();
		
		head.setPrevious(head.getNext().getNext());
		System.out.println(head.getPrevious().getData());
		
		head.getNext().setPrevious(head.getNext().getNext().getNext());
		System.out.println(head.getNext().getPrevious().getData());
		
		head.getNext().getNext().setPrevious(head);
		System.out.println(head.getNext().getNext().getPrevious().getData());
		
		head.getNext().getNext().getNext().setPrevious(head.getNext().getNext());
		System.out.println(head.getNext().getNext().getNext().getPrevious().getData());
		
		head.getNext().getNext().getNext().getNext().setPrevious(head.getNext().getNext());
		System.out.println(head.getNext().getNext().getNext().getNext().getPrevious().getData());
		
		
		
		
		
		
		// Solution with O(n) Time and O(n) Space
		
		
		
		
//		DoublyLinkedList copy = new DoublyLinkedList();
//		
//		Map<Integer,Integer> map1 = new HashMap<>();
//		Map<Integer,DNode> map2 = new HashMap<Integer, DNode>();
//		
//		head = DLL.getHead();
//		
//		while(head != null) {
//			copy.insertAtEnd(head.getData());
//			map1.put(head.getData(), head.getPrevious().getData());
//			head = head.getNext();
//		}
//		
//		
//		DNode headOfCopy = copy.getHead();
//		
//		while(headOfCopy != null) {
//			map2.put(headOfCopy.getData(), headOfCopy);
//			headOfCopy = headOfCopy.getNext();
//		}
//		
//		
//		head = DLL.getHead();
//		headOfCopy = copy.getHead();
//		
//		while(headOfCopy != null) {
//			
//			headOfCopy.setPrevious(map2.get(map1.get(headOfCopy.getData())));
//			headOfCopy = headOfCopy.getNext();
//			
//		}
//		
//		headOfCopy = copy.getHead();
		
		

		
		
		// Solution with O(n) Time and O(1) Space
	
		
		
		head = DLL.getHead();
		
		while(head != null) {
			DNode temp = new DNode(head.getData());
			temp.setPrevious(null);
			temp.setNext(head.getNext());
			head.setNext(temp);
			head = head.getNext().getNext();
		}
		
		DLL.display();
		
		head = DLL.getHead();
		DNode headOfCopy = head.getNext();
		
		
		while(head != null) {
			
			head.getNext().setPrevious(head.getPrevious().getNext());
			head = head.getNext().getNext();
			
		}
		
		head = DLL.getHead();
		while(head.getNext() != null) {
			DNode temp = head.getNext();
			head.setNext( head.getNext().getNext());
			head = temp;
		}
		
		
		
		
		
		
		
		System.out.println();
		
		System.out.println(headOfCopy.getPrevious().getData());
		System.out.println(headOfCopy.getNext().getPrevious().getData());
		System.out.println(headOfCopy.getNext().getNext().getPrevious().getData());
		System.out.println(headOfCopy.getNext().getNext().getNext().getPrevious().getData());
		System.out.println(headOfCopy.getNext().getNext().getNext().getNext().getPrevious().getData());

		

		
	}

}
