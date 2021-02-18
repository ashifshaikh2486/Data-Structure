package bst.problems.solving;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class BST {

	private Node root = null;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void insert(int data) {

		Node temp = new Node(data);
		temp.setLeft(null);
		temp.setRight(null);

		if (root == null) {
			root = temp;
			return;
		} else {

			Node current = root;
			Node parent = null;
			boolean flag = false;

			while (current != null) {
				parent = current;
				if (data < current.getData()) {
					current = current.getLeft();
					flag = true;
				} else {
					current = current.getRight();
					flag = false;
				}
			}

			if (flag) {
				parent.setLeft(temp);
			} else {
				parent.setRight(temp);
			}

		}

	}
	

	
	// Search a Node in BST Using Recursion
//	public Node search(Node p,int data) {
//		
//		if(p == null) {
//			return null;
//		}
//		if(p.getData() == data) {
//			return p;
//		}
//		if(data < p.getData()) {
//		return search(p.getLeft(), data);
//		}else {
//			return search(p.getRight(),data);
//		}
//	}
	
	
	// Search a Node in BST Without Recursion
	
	public Node search(Node p, int data) {
		
		while(p != null) {
			
			if(p.getData() == data) {
				break;
			}else if(data < p.getData()) {
				p = p.getLeft();
			}else {
				p = p.getRight();
			}
		}
		return p;
		
	}
	
	
	
	
	
	public Node delete(Node p, int key) {

		if (p == null) {
			System.out.println(key + " is not present");
			return p;
		} else {

			if (key < p.getData()) {
				p.setLeft(delete(p.getLeft(), key));
			} else if (key > p.getData()) {
				p.setRight(delete(p.getRight(), key));
			} else {

				if (p.getLeft() != null && p.getRight() != null) {
					Node inorderSuccessor = p.getRight();
					while (inorderSuccessor.getLeft() != null) {
						inorderSuccessor = inorderSuccessor.getLeft();
					}

					p.setData(inorderSuccessor.getData());
					p.setRight(delete(p.getRight(), inorderSuccessor.getData()));

				} else {
					Node temp = p;
					if (p.getLeft() != null) {
						p = p.getLeft();
					} else if (p.getRight() != null) {
						p = p.getRight();
					} else {
						p = null;
						temp = null;
					}
				}

			}

		}
		return p;
	}
	
	
	
	

	public void preorder(Node p) {

		if (p == null) {
			return;
		}

		System.out.print(p.getData() + " ");
		preorder(p.getLeft());
		preorder(p.getRight());

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

	
	// Vertical Order Travesal
	
	public static void verticalOrder(Node root,int dist, Map<Integer,List<Integer>> map) {
		if(root == null) {
			return ;
		}
		
		if(map.containsKey(dist)) {
			List<Integer> list = map.get(dist);
			list.add(root.data);
			map.put(dist, list);
		}else {
			List<Integer> list = new ArrayList<>();
			list.add(root.data);
			map.put(dist, list);
		}
		
		verticalOrder(root.left, dist-1, map);
		verticalOrder(root.right, dist+1, map);
	}
	
	
	// Count Number of Nodes Recursively

//	public int numberOfNodes(Node p) {
//		
//		if(p == null) {
//			return 0;
//		}else {
//			return 1 + numberOfNodes(p.getLeft()) +  numberOfNodes(p.getRight());
//		}
//		
//	}

	
	
	// Using Queue

	public int numberOfNodes(Node p) {
		int count = 0;

		Queue<Node> queue = new ArrayDeque<Node>();

		if (p != null) {
			queue.add(p);
		}

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}

			if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
			count++;
		}

		return count;
	}


	
	// Check if two trees are identical or not Using recursion

	public static boolean checkIndenticalTrees(Node p, Node q) {

		if (p == null && q == null) {
			return true;
		}else if((p==null && q != null) || (p!=null && q==null) || (p.data != q.data)) {
			return false;
		}
			return checkIndenticalTrees(p.getLeft(), q.getLeft())
					&& checkIndenticalTrees(p.getRight(), q.getRight());
	
	}
	
	

