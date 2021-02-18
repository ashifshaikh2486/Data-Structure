package arrays.problem.solving;

public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {12,345,2,6,7896,66};
		
		int count = 0;
//      for(int i=0;i<nums.length;i++){
//          if(countDigit(nums[i])%2 == 0){
//              count++;
//          }
//      }
		
		 for(int i=0;i<nums.length;i++){
	            if(String.valueOf(nums[i]).length() % 2 == 0){
	                count++;
	            }
	        }
	       
		System.out.println(count);

	}
	
	
	 public static int countDigit(int num){
	        int count = 0;
	        if(num == 0){
	            return 1;
	        }
	        
	        while(num != 0){
	         count++;
	         num /=10;
	        }
	        
	        return count;
	    }

}
