package arrays.problem.solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int[] ar = {8,1,2,2,3};
		int[] res = new int[ar.length];
		
		//Brute Force Approach : Time -> O(n^2)  Space O(1)
		
//		for(int i = 0; i<ar.length; i++) {
//			int count = 0;
//			for(int j =0 ;j<ar.length;j++) {
//				if(ar[i] > ar[j]) {
//					count++;
//				}
//			}
//			res[i] = count;
//		}
//		
//		for(int i = 0 ;i<res.length;i++) {
//			System.out.print(res[i]+" ");
//		}
		
		
		// Time -> O(nlogn)  Space-> O(n)
		
//		int[] br = ar.clone();;
//		Arrays.sort(br);
//		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for(int i = 0; i <br.length; i++) {
//			if(!map.containsKey(br[i])) {
//			map.put(br[i], i);
//			}
//		}
//		for(int i = 0; i<ar.length ;i++) {
//			res[i] = map.get(ar[i]);
//		    System.out.print(res[i]+" ");
//		}
		
		
		
		// Time -> O(n)  Space -> O(c) : Using Counting Sort Approach only applicable for 0<=ar[i]<=100;
		
		int[] br = new int[ar.length];
		int[] cr = new int[101];
		
		for(int i = 0; i < ar.length; i++) {
			cr[ar[i]]++;
		}
		
		
		for(int i  = 1; i < cr.length; i++) {
			cr[i] += cr[i-1];
		}
		
		for(int i = 0; i < res.length; i++) {
			if(ar[i] ==  0) {
				res[i]  = 0;
			}else {
			res[i] = cr[ar[i]-1];
			}
			System.out.print(res[i] +" ");
		}
		
		
		
		
		
		
		
		
	}

}
