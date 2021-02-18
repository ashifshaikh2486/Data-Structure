package arrays.problem.solving;

import java.util.Arrays;
import java.util.Stack;

public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {2,6,4,8,10,9,15};
		
		
		// Using Selection Sort Time O(n^2) & Space O(1)
		
//		int start = ar.length-1;
//		int end = 0;
//		
//		for(int i = 0; i < ar.length-1; i++) {
//			for(int j = i+1; j < ar.length;j++) {
//				if(ar[i] > ar[j]) {
//					start = Math.min(start, i);
//					end = Math.max(end, j);
//				}
//			}
//		}
//		
//		if(start < end) {
//			System.out.println(end-start+1);
//		}else {
//			System.out.println(0);
//		}
		
		
	
		
		//Using Sorting Time O(nlogn) & Space O(n) 
		
		
//		int start = ar.length-1;
//		int end = 0;
//		
//		int[] copyar = ar.clone();
//		Arrays.sort(copyar);
//		
//		for(int i = 0; i < ar.length; i++) {
//			if(ar[i] != copyar[i]) {
//				start = Math.min(start, i);
//				end = Math.max(end, i);
//			}
//		}
//		
//		if(start < end) {
//			System.out.println(end - start + 1);
//		}else {
//			System.out.println(0);
//		}
		
		
		
		// Using Stack with Time O(n) & Space O(n)
		
		int start = ar.length-1;
		int end = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		
		int i = 1;
        
        while(i<ar.length){
            if(!stack.empty() && ar[stack.peek()]>ar[i]){
                start = Math.min(start,stack.pop());
            }else{
                stack.push(i);
                i++;
            }
        }

		
		stack.clear();
		stack.push(ar.length-1);
		
		i = ar.length-2;
        
        while(i>=0){
            if(!stack.empty() && ar[stack.peek()]<ar[i]){
                end = Math.max(end,stack.pop());
            }else{
                stack.push(i);
                i--;
            }
        }
		
		
		
		if(start < end) {
			System.out.println(end - start + 1);
		}else {
			System.out.println(0);
		}
		
		
		
		
	}

}
