class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> indx = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(indx.containsKey(s.charAt(i))){
                indx.put(s.charAt(i),indx.get(s.charAt(i))+1);
            }else{
                indx.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(indx.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;      
    }
}   
