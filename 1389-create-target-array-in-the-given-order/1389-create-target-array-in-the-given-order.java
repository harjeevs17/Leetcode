class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       ArrayList<Integer> data = new ArrayList<Integer>();
       for(int i=0;i<index.length;i++){
           data.add(index[i],nums[i]);
       }
       int[] res = new int[nums.length];
       int cou = 0;
       for(Integer it: data){
           res[cou] = it;
           cou++;
       }
        return res;
    }
}