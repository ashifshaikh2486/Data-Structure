import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter");
        String s = sc.nextLine();
        s.trim();
        
        String[] sa = s.split(" ");
       
        
        int[] ar = new int[sa.length];
        
        
        for(int i = 0 ;i < ar.length ; i++){
            ar[i] = Integer.parseInt(sa[i]);
            System.out.println(ar[i]);
        }
        
        int maincount = 0;
        
        for(int i=0; i< ar.length;i++){
            
            
            
            int j = i-1;
            int k = i+1;
            
            while(j>= 0 || k < ar.length) {
            	System.out.println(j + " "+ k);
            	boolean flag1 = false;
                boolean flag2 = false;
                
                boolean flag3 = false;
                boolean flag4 = false;
                
            while(j>=0){
                    if(ar[j]<ar[i]){
                        flag1 = true;
                        j--;
                        break;
                    }
                    if(ar[j]>ar[i]){
                        flag3 = true;
                        j--;
                        break;
                    }
                    j--;
            }
            
            while(k < ar.length){
                    if(ar[k]>ar[i]){
                        flag2 = true;
                        k++;
                        break;
                    }   
                    if(ar[k]<ar[i]){
                        flag4 = true;
                        k++;
                        break;
                    }
                    k++;
            }
            
            if(flag1 && flag2){
                maincount++;
            }
            if(flag3 && flag4){
                maincount++;
            }
           }
        }
        
        System.out.println(maincount);

	}

}
