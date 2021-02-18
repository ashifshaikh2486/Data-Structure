package bitmanipulation.problem.solving;

public class TotalHammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,14,2};
		
		
		// Time O(n^2 * k)
//		int res = totalHammingDistance(nums);
//		System.out.println(res);
		
		// Time O(32 * nlogn)
		int res = totalHammingDistance(nums);
		System.out.println(res);
	}

	private static int totalHammingDistance(int[] nums) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for(int i=0;i<32;i++) {
			int ones = 0;
			for(int j=0;j<nums.length;j++) {
				if(((nums[j]& (1<<i)) !=  0)) {
					ones += 1;
				}
			}
			
			total += (ones * (nums.length-ones)); 
		}
		
		return total;
	}

//	private static int totalHammingDistance(int[] nums) {
//		// TODO Auto-generated method stub
//		
//		int total = 0;
//		
//		for(int i=0;i<nums.length-1;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				total += brianKernighanAlgo(nums[i] ^ nums[j]);
//			}
//		}
//		
//		return total;
//	}
//
//	private static int brianKernighanAlgo(int n) {
//		// TODO Auto-generated method stub
//		int count = 0;
//		while(n != 0) {
//			count++;
//			n &= (n-1);
//		}
//		return count;
//	}
//
}
