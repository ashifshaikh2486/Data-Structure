package heap.problems.solving;

import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectNRopesWithMinimumCost {
	
	public static void main(String[] args) {
		
		int[] cost = {1,4,5,2,3,9};
		
		int length = cost.length;
		
		if(length == 0) {
			System.out.println(0);
			return;
		}
		if(length == 1) {
			System.out.println(cost[0]);
			return ;
		}
		
		if(length == 2) {
			System.out.println(cost[0]+cost[1]);
			return;
		}
		
		Queue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < cost.length; i++) {
			minHeap.add(cost[i]);
		}
		
		
		
		while(minHeap.size() != 1) {
			
			int minSum =  minHeap.remove()+minHeap.remove();
			minHeap.add(minSum);
			
		}
		
		System.out.println(minHeap.peek());
		
		
		
	}

}
