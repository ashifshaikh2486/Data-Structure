package dp.problem.solving;

public class RodCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = {0,1,5,8,9,10,17,17,20,24,30};
		
		int n = 5;
		// Using Simple recursion Time O(2^n) and Stack Space
//		int res = cutRod(p,n);
//		System.out.println(res);
		
		// Using Top - Down DP Time O(n^2) and O(n) Space +  Stack Space
		
//		int[] rev = new int[n+1];
//		int  res = cutRod(p,rev,n);
//		System.out.println(res);
		
		// Using Bottom - UP DP Time O(n^2) and O(n) Space 

		int[] rev = new int[n+1];
		
		rev[0] = 0;
		
		for(int i=1;i<=n;i++) {
			
			int best = Integer.MIN_VALUE;
			
			for(int j=1; j<=i;j++ ) {
				best =  Math.max(best, p[j] + rev[i-j]);
			}
			rev[i]= best;
		}
		
		System.out.println(rev[n]);
		
	}

	private static int cutRod(int[] p, int[] rev, int n) {
		// TODO Auto-generated method stub
		if(rev[n] !=0) {
			return rev[n];
		}
		if(n == 0) {
			rev[n] =0;
			return 0;
		}
		
		int best = Integer.MIN_VALUE;
		
		for(int  i=1;i<=n;i++) {
			best = Math.max(best, p[i] + cutRod(p, rev, n-i));
		}
		rev[n] = best;
		return rev[n];
		
	}

	private static int cutRod(int[] p, int n) {
		// TODO Auto-generated method stub
		
		if(n == 0) {
			return 0;
		}
		
		int best = Integer.MIN_VALUE;
		
		for(int i=1;i<=n;i++) {
			best = Math.max(best, p[i] + cutRod(p,n-i));
		}
		
		return best;
		
		
	}

}
