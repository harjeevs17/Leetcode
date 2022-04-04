class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> data = new HashSet<Character>();
        for(int i=0;i<allowed.length();i++){
            data.add(allowed.charAt(i));
        }
        int c = 0;
        for(int i=0;i<words.length;i++){
            int flag = 1;
            for(int j=0;j<words[i].length();j++){
                if(!data.contains(words[i].charAt(j))){
                    flag = 0;
                }
            }
            if(flag==1){
                c++;
            }
        }
        return c;
    }
}