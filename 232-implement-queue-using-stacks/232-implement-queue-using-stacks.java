class MyQueue {
    Stack<Integer> a1;
    Stack<Integer> a2;
    public MyQueue() {
        a1 = new Stack<Integer>();
        a2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        a1.push(x);
    }
    
    public int pop() {
        int pop = -1;
        while(!a1.empty()){
            a2.push(a1.pop());
        }
        if(!a2.empty()){
            pop = a2.pop();
                while(!a2.empty()){
                a1.push(a2.pop());
            }
        }    
        
        return pop;
    }
    
    public int peek() {
       
        int peek = -1;
        while(!a1.empty()){
             System.out.println("rt");
            a2.push(a1.pop());
        }
        if(!a2.empty()){
            peek = a2.peek();    
        }
        if(!a2.empty()){
            System.out.println("df");
            while(!a2.empty()){
                a1.push(a2.pop());
            }
        }
        return peek;
    }
    
    public boolean empty() {
        


        return a1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */