class Solution {
    public boolean isPrefixString(String s1, String[] words) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder sa = new StringBuilder();
            for(int j=0;j<=i;j++){
                sa.append(words[j]);
            }
            if(sa.toString().equals(s1)){
                return true;
            }
        }
        return false;
    }
    
}