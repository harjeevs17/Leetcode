class Solution {
    public String reversePrefix(String word, char ch) {
        int f=0;
        for(int i=0;i<word.length();i++){
           if(word.charAt(i) == ch){
               f=i;
               break;
           }
        }
        StringBuilder re = new StringBuilder(word.substring(0,f+1));
        StringBuilder ff = new StringBuilder(re.reverse());
        ff.append(word.substring(f+1,word.length()));
        System.out.println();
        return ff.toString();
    }
}