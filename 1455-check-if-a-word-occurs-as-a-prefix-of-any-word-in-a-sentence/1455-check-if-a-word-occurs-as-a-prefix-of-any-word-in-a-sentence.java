class Solution {
    public int isPrefixOfWord(String sen, String word) {
        String[] arr = sen.split(" ");
        for(int i=0;i<arr.length;i++){
            //if(arr[i].contains(word) && word == arr[i].substring(0, word.length()-1)){
                //
            //}
            if(arr[i].length()>=word.length() && arr[i].substring(0, word.length()).equals(word) ){
               return i+1;
            }
            
        }
        return -1;
    }
}