//	Level Order Tree Traversal Using Queue

	public void levelOrder(Node p) {

		Queue<Node> queue = new ArrayDeque<Node>();

		if (p != null) {
			queue.add(p);
		}

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.getData() + " ");
			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}

			if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
		}

		System.out.println();
	}

	// Using two stack

//	public void spiralOrder(Node p) {
//
//		Stack<Node> s1 = new Stack<>();
//		Stack<Node> s2 = new Stack<>();
//
//		s1.push(p);
//
//		while (!s1.isEmpty() || !s2.isEmpty()) {
//			Node temp;
//			if (!s1.isEmpty()) {
//				while (!s1.isEmpty()) {
//					temp = s1.pop();
//					if (temp.getRight() != null) {
//						s2.push(temp.getRight());
//					}
//					if (temp.getLeft() != null) {
//						s2.push(temp.getLeft());
//					}
//					System.out.print(temp.getData() + " ");
//				}
//			}
//			if (!s2.isEmpty()) {
//				while(! s2.isEmpty()) {
//					temp = s2.pop();
//					if(temp.getLeft() != null) {
//						s1.push(temp.getLeft());
//					}
//					
//					if(temp.getRight() != null) {
//						s1.push(temp.getRight());
//					}
//					System.out.print(temp.getData() + " ");
//				}
//			}
//		}
//		System.out.println();
//	}

//	Using one stack and one queue

	public void spiralOrder(Node p) {

		Stack<Node> s = new Stack<>();
		Queue<Node> q = new ArrayDeque<>();

		s.push(p);

		while (!s.isEmpty() || !q.isEmpty()) {
			Node temp;
			if (!s.isEmpty()) {
				while (!s.isEmpty()) {
					temp = s.pop();
					if (temp.getLeft() != null) {
						q.add(temp.getLeft());
					}
					if (temp.getRight() != null) {
						q.add(temp.getRight());
					}
					System.out.print(temp.getData() + " ");
				}
			} else if (!q.isEmpty()) {
				while (!q.isEmpty()) {
					temp = q.remove();
					if (temp.getLeft() != null) {
						s.push(temp.getLeft());
					}

					if (temp.getRight() != null) {
						s.push(temp.getRight());
					}
					System.out.print(temp.getData() + " ");
				}
			}
		}
		System.out.println();
	}

	// Mirror Using recursion (Bottom -> Up Aprroach)

//	public void mirror(Node p) {
//		
//		if(p == null) {
//			return;
//		}else {
//			mirror(p.getLeft());
//			mirror(p.getRight());
//			
//			swapChild(p);
//		}
//		
//	}

	// Mirror of Binary Tree Using Queue (Top -> Down Approach)

	public void mirror(Node p) {

		Queue<Node> queue = new ArrayDeque<Node>();
		if (p == null) {
			return;
		}

		queue.add(p);
		Node temp = null;
		while (!queue.isEmpty()) {
			temp = queue.remove();
			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
			swapChild(temp);
		}

	}

	private void swapChild(Node p) {
		// TODO Auto-generated method stub
		Node temp = p.getLeft();
		p.setLeft(p.getRight());
		p.setRight(temp);

	}

	// Find Ancestor of a Node in Binary Tree

	public void findAncestor(Node p, int key) {

		if (p == null) {
			return;
		} else {

			if (p.getData() == key) {
				Node temp = p.getPredecessor();
				while (temp != null) {
					System.out.print(temp.getData() + " ");
					temp = temp.getPredecessor();
				}
				System.out.println();
			}

			if (p.getLeft() != null) {
				p.getLeft().setPredecessor(p);
			}
			findAncestor(p.getLeft(), key);
			if (p.getRight() != null) {
				p.getRight().setPredecessor(p);
			}
			findAncestor(p.getRight(), key);
		}

	}

	// Find Least Common Ancestors for BST Using Recursion

//	public Node lca(Node p, int x, int y){
//		if(p == null) {
//			return null;
//		}else {
//			if(x < p.getData() && y < p.getData()) {
//			 return	lca(p.getLeft(),x,y);
//			}else if(x > p.getData() && y > p.getData()) {
//				return lca(p.getRight(),x,y);
//			}else {
//				return p;
//			}
//		}
//		
//	}

// Find Least Common Ancestors for BST Using Iteration

