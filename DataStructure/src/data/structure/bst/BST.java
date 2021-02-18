package data.structure.bst;

public class BST {

	private Node root = null;

	public void insert(int data) {

		Node temp = new Node(data);
		temp.setLeft(null);
		temp.setRight(null);
		
		if (root == null) {
			root = temp;
			return;
		} else {
			
			Node q = null;
			Node p = root;
			boolean flag = true;
			
			while (p != null) {	
				q = p;
				if (data < p.getData()) {
					p = p.getLeft();
					flag = false;
				} else {
					p = p.getRight();
					flag = true;
				}
			}
			if (flag) {
				q.setRight(temp);
			} else {
				q.setLeft(temp);
			}

		}

	}

	public Node getRoot() {
		return root;
	}

	public Node search(int data) {

		Node p = root;

		while (p != null) {

			if (p.getData() == data) {
				return p;
			} else if (data < p.getData()) {
				p = p.getLeft();
			} else {
				p = p.getRight();
			}

		}
		return p;
	}

	public Node delete(Node p, int key) {

		if (p == null) {
			System.out.println(key + " is not present");
			return p;
		}

		if (key < p.getData()) {
			p.setLeft(delete(p.getLeft(), key));

		} else if (key > p.getData()) {
			p.setRight(delete(p.getRight(), key));

		} else if (p.getLeft() != null && p.getRight() != null) {

			Node inorderSucc = p.getRight();
			while (inorderSucc.getLeft() != null) {
				inorderSucc = inorderSucc.getLeft();
			}

			p.setData(inorderSucc.getData());

			p.setRight(delete(p.getRight(), inorderSucc.getData()));

		} else {
			Node temp = p;
			if (p.getLeft() != null) {
				p = p.getLeft();
			} else if (p.getRight() != null) {
				p = p.getRight();
			} else {
				p = null;
			}
			temp = null;

		}

		return p;

	}

	public int min() {
		Node p = root;
		Node q = p;
		while (p != null) {
			q = p;
			p = p.getLeft();
		}
		return q.getData();
	}

	public int max() {
		Node p = root;
		Node q = p;
		while (p != null) {
			q = p;
			p = p.getRight();
		}
		return q.getData();
	}

	int count = 0;
	
	public int preorder(Node p) {	
		
		if (p == null) {
			return count;
		}
		count += 1;
		System.out.print(p.getData() + " ");
		preorder(p.getLeft());
		preorder(p.getRight());
		return count;
	}

	public void inorder(Node p) {

		if (p == null) {
			return;
		}

		inorder(p.getLeft());
		System.out.print(p.getData() + " ");
		inorder(p.getRight());

	}

	public void postorder(Node p) {

 		if (p == null) {
			return;
		}

		postorder(p.getLeft());
		postorder(p.getRight());
		System.out.print(p.getData() + " ");
	}
	
	public int height(Node ptr) {
		
		int h_left, h_right; 
		 
		if (ptr == null) { /*Base Case*/
			return -1; 
		}else {
		h_left =  height(ptr.getLeft()); 
		h_right = height(ptr.getRight()); 
	 
		if (h_left > h_right) 
			return 1 + h_left; 
		else 
			return 1 + h_right; 

	}
 }

}

class Node {

	private Node left;
	private int data;
	private Node right;

	Node(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}
	

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
