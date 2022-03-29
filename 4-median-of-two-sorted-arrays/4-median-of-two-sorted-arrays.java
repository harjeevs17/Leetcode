class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] comb = new int[nums1.length+nums2.length];
        int k =0;
        for(int i=0;i<nums1.length;i++){
            comb[k] = nums1[i];
            k++;
        }
        for(int i=0;i<nums2.length;i++){
            comb[k] = nums2[i];
            k++;
        }
        for(int i=0;i<comb.length;i++){
            for(int j=0;j<comb.length;j++){
                if(comb[i]<comb[j]){
                    int t = comb[j];
                    comb[j] = comb[i];
                    comb[i] = t;
                }
            }
        }
        for(int i=0;i<comb.length;i++){
            System.out.println(comb[i]);
        }
        int di = comb.length;
        int mid = di/2;
        if(di%2!=0){
            return (comb[(mid)]);
        }else{
            int temp = mid;
            return ((((double)comb[temp-1]+comb[temp])/2));
        }
        
    }
}