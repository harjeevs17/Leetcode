class Solution {
    
	public int removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j+2<arr.length){
                    if(arr[j]==arr[j+1]){
                        arr[j+1] = arr[j+2];
                    }
                 }
             }
         }
        return set.size();
    }
}    
