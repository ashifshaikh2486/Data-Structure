package heap.problems.solving;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int k = 2;
		
		// Using Sorting Time O(nlogn)
//		List<Points> list = new ArrayList<Points>();
//		for (int i = 0; i < points.length; i++) {
//			Points point = new Points(points[i]);
//			list.add(point);
//		}
//		for(int i=0;i<list.size();i++) {
//			System.out.print("["+list.get(i).ar[0]+", "+list.get(i).ar[1]+"]"+" "+list.get(i).dist+" ");
//			
//		}
//		System.out.println();
//		
//		Collections.sort(list);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.print("["+list.get(i).ar[0]+", "+list.get(i).ar[1]+"]"+" "+list.get(i).dist+" ");
//			
//		}
		
		
		// Using Heap TIme O(nlogk) Space O(k)
		
		Queue<Points> minHeap = new PriorityQueue<>((p,q) ->  p.dist >q.dist ? -1 : p.dist < q.dist ? 1 : 0 );
		int i = 0;
		while(i<k) {
			minHeap.add(new Points(points[i]));
			i++;
		}
		
		System.out.println(minHeap.peek().dist);
		
		while(i<points.length) {
			Points temp = new Points(points[i]);
			if(minHeap.peek().dist >  temp.dist) {
				minHeap.remove();
				minHeap.add(temp);
			}
			
			i++;
		}
		

		while(!minHeap.isEmpty()) {
			Points point = minHeap.remove();
			System.out.print("["+point.ar[0]+", "+point.ar[1]+"]"+" "+point.dist+" ");
		}
		
	}

}


class Points implements Comparable<Points>{
    int[] ar ;
    int dist ;
    
    Points(int[]ar){
    	this.ar  = ar;
    	this.dist =(int)(Math.pow(this.ar[0],2) + Math.pow(this.ar[1],2));
    }
	
	@Override
	public int compareTo(Points o) {
		// TODO Auto-generated method stub
		if(this.dist > o.dist) {
			return -1;
		}else if(this.dist < o.dist) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
