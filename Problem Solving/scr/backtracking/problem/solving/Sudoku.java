package backtracking.problem.solving;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		
		int[][] board = {{7,8,0,4,0,0,1,2,0},{6,0,0,0,7,5,0,0,9},{0,0,0,6,0,1,0,7,8},{0,0,7,0,4,0,2,6,0},{0,0,1,0,5,0,9,3,0},{9,0,4,0,6,0,0,0,5},{0,7,0,3,0,0,0,1,2},{1,2,0,0,0,7,4,0,0},{0,4,9
			,2,0,6,0,0,7}};
		
		display(board);
		List<int[]> listOfEmptySell = findEmpty(board);
		
		boolean flag = solveSudoku(board,listOfEmptySell,0);
		
		System.out.println("************************************");
		
		if(flag) {
			display(board);
		}
		

	}

	private static boolean solveSudoku(int[][] board, List<int[]> list, int n) {
		// TODO Auto-generated method stub
		if(n== list.size()) {
			return true;
		}
		
		int[] pos = list.get(n);
		for(int num=1;num<=board.length;num++) {
			if(isValid(board,num,pos)) {
				board[pos[0]][pos[1]] = num;
				if(solveSudoku(board, list, n+1)) {
					return true;
				}
				board[pos[0]][pos[1]] = 0;
			}
			
		}
		
		return false;
	}

	private static boolean isValid(int[][] board, int num, int[] pos) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<board.length;i++) {
			if(board[pos[0]][i] == num || board[i][pos[1]] == num) {
				return false;
			}
		}
		
		int x_box = pos[0]/3;
		int y_box = pos[1]/3;
		
		for(int x=x_box*3 ; x<x_box*3+3;x++) {
			for(int y =y_box*3;y<y_box*3+3;y++) {
				if(board[x][y]==num) {
					return false;
				}
			}
		}
		
		return true;
	}

	private static List<int[]> findEmpty(int[][] board) {
		// TODO Auto-generated method stub
		List<int[]> list = new ArrayList<>();
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j] == 0) {
					int[] pos = {i,j};
					list.add(pos);
				}
			}
		}
		
		return list;
	}

	private static void display(int[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<board.length;i++) {
			if(i%3 == 0 && i != 0) {
				System.out.println("- - - - - - - - - - - - - - - -");
			}
			for(int j=0;j<board[i].length;j++) {
				if(j%3 == 0 && j != 0) {
					System.out.print("|"+"  ");
				}
				System.out.print(board[i][j]+"  ");
			}
			System.out.println("");
			
		}
		System.out.println("- - - - - - - - - - - - - - - -");
	}

}
