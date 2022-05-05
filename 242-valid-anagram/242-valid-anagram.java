class Solution {
   
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
       
        Character [] xx = new Character[s.length()];
        Character [] yy = new Character[t.length()];
        
        int n=0;
        for(int i=0;i<s.length();i++){
            xx[n] = s.charAt(i);
            n++;
        }
        n=0;
        for(int i=0;i<t.length();i++){
            yy[n] = t.charAt(i);
            n++;
        }
        Arrays.sort(xx);
        Arrays.sort(yy);
        if(Arrays.toString(xx).equals(Arrays.toString(yy))){
            return true;
        }
        return false;
        
    }
}