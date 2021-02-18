package graphs.problem.solving;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
		int res = orangesRotting(grid);
		System.out.println(res);
		
	}
	
public static int orangesRotting(int[][] grid) {
        
        Queue<int[]> queue = new ArrayDeque<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    int[] ar = new int[2];
                    ar[0]=i;
                    ar[1]=j;
                    queue.add(ar);
                }
            }
        }
        // System.out.println()
        if(queue.size() == 0){
            return -1;
        }
        
        int time = 0;
        
        while(!queue.isEmpty()){
            System.out.println(queue.size());
            int len = queue.size();
            for(int i=0;i<len;i++){
                int[] ar = queue.remove();
                System.out.println(ar[0]+","+ar[1]);
                getRottingOranges(grid,queue,ar[0],ar[1]);    
            }
          
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                 if(grid[i][j] == 1){
                	 return -1;
                 }
            }
        }
        
        return time-1;
        
    }
    
    public static  void getRottingOranges(int[][] grid,Queue<int[]> queue,int i,int j){
        
        if(i-1 >= 0 && grid[i-1][j]==1 ){
        	int[] ar = new int[2];
            ar[0]=i-1;
            ar[1]=j;
        	grid[i-1][j] = 2;
            queue.add(ar);
        }
        
        if( i+1 < grid.length && grid[i+1][j]==1 ){
        	int[] ar = new int[2];
            ar[0]=i+1;
            ar[1]=j;
            grid[i+1][j] = 2;
            queue.add(ar);
        }
        
        if(j-1 >= 0 && grid[i][j-1]==1 ){
        	int[] ar = new int[2];
            ar[0]=i;
            ar[1]=j-1;
            grid[i][j-1] = 2;
            queue.add(ar);
        }
        
        if( j+1 < grid[i].length && grid[i][j+1]==1 ){
        	int[] ar = new int[2];
            ar[0]=i;
            ar[1]=j+1;
        	grid[i][j+1] = 2;
            queue.add(ar);
        }
        
        
        
    }
	
}
