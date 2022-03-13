class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i=0;i<s.length();i++){
            Set<Character> hash_Set = new HashSet<Character>();
            int counter = 0;
            for(int j=i;j<s.length();j++){
                if(hash_Set.contains(s.charAt(j))){
                    break;
                }else{
                    counter++;
                    hash_Set.add(s.charAt(j));        
                }
            }
            if(counter>max){
                max = counter;
            }
            
        }
        return max;
    }
}