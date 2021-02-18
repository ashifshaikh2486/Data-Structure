import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		Integer [] I = {4,6,8};
		
		Set<Integer> set1 = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			set1.add(i);
		}
		
		Set<Integer> set2 = new HashSet<>(Arrays.asList(I));
		
		set1.removeAll(set2);
		
		List<Integer> list = new ArrayList<>(set1);
		
		Random rand = new Random();
		
		int i = rand.nextInt(list.size());
		System.out.println(list.get(i));

	}

}
