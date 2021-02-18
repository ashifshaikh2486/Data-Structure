package linkedlist.problem.solving;

public class SinglyLinkedList {

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	private Node head = null;

	public void display() {
		if (head == null) {
			System.out.println("List is Empty.");
		} else {
			Node n = head;
			while (n != null) {
				System.out.print(n.getData() + " ");
				n = n.getNext();
			}
		}
	}

	public void insertAtBeginning(int data) {

		Node temp = new Node(data);
		temp.setNext(head);
		head = temp;

	}

	public void insertAtEnd(int data) {
		Node temp = new Node(data);
		temp.setNext(null);

		if (head == null) {
			head = temp;
		} else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(temp);
		}

	}

	public void insertAfter(int data, int item) {

		Node temp = new Node(data);
		Node n = head;

		while (n != null) {
			if (n.getData() == item) {
				break;
			} else {
				n = n.getNext();
			}
		}

		temp.setNext(n.getNext());
		n.setNext(temp);

	}

	public void insertBefore(int data, int item) {

		Node temp = new Node(data);

		Node n = head;
		if (n.getData() == item) {
			temp.setNext(head);
			head = temp;
		} else {
			Node p = n;
			n = n.getNext();
			boolean flag = false;

			while (n.getNext() != null) {
				if (n.getData() == item) {
					flag = true;
					break;
				}
				p = n;
				n = n.getNext();
			}
			if (flag) {
				temp.setNext(p.getNext());
				p.setNext(temp);
			} else {
				System.out.println(item + " is not preseantin the list ");
			}
		}

	}

	public void remove(int data) {
		Node n = head;
		boolean flag = false;

		if (head == null) {
			System.out.println("List is Empty:");
		} else {
			if (n.getData() == data) {
				head = n.getNext();
				n = null;
				flag = true;
			} else {
				Node p = n;
				n = n.getNext();
				while (n != null) {
					if (n.getData() == data) {
						p.setNext(n.getNext());
						n = null;
						flag = true;
						break;
					}
					p = n;
					n = n.getNext();
				}
			}
			if (flag) {
				System.out.println(data + " is deleted successfully");
			} else {
				System.out.println(data + " is not present in the list");
			}
		}
	}

	public void search(int data) {
		int count = 1;
		Node n = head;
		boolean flag = false;

		while (n != null) {
			if (n.getData() == data) {
				flag = true;
				break;
			}
			n = n.getNext();
			count++;
		}

		if (flag) {
			System.out.println(data + " is found at location " + count);
		} else {
			System.out.println(data + " is not present in the list");
		}

	}

}


