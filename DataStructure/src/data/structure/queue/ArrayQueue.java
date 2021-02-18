package data.structure.queue;

public class ArrayQueue {
	
	private int[] ar = new int[5];
	int head = -1;
	int tail = -1;
	
	public void enqueue(int data) {
		if(head == -1) {
			head+=1;
			tail+=1;
			ar[tail] = data;
		}else if(tail+1<ar.length && head <=tail) {
			tail+=1;
			ar[tail] = data;
		}else if(tail+1 == ar.length && head!=0) {
			tail = 0;
			ar[tail] = data;
		}else if(tail<head){
			tail+=1;
			ar[tail] = data;
		}else {
			System.out.println("The Queue is full");
		}
	}
	
	public void dequeue() {
		if(head == -1) {
			System.out.println("Queue is empty");
		}else if(head == tail ) {
			head = -1;
			tail =-1;
		}else if (head<tail  ) {
			head+=1;
		}else if(head==ar.length-1) {
			head=0;
		}else if(head>tail && head<ar.length-1) {
			head+=1;
		}
	}
	
	
	public void display() {
		
		if(head==-1) {
			System.out.println("Queue is Empty");
		}else {
			int i = head;
			if(head<tail) {
				while(i<=tail) {
					System.out.print(ar[i]+" ");
					i++;
				}
			}else if(tail<head) {
				while(i<ar.length) {
					System.out.print(ar[i]+" ");
					i++;
				}
				i=0;
				while(i<=tail) {
					System.out.print(ar[i]+" ");
					i++;
				}
			}
			System.out.println();
			
		}	
	}
		
	
	public static void  main(String args[]) {
	
		ArrayQueue aq = new ArrayQueue();
		
		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(5);
		
		aq.display();
		
		aq.dequeue();
		aq.display();
		
		aq.enqueue(6);
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.dequeue();
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.enqueue(7);
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.dequeue();
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.enqueue(8);
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.dequeue();
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.enqueue(9);
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.dequeue();
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
		
		aq.enqueue(10);
		aq.display();
		
		System.out.println(aq.head + " "+aq.tail);
	}

}
