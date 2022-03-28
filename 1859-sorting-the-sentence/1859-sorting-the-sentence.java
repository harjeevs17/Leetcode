class Solution {
    public String sortSentence(String s) {
       String[] arr = s.split(" ");
       StringBuilder res = new StringBuilder();
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
                if(arr[i].charAt(arr[i].length()-1) < arr[j].charAt(arr[j].length()-1)){
                   String temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }     
           }
       }
       for(int i=0;i<arr.length;i++){
           res.append(arr[i].substring(0, arr[i].length() - 1) + " ");
       }
       return res.toString().substring(0, res.toString().length() - 1); 
    }
}