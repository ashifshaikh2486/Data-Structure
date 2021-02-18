package stack.problem.solving;

public class PrintTheNextGreaterElementForEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 15, 12, 16, 2, 1, 0, 7, 8 };
		boolean flag;

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
		
		// O(n^2) TIme and O(1) Space

//		for (int i = 0; i < ar.length; i++) {
//			flag = false;
//			for (int j = i+1; j < ar.length; j++) {
//				
//				if(ar[i] <ar[j]) {
//					System.out.println("The next greater element of " + ar[i ]+ " is " +ar[j]);
//					flag = true;
//					break;
//				}
//			}
//			if(! flag) {
//				System.out.println("There is no greter element of "+ar[i]);
//			}
//			
//		}

		// Using stack O(n) TIme and O(n) Space

		LinkedLinkStack st = new LinkedLinkStack();

		

		for (int i = 0; i < ar.length; i++) {

			if (st.getTop() == null) {
				st.push(ar[i]);
			} else {
				if (ar[i] <= st.getTop().getData()) {
					st.push(ar[i]);
				} else {
					while (st.getTop() != null && st.getTop().getData() <= ar[i]) {
						
						System.out.println("The next greater element of " + st.pop() + " is " + ar[i]);
					}
					st.push(ar[i]);
				}
			}

		}
		
		while(st.getTop() != null) {
			System.out.println("There is no next gretaer element for "+st.pop());
		}

	}

}
