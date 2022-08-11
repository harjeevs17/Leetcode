class Solution {
    public int[] shuffle(int[] nums, int f) {
       int rr = 0;
       int[] result = new int[f*2];
       for (int i=0;i<f;i++){
           result[rr] = nums[i];
           result[rr+1] = nums[i+f];
           rr = rr + 2;
       }
       return result;
    }
}