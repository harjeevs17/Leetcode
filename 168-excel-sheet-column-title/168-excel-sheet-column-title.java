class Solution {
    public String convertToTitle(int num) {
        if(num==1){
            return "A";
        }
        StringBuilder res = new StringBuilder();
        while(num>0){
            num--;
            System.out.println('A'+(char)num%26);
            res.append((char)('A' + num % 26));
            num= num/26;
        }
        return res.reverse().toString();
        
    }
}