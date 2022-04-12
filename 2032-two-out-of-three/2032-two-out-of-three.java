class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer,Integer> data = new HashMap<>();
        Map<Integer,Integer> aa = new HashMap<>();
        Map<Integer,Integer> bb = new HashMap<>();
        Map<Integer,Integer> cc = new HashMap<>(); 
        List<Integer> dd = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            aa.put(nums1[i],1);
        }
        for (Map.Entry<Integer, Integer> entry : aa.entrySet()) {
            if(!data.containsKey(entry.getKey())){
                data.put(entry.getKey(),1);
            }
        }
       
        for(int i=0;i<nums2.length;i++){
            bb.put(nums2[i],1);
        }
         
         for (Map.Entry<Integer, Integer> entry : bb.entrySet()) {
            if(!data.containsKey(entry.getKey())){
                data.put(entry.getKey(),1);
            }else{
                 data.put(entry.getKey(),data.get(entry.getKey())+1);
            }
        }
        for(int i=0;i<nums3.length;i++){
            cc.put(nums3[i],1);
        }
         for (Map.Entry<Integer, Integer> entry : cc.entrySet()) {
            if(!data.containsKey(entry.getKey())){
                data.put(entry.getKey(),1);
            }else{
                 data.put(entry.getKey(),data.get(entry.getKey())+1);
            }
        }
        
        System.out.println(Arrays.toString(data.entrySet().toArray()));
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
            if(entry.getValue()>=2){
                dd.add(entry.getKey());
            }
        }   
        return dd;
    }
}