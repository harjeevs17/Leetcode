class Solution {
    public int calPoints(String[] ops) {
        Stack<String> data = new Stack<String>();
        int tot = 0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                data.pop();
            }else if(ops[i].equals("D")){
                data.push(String.valueOf(2 * (Integer.parseInt(data.peek()))));
            }else if(ops[i].equals("+")){
                String a1 = data.pop();
                String a2 = data.pop();
                data.push(a2);
                data.push(a1);
                data.push(String.valueOf(Integer.parseInt(a1) + Integer.parseInt(a2)));
            }else{
                data.push(ops[i]);
            }
        }
        for(String x:data){
            System.out.println(x);
            tot = tot + Integer.parseInt(x);
        }
        
        return tot;
    }
}