//	public Node lca(Node p,int x,int y) {
//		
//		if(p==null) {
//			return null;
//		}else {
//			while(p != null) {
//				
//				if(x < p.getData() && y < p.getData()) {
//					p = p.getLeft();
//				}else if(x > p.getData() && y > p.getData()) {
//					p = p.getRight();
//				}else {
//					break;
//				}
//			}
//			return p;
//		}
//		
//	}

// Find Least Common Ancestors for Binary Tree Using DFS (Still a bug)

	public Node lca(Node p, int x, int y) {

		if (p == null) {
			return null;
		}
		if (p.getData() == x || p.getData() == y) {
			return p;
		}

		Node leftSerach = lca(p.getLeft(), x, y);
		Node rightSearch = lca(p.getRight(), x, y);

		if (leftSerach == null) {
			return rightSearch;
		} else if (rightSearch == null) {
			return leftSerach;
		} else if ((leftSerach.getData() == x && rightSearch.getData() == y)
				|| (leftSerach.getData() == y && rightSearch.getData() == x)) {
			return p;
		} else {
			return null;
		}

	}

	// ChildSum check for Binary Tree using DFS

//	public boolean childSum(Node p) {
//		if(p == null) {
//			return true;
//		}
//		if(p.getLeft() == null && p.getRight() == null) {
//			return true;
//		}
//		
//		int l = 0;
//		int r = 0;
//		
//		if(p.getLeft() != null) {
//			l = p.getLeft().getData();
//		}
//		if(p.getRight() != null) {
//			r = p.getRight().getData();
//		}
//		
//		return ((p.getData() == l+r) && childSum(p.getLeft()) && childSum(p.getRight()));
//		
//	}

	// ChildSum check for Binary Tree using BFS

	public boolean childSum(Node p) {
		boolean flag = true;
		if (p == null) {
			return flag;
		} else {
			Queue<Node> queue = new ArrayDeque<Node>();

			queue.add(p);
			int l, r;
			while (!queue.isEmpty()) {
				l = 0;
				r = 0;
				Node temp = queue.remove();

				if (temp.getLeft() == null && temp.getRight() == null) {
					continue;
				}
				if (temp.getLeft() != null) {
					l = temp.getLeft().getData();
					queue.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					r = temp.getRight().getData();
					queue.add(temp.getRight());
				}

				if (!(temp.getData() == r + l)) {
					flag = false;
					break;
				}
			}
			return flag;
		}
	}

	// Count the number of leaf nodes in Binary Tree

	public int countLeaves(Node p) {

		if (p == null) {
			return 0;
		} else if (p.getLeft() == null && p.getRight() == null) {
			return 1;
		} else {
			return countLeaves(p.getLeft()) + countLeaves(p.getRight());
		}

	}

	// Build Binary tree from In Order and Post Order O(n^2) Time and O(n) Space

