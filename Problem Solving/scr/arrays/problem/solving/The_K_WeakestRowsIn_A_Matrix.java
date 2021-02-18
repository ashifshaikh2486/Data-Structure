package arrays.problem.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class The_K_WeakestRowsIn_A_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] mat = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
			int k = 3;
			
	
//			List<List<Integer>> list = new ArrayList<>();
//			
//			for(int i=0;i<mat.length;i++) {
//				int count = 0;
//				for(int j=0;j<mat[i].length;j++) {
//					count += mat[i][j];
//				}
//				List<Integer> l = new ArrayList<>();
//				l.add(count);
//				l.add(i);
//				list.add(l);
//			}
//			
//			list.sort((l1,l2) -> (l1.get(0) > l2.get(0)) ? 1 : (l1.get(0) < l2.get(0)) ? -1 : 0);
//			
//			int[] ar = new int[k];
//			for(int i = 0;i<k;i++) {
//				ar[i] = list.get(i).get(1);
//				System.out.print(ar[i]+" ");
//			}
			
			
			
			// Using Binary Search
			
//			List<List<Integer>> list = new ArrayList<>();
//			
//			for(int i=0;i<mat.length;i++) {
//				List<Integer> l = new ArrayList<>();
//				l.add(binarySearch(mat[i]));
//				l.add(i);
//				System.out.println(l);
//				list.add(l);
//			}
//			
//			list.sort((l1,l2) -> (l1.get(0) > l2.get(0)) ? 1 : (l1.get(0) < l2.get(0)) ? -1 : 0);
//			
//			int[] ar = new int[k];
//			for(int i = 0;i<k;i++) {
//				ar[i] = list.get(i).get(1);
//				System.out.print(ar[i]+" ");
//			}
			
			
			Queue< List<Integer>> pq = new PriorityQueue<List<Integer>>((x,y) -> (y.get(0) >  x.get(0)) ? 1 : (y.get(0) <  x.get(0)) ? -1 : (y.get(1) >  x.get(1)) ? 1 : (y.get(1) <  x.get(1)) ? -1 : 0 );
			
			for(int i=0;i<k;i++) {
				List<Integer> l = new ArrayList<>();
				l.add(binarySearch(mat[i]));
				l.add(i);
				System.out.println(l);
				pq.add(l);
			}
			
			for(int i=k;i<mat.length;i++) {
				List<Integer> l = new ArrayList<>();
				l.add(binarySearch(mat[i]));
				l.add(i);
				System.out.println(l);
				if(l.get(0) < pq.peek().get(0) || (l.get(0) == pq.peek().get(0) && l.get(1) < pq.peek().get(1))) {
					pq.remove();
					pq.add(l);
					
				}
				
			}
			
//			List<List<Integer>> list = new ArrayList(pq);
//			
//			list.sort((l1,l2) -> (l1.get(0) > l2.get(0)) ? 1 : (l1.get(0) < l2.get(0)) ? -1 : 0);
			
			int[] ar = new int[k];
			for(int i = k-1;i>=0;i--) {
				ar[i] = pq.remove().get(1);
			}
			
			for(int i = 0;i<k;i++) {
				System.out.print(ar[i] + " ");
			}

			
			
	}

	private static Integer binarySearch(int[] ar) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = ar.length-1;
		
		while(low<high) {
			int mid = low + (high-low)/2;
			if(ar[mid] == 1) {
				low = mid+1;
			}else {
				high = mid;
			}
		}
		return low;
	}

}
