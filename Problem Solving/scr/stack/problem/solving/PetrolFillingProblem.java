package stack.problem.solving;

public class PetrolFillingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] fuelOnStation = {4,6,7,4};
		int[] distance = {6,5,3,5};
		
		
		
		
		// Time O(n^2) and Space O(1)
		
//		int i =0 ;
//		boolean flag = false ;
//		
//		while(i < 5){
//			int fuel = 0;
//			flag = false;
//			if(fuelOnStation[i] >= distance[i])  {
//				fuel = fuelOnStation[i] - distance[i];
//				int j = i+1;
//				while(fuel >= 0 && j != i ) {
//					fuel = fuel + fuelOnStation[j%5] - distance[j%5] ;
//					j = (j+1) % 5;
//				}
//				if(j == i && fuel >=0) {
//					flag = true;
//					break;
//				}
//			}
//			i++;
//			
//		}
//		
//		System.out.println(flag);

		
		
		
		
		// Time O(n) and Space O(1) 
		// Using the info like lack of fuel per station to cross next station of extra fuel per station when you reached at that station
		
		
		int sum = 0;
		int diff = 0;
		int start = 0;
		
		for (int i = 0; i < n; i++) {
			
			sum += fuelOnStation[i] - distance[i];
			
			if(sum < 0) {
				start = i+1;
				diff += sum;
				sum = 0;
			}
			
		}
		
		if(sum+diff >= 0) {
			System.out.println(true);
			System.out.println("Starting station is " + (start+1));
		}else {
			start = -1;
			System.out.println(false);
		}
		
		
	}

}
