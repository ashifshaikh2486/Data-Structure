package graphs.problem.solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DirectionRulesVarifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  	test1();
		    test2();
		    test3();

	}
	
	  private static void test1() {
		    String[] rules = {"A N B",
		                      "C SE B",
		                      "C N A"};
		    System.out.println(validate(rules));
		  }

		  private static void test2() {
		    String[] rules = {"A NW B",
		                      "A N B"};
		    System.out.println(validate(rules));
		  }

		  private static void test3() {
		    String[] rules = {"A N B",
		                      "C N B"};
		    System.out.println(validate(rules));
		  }
		  
		  static class Node{
				
				char val;
				List<Set<Node>> edges = new ArrayList<>();
				
				Node(char val){
					this.val = val;
					for(int i=0;i<4;i++) {
						edges.add(new HashSet<Node>());
					}
				}
				
			}
	

		  public static final int N = 0;
		  public static final int E = 1;
		  public static final int S = 2;
		  public static final int W = 3;
		  
		  public static final int[] DIRS = {N,E,S,W};
		  public static final Map<Character, Integer> charToDir = new HashMap<>();
		  static {
			    charToDir.put('N', N);
			    charToDir.put('E', E);
			    charToDir.put('S', S);
			    charToDir.put('W', W);
			  }
		  
		  private static boolean validate(String[] rules) {
			// TODO Auto-generated method stub
			  Map<Character, Node> map = new HashMap<>();
			  
			  for(String line : rules) {
				  System.out.println("Rule -> " + line);
				  String[] rule = line.split(" ");
				  
				  char fromVal = rule[2].charAt(0);
				  char toVal = rule[0].charAt(0);
				  
				  if(!map.containsKey(fromVal)) {
					  map.put(fromVal, new Node(fromVal));
				  }
				  
				  if(!map.containsKey(toVal)) {
					  map.put(toVal, new Node(toVal));
				  }
				  
				  Node from = map.get(fromVal);
				  Node to = map.get(toVal);
				  
				  for(char dirChar : rule[1].toCharArray()) {
					  
					  int dir = charToDir.get(dirChar);
					  
					  if(! isValid(map,from,to,dir)) {
						  return false;
					  }
					  
					  addEdges(map,from,to,dir);
//					  System.out.println(from.edges.get(dir));
//				      System.out.println(to.edges.get(opposite(dir)));
				  }
				  
			  }
			  
			  
			return true;
		}

	

		private static boolean isValid(Map<Character, Node> map, Node from, Node to, int newDir) {
			// TODO Auto-generated method stub
			int oppositeDir = opposite(newDir);
			if(from.edges.get(oppositeDir).contains(to)) {
				return false;
			}
			return true;
			
		}

		private static int opposite(int newDir) {
			// TODO Auto-generated method stub
			return (newDir+2)%4;
		}
		
		private static void addEdges(Map<Character, Node> map, Node from, Node to, int newDir) {
			// TODO Auto-generated method stub
			
			int oppositeDir = opposite(newDir);
			
			from.edges.get(newDir).add(to);
			to.edges.get(oppositeDir).add(from);
			
			for(int dir : DIRS) {
				
				if(dir == newDir) {
					continue;
				}
				
				for(Node neighbour : from.edges.get(dir)) {
					
					if(neighbour == to) {
						continue;
					}
					neighbour.edges.get(newDir).add(to);
					to.edges.get(oppositeDir).add(neighbour);
				}
				
			}
			
			
		}

		  
}




