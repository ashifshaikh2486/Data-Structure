package string.problem.solving;

public class ReverseTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I love algorithms";
		
		
//		char[] ar = s.toCharArray();
//		
//		int i = 0;
//		int l = 0;
//		
//		while(i < ar.length) {
//			if(i == ar.length-1) {
//				reverse(ar,l,i);
//			}
//			if(ar[i] == ' ') {
//				reverse(ar,l,i-1);
//				i++;
//				l = i;
//			}
//			i++;
//		}
//		
//		reverse(ar,0,ar.length-1);
//		
//		s = new String(ar);

		
		String ar[] = s.split(" ");
		s = "";
		
		int i = ar.length-1;
		while(i > 0) {
			s += ar[i]+" ";
			i--;
		}
		s += ar[i];
		
		System.out.println(s);
		
		
//		System.out.println(s);
		

	}

	private static void reverse(char[] ar, int l, int i) {
		// TODO Auto-generated method stub
		
		while(l < i) {
			char temp = ar[l];
			ar[l] = ar[i];
			ar[i] = temp;
			l++;
			i--;
		}
		
	}

	
		

}
