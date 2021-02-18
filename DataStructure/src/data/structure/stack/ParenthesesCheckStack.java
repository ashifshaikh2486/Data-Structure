package data.structure.stack;

public class ParenthesesCheckStack {
	
	private PNode top = null;
	
	public void push(char ch) {
		PNode temp = new PNode(ch);
		temp.setNext(top);
		top = temp;
	}
	
	public char pop() {
		char ch = '0';
		if(top == null) {
			System.out.println("Stack UnderFlow");
		}else {
			PNode temp = top;
			ch = temp.getCh();
			top = temp.getNext();
			temp = null;
		}
		return ch;
	}
	
	public char peek() {
		char ch = '0';
		if(top!=null) {
		  ch = top.getCh();	
		}
		return ch;
	}
	
	public void display() {
		if(top == null) {
			System.out.println("Stack is Empty");
		}else {
			PNode n = top;
			while(n != null) {
				System.out.println(n.getCh());
				n = n.getNext();
			}
		}
	}

}

class PNode{
	
	private char ch;
	private PNode next;
	
	PNode(char ch){
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public PNode getNext() {
		return next;
	}

	public void setNext(PNode next) {
		this.next = next;
	}
	
}