//	public static Node buildBinaryTree(int[] in, int[] post, int inStart, int inEnd, int postStart, int postEnd) {
//		
//		if(inStart > inEnd) {
//			return null;
//		}else if( inStart == inEnd) {
//			return new Node(in[inStart]);
//		}else {
//			Node temp = new Node(post[postEnd]) ;
//			int i = search(in, post[postEnd]);
//			temp.setLeft(buildBinaryTree(in, post, inStart, i-1, postStart, postStart+i-1-inStart));
//			temp.setRight(buildBinaryTree(in, post, i+1, inEnd, postStart+i-inStart, postEnd-1));
//			return temp;
//		}
//		
//	}
//
//private static int search(int[] in, int num) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < in.length; i++) {
//			if(in[i]==num) {
//				return i;
//			}
//		}
//		return -1;
//	}

	// Build Binary tree from In Order and Post Order O(n) Time and O(n) Space

	public static Node buildBinaryTree(int[] in, int[] post, Map<Integer, Integer> map, int inStart, int inEnd,
			int postStart, int postEnd) {
		if (inStart > inEnd) {
			return null;
		} else if (inStart == inEnd) {
			return new Node(in[inStart]);
		} else {
			Node temp = new Node(post[postEnd]);
			int i = map.get(post[postEnd]);
			temp.setLeft(buildBinaryTree(in, post, map, inStart, i - 1, postStart, postStart + i - 1 - inStart));
			temp.setRight(buildBinaryTree(in, post, map, i + 1, inEnd, postStart + i - inStart, postEnd - 1));
			return temp;
		}
	}
	
	
	
	// Build Binary tree from In Order and Post Order O(n^2) Time and O(n) Space
	
	public static Node buildBinaryTreeFromPreAndInOrder(int[] in,int[] pre, int inStart, int inEnd, int preStart, int preEnd) {
		if(inStart > inEnd ) {
			return null;
		}else if(inStart == inEnd) {
			return new Node(in[inStart]);
		}else {
		
		Node temp = new Node(pre[preStart]);
		int i = search(in,temp.data); 
		temp.left = buildBinaryTreeFromPreAndInOrder(in, pre, inStart, i-1, preStart+1, preStart+i-inStart);
		temp.right = buildBinaryTreeFromPreAndInOrder(in, pre, i+1, inEnd,preStart+i-inStart+1, preEnd);
		return temp;
		}
	}
	
	
	private static int search(int[] in, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < in.length; i++) {
			if(in[i]==num) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static Node buildBinaryTreeFromPreAndInOrder(int[] in,int[] pre, Map<Integer,Integer> map,int inStart, int inEnd, int preStart, int preEnd) {
		if(inStart > inEnd ) {
			return null;
		}else if(inStart == inEnd) {
			return new Node(in[inStart]);
		}else {
		
		Node temp = new Node(pre[preStart]);
		int i = map.get(temp.data); 
		temp.left = buildBinaryTreeFromPreAndInOrder(in, pre, inStart, i-1, preStart+1, preStart+i-inStart);
		temp.right = buildBinaryTreeFromPreAndInOrder(in, pre, i+1, inEnd,preStart+i-inStart+1, preEnd);
		return temp;
		}
	}
	// Sum Tree

	public int sumTree(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.getLeft() == null && p.getRight() == null) {
			return p.getData();
		}
		int data = p.getData();
		p.setData(sumTree(p.getLeft()) + sumTree(p.getRight()));
		return data + p.getData();
	}

	public int maxSum(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.getLeft() == null && p.getRight() == null) {
			return p.getData();
		}

		int l = maxSum(p.getLeft());
		int r = maxSum(p.getRight());

		if (l > r) {
			return p.getData() + l;
		} else {
			return p.getData() + r;
		}
	}

	Node maxLeaf = null;
	int bestSum = Integer.MIN_VALUE;

	public int getMaxSum(Node p, int currentSum) {
		if (p == null) {
			return bestSum;
		}
		currentSum += p.getData();
		if (p.getLeft() == null && p.getRight() == null) {
			if (currentSum > bestSum) {
				bestSum = currentSum;
				maxLeaf = p;
				return bestSum;
			}
		}
		getMaxSum(p.getLeft(), currentSum);
		getMaxSum(p.getRight(), currentSum);
		return bestSum;
	}

	public boolean getMaxSumPath(Node p) {

		if (p == null) {
			return false;
		}

		if (p.getData() == maxLeaf.getData() || getMaxSumPath(p.getLeft()) || getMaxSumPath(p.getRight())) {

			System.out.print(p.getData() + " ");
			return true;
		}
		return false;

	}

	// Binary Tree to DLL

