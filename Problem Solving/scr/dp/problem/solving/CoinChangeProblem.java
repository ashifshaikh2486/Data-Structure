package dp.problem.solving;

public class CoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coins = {1,2,5};
		int val  = 11;
		
		if(coins.length == 0) {
			System.out.println(-1);
			return;
		}
		
		// Brute Force Recursion Time O(m^n) Stack Space O(n)
		
//		int res = minCoins(coins,val);
//		System.out.println(res);
		
		// Top-Down DP Time O(n*m) and Space O(n) + Stack Space
		
		
//		int[] values = new int[val+1];
//		int res = minCoins(values,coins,val);
//		System.out.println(res);
		
		// Bottom-Up DP Time O(m*n) and Space O(n) 
		
		int[] values = new int[val + 1];
		
		for(int i = 0;i<coins.length;i++) {
			values[coins[i]] = 1;
		}
		
		for(int i=1;i<=val;i++) {
			if(values[i] == 0) {
				int min = Integer.MAX_VALUE;
				boolean flag = true;
				
				for(int j=0;j<coins.length;j++) {
					if(i-coins[j] >= 0) {
						int temp = values[i-coins[j]];
						if(temp != -1) {
							flag = false;
							min  = Math.min(min,temp);	
						}
					}
				}
				
				
				
				if(flag) {
					values[i] = -1;
				}else {
					values[i] = min+1;
				}
				
				
			}
		}
		
				
			
		
		System.out.println(values[val]);
		
	}

	private static int minCoins(int[] values, int[] coins, int val) {
		// TODO Auto-generated method stub
		if(val == 0) {
			return 0;
		}
		if(val < 0) {
			return -1;
		}
		
		if(values[val] == 0) {
			int min = Integer.MAX_VALUE;
			boolean flag = true;
			
			for(int i =0;i<coins.length;i++) {
				 int temp = minCoins(values, coins, val-coins[i]);
				 if(temp != -1) {
					 flag = false;
					 if(min >  temp) {
						 min = temp;
					 }
				 }
			}
			if(flag) {
				values[val] = -1;
			}else {
				values[val] =1+ min;
			}
			
			
		}
		
		return values[val];
	}

	private static int minCoins(int[] coins, int val) {
		// TODO Auto-generated method stub
		
		if(val == 0) {
			return 0;
		}
		
		if(val < 0) {
			return -1;
		}
		
		int min = Integer.MAX_VALUE;
		boolean flag = true;
		for(int i =0;i< coins.length;i++) {
			int temp = minCoins(coins, val-coins[i]);
			if(temp != -1) {
				flag = false;
				if(min > temp) {
					min = temp;
				}
			}
		}
		
		if(flag) {
			return -1;
		}
		
		return 1+min;
	}

}
