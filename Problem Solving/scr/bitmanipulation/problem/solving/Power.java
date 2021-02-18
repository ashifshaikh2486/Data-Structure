package bitmanipulation.problem.solving;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	
		double x = 2.0d;
		int n = 10;
	
		//  Time O(n)
		
//		double res = pow(x,n);
//		System.out.println(res);
		
		
		// FastPower Time O(lgn) Space O(logn) Logic -> x^n = x^n/2 * x^n/2
		
//		if(n<0) {
//			x = 1/x;
//			n = -n;
//		}
//		
//		double res = fastPow(x,n);
//		System.out.println(res);
		
		// Fast Power Iterative Time O(logn) Space O(1)
		
		if(n<0) {
			x = 1/x;
			n = -n;
		}
		
		double res = 1.0d;
		
		while(n != 0) {
			if((n&1) == 1) {
				res *= x;
			}
			x *= x;
			n=n>>1;
		}
		
		System.out.println(res);
		
	}

	private static double fastPow(double x, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1.0d;
		}
		double half = fastPow(x, n/2);
		if(n%2 == 0) {
			return half*half;
		}else {
			return half*half*x;
		}
		
	}

	private static double pow(double x, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		
		if(n <0 ) {
			x = 1/x;
			n = -n;
		}
		double res = 1;
		for(int i=0;i<n;i++) {
			res *= x; 
		}
		return res;
	}

}
