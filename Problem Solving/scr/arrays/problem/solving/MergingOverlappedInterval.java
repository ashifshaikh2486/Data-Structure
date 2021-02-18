package arrays.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingOverlappedInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] ar = {{0,2},{1,5},{8,9},{6,10}};
		
//		for (int i = 0; i < ar.length; i++) {
//			int s1 = ar[i][0];
//			int e1 = ar[i][1];
//			
//			for (int j = i+1; j < ar.length; j++) {
//					int s2 = ar[j][0];
//					int e2 = ar[j][1];
//					
//					if(s1 <= s2 && s2 <= e1) {
//						System.out.println("( "+s1+" ,"+Integer.max(e1, e2)+" )" );
//					}else if(s1 >= s2 && s1 <= e2) {
//						System.out.println("( "+s2+" ,"+Integer.max(e1, e2)+" )" );
//					}	
//			}	
//		}
		
		
		Arrays.sort(ar,(x,y)->Integer.compare(x[0], y[0]));
		List<int[]> res = new ArrayList<>();
		int[] temp = ar[0];
		
		int i=1;
		while(i<ar.length) {
			int s1 = temp[0];
			int e1 = temp[1];
			int s2 = ar[i][0];
			int e2 = ar[i][1];
			
			if(s2<=e1) {
				temp[1] = Math.max(e1, e2);
			}else {
				res.add(temp);
				temp = ar[i];
			}
			i++;
		}
		
		res.add(temp);
		
		System.out.print("{");
		for(int[] a : res) {
			System.out.print("(" + a[0] +", " + a[1] +"), ");
		}
		System.out.print("}");
	}

}
