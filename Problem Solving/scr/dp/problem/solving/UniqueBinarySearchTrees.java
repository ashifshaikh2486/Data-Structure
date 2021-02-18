package dp.problem.solving;

public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Logic Make 1 to n as root node of each root node count the unique bst by multiply unique bst of its left and right subtrees
		
		int n = 4;
		
		int[] dp = new int[n+1];
		dp[0] =1;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				dp[i] += dp[j-1]*dp[i-j];
			}
		}
		
		System.out.println(dp[n]);
		
	}

}
