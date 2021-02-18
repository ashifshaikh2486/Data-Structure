import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)){
		
		System.out.println("Enter the No of elements : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = i-j;
				sum += arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(sum);
		
		System.out.println("--------------");
		
		int[] ar = {1,2,3,4,5};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		reverse(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
		}

	}
	
	private static void reverse(int ar[]) {
		int n = ar.length;
		for(int i=0;i<n/2;i++) {
			int temp = ar[i];
			ar[i] = ar[n-1-i];
			ar[n-1-i] = temp;
		}
		
	}

}
