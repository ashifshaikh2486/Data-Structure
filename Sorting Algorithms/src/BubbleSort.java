import java.util.Scanner;

public class BubbleSort {

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

		System.out.println();
		
		boolean flage = true;
		
		for(int i=0;i<ar.length-1;i++) {
			if(!flage) {
				break;
			}
			
			flage = false;
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flage = true;
				}
			}
			
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}


	}

}
