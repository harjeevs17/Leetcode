class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int c=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                res[c] = nums[j]; 
                c++;
            }
        }
        return res;
    }
}