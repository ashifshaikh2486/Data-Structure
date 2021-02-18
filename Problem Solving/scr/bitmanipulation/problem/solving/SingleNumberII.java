package bitmanipulation.problem.solving;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {0,1,0,1,99,0,1};
		
		int res = singleNumber(ar);
		System.out.println(res);
		
	}

	private static int singleNumber(int[] ar) {
		// TODO Auto-generated method stub
		int ones = 0;
		int twice = 0;
		int thrice = 0;
		for(int i=0;i<ar.length;i++) {
			twice |= ones&ar[i];
			ones = ones^ar[i];
			thrice = ones & twice;
			ones = ~thrice & ones;
			twice = ~thrice & twice;
			
		}
		
		return ones;
	}

}
