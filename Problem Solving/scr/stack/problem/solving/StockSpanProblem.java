package stack.problem.solving;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {100,80,60,70,60,75,85,110};
		int[] span = new int[ar.length];
		
		
		
		// O(n^2) Time and O(1) space
		
		
		
//		for (int i = 0; i < ar.length; i++) {
//			int count = 1;
//			for (int j = i-1; j >= 0; j--) {
//				if(ar[j] < ar[i]) {
//					count++;
//				}else {
//					break;
//				}
//			}
//			span[i] = count;
//		}
//		
//		for (int i = 0; i < span.length; i++) {
//			System.out.println(ar[i]+" "+span[i]);
//		}
		
		
		
		
		// Using stack O(n) Time and O(n) Space

		
		LinkedLinkStack st = new LinkedLinkStack();
		
		st.push(0);
		span[0] = 1;
		
		for (int i = 1; i < ar.length; i++) {
			
			if(ar[i] < ar[st.getTop().getData()]) {
				span[i] = i -st.getTop().getData();
				st.push(i);
			}else {
				while(st.getTop() != null && ar[i] > ar[st.getTop().getData()]) {
						st.pop();
				}
				
				if(st.getTop() == null) {
					span[i] = i+1;
				}else {
					span[i] = i - st.getTop().getData();
				}
				st.push(i);
			}
			
		}
		
		
		for (int i = 0; i < span.length; i++) {
			System.out.println(ar[i]+" "+span[i]);
		}
		
	}

}
