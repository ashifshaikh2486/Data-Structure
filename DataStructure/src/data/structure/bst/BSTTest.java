package data.structure.bst;

public class BSTTest {

public static void main(String[] args) {
		
		BST b = new BST();
		
		b.insert(16);
		b.insert(8);
		b.insert(24);
		b.insert(6);
		b.insert(12);
		b.insert(18);
		b.insert(28);
		b.insert(4);
		b.insert(6);
		b.insert(14);
		b.insert(26);
		b.insert(30);
		
		System.out.println("Min value of BST : "+b.min());
		System.out.println("Max Value of BST : "+b.max());
		
		Node searchedNode = b.search(25);
		
		if(searchedNode != null) {
			System.out.println(searchedNode.getData()+ "  is present");
		}else {
			System.out.println("Not Present");
		}
		
		System.out.println();
		
		System.out.print("Preorder : ");
		b.preorder(b.getRoot());
		
		System.out.println();
		
		System.out.print("Inorder : ");
		b.inorder(b.getRoot());
		
		System.out.println();
		
		System.out.print("Postoreder : ");
		b.postorder(b.getRoot());
		
	   b.delete(b.getRoot(), 16);
		
         System.out.println();
         System.out.println();
         
		System.out.print("Inorder : ");
		b.inorder(b.getRoot());
		
		System.out.println();
		System.out.println("Hieght of BST : " + b.height(b.getRoot()));
		
		 
	}
	
}
