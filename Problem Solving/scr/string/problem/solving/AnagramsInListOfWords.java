package string.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramsInListOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ar = {"cat","act","tac","man","dog","nam"};
		
		List<Str> list = new ArrayList<Str>();
		
		
		for (int i = 0; i < ar.length; i++) {
			
			char[] temp = ar[i].toCharArray();
			Arrays.sort(temp);
			list.add(new Str(new String(temp),i));
			
		}
		
		Collections.sort(list);
		
		List<String> res = new ArrayList<String>();
		
		for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i).getStr().equals(list.get(i+1).getStr())) {
				
				if(res.contains(ar[list.get(i).getInd()])){
					res.add(ar[list.get(i+1).getInd()]);
				}else {
					res.add(ar[list.get(i).getInd()]);
					res.add(ar[list.get(i+1).getInd()]);
				}
				
			}
			
		}
		
		System.out.println(res.toString());
		
	}

}

class Str implements Comparable<Str>{
	String str ;
	int ind;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getInd() {
		return ind;
	}

	public void setInd(int ind) {
		this.ind = ind;
	}

	public Str(String str, int ind) {
		super();
		this.str = str;
		this.ind = ind;
	}

	@Override
	public int compareTo(Str s) {
		// TODO Auto-generated method stub
		return this.str.compareTo(s.getStr());
	}
	
	
}
