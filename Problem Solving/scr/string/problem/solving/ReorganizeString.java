package string.problem.solving;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReorganizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  S = "abaab";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i =0;i<S.length();i++) {
			if(map.containsKey(S.charAt(i))) {
				map.put(S.charAt(i), map.get(S.charAt(i))+1);
			}else {
				map.put(S.charAt(i), 1);
			}
		}
		
		int maxCount = 0;
		
		for(Map.Entry<Character, Integer> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" "+entry.getValue());
			Integer value =  entry.getValue();
			if(maxCount < value) {
				maxCount = value;;
			}
		}
		
		if(maxCount>(S.length()+1)/2) {
			System.out.println("");
		}
		
		List<Map.Entry<Character,Integer>>  list = new LinkedList<>(map.entrySet());
		
		Collections.sort(list, (x,y)-> x.getValue() > y.getValue() ? -1 : x.getValue() < y.getValue() ? 1 : 0 );
		
		char[] ar = new char[S.length()];
		
		System.out.println(list.get(0).getKey() + " "+ list.get(0).getValue());;
		System.out.println(list.get(1).getKey() + " "+ list.get(1).getValue());
		
		int i =0 ;
		int j=0;
		int k = 0;
		while(i<ar.length) {
			
			if(j< list.size() && k < list.get(j).getValue()) {
				System.out.print(list.get(j).getKey()+" ");
				ar[i] = list.get(j).getKey();
				k++;
			}else {
				k=0;
				j++;
			}
			i+=2;
		}
		
		i=1;	
		while(i<list.size()) {
			if(j< list.size() && k < list.get(j).getValue()) {
				System.out.print(list.get(j).getKey()+" ");
				ar[i] = list.get(j).getKey();
				k++;
			}else {
				k=0;
				j++;
			}
			i+=2;
		}
		
//		System.out.println(new String(ar));

	}

}
