import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(rotateString("clrwmpkwru", "wmpkwruclr"));
		
		
		
//		List<int[]> list = new ArrayList<>();
//		int[] ar = {1,3};
//		list.add(ar);
//		int[] br = {2,1};
//		list.add(br);
//		
//		list.forEach(a-> System.out.println(a[0]+" "+a[1]));
//		
//		Collections.sort(list,( x,y) -> x[1] < y[1] ? -1 : 1);
//		
//		System.out.println();
//		
//		list.forEach(a-> System.out.println(a[0]+" "+a[1]));
			
//			String S = "DID";
//		 	int n = S.length();
//	        int[] ar = new int[n+1];
//	        for(int i=0;i<ar.length;i++){
//	            ar[i] = i;
//	        }
//	        
//	        int res =  permutations(S,ar,1,ar.length);
//	        System.out.println(res);
//		
		
//		System.out.println(reverseWords("a good   example"));
		
		
		int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		
		int n  = intervals.length;
        
        Arrays.sort(intervals,(x,y) -> x[0] - y[0]);

        
        for(int i=0;i<n;i++) {
        	System.out.print("{");
        	for(int j=0;j<2;j++) {
        		System.out.print(intervals[i][j] +", ");
        	}
        	System.out.print("},");
        }
		

	}
	
	
	public static  String reverseWords(String s) {
        s = s.trim();
        
        StringBuilder sb = new StringBuilder();
        
        List<String> wordlist = new ArrayList<>();
        
        int n = s.length();
        int i = 0;
        
        while(i<n) {
        	while(s.charAt(i) == ' ') {
        		i++;
        	}
           int 	j = i+1;
        	
        	while(j<n && s.charAt(j) != ' ') {
        		j++;
        	}
        	
        	wordlist.add(s.substring(i, j));
        	i = j+1;
        	
        }
        
        System.out.println(wordlist.toString());
        
        
        String[] strs = s.split(" ");
        
        for(i=0;i<wordlist.size();i++){    
            sb.append(reverseString(wordlist.get(i)).append(" "));
        }
        
        sb.delete(sb.length()-1,sb.length());
        
        return reverseString(sb.toString()).toString();
        
    
    }
    
    public static StringBuilder reverseString(String s){
        
        return new StringBuilder(s).reverse();
    }
	
	
	  public static  int permutations(String s,int[] ar, int l, int r){
	        if(l==r){
	            return 1;
	        }else{
	            int sum = 0;
	            for(int i=l-1;i<r;i++){
	                int temp = ar[l-1];
	                ar[l-1] = ar[i];
	                ar[i] = temp;
	                if(s.charAt(l-1) == 'D' && ar[l-1]>ar[l]){
	                    sum += permutations(s,ar,l+1,r);
	                }else if(s.charAt(l-1) == 'I' && ar[l-1] < ar[l]){
	                    sum += permutations(s,ar,l+1,r);
	                }
	                
	                
	                temp = ar[l-1];
	                ar[l-1] = ar[i];
	                ar[i] = temp;
	                
	            }
	            return sum;
	        }
	    }

	  
	  public static boolean rotateString(String A, String B) {
	        
	        int n = A.length();
	        int m = B.length();
	        
	        if(m != n){
	            return false;
	        }
	        
	        
	        int j = -1;
	        
	        for(int i=0;i<n;i++){
	            if(A.charAt(i) == B.charAt(0)){
	                j = i;
	            }
	        }
	        
	        if(j==-1){
	            return false;
	        }
	        
	        for(int i=0;i<m;i++){
	            if(A.charAt(j%n) != B.charAt(i)){
	                return false;
	            }
	            j++;
	        }
	        return true;
	           
	    }
	  

	  
	  
	  
}



