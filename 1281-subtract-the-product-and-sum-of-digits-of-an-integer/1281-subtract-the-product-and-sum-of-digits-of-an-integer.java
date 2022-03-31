class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int a = 0;
        while(n>0){
           int r = n%10;
           p = p * r;
           a = a + r; 
           n = n / 10; 
       }
       return (p-a); 
    }
}