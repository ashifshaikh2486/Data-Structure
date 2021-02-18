import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No of elements : ");
		int num = sc.nextInt();

		int[] ar = new int[num];

		System.out.println("Enter " + num + "elements : ");
		for (int i = 0; i < num; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		
		for(int i=0;i<ar.length-1;i++) {
			int iMin = i;
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[iMin]>ar[j]) {
					iMin = j;
				}
			}
			
			if(iMin != i) {
				int temp = ar[iMin];
				ar[iMin] = ar[i];
				ar[i] = temp;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}


	}

}
