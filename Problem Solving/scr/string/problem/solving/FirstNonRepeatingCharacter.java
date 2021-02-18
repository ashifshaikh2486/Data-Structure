package string.problem.solving;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "abbadabcaa";
		 System.out.println(s);
//		Map<Character,Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}else {
//				map.put(ch, 1);
//			}
//		}
//		
//		
//		List<Character> list = new ArrayList<>();
//		
//		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
//			if(entry.getValue()==1) {
//				list.add(entry.getKey());
//			}
//		}
//		
//		
//		
//		for (int i = 0; i < s.length(); i++) {
//			boolean flag = false;
//			for (int j = 0; j < list.size(); j++) {
//				if(s.charAt(i) == list.get(j)) {
//					System.out.println(list.get(j));
//					flag = true;
//					break;
//				}
//			}
//			
//			if(flag) {
//				break;
//			}
//		}

//		Map<Character,Integer> m1 = new HashMap<Character, Integer>();
//		Map<Character,Integer> m2 = new HashMap<Character, Integer>();
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if(m1.containsKey(ch)) {
//				m1.put(ch, m1.get(ch)+1);
//			}else {
//				m1.put(ch, 1);
//			}
//			
//			if(! m2.containsKey(ch)) {
//				m2.put(ch,	 i);
//			}
//		}
//		
//		List<Character> list = new ArrayList<Character>();
//	
//		for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
//			if(entry.getValue()==1) {
//				list.add(entry.getKey());
//			}
//		}
//		
//		int min = s.length();
//		
//		for(int j=0;j<list.size();j++) {
//			if(min>m2.get(list.get(j))) {
//				min = m2.get(list.get(j));
//			}
//		}
//			
//		System.out.println(s.charAt(min));
//		

		// Using Single Map

//		Map<Character, Node> map = new HashMap<Character, Node>();
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (map.containsKey(ch)) {
//				Node n = map.get(ch);
//				n.setVal(n.getVal() + 1);
//				map.put(ch, n);
//			} else {
//				Node n = new Node(1, i);
//				map.put(ch, n);
//			}
//
//		}
//		
//		
//		int min = s.length();
//		
//		for(Map.Entry<Character, Node> entry : map.entrySet() ) {
//			
//			int val = entry.getValue().getVal();
//			int ind = entry.getValue().getInd();
//			
//			if(val == 1 && ind < min) {
//				min = ind;
//			}
//			
//		}
//		
//		System.out.println(s.charAt(min));

		
		
		
		
		
		
		
		// Using HashMap and LinkedLsit as Queue

		

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Character> queue = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (map.containsKey(ch)) {
				if (map.get(ch) == 1) {
					queue.remove(ch);
					map.put(ch, 0);
				}
			} else {
				map.put(ch, 1);
				queue.add(ch);
			}
		}

		System.out.println(queue.get(0));

	}

}

class Node {
	int val;
	int ind;

	public Node(int val, int ind) {
		this.val = val;
		this.ind = ind;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int getInd() {
		return ind;
	}

	public void setInd(int ind) {
		this.ind = ind;
	}

}