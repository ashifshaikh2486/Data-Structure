package arrays.problem.solving;

public class SortedAndRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  Unsorted Array Brute Force O(n^2)
		
//		int[] ar = {2,4,1,5,6,7,8,10};
//		int sum =11;
//		boolean flag = false;
//		
//		for(int i=0;i<ar.length-1;i++) {
//			for(int j=i+1;j<ar.length;j++) {
//				if(sum == ar[i]+ar[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if(flag) {
//				break;
//			}
//		}
//		
//		System.out.println(flag);

		
//		Sorted Array O(n)
		
//		int[] ar = {9,10,11,15,26,38};
//		
//		int l =0;
//		int r = ar.length-1;
//		
//		int sum = 47;
//		boolean flag = false;
//		
//		while(l<r) {
//			if(sum == ar[l]+ar[r]) {
//				flag = true;
//				break;
//			}
//			else if(sum > ar[l]+ar[r]) {
//					l +=1;
//				}else {
//					r -= 1;
//				}
//			}
//		
//		System.out.println(flag);
		
// Sorted + Rotated Array O(n)
		
		int[] ar = {11,15,26,38,9,10};
		int l=0;
		int r = ar.length-1;
		int sum = 47;
		for(int i=0;i<ar.length;i++) {
			if( ar[i] > ar[i+1]) {
				l = i+1;
				r = i;
				break;
			}
		}
		
		boolean flag = false;
		while(l != r) {
			 int a = ar[l]+ar[r];
			 
			 if( sum == a) {
				 flag = true;
				 break;
			 }
			 if(sum > a) {
				l = (l+1) % ar.length;
			 }else {
				 r = (r+ar.length-1)%ar.length;
			 }
			
		}
		
		System.out.println(flag);
		
	}

}
