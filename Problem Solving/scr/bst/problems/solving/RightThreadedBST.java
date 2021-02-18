package bst.problems.solving;

public class RightThreadedBST {
	
	RNode root ;
	public RightThreadedBST() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	
	public void insert(int data) {
		RNode newNode = new RNode(data);
		boolean flag = false;
		if(root == null) {
			root = newNode;
			return;
		}
		RNode current = root;
		RNode parent = null;
		while(current != null ) {
			parent = current ;
			if(data <= parent.data) {
				current = current.left;
				flag = true;
			}else {
				if(current.rThread) {
					current = null;
				}else {
					current = current.right;
				}
				
				flag = false;
			}
			
			
		}
		
		
		if(flag) {
			parent.left = newNode;
			newNode.right = parent;
			newNode.rThread = true;
		}else {
			parent.rThread = false;
			newNode.right = parent.right;
			newNode.rThread = true;
			parent.right = newNode;
		}
		
	}
	
	
	public static void inorder(RNode root) {
		if(root == null) {
			return ;
		}
		
		RNode p = getLeftMostNode(root);
		
		while(p != null) {
			System.out.print(p.data+" ");
			if(p.rThread) {
				p = p.right;
			}else {
				p = getLeftMostNode(p.right);
			}
		}
		System.out.println();
		
		
	}

	private static RNode getLeftMostNode(RNode p) {
		// TODO Auto-generated method stub
		if(p == null) {
			return null;
		}
		while(p.left != null) {
			p = p.left;
		}
		return p;
	}

}


class RNode{
	int data;
	RNode left ;
	RNode right;
	boolean rThread ;
	
	public RNode(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.rThread = false;
		this.left = null;
		this.right = null;
	}
	
}
