package data.structure.tree;

public class PostfixToExpresionTreeStack {
	
	int top = -1;
	
	Node ar[] = new Node[20];
	
	public void push(Node n) {
		
		if(top+1  == ar.length) {
			System.out.println("Stack Overflow");
		}else {
			top +=1;
			ar[top] = n;
		}
		
	}
	
	public Node pop() {
		
		Node n = null;
		if(top == -1) {
			System.out.println("Stack UnderFlow");
		}else {
			n = ar[top];
			top -= 1;
		}
		return n;
	}
	
	

}

class Node{
	
	Node left;
	char info;
	Node right;
	
	public Node getLeft() {
		return left;
	}

	public char getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	
	Node(char info){
		this.info = info;
	}
	
}
