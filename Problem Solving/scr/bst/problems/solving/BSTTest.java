package bst.problems.solving;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class BSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST b = new BST();
	
		b.insert(16);
		b.insert(8);
		b.insert(24);
		b.insert(6);
		b.insert(12);
		b.insert(18);
		b.insert(28);
		b.insert(4);
		b.insert(7);
		b.insert(14);
		b.insert(26);
		b.insert(30);
		
		
		BST a = new BST();
		
		a.insert(16);
		a.insert(8);
		a.insert(24);
		a.insert(6);
		a.insert(12);
		a.insert(18);
		a.insert(28);
		a.insert(4);
		a.insert(6);
		a.insert(14);
		a.insert(26);
		
		
		BST c = new BST();
		c.insert(20);
		c.getRoot().setLeft(new Node(12));
		c.getRoot().setRight(new Node(8));
		
		c.getRoot().getLeft().setLeft(new Node(6));
		c.getRoot().getLeft().setRight(new Node(6));
		
		c.getRoot().getRight().setLeft(new Node(3));
		c.getRoot().getRight().setRight(new Node(5));
		
		c.getRoot().getRight().getRight().setLeft(new Node(5));
		
		
//		System.out.println(BST.checkIndenticalTrees(a.getRoot(), b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//	
//		System.out.println(b.numberOfNodes(b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.print("InOrder : ");
//		b.inorder(b.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//
//		System.out.print("PreOrder : ");
//		b.preorder(b.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.print("PostOrder : ");
//		b.postorder(b.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//
		
//		System.out.print("Level Order : ");
//		b.levelOrder(b.getRoot());
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.print("Spiral Order : ");
//		b.spiralOrder(b.getRoot());
//		System.out.println("----------------------------------------------------------------------------");
		
//		b.mirror(b.getRoot());
//		System.out.print("Level Order After Mirror : ");
//		b.levelOrder(b.getRoot());		
		
