package linkedlist.problem.solving;

import java.util.PriorityQueue;

public class MergeK_SortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		SinglyLinkedList l1 = new SinglyLinkedList();
		SinglyLinkedList l2 = new SinglyLinkedList();
		SinglyLinkedList l3 = new SinglyLinkedList();
		
		l1.insertAtEnd(1);
		l1.insertAtEnd(4);
		l1.insertAtEnd(5);
		
		l2.insertAtEnd(1);
		l2.insertAtEnd(3);
		l2.insertAtEnd(4);
		
		l3.insertAtEnd(2);
		l3.insertAtEnd(6);
		
		l1.display();
		System.out.println();
		
		l2.display();
		System.out.println();
		
		l3.display();
		System.out.println();
		
		Node[] list = new Node[3];
		list[0] = l1.getHead();
		list[1] = l2.getHead();
		list[2] = l3.getHead();
		
		Node head1 = list[0];
		Node head2 = null;
		
//		int i = 1;
//		while(i<list.length) {
//			head2 = list[i];
//			head1 = mergeTwoList(head1,head2);
//			i++;
//		}
//		
//		l1.setHead(head1);
//		l1.display();
		
		
		
		l1.setHead(mergeKLists(list));
		l1.display();
		
	}

public static  Node mergeKLists(Node[] lists) {
        Node head = null;
        
        PriorityQueue< Node> queue = new PriorityQueue<Node>((n1,n2) -> n1.getData() - n2.getData());
        
        for(int i=0;i<lists.length;i++) {
        	if(lists[i] != null) {
        	queue.add(lists[i]);
        	}
        }
        
        head = queue.remove();
        if(head.next != null) {
        queue.add(head.next);
        }
        
        Node temp = head;
        
        while(!queue.isEmpty()) {
        	temp.next = queue.remove();
        	temp =  temp.next;
        	if(temp.next != null) {
        		queue.add(temp.next);
        	}
        }
        
        temp.setNext(null);
        
        return head;
    }




private static Node mergeTwoList(Node head1, Node head2) {
	// TODO Auto-generated method stub
	if(head1 == null) {
		return head2;
	}
	if(head2 == null) {
		return head1;
	}
	
	Node head  = null;
	
	if(head1.data <= head2.data) {
		head = head1;
		head1 = head1.next;
	}else {
		head = head2;
		head2 = head2.next;
	}
	
	Node curr = head;
	
	while(head1 != null & head2 != null) {
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
