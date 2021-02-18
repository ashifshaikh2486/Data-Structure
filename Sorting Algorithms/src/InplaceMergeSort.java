import java.util.Scanner;

public class InplaceMergeSort {

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
		
		InplaceMergeSort m = new InplaceMergeSort();
		m.mergeSort(ar, 0, ar.length - 1);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	private void mergeSort(int[] ar, int l, int r) {
		if (l < r) {
			int mid = r + l / 2;
			mergeSort(ar, l, mid);
			mergeSort(ar, mid + 1, r);
			merge(ar, l, mid, r);
		}

	}

	private void merge(int[] ar, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int s1 = l;
		int s2 = mid+1;
		
		while(s1<=mid && s2 <=r) {
			if(ar[mid]<ar[s2]) {
				return;
			}
		if(ar[s1]<ar[s2]) {
			s1++;
		}else {
			int index = s2;
			int value = ar[index];
			while(index > s1) {
				ar[index] = ar[index-1];
				index--;
			}
			ar[index] = value;
		}
			
		}
		

	}

}