//	public void binaryToDLL(Node p) {
//		if (p == null) {
//			return;
//		}
//		Queue<Node> queue = new ArrayDeque<Node>();
//		queue.add(p);
//
//		Node temp = null;
//		Node prev = null;
//
//		while (!queue.isEmpty()) {
//			temp = queue.remove();
//			if (temp.getLeft() != null) {
//				queue.add(temp.getLeft());
//			}
//			if (temp.getRight() != null) {
//				queue.add(temp.getRight());
//			}
//			temp.setLeft(prev);
//			if (!queue.isEmpty()) {
//				temp.setRight(queue.element());
//			} else {
//				temp.setRight(null);
//			}
//			prev = temp;
//
//		}
//
//	}

	
	// Inorder Binary to DLL
	
	public Node binaryToDLL(Node root) {
			if(root == null) {
				return null;
			}
			root = binaryToDLLUtil(root);
			while(root.left != null) {
				root = root.left;
			}
			return root;
			
	}
	
	public Node binaryToDLLUtil(Node root) {
		
		
		if(root.left != null) {
			Node left = binaryToDLLUtil(root.left);
			while(left.right != null) {
				left = left.right;
			}
			left.right = root;
			root.left = left;
			
			}
			if(root.right != null) {
				Node right = binaryToDLLUtil(root.right);
				while(right.left != null) {
					right = right.left;
				}
				
				right.left = root;
				root.right = right;
			}
			
		return root;
		
	}
	
	
	public void traverseDLL(Node p) {
		while (p != null) {
			System.out.print(p.getData() + " ");
			p = p.getRight();
		}
	}
	
	
	
	
	
	// Merge Two Binary Tree // Time O(n) and Space O(h)
	
	public  static Node mergeTrees(Node p, Node q) {
		
		if( p == null && q == null) {
			return null;
		}
		if(p == null) {
			Node temp = new Node(q.getData());
			temp.setLeft(mergeTrees(p, q.getLeft()));
			temp.setRight(mergeTrees(p,q.getRight()));
			return temp;
		}
		if( q == null) {
			Node temp = new Node(p.getData());
			temp.setLeft(mergeTrees(p.getLeft(), q));
			temp.setRight(mergeTrees(p.getRight(),q));
			return temp;
		}
		
		Node temp = new Node(p.getData()+q.getData());
		temp.setLeft(mergeTrees(p.getLeft(),q.getLeft()));
		temp.setRight(mergeTrees(p.getRight(), q.getRight()));
		return temp;
		
	}
	
	
	
	
	
	
	
	// Range Sum in Binary Search Tree
	
	public static int rangeSum(Node p,int x, int y) {
		
		if(p == null) {
			return 0;
		}
		
		if(p.getData() == x) {
			return p.getData() + rangeSum(p.getRight(), x, y);
			
		}
		
		if(p.getData() == y) {
			return  p.getData() + rangeSum(p.getLeft(), x, y);
		}
		
		if(p.getData() < x) {
			 return rangeSum(p.getRight(), x, y);
		}
		
		if(p.getData() > y) {
			return rangeSum(p.getLeft(), x, y);
		}
		
		return p.getData() + rangeSum(p.getLeft(), x, y) + rangeSum(p.getRight(), x, y);
		
		
	}
	
	
	
	
	
	
	
	
	// Height of Binary Tree
	
	public static int getHeight(Node p) {
		
		if(p == null) {
			return -1;
		}
		
		if(p.getLeft() == null && p.getRight() == null) {
			return 0;
		}
		
		int l =  getHeight(p.getLeft());
		int r = getHeight(p.getRight());
		
		return (1 + Math.max(l, r));
	}
	
	
	
	
	// Max Depth of Binary Tree : here Max Depth = Number of nodes along with longest path
	
	public static int getMaxDepth(Node p) {
		if(p == null) {
			return 0;
		}
		int l = 1 + getMaxDepth(p.getLeft());
		int r = 1 + getMaxDepth(p.getRight());
		
		if(l > r) {
			return l;
		}else {
			return r;
		}
		
		
	}
	
	
	// Diameter of Binary Tree
	static int diameter = Integer.MIN_VALUE;
	
	public static int getDiameter(Node p) {
		height(p);
		return diameter;
		
		
	}
	
	
	private static int height(Node p) {
		// TODO Auto-generated method stub
		
		if(p == null) {
			return -1;
			
		}else if(p.getLeft() == null && p.getRight()==null) {
			return 0;
		}
		
		int l = height(p.getLeft());
		int r = height(p.right);
		
		diameter = Math.max(diameter, r+l+2);
		
		return 1+Math.max(l, r);
	}

	
	
	
	// Path Sum
	public static boolean hasPathSum(Node root, int sum) {
        if(root == null){
            return false;
        }
        if(sum-root.data == 0 && root.left == null && root.right==null){
            return true;
        }
        
        return hasPathSum(root.left,sum-root.data) || hasPathSum(root.right,sum-root.data);
        
    }
	
	
	// Leaf-Similar Trees
	
