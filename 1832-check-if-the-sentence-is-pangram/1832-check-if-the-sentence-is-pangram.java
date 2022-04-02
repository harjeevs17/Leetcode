class Solution {
    public boolean checkIfPangram(String snt) {
        List<Character> res = new ArrayList<>();
        for(int i=0;i<snt.length();i++){
            if(!res.contains(snt.charAt(i))){
                res.add(snt.charAt(i));
            }
        }
        if(res.size()==26){
            return true;
        }else{
            return false;
        }
    }
}