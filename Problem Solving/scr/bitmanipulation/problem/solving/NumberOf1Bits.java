package bitmanipulation.problem.solving;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 11;
		
//		int res = hammingWeight(n);
//		System.out.println(res);
		
		int res = brianKernighanAlgo(n);
		System.out.println(res);
	}

	private static int brianKernighanAlgo(int n) {
		// TODO Auto-generated method stub
		int count =0;
		
		while(n != 0) {
			count++;
			n = n & (n-1);
		}
		
		return count;
	}

	private static int hammingWeight(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n != 0 ) {
			if((n & 1)==1 ) {
				count++;
			}
			n >>= 1;
		}
		
		return count;
	}

}