public static boolean leafSimilar(Node root1, Node root2) {
        
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null || root2 == null){
            return false;
        }
        List<Integer> list1 = new ArrayList<>();
        leafNodes(root1,list1);
        List<Integer> list2 = new ArrayList<>();
        leafNodes(root2,list2);
        return list1.equals(list2);
        
        
    }
    
    public static  void leafNodes(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            list.add(root.data);
            return ;
        }
        
        leafNodes(root.left,list);
        leafNodes(root.right,list);
        
        
    }
	
	
	
	// Sum of All Leaf Nodes
	
	public static int getSumOfLeafNodes(Node p) {
		if(p == null) {
			return 0;
		}
		
		if(p.getLeft() == null && p.getRight() == null) {
			return p.getData();
		}
		
		return getSumOfLeafNodes(p.getLeft()) + getSumOfLeafNodes(p.getRight());
	}
	
	public static int getSumOfLeftLeafNodes(Node p) {
		
		if(p == null) {
			return 0;
		}
		
		if(p.getLeft() != null && p.getLeft().getLeft() == null && p.getLeft().getRight() == null) {
			return p.getLeft().getData() + getSumOfLeftLeafNodes(p.getRight());
		}
		
		return getSumOfLeftLeafNodes(p.getLeft()) + getSumOfLeftLeafNodes(p.getRight());
		
	}
	
	
	public static int getSumOfRightLeafNodes(Node p) {
		
		if(p== null) {
			return 0;
		}
		
		if(p.getRight() != null && p.getRight().getLeft() == null && p.getRight().getRight() == null) {
			return p.getRight().getData() + getSumOfRightLeafNodes(p.getLeft());
		}
		
		return getSumOfRightLeafNodes(p.getLeft()) + getSumOfRightLeafNodes(p.getRight());
	}
	
	
	
	
	
	
	// Get ALl Element of Two Binary Trees in Ascending Order
	
	
//	public static ArrayList<Integer> getAllElements(Node p, Node q) {
//		
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		
//		 inorderTravesal(p,list1);
//		 inorderTravesal(q,list2);
//		 
//		 return merge(list1,list2);
//		 
//	}

	

	private static void inorderTravesal(Node p, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
		if(p == null) {
			return;
		}
		inorderTravesal(p.getLeft(), list);
		list.add(p.getData());
		inorderTravesal(p.getRight(), list);
		
	}
	
	private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		ArrayList< Integer> result = new ArrayList<Integer>();
		int i = 0;
		int j =0;
		
		
		while(i < list1.size() && j < list2.size() ) {
			if(list1.get(i) <= list2.get(j)) {
				result.add(list1.get(i));
				i++;
			}else {
				result.add(list2.get(j));
				j++;			
			}
		}
			
			while(i < list1.size()) {
				result.add(list1.get(i));
				i++;
			}
			
			while(j < list2.size()) {
				result.add(list2.get(j));
				j++;
			}
		return result;
	}
	
	// Get ALl Element of Two Binary Trees in Ascending Order
	
	public static ArrayList<Integer> getAllElements(Node p, Node q) {
		Stack<Node> s1 = new Stack<Node>();
		Stack< Node >  s2 = new Stack<Node>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		
		while(p != null || q != null || ! s1.isEmpty() || ! s2.isEmpty()) {
			
			
			while(p != null) {
				s1.push(p);
				p = p.getLeft();
			}
			
			while(q != null) {
				s2.push(q);
				q = q.getLeft();
			}
			
			if( !(s1.isEmpty() && s2.isEmpty())) {
				if(s1.peek().getData() <= s2.peek().getData() ) {
					p = s1.pop();
					result.add(p.getData());
					p = p.getRight();
				}else {
					q = s2.pop();
					result.add(q.getData());
					q = q.getRight();
				}
			}else if( !s1.isEmpty()) {
				p = s1.pop();
				result.add(p.getData());
				p = p.getRight();
			}else if( !s2.isEmpty()) {
				q = s2.pop();
				result.add(q.getData());
				q = q.getRight();
			}
			
		}
		
		return result;
	}
	
	
	
	
	
	// Construct a Maximum Binary Tree
	
	public static Node constructMaximumBInaryTree(int[] ar, int l,int r) {
		if(l>r) {
			return null;
		}else {
			int index = l;
			for(int i = l+1; i<= r;i++) {
				if(ar[i] > ar[index]) {
					index = i;
				}
			}
			Node temp = new Node(ar[index]);
			temp.setLeft(constructMaximumBInaryTree(ar, l, index-1));
			temp.setRight(constructMaximumBInaryTree(ar, index+1, r));;
			return temp;
			
		}
	}
	
	
	
	
	
	
	
	//Prune a Binary Tree which contains only 0's and 1's
	
	public static Node pruneTree(Node p) {
		
		if(p == null) {
			return null;
		}
		
		p.setLeft( pruneTree(p.getLeft()));
		p.setRight(pruneTree(p.getRight()));
		
		if(p.getData() == 0 && p.getLeft() == null && p.getRight() == null) {
			return null;
		}
		return p;
	}
	
	
	
	
	
	// Validate a Binary Search Tree (There is a bug in this solution bcoz we compare only child with parent In some case when left tree contain larger element than current node and this solution return true ) 
	
