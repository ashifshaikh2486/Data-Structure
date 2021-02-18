package arrays.problem.solving;

import java.util.Arrays;

public class FirstMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,5};
		
		
		// TIme O(nlogn) + O(n)
		
//		 Arrays.sort(nums);
//		 int min = 1;
//      
//       int i = 0;
//       while(i<nums.length && nums[i] <= 0){
//           i++;
//       }      
//       while(i < nums.length){
//          
//           if(i>0 && nums[i] == nums[i-1]){
//               i++;
//               continue;
//           } 
//          
//           if(nums[i] == min){
//               min += 1;
//           }else{
//               break;
//           }
//           i++;
//       }
//      
//      
//       for(int i=0;i<nums.length;i++){
//           if(min == nums[i]){
//               min+=1;
//           }
//       }
//      
//      
//      System.out.println(min);


		// Time O(n)
		
		boolean flag = true;
        int n = nums.length;
        int res = 1;
        for(int i = 0;i< n;i++){
            if(nums[i] == 1){
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.println(res);
            return;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i] <= 0 || nums[i] > n ){
                nums[i] = 1  ;
            }
        }
        
        for(int i=0;i<n;i++){
            int val = Math.abs(nums[i]);
            if(val == n){
                nums[0] = -Math.abs(nums[i]);
            }else{
                nums[val] = -Math.abs(nums[val]);
            }
        }
        
        
        for(int i=1;i<n;i++){
            if(nums[i] > 0){
                res = i;
                flag = true;
                break;
            }
        }
        
        if(!flag){
            if(nums[0] > 0){
                res = n;
            }else{
                res = n+1;
            }
        }
        System.out.println(res);

		
	}

}
