package arrays.problem.solving;

public class ArrayProductProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {4,5,1,8,2,10,6};
		int[] out = new int[ar.length];
		
		
		
		// O(n^2)
		
//		for (int i = 0; i < ar.length; i++) {
//			int product = 1;
//			for (int j = 0; j < ar.length; j++) {
//				if(i != j) {
//					product *= ar[j];
//				}
//			}
//			out[i] = product;
//		}
//		
//		for (int i = 0; i < out.length; i++) {
//			System.out.print(out[i]+" ");
//		}
		
		
		// O(n) with division
		
//		int product = 1;
//		for (int i = 0; i < ar.length; i++) {
//			product *= ar[i];
//		}
//		
//		for (int i = 0; i < out.length; i++) {
//			out[i] = product/ar[i];
//			System.out.print(out[i]+ " ");
//		}
		
		
		
		
		// left - right product approach with O(n^2) Time and O(1) space
		
//		for (int i = 0; i < out.length; i++) {
//			
//			int leftProduct = 1;
//			int  rightProduct = 1;
//			
//			for(int j = i-1; j>=0;j--) {
//				leftProduct *= ar[j];
//			}
//			
//			for(int k = i+1;k<ar.length;k++) {
//				rightProduct *= ar[k];
//			}
//			
//			out[i] = leftProduct * rightProduct;
//			
//		}
		
		
		// left - right product approach with O(n) Time and O(n) space
		
//		int[] leftProduct = new int[ar.length];
//		int[] rightProduct = new int[ar.length];
//		leftProduct[0] = 1;
//		rightProduct[ar.length-1] = 1;
//		
//		for (int i = 0; i < rightProduct.length-1; i++) {
//			leftProduct[i+1] = leftProduct[i] * ar[i]; 
//		}
//		
//		for (int i = ar.length-1; i > 0;i--) {
//			rightProduct[i-1] = rightProduct[i] * ar[i];
//		}
//		
//		for (int i = 0; i < out.length; i++) {
//			out[i] = leftProduct[i] * rightProduct[i];
//		}
		
		
		
		// left - right product approach with O(n) Time and O(1) space
		
		out[0] = 1;
		for (int i = 0; i < out.length-1; i++) {
			out[i+1] = out[i] * ar[i]; 
		}
		
		int rightProduct = 1;
		for (int i = out.length-1; i >=0; i--) {
			out[i] = out[i] * rightProduct;
		   rightProduct *= ar[i];
		}
		
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i]+" ");
		}
		
		
		
		
	}

}
