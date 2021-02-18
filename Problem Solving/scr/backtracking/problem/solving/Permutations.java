package backtracking.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3};
		
		List<List<Integer>> res = getPermutations(nums);
		
		System.out.println(res);

	}

	private static List<List<java.lang.Integer>> getPermutations(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		if(nums.length==0) {
			return res;
		}
		recursion(nums,res,0);
		
		return res;
	}

	



	private static void recursion(int[] nums, List<List<Integer>> res, int i) {
		// TODO Auto-generated method stub
		if(i==nums.length) {
			 
			List<Integer> list = new ArrayList<>();
			for(int k=0;k<nums.length;k++) {
				list.add(Integer.valueOf(nums[k]));
			}
			res.add(list);
			return;
		}
		
		for(int j=i;j<nums.length;j++) {
			swap(nums,i,j);
			recursion(nums, res, i+1);
			swap(nums,i,j);
		}
	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
