class Solution {
    public String restoreString(String s, int[] indices) {
        Character[] ch = new Character[indices.length];
        StringBuilder res = new StringBuilder();
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<ch.length;i++){
            res.append(ch[i]);
        }
        return res.toString();
    }
}