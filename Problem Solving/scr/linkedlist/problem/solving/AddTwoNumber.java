package linkedlist.problem.solving;

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList a = new SinglyLinkedList();
		SinglyLinkedList b = new SinglyLinkedList();

		for (int i = 1; i < 10; i++) {
			a.insertAtBeginning(i);
		}

		for (int i = 9; i > 0; i--) {
			b.insertAtBeginning(i);
		}

		a.display();
		System.out.println();

		b.display();
		System.out.println();

		SinglyLinkedList sum = new SinglyLinkedList();

		Node headA = a.getHead();
		Node headB = b.getHead();

		int add = 0;
		int rem = 0;
		int q = 0;

		while (headA != null || headB != null) {

			add = q +  ((headA != null) ? headA.getData() : 0) + ((headB != null) ? headB.getData() : 0);
			rem = add % 10;
			q = add / 10;

			sum.insertAtBeginning(rem);

			if (headA != null) {
				headA = headA.getNext();
			}

			if (headB != null) {
				headB = headB.getNext();
			}
		}

		if (q > 0) {
			sum.insertAtBeginning(q);
		}

		sum.display();

	}

}
