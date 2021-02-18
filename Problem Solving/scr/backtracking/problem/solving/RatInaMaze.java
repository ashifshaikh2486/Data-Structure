package backtracking.problem.solving;

public class RatInaMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] maze = {{1,0,1,1,1},{1,1,1,0,1},{1,0,0,1,1},{1,0,0,1,0},{1,0,0,1,1}};
		int[][] res = new int[maze.length][maze[0].length];
		
		
		display(maze);
		System.out.println("**************************");
		
		boolean flag = false;
		if(isSafe(0, 0, maze)) {
			if(solveMaze(maze, res, 0, 0, 'l')) {
				display(res);
				return;
			}
		}
		
		System.out.println("No Solution");
		
		
		
		

	

	}

	private static boolean solveMaze(int[][] maze, int[][] res, int i, int j, char ch) {
		// TODO Auto-generated method stub
		
		if(i==maze.length-1 && j == maze[i].length-1) {
			res[i][j] = 1;
			return true;
		}
		
		if(isSafe(i, j, maze)) {
			res[i][j] = 1;
			if(ch != 'u'  && solveMaze(maze, res, i+1, j, 'd')) {
				return true;
			}
			
			if(ch != 'd' && solveMaze(maze, res, i-1, j, 'u')) {
				return true;
			}
			
			if(ch != 'r'  && solveMaze(maze, res, i, j-1, 'l')) {
				return true;
			}
			
			if(ch != 'l'  && solveMaze(maze, res, i, j+1, 'r')) {
				return true;
			}
			res[i][j] = 0;
		}
		
		return false;
	}
	private static void display(int[][] res) {
		// TODO Auto-generated method stub
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static boolean isSafe(int i, int j, int[][] maze) {
		// TODO Auto-generated method stub
		
		if(i>=0 && i < maze.length && j>=0 && j<maze[0].length && maze[i][j]==1) {
			return true;
		}
		
		return false;
	}

}
