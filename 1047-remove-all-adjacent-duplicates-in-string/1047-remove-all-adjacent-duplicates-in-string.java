class Solution {
    public String removeDuplicates(String s) {
        
    Stack<Character> stack = new Stack<Character>();
    for(int i=0;i<s.length();i++){
        if(stack.empty()){
            stack.add(s.charAt(i));
        }
        else{
            if(stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.add(s.charAt(i));
            }
        }
    }
    StringBuilder re = new StringBuilder();    
    while(!stack.empty()){
        re.append(stack.pop());
    }
        return re.reverse().toString();      
    }
}