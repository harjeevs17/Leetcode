class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] res = new String[words.length];
        int h=0;
        for(int i=0;i<words.length;i++){
            StringBuilder mi = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                int t = words[i].charAt(j) - '0' - 49;
                mi.append(arr[t]);
            }
            res[h] = mi.toString();
            h++;
        }
        Set<String> set = new HashSet<String>(); 
        for(int i=0;i<res.length;i++){
            if(!set.contains(res[i])){
                set.add(res[i]);
            }
        }
        return set.size();
    }
}