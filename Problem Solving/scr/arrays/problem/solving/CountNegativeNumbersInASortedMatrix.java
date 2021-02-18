package arrays.problem.solving;

public class CountNegativeNumbersInASortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
		
		int count = 0;
		
//		for(int i=0;i<grid.length;i++) {
//			for(int j=0;j<grid[i].length;j++) {
//				if(grid[i][j]<0) {
//					count++;
//				}
//			}
//		}
		
		int i = 0;
		int j = grid[i].length-1;
		
		while(i<grid.length && j>=0) {
			if(grid[i][j]<0) {
				count += grid.length-i;
				j--;
			}else {
				i++;
			}
		}
		
		
		System.out.println(count);
	}

}
