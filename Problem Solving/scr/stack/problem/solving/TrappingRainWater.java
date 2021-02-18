package stack.problem.solving;

import java.util.Stack;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int water = 0;
		int n = height.length;
		 
		
		
		// Time O(n) with 1 pass and Space O(0)
		
		
		int left = 0;
		int right = n-1;
		int left_max = 0;
		int right_max = 0;
		
		while(left < right) {
			if(height[left] < height[right]) {
				if(height[left] >= left_max) {
					left_max = height[left];
				}else {
					water += left_max - height[left];
				}
				left++;
			}else {
				if(height[right] >= right_max) {
					right_max = height[right];
				}else {
					water += right_max - height[right];
				}
				right--;
			}
		}
		
		
		
		
		
		
		
		// Time O(n) with 1 pass and Space O(n)
		
		
//		Stack<Integer> stack = new Stack<>();
//		
//		for(int i=0;i<n;i++) {
//			while(!stack.isEmpty() && height[i] > height[stack.peek()] )	{
//				int top = stack.pop();
//				if(stack.isEmpty()) {
//					break;
//				}
//				int distance = i-stack.peek()-1;
//				int bounded_height = Math.min(height[i],height[stack.peek()])-height[top];
//				water += distance * bounded_height;
//			}
//			
//			stack.add(i);
//				
//		}
		
		
		
		
		
		// Time O(n) with 3 pass and Space O(n)
		
//		int[] leftMax  = new int[n];
//		int[] rightMax = new int[n];
//		
//		leftMax[0] = height[0];
//		
//		for(int i=1;i<n;i++) {
//			if(height[i] >= leftMax[i-1]) {
//				leftMax[i] = height[i];
//			}else {
//				leftMax[i] = leftMax[i-1];
//			}
//		}
//		
//		rightMax[n-1] = height[n-1];
//		
//		for(int i=n-2;i>=0;i--) {
//			if(height[i]>=rightMax[i+1]) {
//				rightMax[i] = height[i];
//			}else{
//				rightMax[i] = rightMax[i+1];
//			}
//		}
//		
//		
//		for(int i=0;i<n;i++) {
//			water += Math.min(rightMax[i], leftMax[i]) - height[i];
//		}
		
		
		
		
		
		
		// Time O(n^2 ) Space O(1)
		
//		for(int i= 0;i<n;i++) {
//			int left = i;
//			int right = i;
//			
//			int j = i;
//			int k = i;
//			
//			while(j>=0) {
//				if(height[j] > height[left]) {
//					left = j;
//				}
//				j--;
//			}
//			
//			while(k<n) {
//				if(height[k] > height[right]) {
//					right = k;
//				}
//				k++;
//			}
//			
//			water += Math.min(height[left], height[right]) - height[i];
//			
//		}
		
		
		System.out.println(water);

	}

}
