import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of elements : ");
		int num = sc.nextInt();

		int[] ar = new int[num];

		System.out.println("Enter " + num + " elements between only 0 to 5 : ");
		for (int i = 0; i < num; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		int k = 5;
		
		int[] B = new int[ar.length];
		int[] C = new int[k+1];
		
		for(int i=0;i<ar.length;i++) {
			C[ar[i]] = C[ar[i]] + 1;
		}
		
			
		C[0] = C[0] -1;
		
		for(int j=1;j<C.length;j++) {
			C[j] = C[j]+C[j-1];
		}
		
		
		
		for(int i=ar.length-1;i>=0;i--) {
			B[C[ar[i]]] = ar[i];
			C[ar[i]] = C[ar[i]] - 1;
		}

		System.out.println();
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}

	}

}
