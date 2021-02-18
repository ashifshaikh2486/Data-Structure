package stack.problem.solving;

public class StackWithGetMidAndDeleteMidInConstantTime {

	private DNode head = null;
	private int count = 0;
	private DNode mid = null;

	public void push(char info) {

		DNode temp = new DNode(info);
		temp.setPrev(null);
		temp.setNext(head);

		if (head == null) {
			head = temp;
			mid = temp;
			count++;
		} else {
			head.setPrev(temp);
			head = temp;
			if ((count & 1) == 0) {
				mid = mid.getPrev();
			}
			count++;
		}

	}

	public char pop() {

		char info = '0';
		DNode temp = null;
		if (head == null) {
			System.out.println("Stack is Empty");
			return info;
		} else {
			temp = head;
			head = head.getNext();
			if ((count & 1) == 1) {
				mid = mid.getNext();
			}
			count--;
			info = temp.getInfo();
		}

		temp = null;

		return info;
	}

	public void delMin() {

		if (head == null) {
			System.out.println("Stack is Empty");
			return;
		} else {
			if (mid == head) {
				head = mid.getNext();
				mid = mid.getNext();
			} else {

				if (mid.getPrev() != null) {
					mid.getPrev().setNext(mid.getNext());
				}
				if (mid.getNext() != null) {
					mid.getNext().setPrev(mid.getPrev());
				}

				if ((count & 1) == 0) {
					mid = mid.getPrev();
				} else {
					mid = mid.getNext();
				}
				count--;	
			}
		}

	}

	public void display() {

		DNode temp = head;

		while (temp != null) {
			System.out.print(temp.getInfo() + "->");
			temp = temp.getNext();
		}
		System.out.println();

	}

	public DNode getHead() {
		return head;
	}

	public void setHead(DNode head) {
		this.head = head;
	}

	public DNode getMid() {
		return mid;
	}

	public void setMid(DNode mid) {
		this.mid = mid;
	}

}

class DNode {

	private DNode prev;
	private char info;
	private DNode next;

	DNode(char info) {
		this.info = info;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	public char getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

}