//	public static boolean isValidBST(Node p) {
//		
//		if(p==null) {
//			return true;
//		}
//		
//		boolean leftFlag=true;
//		boolean rightFlag = true;
//		if(p.getLeft() != null) {
//			leftFlag = (p.getData() >= p.getLeft().getData()) && isValidBST(p.getLeft());
//		}
//		if(p.getRight() != null) {
//			rightFlag = (p.getData() <= p.getRight().getData()) && isValidBST(p.getRight());	
//		}
//		
//		return leftFlag && rightFlag;
//		
//	}
	
	
	public static boolean isValidBST(Node p) {
		
		int l = Integer.MIN_VALUE;
		int u = Integer.MAX_VALUE;
		
		return check(p,l,u);
		
	}

	private static boolean check(Node p, int l, int u) {
		// TODO Auto-generated method stub
		if(p == null) {
			return true;
		}
		if(p.getData() < l || p.getData() > u ) {
			return false;
		}
		if(! check(p.getLeft(), l, p.getData())) {
			return false;
		}
		if(! check(p.getRight(), p.getData(),u)) {
			return false;
		}
		return true;
	}
	
	
	// Right View Binary Tree
	
	public static void rightView(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
				while(size>0) {
					Node temp = queue.remove();
					if(size==1) {
						System.out.print(temp.data+" ");
					}
					if(temp.left != null) {
						queue.add(temp.left);
					}
					if(temp.right != null) {
						queue.add(temp.right);
					}
					size--;
				}
		}
		System.out.println();
	}
	
	
	
	// Top View of Binary Tree
	
	public static SortedMap<Integer,Integer> map = new TreeMap<>();
    public static Map<Node,Integer> hdMap = new HashMap<>();
	public static void topView(Node root) {
        if(root == null){
            return;
        }
        
        horizontalDistance(root,0);

        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            int hd = hdMap.get(temp);
            if(!map.containsKey(hd)){
                map.put(hd,temp.data);
            }
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }

        }


        for(Map.Entry entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
      
    }

    public static void horizontalDistance(Node root,int hd){
        if(root == null){
            return;
        }
         
        hdMap.put(root,hd);
        horizontalDistance(root.left,hd-1);
        horizontalDistance(root.right,hd+1);

    }


    
    // Binary Tree Zigzag Traversal
    
    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        
        List<List<Integer>> result = new ArrayList<>();
              
        if(root == null){
            return result;
        }
        
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
  
        st1.push(root);
        while(!st1.isEmpty() || !st2.isEmpty()){
            List<Integer> list = new ArrayList<>();
            if(st2.isEmpty()){
                while(!st1.isEmpty()){
                    Node temp = st1.pop();
                    if(temp.left != null){
                        st2.push(temp.left);
                    }
                    if(temp.right != null){
                        st2.push(temp.right);
                    }
                    list.add(temp.data);
                }
            }else{
                while(!st2.isEmpty()){
                    Node temp = st2.pop();
                   
                     if(temp.right != null){
                        st1.push(temp.right);
                    }
                    if(temp.left != null){
                        st1.push(temp.left);
                    }
                    list.add(temp.data);
                   
                }
            }
            result.add(list);
        }
        return result;
    }

    
    
    
	

}

class Node {

	public Node left;
	public int data;
	public Node right;
	private Node predecessor;
	boolean rThread ;
	
	
	public Node getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Node predecessor) {
		this.predecessor = predecessor;
	}

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