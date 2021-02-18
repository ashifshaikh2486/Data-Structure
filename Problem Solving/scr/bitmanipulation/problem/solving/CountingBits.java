package bitmanipulation.problem.solving;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
//		int[] res = countBits(n);
//		
//		for(int i=0;i<=n;i++) {
//			System.out.print(res[i]+" ");
//		}
		
		// Logic no, 1 bits in n = no. of one bits in n//2 + n%2;
		
		int[] res = new int[n+1];
		res[0] = 0;
		
//		for(int i=1;i<=n;i++) {
//			res[i] = res[i/2] + i%2;
//		}
		
		// Using the logic of count ones in number by Brian KernighanAlgo 
		
		for(int i=1;i<=n;i++) {
			res[i] = res[i&(i-1)] + 1;
		}
		
		for(int i=0;i<=n;i++) {
			System.out.print(res[i]+" ");
		}
		
		
	}

	private static int[] countBits(int n) {
		// TODO Auto-generated method stub
		int[] res = new int[n+1];
		for(int i=0;i<=n;i++) {
			res[i] = brianKernighanAlgo(i);
		}
		
		return res;
	}

	private static int brianKernighanAlgo(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n != 0) {
			count++;
			n &= (n-1);
		}
		
		return count;
	}

}
