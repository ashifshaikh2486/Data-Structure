package dp.problem.solving;

public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {-2,-3,4,1,-2,1,5,-3};
		
		
		
		// Using recursion(top-down DP) with TIme O(n) Space O(n)+StackSpace
		
		
//		int[] sum = new int[ar.length];
//		int res = getLargestSum(ar,sum);
//		System.out.println(res);
		
		
		// Using recursion(bottom-up DP) with TIme O(n) Space O(0)
		
		if(ar.length==0) {
			System.out.println(0);
			return;
		}
		
		int currentSum = ar[0];
		int  maxSum = ar[0];
		
		for(int i=1;i<ar.length;i++) {
			
			currentSum = Math.max(ar[i], ar[i]+currentSum);
			if(maxSum < currentSum ) {
				maxSum = currentSum;
				
			}		
		}
			
		System.out.println(maxSum);

	}

	private static int getLargestSum(int[] ar, int[] sum) {
		// TODO Auto-generated method stub
		
		if(ar.length==0) {
			return 0;
		}
		getSumArray(ar,sum,ar.length-1);
		
		int max = sum[0];
		
		for(int i=1;i<sum.length;i++) {
			if(max<sum[i]) {
				max = sum[i];
			}
		}
		
		return max;
	}

	private static int getSumArray(int[] ar, int[] sum, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			sum[n] = ar[n];
			return sum[n];
		}
		
		sum[n] = Math.max(ar[n],ar[n]+getSumArray(ar,sum,n-1));
		return sum[n];
		
	}

}
