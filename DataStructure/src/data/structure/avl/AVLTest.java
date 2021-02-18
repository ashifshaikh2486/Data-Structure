package data.structure.avl;

public class AVLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AVL avl = new AVL();
		
		avl.insert(21);
		avl.insert(26);
		avl.insert(30);
		avl.insert(9);
		avl.insert(4);
		avl.insert(14);
		avl.insert(28);
		avl.insert(18);
		avl.insert(15);
		avl.insert(10);
		avl.insert(2);
		avl.insert(3);
		avl.insert(7);
		
		avl.inOrderTravesal(avl.root);
		System.out.println();
		System.out.println(avl.root.data);
		
		avl.delete(21);
		avl.inOrderTravesal(avl.root);
		System.out.println();
		
//		System.out.println(avl.root.data);
//		System.out.println(avl.root.height);
		
	}

}
