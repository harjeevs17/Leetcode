class Solution {
    public int ff(int n){
    if(n<=1){
        return n;
    }
    else{
        return ff(n-1) + ff(n-2);
    }    
    }
    public int fib(int n) {
        return ff(n);
    }
}