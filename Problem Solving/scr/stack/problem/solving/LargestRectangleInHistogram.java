package stack.problem.solving;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] heights = {2,1,5,6,2,3};
		
		int maxRectangle = 0;
		
		if(heights.length == 0) {
			System.out.println(maxRectangle);
			return;
		}
		
		
		Stack<Integer> stack = new Stack<>();
		
		int i =0 ;
		while(i<heights.length) {
			if(stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
				stack.push(i);
				i++;
			}else {
				int top = stack.pop();
				if(stack.isEmpty()) {
					maxRectangle = Math.max(maxRectangle, heights[top]*i);
				}else {
					maxRectangle = Math.max(maxRectangle, heights[top]*(i-stack.peek()-1));
				}
			}
		}
		
		while(!stack.isEmpty()) {
			int top = stack.pop();
			if(stack.isEmpty()) {
				maxRectangle = Math.max(maxRectangle, heights[top]*i);
			}else {
				maxRectangle = Math.max(maxRectangle, heights[top]*(i-stack.peek()-1));
			}
		}
		
		System.out.println(maxRectangle);
		
	}

}
