package data.structure.stack;
public class ArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			ArrayStack as = new ArrayStack();
			
			as.display();
			System.out.println("------------------------");
			
			as.push(20);
			as.push(15);
			as.push(10);
			as.push(5);
			as.push(1);
			as.display();
			
			System.out.println("--------------------------");
			as.push(0);
			System.out.println("--------------------------");
			System.out.println("Pop " + as.pop());
			System.out.println("Pop " + as.pop());
			System.out.println("Pop " + as.pop());
			System.out.println("Pop " + as.pop());
			System.out.println("Pop " + as.pop());
			
			System.out.println("---------------------------");
			System.out.println(as.pop());
	}

}
