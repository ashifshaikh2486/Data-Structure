package arrays.problem.solving;

public class RotateMetrixBy90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(i != j) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int j = 0; j < arr.length; j++) {
			int m = arr.length/2;
			for (int i = 0; i <= m; i++) {
				int temp = arr[i][j];
				arr[i][j] = arr[arr.length-1-i][j];
				arr[arr.length-1-i][j] = temp;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

//1 2 3		3 6 9
//4 5 6		2 5 8
//7 8 9		1 4 7