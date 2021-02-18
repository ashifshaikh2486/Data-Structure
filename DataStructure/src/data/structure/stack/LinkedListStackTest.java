package data.structure.stack;

public class LinkedListStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLinkStack ls = new LinkedLinkStack();
		
		ls.display();
		
		System.out.println("---------------------------------------");
		
		ls.push(25);
		ls.push(20);
		ls.push(15);
		ls.push(10);
		ls.push(5);
		
		ls.display();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Pop "+ls.pop());
		System.out.println("Pop "+ls.pop());
		System.out.println("Pop "+ls.pop());
		System.out.println("Pop "+ls.pop());
		System.out.println("Pop "+ls.pop());
		
		System.out.println("---------------------------------------");
		System.out.println(ls.pop());
	}

}
