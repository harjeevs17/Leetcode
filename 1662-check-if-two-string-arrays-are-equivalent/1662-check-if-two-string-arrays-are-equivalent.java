class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a1  = new StringBuilder();
        for(int i=0;i<word1.length;i++){
           for(int j=0;j<word1[i].length();j++){
                a1.append(word1[i].charAt(j));
           }
       }
       StringBuilder a2  = new StringBuilder();
        for(int i=0;i<word2.length;i++){
           for(int j=0;j<word2[i].length();j++){
                a2.append(word2[i].charAt(j));
           }
       }
       System.out.println(a1.toString());
       System.out.println(a2.toString());
       if(a1.toString().equals(a2.toString())){
           return true;    
       }
        else{
            return false;
        }
        
    }
}