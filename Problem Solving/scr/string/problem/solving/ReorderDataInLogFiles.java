 package string.problem.solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReorderDataInLogFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] logs = {"dig1 8  5 1", "let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		
		List<String> digitLogs = new ArrayList<>() ;
		List<String> letterLogs = new ArrayList<String>();
		
		for (int i = 0; i < logs.length; i++) {
			try {
				Integer.parseInt(logs[i].split( " ")[1]);
				digitLogs.add(logs[i]);
			}catch (Exception e) {
				// TODO: handle exception
				letterLogs.add(logs[i]);
			}
		}
		
		System.out.println(digitLogs);
		System.out.println(letterLogs);
		
		for (int i = 0; i < letterLogs.size(); i++) {
						
			
		}
		
	}

}
