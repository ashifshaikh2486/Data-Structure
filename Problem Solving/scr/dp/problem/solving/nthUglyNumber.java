package dp.problem.solving;

import java.util.PriorityQueue;
import java.util.Queue;

public class nthUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		
		// Heap based solution Time O(nlogn) Space O(n)
		
//		Queue<Integer> queue = new PriorityQueue<>();
//		
//		queue.add(1);
//		
//		for(int i=2;i<=n;i++) {
//			int temp = queue.remove();
//			
//			if(!queue.contains(temp*2)) {
//				queue.add(temp*2);
//			}
//			if(!queue.contains(temp*3)) {
//		 		queue.add(temp*3);
//			}
//			if(!queue.contains(temp*5)) {
//				queue.add(temp*5);
//			}
		
//		}
//		
//		System.out.println(queue.peek());

		
		
		
		// Solution Time O(n) Space O(n) Using three pointer to track multiplication 
		
		int[] dp = new int[n];
		dp[0] = 1;
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		
		for(int i = 1;i<n;i++) {
			dp[i] =Math.min( Math.min(dp[p1]*2, dp[p2]*3),dp[p3]*5);
			if(dp[i] ==dp[p1]*2) {
				p1 +=1;
			}
			if(dp[i] ==dp[p2]*3) {
				p2 +=1;
			}
			if(dp[i] ==dp[p3]*5) {
				p3 +=1;
			}
		}

		System.out.println(dp[n-1]);
		
	}
	

}
