class Solution {
    
	public int removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
        int g=0;
		for(int i=0;i<arr.length;i++){
            int flag = 998;
            for(int j=0;j<arr.length;j++){
                if(j+2<arr.length){
                    if(arr[j]==arr[j+1]){
                        arr[j+1] = arr[j+2];
                        flag =1;
                    }
                 }
             }
         }
       
        
       System.out.println(g);
		return set.size();
    }
}    
