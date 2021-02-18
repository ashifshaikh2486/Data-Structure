package backtracking.problem.solving;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		
		String word = "ABCB";
		
//		boolean res = wordSeach(board,word);
//		System.out.println(res);
		
		boolean res = exist(board,word);
		System.out.println(res);
		

	}

	private static boolean exist(char[][] board, String word) {
		// TODO Auto-generated method stub
		int rows = board.length;
		int cols = board[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(pathExist(board,word,i,j)) {
					return true;
				}
			}
		}
		
		return false;
	}

	private static boolean pathExist(char[][] board, String word, int i, int j) {
		// TODO Auto-generated method stub
		if(word.length()==0) {
			return true;
		}
		
		if(i<0 || j <0 || i>=board.length || j>= board[0].length || board[i][j] != word.charAt(0)) {
			return false;
		}
		
		board[i][j] = '@';
		
		if(pathExist(board, word.substring(1), i-1, j)) {
			return true;
		}
		if(pathExist(board, word.substring(1), i+1, j)) {
			return true;
		}
		if(pathExist(board, word.substring(1), i, j-1)) {
			return true;
		}
		if(pathExist(board, word.substring(1), i, j+1)) {
			return true;
		}
		board[i][j] = word.charAt(0);
		return false;
		
	}

	private static boolean wordSeach(char[][] board, String word) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				boolean flag = false;
				if(word.charAt(0) ==board[i][j]) {
					char ch = board[i][j];
					board[i][j] = '@';
					flag = recursion(board,word,1,i,j);
					board[i][j] = ch;
					if(flag) {
						return true;
					}
				}
				 
			}
		}
		
		return false;
	}

	private static boolean recursion(char[][] board, String word, int n, int i, int j) {
		// TODO Auto-generated method stub
		if(n== word.length()) {
			return true; 
		}
		
		
		boolean flag = false;
		char ch = board[i][j];
		if(isMatched(board,word.charAt(n),i-1,j)) {
			ch = board[i-1][j] ;
			board[i-1][j]  = '@';
			flag = recursion(board, word, n+1, i-1, j);
			board[i-1][j] = ch;
			if(flag) {
				return true;
			}
		}
		
		if(isMatched(board,word.charAt(n),i+1,j)) {
			ch = board[i+1][j] ;
			board[i+1][j]  = '@';
			flag = recursion(board, word, n+1, i+1, j);
			board[i+1][j] = ch;
			if(flag) {
				return true;
			}
		}
		
		if(isMatched(board,word.charAt(n),i,j-1)) {
			ch = board[i][j-1] ;
			board[i][j-1]  = '@';
			flag = recursion(board, word, n+1, i, j-1);
			board[i][j-1] = ch;
			if(flag) {
				return true;
			}
		}
		
		if(isMatched(board,word.charAt(n),i,j+1)) {
			ch = board[i][j+1] ;
			board[i][j+1]  = '@';
			flag = recursion(board, word, n+1, i, j+1);
			board[i][j+1] = ch;
			if(flag) {
				return true;
			}
		}
		
		
		return false;
	}

	private static boolean isMatched(char[][] board, char ch, int i, int j) {
		// TODO Auto-generated method stub
		
		if( i>= 0 && j >=0 && i< board.length && j < board[i].length && ch == board[i][j]) {
			return true;
		}
		
		return false;
	}

	

}
