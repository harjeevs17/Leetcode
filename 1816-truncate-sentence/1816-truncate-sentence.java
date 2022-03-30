class Solution {
    public String truncateSentence(String s, int k) {
        String[] st = s.split(" ");
        StringBuilder r = new StringBuilder();
        for(int i=0;i<k;i++){
            r.append(st[i] + " ");
        }
        r.deleteCharAt(r.length()-1);
        return r.toString();
    }
}