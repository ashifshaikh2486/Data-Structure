package data.structure.linked_list;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList list = new DoublyLinkedList();

		list.display();

		list.insertAtEnd(15);
		System.out.println();
		list.display();

		list.insertAtBeginning(10);
		System.out.println();
		list.display();

		list.insertAtBeginning(5);
		System.out.println();
		list.display();

		list.insertAtEnd(30);
		System.out.println();
		list.display();

		list.insertAfter(25, 15);
		System.out.println();
		list.display();

		list.insertBefore(20, 25);
		System.out.println();
		list.display();

		System.out.println();

		list.search(20);
		list.search(5);
		list.search(30);
		list.search(40);
		
		System.out.println();
		list.remove(5);
		list.display();
		
		System.out.println();
		list.remove(25);
		list.display();
		
		System.out.println();
		list.remove(15);
		list.display();
		
		System.out.println();
		list.remove(40);
		list.display();


	}

}
