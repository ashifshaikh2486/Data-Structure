package stack.problem.solving;

public class CelebrityProblem {

	private static int[][] matrix = {{0,1,1,1},{0,0,0,1},{1,1,0,1},{0,0,0,0}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// O(n) TIme and 
		
		int celeb = 0;
		int n = 4;
		boolean flag = true;
		
		for (int i = 1; i < n; i++) {
			
			if(known(celeb,i) == 1) {
				celeb = i;
			}
			
		}
		
		for (int i = 0; i < n; i++) {
			
			if((i != celeb) && (known(celeb,i) == 1 || known(i,celeb) != 1 )) {
				flag = false;
				System.out.println("There is no celebrity");
				break;
			}
			
		}
		
		if(flag) {
			System.out.println(celeb + " is a calebrity");
		}
		
		
		
		
		
		
		//  O(n^2) TIme and O(1) Space
		
		
//		
//		for (int i = 0; i < arr.length; i++) {
//			flag = true;
//			for (int j = 0; j < arr[i].length; j++) {
//				if(i != j) {
//				if(!(arr[i][j] == 0 && arr[j][i] ==1)) {
//					flag = false;
//					break;
//				}
//				}
//			}
//			if(flag) {
//				System.out.println(i +" is a Celebrity");
//				break;
//			}
//			
//		}
//		
//		if(!flag) {
//			System.out.println("There is no Celebrity");
//		}
		
	}

	private static int known(int celeb, int i) {
		// TODO Auto-generated method stub
		return matrix[celeb][i];
	}

}
