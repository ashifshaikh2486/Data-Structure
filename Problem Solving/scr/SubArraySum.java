import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int K = 9;
//		int[] ar = {1, 2, 4, 5};
		
		// My Solution
		
//		int start = 0;
//		K -= ar[start];
//		int i = start+1;
//		
//		while(i<ar.length) {
//			if(K==0) {
//				break;
//			}else if(K< 0) {
//				K+=ar[start];
//				start++;
//			}else {
//				K-=ar[i]; 
//				i++;
//			}
//		}
//	
//		while(K<0) {
//			K+= ar[start];
//			start++;
//		}
//		while(start < i) {
//			System.out.print(ar[start] +" ");
//			start++;
//		}
		
	
		int K = 9;
		int[] ar = {1, 2, 3,-1,4, 5};
		int n = ar.length;
		
		int start = -1;
		int end = n;
		
		Map<Integer,Integer> weight_index  = new HashMap<>();
		weight_index.put(0, -1);
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += ar[i];
			if(weight_index.containsKey(sum-K)) {
				start = weight_index.get(sum-K)+1;
				end = i;
				break;
			}
			
			weight_index.put(sum, i);
			
		}
		
		if(start != -1 && end != n) {
			while(start <= end) {
				System.out.print(ar[start]+" ");
				start++;
			}
		}
		

	}

}
