import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		String[] s = sc.nextLine().split(" ");
		
		int M = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		
		int[][] mat = new int[M][N];
		
		for(int i=0;i<M;i++) {
			String[] ar = sc.nextLine().trim().split(" ");
			for(int j=0;j<N;j++) {
				mat[i][j] = Integer.parseInt(ar[j]);
			}
		}
		
		int[] row_count = new int[M];
		int[] col_count = new int[N];
		
		for(int i=0;i<M;i++) {
			int count = 0;
			for(int j=0;j<N;j++) {
				if(mat[i][j] == 0) {
					col_count[j] ++;
					count++;
				}
			}
			row_count[i] = count;
		}
		
		String temp = "";
		
		for(int i=0;i<M;i++) {
			
			if(row_count[i] == N) {
				continue;
			}
			
			for(int j=0;j<N;j++) {
				if(col_count[j] != M) {
					temp += String.valueOf(mat[i][j]) + " ";
				}
			}
			
			temp += "\n";
			
		}
		
		System.out.print(temp.trim());
		
	}

}
