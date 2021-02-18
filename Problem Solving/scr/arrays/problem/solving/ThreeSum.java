package arrays.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -1, 0, 1, 2, -1, -4 };
       
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		
		List<List<Integer>> list = new ArrayList();
		
		
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i] == nums[i-1]) {
				continue;
			}
			int l = i+1;
			int r = nums.length-1;
			while(l<r) {
				if(nums[i]+ nums[l]+nums[r]>0) {
					r--;
				}else if(nums[i]+nums[l]+nums[r]<0) {
					l++;
				}else {
					List<Integer> ar = new ArrayList();
					ar.add(nums[i]);
					ar.add(nums[l]);
					ar.add(nums[r]);
					list.add(ar);
					l++;
					r--;
					
					while(l<r && nums[l] == nums[l-1] && nums[r] == nums[r+1]) {
						l++;
						r--;
					}
				}
			}
		}
		
		for(List<Integer> l : list) {
			System.out.println(l);
		}
		

	}

}
