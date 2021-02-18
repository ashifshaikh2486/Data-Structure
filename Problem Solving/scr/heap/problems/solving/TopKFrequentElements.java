package heap.problems.solving;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] ar = {1,1,1,2,2,3};
		int k = 2;
		
		
		Map<Integer,Integer> hashMap =  new HashMap<>();
		
		for (int i = 0; i < ar.length; i++) {
			if(!hashMap.containsKey(ar[i])) {
				hashMap.put(ar[i], 1);
			}else {
				hashMap.put(ar[i], hashMap.get(ar[i])+1);
			}
		}
		
		
		
		// Using Heap Time (O(n) + O(klogn))
		
		Queue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((x,y)-> x.getValue() > y.getValue() ? -1 : x.getValue() < y.getValue() ? 1 : 0);
		
		for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			maxHeap.add(entry);
		}
		
		for(int i=0;i<k;i++) {
			System.out.print(maxHeap.remove().getKey()+" ");
		}
		
		
		// Using Sorting Time O(nlogn) 
		
//		List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashMap.entrySet());
//		
//		Collections.sort(list,(a,b) -> a.getValue() > b.getValue() ? -1 : a.getValue() < b.getValue() ? 1 : 0);
//		
//		for(int i=0;i<k;i++) {
//			System.out.print(list.get(i).getKey()+" ");
//		}
		
	}

}
