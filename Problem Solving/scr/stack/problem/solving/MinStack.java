package stack.problem.solving;

class MinStack {

    SNode top;
    int min;
    int prev_min = 0;
    /** initialize your data structure here. */
    public MinStack() {
        this.top = null;
        this.min = Integer.MIN_VALUE;
    }
    
    public void push(int x) {
        if(top == null){
            top = new SNode(x);
            min = x;
        }else{
        		if(x != Integer.MIN_VALUE && x<min){
                    SNode newNode = new SNode(2*x-min);
                    min = x;
                    newNode.next = top;
                    top = newNode;
                }else{
                	if(x == Integer.MIN_VALUE) {
                		prev_min = min;
                		min = x;
                	}
                    SNode newNode = new SNode(x);
                    newNode.next = top;
                    top = newNode;
                  
                }
        	
        	
            
        }
        
        
    }
    
    public void pop() {
        if(top != null){
            SNode temp = top;
            top = top.next;
            if(temp.data != Integer.MIN_VALUE && temp.data<min){
                min = 2*min-temp.data;
            }else if(temp.data == Integer.MIN_VALUE) {
            	min = prev_min;
            }
            temp = null;
        }
    }
    
    public int top() {
        if(top!=null){
            if(top.data<min){
                return min;
            }else{
                return top.data;
            }
        }else{
            return 0;
        }
    }
    
    public int getMin() {
        return min;
    }
    
    
    public  void display() {
    	SNode temp = top;
    	while(temp != null) {
    		if(temp.data<min) {
    			System.out.print(min+" ");
    		}else {
    			System.out.println(temp.data);
    		}
    		temp = temp.next;
    	}
    	System.out.println();
    }
    
}


class SNode{
    int data;
    SNode next;
    SNode(int data){
        this.data = data;
        this.next = null;
    }
}




