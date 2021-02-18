package arrays.problem.solving;

public class GameOfLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };

		int rows = board.length;
		int cols = board[0].length;
		int[][] eight_neighbours = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 }, { -1, -1 }, { -1, 1 }, { 1, -1 },{ 1, 1 } };
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		int[][] copy_board = new int[rows][cols];
//
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				int live_neighbours = 0;
//
//				for (int k = 0; k < eight_neighbours.length; k++) {
//					int r = i + eight_neighbours[k][0];
//					int c = j + eight_neighbours[k][1];
//					if ((r >= 0 && r < rows) && (c >= 0 && c < cols) && (board[r][c] == 1)) {
//						live_neighbours++;
//					}
//				}
//
//				if ((board[i][j] == 1) && (live_neighbours < 2 || live_neighbours > 3)) {
//					copy_board[i][j] = 0;
//				}
//
//				if (board[i][j] == 0 && live_neighbours == 3) {
//					copy_board[i][j] = 1;
//				}
//			}
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(copy_board[i][j] + " ");
//			}
//			System.out.println();
//		}

		for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int live_neighbours = 0;
                for(int k=0;k<eight_neighbours.length;k++){
                    int r = i + eight_neighbours[k][0];
                    int c = j + eight_neighbours[k][1];
                    if(( r >= 0 && r < rows) && ( c >= 0 && c < cols ) && (Math.abs(board[r][c]) == 1)){
                        live_neighbours++;
                    }
                }
                
                if((board[i][j] == 1) && (live_neighbours < 2 || live_neighbours > 3)){
                    board[i][j] = -1;
                }else if(board[i][j] == 0 && live_neighbours == 3 ){
                    board[i][j] = 2;
                }
                 
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j] == -1){
                    board[i][j] = 0;
                }else if(board[i][j] == 2){
                    board[i][j] = 1;
                }
            }
        }
		
		
		
		System.out.println();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
