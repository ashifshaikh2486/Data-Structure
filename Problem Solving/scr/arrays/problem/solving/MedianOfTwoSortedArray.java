package arrays.problem.solving;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 5, 6, 7, 8, 9, 11,12};
		int[] b = { 1, 4, 6, 8, 12, 14, 15, 17 };

		// Time O(n+m) space O(n+m)

		int n = a.length;
		int m = b.length;

//		int[] c = new int[n + m];
//
//		int i = 0;
//		int j = 0;
//		int k = 0;
//
//		while (i < n && j < m) {
//			if (a[i] <= b[j]) {
//				c[k] = a[i];
//				i++;
//			} else {
//				c[k] = b[j];
//				j++;
//			}
//			k++;
//		}
//
//		while (i < n) {
//			c[k] = a[i];
//			i++;
//			k++;
//		}
//		while (j < m) {
//			c[k] = b[j];
//			j++;
//			k++;
//		}
//
//		if(c.length%2==0) {
//			int mid = c.length/2;
//			System.out.println((c[mid]+c[mid-1])/2.0);
//			
//		}else  {
//			System.out.println(c[c.length/2]);
//		}

		// TIme O(n+m) space O(1)

//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int mid = (n + m) / 2;
//		int x=0, y=0;
//
//		while (i < n && j < m) {
//			if (a[i] <= b[j]) {
//				if (k == mid - 1) {
//					x = a[i];
//				}
//				if (k == mid) {
//					y = a[i];
//					break;
//				}
//				i++;
//			} else {
//				if (k == mid - 1) {
//					x = b[j];
//				}
//				if (k == mid) {
//					y = b[j];
//					break;
//				}
//				j++;
//			}
//			k++;
//		}
//		
//		while(i < a.length) {
//			if (k == mid - 1) {
//				x = a[i];
//			}
//			if (k == mid) {
//				y = a[i];
//				break;
//			}
//			i++;
//			k++;
//		}
//		
//		while(j<b.length) {
//			if (k == mid - 1) {
//				x = b[j];
//			}
//			if (k == mid) {
//				y = b[j];
//				break;
//			}
//			j++;
//			k++;
//		}
//		
//		System.out.println(x+" "+y);
//		
//		if((n+m)%2==0) {
//			System.out.println((x+y)/2.0);
//		}else {
//			System.out.println(y);
//		}

		// Time O(logn) using Binary Search (Need to work on this)
		float res;
		if (n <=  m) {
			res = findMedianOfSortedArrays(a, n, b, m);
		} else {
			res = findMedianOfSortedArrays(b, m, a, n);
		}

		System.out.println(res);

	}

	private static float findMedianOfSortedArrays(int[] a, int n, int[] b, int m) {
		// TODO Auto-generated method stub
		int min_index = 0;
		int max_index = n-1;
		int m1=0;
		int m2 =0;
		
		while(min_index <= max_index) {
			
			int i = (min_index + max_index)/2;
			int j = (m+n-4)/2 - i;
			
		
			if( i<n-1 && j>0 && a[i+1]<b[j]) {
				min_index = i+1;
			}else if(i>0 && j<m-1 && a[i] > b[j+1]) {
				max_index = i-1;
			}else {
				if(i==0) {
					m1 = b[j];
					m2 = a[i]>b[j+1] ? a[i] : b[j+1]; 
					break;
				}else if(i==n-1){
					m1 = a[i]>=b[j] ? a[i] : b[j];
					m2 = b[j+1];
				}else {
					m1 = a[i]>=b[j]  ? a[i] : b[j];
					m2 = a[i+1] <=b[j+1] ? a[i+1] : b[j+1];
					break;
				}
			}
		}
		if ((m+n)%2==0) {
			return (float)((m1+m2)/2.0);
		}else {
			return (float)m2;
		}
		
	}

}
