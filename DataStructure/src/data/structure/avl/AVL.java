package data.structure.avl;

public class AVL {
	
	public AVLNode root; 
	
	AVL(){
		this.root = null;
	}
	
	
	public void insert( int  data) {
		
		this.root = insertIntoAVLTree(this.root,data);
		
	}


	private AVLNode insertIntoAVLTree(AVLNode root, int data) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new AVLNode(data);
		}else if(data < root.data) {
			root.left = insertIntoAVLTree(root.left,data);
		}else {
			root.right = insertIntoAVLTree(root.right,data); 
		}
		
		root.height = 1 + Math.max(this.getHeight(root.left), this.getHeight(root.right));
		
		int balanceFactor = getBalance(root);
		
		if(balanceFactor < -1 ) {
			if(data > root.right.data) {
				return this.leftRotation(root);
			}else {
				root.right = this.rightRotation(root.right);
				return this.leftRotation(root);
			}
		}
		
		if(balanceFactor > 1 ) {
			if(data < root.left.data) {
				return this.rightRotation(root);
			}else {
				root.left  = this.leftRotation(root.left);
				return this.rightRotation(root);
			}
		}
		
		return root;

	}
	
	
	public void delete(int data) {
		if(this.root == null) {
			System.out.println("Tree is empty");
		}
		
		this.root = deleteNodeFromAVL(this.root,data);
		
	}


	private AVLNode deleteNodeFromAVL(AVLNode root, int data) {
		// TODO Auto-generated method stub
		if(root == null) {
			System.out.println(data  + " is not present in AVL Tree");
			return root;
		}
		
		if(data<root.data) {
			root.left = deleteNodeFromAVL(root.left, data);
		}else if(data > root.data) {
			root.right = deleteNodeFromAVL(root.right, data);
		}else {
			AVLNode temp;
			if(root.left == null ) {
				temp = root.right;
				root = null;
				return temp;
			}else if(root.right == null) {
				temp = root.left;
				root = null;
				return temp;
			}else {
				temp = getInoderSuccessor(root.right);
				root.data = temp.data;
				root.right = deleteNodeFromAVL(root.right, temp.data);
			}
		}
		
		
		
		root.height = 1 + Math.max(this.getHeight(root.left), this.getHeight(root.right));
		int balanceFactor = getBalance(root);
		
		if(balanceFactor < -1) {
			if(getBalance(root.right) <= 0 ) {
				return this.leftRotation(root);
			}else {
				root.right = this.rightRotation(root.right);
				return this.leftRotation(root);
			}
		}
		
		if(balanceFactor > 1) {
			if(getBalance(root.left) >= 0 ) {
				return this.rightRotation(root);
			}else {
				root.left = this.leftRotation(root.left);
				return this.rightRotation(root);
			}
		}
		
		return root;
	}


	private AVLNode getInoderSuccessor(AVLNode root) {
		// TODO Auto-generated method stub
		while(root.left != null) {
			root = root.left;
		}
		
		return root;
		
	}


	private AVLNode rightRotation(AVLNode root) {
		// TODO Auto-generated method stub
		AVLNode l = root.left;
		AVLNode temp = l.right;
		
		l.right = root;
		root.left = temp;
		
		root.height = 1 + Math.max(this.getHeight(root.left),this.getHeight(root.right));
		l.height = 1 + Math.max(this.getHeight(l.left),this.getHeight(l.right));
		
		return l;
	}


	private AVLNode leftRotation(AVLNode root) {
		// TODO Auto-generated method stub
		AVLNode r = root.right;
		AVLNode temp = r.left;
		
		r.left = root;
		root.right = temp;
		
		root.height = 1 + Math.max(this.getHeight(root.left),this.getHeight(root.right));
		r.height = 1 + Math.max(this.getHeight(r.left),this.getHeight(r.right));
		
		return r;
		
	}


	private int getBalance(AVLNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}else {
			return this.getHeight(root.left) - this.getHeight(root.right);
		}
	}


	private int getHeight(AVLNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}else {
			return root.height;
		}
		
	}
	
	public void inOrderTravesal(AVLNode root) {
		if(root == null) {
			return ;
		}
		
		inOrderTravesal(root.left);
		System.out.print(root.data+" ");
		inOrderTravesal(root.right);
	}
	
	
}


class AVLNode {
	
	public AVLNode left;
	public AVLNode right ;
	public int data ;
	public int height;
	
	AVLNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.height = 1;
	}
	
}
