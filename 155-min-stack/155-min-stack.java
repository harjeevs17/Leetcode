class MinStack {

    int[] arr = new int[30000];
    int top;
    public MinStack() {
        top=-1;
    }
    
    public void push(int val) {
        ++top;
        arr[top] = val;
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
    	System.out.println(top);
        return arr[top];
    }
    public int getMin() {
    	ArrayList<Integer> temp = new ArrayList<>();
    	int g = top;
    	int l=0;
    	while(g>-1) {
    		temp.add(arr[g]);
    		l++;
    		g = g -1;
    	}
    	int min = temp.get(0);
    	for(Integer n:temp) {
    		if(n<min) {
    			min = n;
    		}
    	}
    	return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */