
public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {3,2,1,0,44};
		int n = ar.length;
//		System.out.println(canJump(ar,0));
		
		if(n==1) {
			System.out.println(true);
			return;
		}
		
		int i =  0;
		
		while(i<n-1) {
			if(ar[i]+i >= n-1) {
				System.out.println(true);
				break;
			}
			i++;
		}
		
		if(i==n-1) {
			System.out.println(false);
		}
		

	}
	
	
	public static boolean canJump(int[] ar, int n) {
		
		if(n==ar.length-1) {
			return true;
		}
		
		if(n > ar.length-1) {
			return false;
		}
		
		int i=1;
		while( i<=ar[n]) {
			if(canJump(ar,n+i)) {
				return true;
			}
			i++;
		}
		
		return false;
		
	}
	

}
