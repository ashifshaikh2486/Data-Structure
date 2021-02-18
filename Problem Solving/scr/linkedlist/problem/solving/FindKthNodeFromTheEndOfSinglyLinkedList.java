package linkedlist.problem.solving;


public class FindKthNodeFromTheEndOfSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SinglyLinkedList linkedList = new SinglyLinkedList();
	
	for (int i = 1; i < 8; i++) {
		linkedList.insertAtEnd(i);
	}
	
	
	int k = 3;
	
	
	
	
	// Solution with one pointer and two traverser
	
//	int n = 0;
//	
//	Node node = linkedList.getHead();
//	
//	while(node != null) {
//		n++;
//		node = node.getNext();
//	}
//	
//	if(n-k+1>0) {
//		node = linkedList.getHead();
//		int i = 1;
//		while(i<=n-k) {
//			node = node.getNext();
//			i++;
//		}
//		
//		System.out.println(node.getData());
	
	
	
	
	// Solution with two pointers and one traverser
	
	
	linkedList.display();
	System.out.println();
	
	Node fast = linkedList.getHead();
	Node slow = linkedList.getHead();
	
	
	int i = 1;	
	while(i<k) {
		fast = fast.getNext();
		i++;
	}
	
	while(fast.getNext() != null) {
		
		fast = fast.getNext();
		slow = slow.getNext();
		
	}
	
	linkedList.display();
	System.out.println();
	
	 	System.out.println(slow.getData());
	}

}
