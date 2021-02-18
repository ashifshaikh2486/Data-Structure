package stack.problem.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] asteroids = {-2,-1,1,2};
		
		
		// TIme O(n) and  Space O(0)
		
		int i = -1;
		for(int j=0;j<asteroids.length;j++) {
			boolean flag = true;
			while(i >= 0 && asteroids[j] < 0 && asteroids[i] > 0) {
				flag = false;
				if(asteroids[i] < Math.abs(asteroids[j])){
					i--;
					flag = true;
					continue;
				}else if(asteroids[i] == Math.abs(asteroids[j])) {
					i--;
				}
				break;
			}
			if(flag) {
				asteroids[i+1] = asteroids[j];
				i++;
			}
		}
		
		int[] res = new int[i+1];
		for(int j=0;j<res.length;j++) {
			res[j] = asteroids[j];
			System.out.print(res[j]+" ");
		}
		
		
		
				
//		TIme O(n) and Space O(n)
//		
//		Stack<Integer> stack = new Stack<>();
//		
//		for(int i=0;i<asteroids.length;i++) {
//			boolean flag = true;
//			while(!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0 ) {
//				flag = false;
//				if(Math.abs(asteroids[i]) > stack.peek()) {
//					flag = true;
//					stack.pop();
//					continue;
//				}else if(Math.abs(asteroids[i]) == stack.peek()) {
//					stack.pop();
//				}
//				break;
//			}
//			
//			if(flag) {
//				stack.add(asteroids[i]);
//			}
//			
//		}
//		
//		int[]  res = new int[stack.size()];
//		for(int i=res.length-1;i>=0;i--) {
//			res[i] = stack.pop();
//		}
//				
//		for(int i = 0;i<res.length; i++) {
//			System.out.print(res[i]+ " ");
//		}
		
		
	}

}
