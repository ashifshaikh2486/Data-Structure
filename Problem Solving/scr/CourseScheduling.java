import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CourseScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Map<String,List<String>> map = new HashMap<>();
			
			List<String> l1 = new ArrayList<>();
			List<String> l2 = new ArrayList<>();
			List<String> l3 = new ArrayList<>();
			
			l3.add("CSC100");
			l3.add("CSC200");
			l2.add("CSC100");
			
			map.put("CSC300",l3);
			map.put("CSC200",l2);
			map.put("CSC100",l1);
			
			Set<String> visited= new HashSet<>();
			
			List<String> res = new ArrayList<>();
			
			
			for(Map.Entry<String, List<String>> entry : map.entrySet()) {
				String id = entry.getKey();
				
				if(!visited.contains(id)) {
					DFS(id,map,visited,res);
				}		
			}
			
			for(String course : res) {
				System.out.println(course);
			}
			
			
			
		
	}

	private static void DFS(String id, Map<String, List<String>> map, Set<String> visited, List<String> res) {
		// TODO Auto-generated method stub
		
		visited.add(id);
		
		if(map.get(id).isEmpty()) {
			res.add(id);
			return;
		}
		
		for(String course : map.get(id)) {
			if(!visited.contains(course)) {
				DFS(course,map,visited,res);
			}
		}
		
		res.add(id);
	}

	

}
