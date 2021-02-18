import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of elements : ");
		int num = sc.nextInt();
		
		int[] ar = new int[num];
		
		System.out.println("Enter " + num + " elements : ");
		for(int i=0; i<num;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		
		for(int i=1;i<ar.length;i++) {
			
			int j = i-1;
			int temp = ar[i];
			while(j>=0 && temp<ar[j]) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = temp;
			
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
