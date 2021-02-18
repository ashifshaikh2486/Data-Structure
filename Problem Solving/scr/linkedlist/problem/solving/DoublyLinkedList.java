package linkedlist.problem.solving;

public class DoublyLinkedList {

	private DNode head = null;

	public void display() {
		DNode n = head;
		if (n == null) {
			System.out.println("List is Empty");
		} else {

			while (n != null) {
			//	System.out.println(n.getPrevious()+" "+n.getData() + " "+n.getNext());
				System.out.print(n.getData()+" ");
				n = n.getNext();
			}
		}
	}

	public DNode getHead() {
		return head;
	}

	public void setHead(DNode head) {
		this.head = head;
	}

	public void insertAtBeginning(int data) {

		DNode temp = new DNode(data);

		temp.setPrevious(null);
		temp.setNext(head);

		if (head !=null) {
			head.setPrevious(temp);
		}
		
		head = temp;
	}

	public void insertAtEnd(int data) {

		DNode temp = new DNode(data);

		temp.setNext(null);

		if (head == null) {
			temp.setPrevious(null);
			head = temp;
		} else {
			DNode n = head;

			while (n.getNext() != null) {
				n = n.getNext();
			}

			n.setNext(temp);
			temp.setPrevious(n);
		}

	}

	public void insertAfter(int data, int item) {

		if (head == null) {
			System.out.println("Lsit is Empty");
		} else {
			DNode n = head;
			boolean flag = false;

			while (n != null) {
				if (n.getData() == item) {

					DNode temp = new DNode(data);
					temp.setPrevious(n);
					temp.setNext(n.getNext());

					if (n.getNext() != null) {
						n.getNext().setPrevious(temp);
					}

					n.setNext(temp);

					flag = true;
					break;
				}
				n = n.getNext();
			}
			if (!flag) {
				System.out.println(item + " is not present in the list");
			}
		}
	}

	public void insertBefore(int data, int item) {
		DNode temp;

		if (head == null) {
			System.out.println("List is Empty");
		} else {
			DNode n = head;
			if (n.getData() == item) {
				temp = new DNode(data);
				temp.setNext(n);
				temp.setPrevious(null);
				n.setPrevious(temp);
				head = temp;
				return;
			}

			n = n.getNext();
			boolean flag = false;

			while (n != null) {

				if (n.getData() == item) {
					temp = new DNode(data);

					temp.setNext(n);
					temp.setPrevious(n.getPrevious());
					n.getPrevious().setNext(temp);
					n.setPrevious(temp);
					flag = true;
					break;
				}
				n = n.getNext();
			}
			if (!flag) {
				System.out.println(item + " is not present in the list");
			}
		}
	}

	public void remove(int data) {

		if (head == null) {
			System.out.println("List is Empty");
		} else {
			if (head.getData() == data) {
				if (head.getNext() != null) {
					head.getNext().setPrevious(null);
				}
				head = head.getNext();
				return;
			}

			DNode n = head.getNext();
			boolean flag = false;

			while (n != null) {
				
				if (n.getData() == data) {
					n.getPrevious().setNext(n.getNext());
					if (n.getNext() != null) {
						n.getNext().setPrevious(n.getPrevious());
					}
					n = null;
					flag = true;
					break;
				}
				n = n.getNext();
			}

			if (!flag) {
				System.out.println(data + " is not present in the list");
			}

		}

	}
	
	
	public void search(int data) {
		
		DNode n = head;
		boolean flag = false;
		int count = 1;
		
		while(n != null ) {
			
			if(n.getData() == data ) {
				System.out.println(data + " is found at location "+count);
				flag = true;
				break;
			}
			count++;
			n = n.getNext();
		}
		if(!flag) {
			System.out.println(data + " is not present in the list");
		}
		
	}
	

}

class DNode {

	private DNode previous;
	private int data;
	private DNode next;

	DNode(int data) {
		this.data = data;
	}

	public DNode getPrevious() {
		return previous;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setPrevious(DNode previous) {
		this.previous = previous;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

}
