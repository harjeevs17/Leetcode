class Solution {
    public String makeGood(String s) {
        Stack<Character> st= new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(st.empty()) {
				st.add(s.charAt(i));
			}else {
				if(st.peek()!=s.charAt(i) &&(Character.toUpperCase(st.peek()) == s.charAt(i) || st.peek() == Character.toUpperCase(s.charAt(i)))) {
					st.pop();
					continue;
				}else {
					st.add(s.charAt(i));
				}
			}
			
		}
		StringBuilder res = new StringBuilder();
		while(!st.empty()) {
    		res.append(st.pop());
    	}
		return res.reverse().toString();
    }
}