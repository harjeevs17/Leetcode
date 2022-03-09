class Solution {
    
    public Boolean exists(int n,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
    public int[] check(int[] small,int[] big){
        Set<Integer> data = new HashSet<Integer>();
        for(int i=0;i<big.length;i++){
            if(exists(big[i],small)){
                data.add(big[i]);
            }
        }
        int[] result  = new int[data.size()];
        int m =0;
        for(Integer it:data){
            result[m] = it;
            m++;
        }
        return result;
    }
    
    public int[] intersection(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int a2 = nums2.length;
        if(a1<a2){
            return check(nums1,nums2);    
        }else{
            return check(nums1,nums2);
        }
        
    }
}