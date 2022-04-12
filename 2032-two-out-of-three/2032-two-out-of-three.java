class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        	Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer> set3 = new HashSet<>(); 
            Set<Integer> set = new HashSet<>();
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                set1.add(nums1[i]);
                set.add(nums1[i]);
            }
            for(int i=0;i<nums2.length;i++){
                set2.add(nums2[i]);
                set.add(nums2[i]);
            }
            for(int i=0;i<nums3.length;i++){
                set3.add(nums3[i]);
                set.add(nums3[i]);
            }
            for(Integer d:set){
                if((set1.contains(d)&&set2.contains(d))||(set2.contains(d)&&set3.contains(d))||(set1.contains(d)&&set3.contains(d))){
                    res.add(d);
                }
            }
            return res;
        

        
    }
}