class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<String>();
        Stack<Integer> data = new Stack<Integer>();
        int x=0;
        for(int i=1;i<=n;i++){
           System.out.println("Push");
           res.add("Push"); 
           data.push(i);
           if(target[x]!=data.peek()){
               data.pop();
               System.out.println("Pop");
               res.add("Pop"); 
           }else if(target[x]==data.peek() && x<target.length-1){
               x++;
           }
           if(target.length==data.size()){
               break;
           } 
        }
        return res;
    }
}