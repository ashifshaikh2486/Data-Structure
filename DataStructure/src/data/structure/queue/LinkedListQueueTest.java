package data.structure.queue;

public class LinkedListQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListQueue lq = new LinkedListQueue();
		
		lq.display();
		System.out.println("-----------------------");
		
		lq.enqueue(5);
		lq.enqueue(10);
		lq.enqueue(15);
		lq.enqueue(20);
		lq.enqueue(25);
		
		lq.display();
		System.out.println("-----------------------");
		
		lq.deqyeue();
		lq.deqyeue();
		lq.deqyeue();
		
		lq.display();
		System.out.println("-----------------------");
		
		lq.deqyeue();
		lq.deqyeue();
		
		lq.display();
		System.out.println("-----------------------");

		lq.deqyeue();


	}

}
