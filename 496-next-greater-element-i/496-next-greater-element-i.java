class Solution {
    public static int findIndex(int arr[], int t)
        {      
            for(int i=0;i<arr.length;i++){
                if(arr[i]==t){
                    return i;
                }
            }
            return -1;
        } 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<Integer>();  
        for(int i=0;i<nums1.length;i++){
            int v = -1;
            int index = findIndex(nums2,nums1[i]);
            if(index!=-1){
                for(int j=index;j<nums2.length;j++){
                    if(nums1[i]<nums2[j]){
                        v = nums2[j];
                        break;
                    }
                }
            }
            else{
                v = -1;
            }
            res.add(v);
        }
        int[] arr = new int[res.size()];
        int p = 0;
        for(Integer x:res){
            arr[p] = x;
            p++;
        }
        return arr;
    }
}