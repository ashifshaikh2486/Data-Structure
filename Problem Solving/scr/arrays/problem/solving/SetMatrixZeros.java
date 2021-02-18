package arrays.problem.solving;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,1,1}, {1,0,1}, {1,1,1}};
		
//		List<int[]> list = new LinkedList<>();
//			
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//				if(arr[i][j]==0) {
//					int[] ar = {i,j};
//					list.add(ar);
//				}
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			int[] ar = list.get(i);
//			
//			for(int j =0;j<arr.length;j++) {
//				arr[ar[0]][j] = 0;
//			}
//			
//			for(int j =0;j<arr[0].length;j++) {
//				arr[j][ar[1]] = 0;
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		Set<Integer> row = new HashSet<>();
//		Set<Integer> col = new HashSet<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//				if(arr[i][j]==0) {
//					row.add(i);
//					col.add(j);
//				}
//			}
//			System.out.println();
//		}
//
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(row.contains(i) || col.contains(j)) {
//					arr[i][j] = 0;
//				}
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		boolean row_flag = false;
        boolean col_flag = false;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            	System.out.print(arr[i][j]);
                if(i==0 && arr[i][j]==0){
                    row_flag = true;
                }
                
                if(j==0 && arr[i][j]==0){
                    col_flag = true;
                }
                
                if(arr[i][j]==0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
                
            }
            System.out.println();
        }
        
        
        
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[0][j]==0 || arr[i][0]==0){
                    arr[i][j]=0;
                }
            } 
        }
        
        if(row_flag){
            for(int i=0;i<arr[0].length;i++){
                arr[0][i]=0;
            }
        }
        
        if(col_flag){
            for(int i=0;i<arr.length;i++){
                arr[i][0]=0;
            }
        }

	    System.out.println();
	    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println();
        }

        
	}

}