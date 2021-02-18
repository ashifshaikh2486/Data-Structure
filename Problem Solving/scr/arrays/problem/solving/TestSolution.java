package arrays.problem.solving;

public class TestSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4,5};
		        
		          
		        if(nums.length < 3){
		            System.out.println( false);
		            return;
		        }
		        
		        int min_indx = 0;
		        int low = -1;
		        int mid = -1;
		        boolean flag = false;
		        
		        for(int i=1;i<nums.length;i++){
		            if(nums[min_indx] >= nums[i]){
		                min_indx = i;
		            }else if(mid == -1){
		                low = min_indx;
		                mid = i;
		            }else if(nums[i]<=nums[mid]){
		                low = min_indx;
		                mid = i;
		            }else{
		                flag = true;
		                break;
		            }
		        }
		        
		        System.out.println(flag);
		    
		        
	}

}
