class Solution {
    public String reverseWords(String s) {
        String[] arr =s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<arr.length;i++){
           StringBuilder t = new StringBuilder(arr[i]);
           res.append(t.reverse().toString()+" ");
        }
        return res.toString().trim();
    }
}