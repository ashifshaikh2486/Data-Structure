package linkedlist.problem.solving;

public class FindIntersectionNodeofTwoSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList list1= new SinglyLinkedList();
		SinglyLinkedList list2= new SinglyLinkedList();
		
		for (int i = 1; i < 6; i++) {
			list1.insertAtEnd(i);
		}
		
		list2.insertAtEnd(2);
		list2.insertAtEnd(3);
		
		
		Node h1 = list1.getHead();
		Node h2 = list2.getHead();
		
		
		
		if(h1 == null || h2 == null) {
			return ;
		}
		
		if(h1.getNext() == null && h2.getNext() == null) {
			return;
		}
		
		
		while(h2.getNext() != null) {
			h2 = h2.getNext();
		}
		
		h2.setNext(h1.getNext().getNext().getNext());
		
		h2 = list2.getHead();
		
		
		list1.display();
		System.out.println();
		
		list2.display();
		System.out.println();

		
		
		// O(n*m) Time and O(1) Space
		
//		boolean flag = false;
//		
//		while(h1 != null) {
//			
//			h2 = list2.getHead();
//			
//			while(h2 != null) {
//				
//				if(h1 == h2) {
//					System.out.println(h1.getData());
//					flag = true;
//					break;
//				}
//				h2 = h2.getNext();
//			}
//			
//			if(flag) {
//				break;
//			}
//			
//			h1 = h1.getNext();
//			
//		}
		
		
		
		
		
		
		
		
		// O(n) Time and O(1) Space
		
		
		int n = 0;
		int m = 0;
		
		while(h1 != null) {
			n++;
			h1 = h1.getNext();
		}
		
		while(h2 != null) {
			m++;
			h2 = h2.getNext();
		}
		
		int diff = 0;
		
		if(n>m) {
			diff = n-m;
			h1 = list1.getHead();
			h2 = list2.getHead();
		}else {
			diff = m-n;
			h1 = list2.getHead();
			h2 = list1.getHead();
		}
		
		while(diff>0) {
			h1 = h1.getNext();
			diff--;
		}
		
		boolean flag = false;
		
		while(h1 != null && h2 !=null) {
			if(h1==h2) {
				flag = true;
				System.out.println(h1.getData());
				break;
			}
			h1 = h1.getNext();
			h2 = h2.getNext();
		}

	}

}
