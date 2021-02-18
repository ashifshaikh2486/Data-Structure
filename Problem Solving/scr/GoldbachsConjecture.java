
public class GoldbachsConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9990;
		
		for(int i=2;i<n;i++) {
			if(isPrime(i) && isPrime(n-i)) {
				System.out.println(i+" "+(n-i));
				break;
			}
		}
		
		

	}
	
	public static  boolean isPrime(int n) {
		int i = (int)Math.ceil(Math.sqrt(n));
		
		while(i>1) {
			if(n%i == 0) {
				return false;
			}
			i--;
		}
		
		return true;
	}

}
