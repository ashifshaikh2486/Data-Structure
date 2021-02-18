package backtracking.problem.solving;

public class NQueens {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n = 8;
		
		int[][] board = new int[n][n];
		
		boolean flag = NQ(board,0,n);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
			
	}

	private static boolean NQ(int[][] board, int row, int n) {
		// TODO Auto-generated method stub
		if(row == n) {
			return true;
		}
		
		for(int col = 0;col<n;col++) {
			if(isSafe(board,row,col,n)) {
				board[row][col] =1;
				boolean flag = NQ(board, row+1, n);
				if(flag) {
					return true;
				}
				board[row][col] = 0;
			}
			
			
		}
		
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col,int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			if(board[row][i] == 1 || board[i][col] ==1) {
				return false;
			}
		}
		
		int i = row;
		int j = col;
		
		while(i>=0 && j>=0) {
			if(board[i][j] == 1) {
				return false;
			}
			i--;
			j--;
		}
		
		i = row;
		j = col;
		
		while(i<n && j<n) {
			if(board[i][j] == 1) {
				return false;
			}
			i++;
			j++;
		}
		
		i = row ;
		j = col;
		
		while(i>=0 && j < n) {
			if(board[i][j] == 1) {
				return false;
			}
			i--;
			j++;
		}
		
		i = row ;
		j = col;
		
		while(i<n && j >= 0) {
			if(board[i][j] == 1) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