//		System.out.print("Ancestors of 26 : " );
//		b.findAncestor(b.getRoot(), 26);
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.println("Least Common Ancestor of 26 and 30  : "+ b.lca(b.getRoot(), 4, 14).getData());
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.println(c.childSum(c.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.println("Number of leaf nodes in tree b : "+b.countLeaves(b.getRoot()));
//		System.out.println("Number of leaf nodes in tree c : " + c.countLeaves(c.getRoot()) );
//		System.out.println("----------------------------------------------------------------------------");
		
		
//		System.out.println("Create BST from inorder and postorder");
//		
//		int[] in =     {4,6,7,8,12,14,16,18,24,26,28,30};
//		int[] post = {4,7,6,14,12,8,18,26,30,28,24,16};
//		
//		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		
//		for (int i = 0; i < post.length; i++) {
//			map.put(in[i], i);
//		}
//		
//		
//		BST d  = new BST();
//		d.setRoot(BST.buildBinaryTree(in, post, map, 0, in.length-1, 0, post.length-1));
//		
//		System.out.print("Inorder of d : ");
//		d.inorder(d.getRoot());
//		System.out.println();
//		
//		System.out.print("Postorder of d : ");
//		d.postorder(d.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.print("Level Order of b : ");
//		b.levelOrder(b.getRoot());
//		System.out.println("----------------------------------------------------------------------------");
		

//		System.out.println("Create BST from inorder and preorder");
//		
//		int[] in =    {4, 6, 7, 8, 12, 14, 16, 18, 24, 26, 28, 30};
//		int[] pre = {16, 8, 6, 4, 7, 12, 14, 24, 18, 28, 26, 30};
//		
//		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		
//		for (int i = 0; i < in.length; i++) {
//			map.put(in[i], i);
//		}
//		
//		
//		BST e  = new BST();
//		e.setRoot(BST.buildBinaryTreeFromPreAndInOrder(in, pre, map, 0, in.length-1, 0, pre.length-1));
//		
//		System.out.print("Inorder of e : ");
//		e.inorder(e.getRoot());
//		System.out.println();
//		
//		System.out.print("Postorder of e : ");
//		e.preorder(e.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//		
		
		
		
		
//		System.out.print("Level Order of b : ");
//		b.levelOrder(b.getRoot());
//		System.out.println("----------------------------------------------------------------------------");
		
//		b.sumTree(b.getRoot());
//		System.out.print("After covert b into Sum Tree : ");
//		b.levelOrder(b.getRoot());
//		System.out.println("----------------------------------------------------------------------------");
		
//		System.out.print("Max Sum from Root to Leaf node of  tree b  : ");
//		System.out.println(b.maxSum(b.getRoot()));
//		
//		System.out.print("Max Sum from Root to Leaf node of  c: ");
//		System.out.println(c.maxSum(c.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.print("Max Sum from Root to Leaf node of  tree b  : ");
//		System.out.println(b.getMaxSum(b.getRoot(),0));
//		System.out.print("Path of Max Sum from  Leaf to Root node of  tree b  : ");
//		b.getMaxSumPath(b.getRoot());
//		System.out.println();
//		
//		System.out.print("Max Sum from Root to Leaf node of  c: ");
//		System.out.println(c.getMaxSum(c.getRoot(),0));
//		System.out.print("Path of Max Sum from  Leaf to Root node of  tree c  : ");
//		c.getMaxSumPath(c.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.println("Covert Tree b into DLL : ");
//		b.binaryToDLL(b.getRoot());
//		b.traverseDLL(b.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
		
		
		
//		System.out.println("Merge Two Binary Tree");
//		BST x = new BST();
//		BST y = new BST();
//		BST z = new BST();
//		
//		x.setRoot(new Node(1));
//		x.getRoot().setLeft(new Node(3));
//		x.getRoot().setRight(new Node(2));
//		x.getRoot().getLeft().setLeft(new Node(5));
//		x.getRoot().getLeft().getLeft().setLeft(new Node(6));
//		
//		
//		y.setRoot(new Node(2));
//		y.getRoot().setLeft(new Node(1));
//		y.getRoot().setRight(new Node(3));
//		y.getRoot().getLeft().setRight(new Node(4));
//		y.getRoot().getRight().setRight(new Node(7));
//		y.getRoot().getLeft().getRight().setLeft(new Node(8));
//
//		
//		z.setRoot(BST.mergeTrees(x.getRoot(), y.getRoot()));
//		z.levelOrder(z.getRoot());
//		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
//		System.out.print("Range sum of BST b :  ");
//		System.out.println(BST.rangeSum(b.getRoot(), 4, 30));
//		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
//		System.out.println("Search for a node in tree b : ");
//		b.levelOrder(b.search(b.getRoot(), 8));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.print("Height of Tree y : ");
//		System.out.println(BST.getHeight(y.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//
//
//		System.out.print("Diameter of Tree b: ");
//		System.out.println(BST.getDiameter(b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.print("Max Depth of Tree b : " );
//		System.out.println( BST.getMaxDepth(b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.print("Sum of All leaf Nodes of Tree b : ");
//		System.out.println(BST.getSumOfLeafNodes(b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		System.out.print("Sum of All Left Leaf Nodes of Tree b : ");
//		System.out.println(BST.getSumOfLeftLeafNodes(b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
//		
//		System.out.print("Sum of All Left Right Nodes of Tree b : ");
//		System.out.println(BST.getSumOfRightLeafNodes(b.getRoot()));
//		System.out.println("----------------------------------------------------------------------------");
		
		
//		BST r1 = new BST();
//		r1.insert(2);
//		r1.insert(1);
//		r1.insert(33);
//		r1.insert(25);
//		r1.insert(40);
//		
//		BST r2 = new BST();
//		r2.insert(1);
//		r2.insert(0);
//		r2.insert(2);
//		r2.insert(3);
//		
//		System.out.print("All Elements of Tree r1 and r2 in Ascending Order : ");
//		ArrayList<Integer> result = BST.getAllElements(r1.getRoot(), r2.getRoot());
//		for(int i : result ) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//		
		
		
		
//		System.out.println("Construct a Maximum Binary Tree");
//		int[] ar = {3,2 ,1,6,0,5};
//		Node root = BST.constructMaximumBInaryTree(ar, 0, ar.length-1);
//		BST r = new BST();
//		r.setRoot(root);
//		r.levelOrder(r.getRoot());
//		System.out.println();
//		System.out.println("----------------------------------------------------------------------------");
//		
		
		
//		System.out.println("Prune a Binary Tree which contains 0's and 1's ' : ");
//		
//		BST t1 = new BST();
//		t1.setRoot(new Node(1));
//		t1.getRoot().setLeft(new Node(0));
//		t1.getRoot().setRight(new Node(0));
//		
//		t1.getRoot().getLeft().setLeft(new Node(0));
//		t1.getRoot().getLeft().setRight(new Node(1));
//		
//		t1.getRoot().getRight().setLeft(new Node(0));
//		t1.getRoot().getRight().setRight(new Node(1));
//		
//		System.out.print("Level order traversing before prune tree t1 : ");
//		t1.levelOrder(t1.getRoot());
//		BST.pruneTree(t1.getRoot());
//		System.out.print("Level order traversing after prune tree t1 : ");
//		t1.levelOrder(t1.getRoot());
//		
//		System.out.println("----------------------------------------------------------------------------");
//		
//		
//		// Validate aBinary Tree is BST or Not
//		t1.setRoot(new Node(5));
//		t1.getRoot().setLeft(new Node(1));
//		t1.getRoot().setRight(new Node(6));
//		
//		t1.getRoot().getRight().setLeft(new Node(4));
//		t1.getRoot().getRight().setRight(new Node(7));
//		
//		System.out.println("Is Tree b is BST : "+BST.isValidBST(b.getRoot()));
//		System.out.println("Is Tree t1 is BST : "+BST.isValidBST(t1.getRoot()));
		
		
//		BST.topView(b.getRoot());
		
		
		
//		System.out.println("---------------------------Binary to DLL--------------------------------------");
//		
//		Node head = b.binaryToDLL(b.getRoot());
//		while(head != null) {
//			System.out.print(head.data+" ");
//			head = head.right;
//		}
		
		
//		System.out.println("---------------------------Vertical Order Traversal--------------------------------------");
		
//		Map<Integer,List<Integer>> map = new TreeMap<>();
//		BST.verticalOrder(b.getRoot(), 0, map);
//		
//		for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
//			List<Integer> list = entry.getValue();
//			for(int i=0;i<list.size();i++) {
//				System.out.print(list.get(i)+", ");
//			}
//			System.out.println();
//		}

		
		System.out.println("-----------------------------------Right View binary tree-------------------------------");
		BST.rightView(b.getRoot());
		
		
//		System.out.println("-----------------------------------Threaded binary tree-------------------------------");
//		//Inorder Tree Traversal without recursion and without stack (Threaded binary tree)
//		
//		RightThreadedBST rb = new RightThreadedBST();
//		
//		rb.insert(16);
//		rb.insert(8);
//		rb.insert(24);
//		rb.insert(6);
//		rb.insert(12);
//		rb.insert(18);
//		rb.insert(28);
//		rb.insert(4);
//		rb.insert(7);
//		rb.insert(14);
//		rb.insert(26);
//		rb.insert(30);
//		
//		System.out.println(rb.root.data);
//		RightThreadedBST.inorder(rb.root);
		
		
	}

}
