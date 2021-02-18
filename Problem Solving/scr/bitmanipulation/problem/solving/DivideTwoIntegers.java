package bitmanipulation.problem.solving;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648,-3));
	}

	public static int divide(int dividend, int divisor) {

		
		
		if(dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		
		if(dividend == Integer.MIN_VALUE && divisor == 1) {
			return Integer.MIN_VALUE;
		}
		
		boolean negative = (dividend < 0) ^ (divisor < 0);
		
		
		dividend = (dividend>0) ? -dividend : dividend;
		divisor = (divisor>0) ? -divisor : divisor;

        
        int quotient  = 0;
        
//        while(dividend <= divisor){
//            int count = 1;
//            int accum = divisor;
//            
//            while(accum < Integer.MIN_VALUE>>1 &&   dividend <= accum+accum){
//                count += count;
//                accum += accum;
//            }
//            quotient  += count;
//            dividend -= accum;
//        }
        
        int i = 1;
        int accum = divisor;
        
        while(accum >= Integer.MIN_VALUE>>1 && dividend <= accum+accum) {
        	i <<= 1;
        	accum += accum;
        }
        
        while(dividend <= divisor) {
        	if(dividend <= accum) {
        		dividend -= accum;
        		quotient += i;
        	}
        	
        	accum >>=1;
        	i >>= 1;
        	
        }
        

		return negative ? -quotient : quotient;

	}

}
