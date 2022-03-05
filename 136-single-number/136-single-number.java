class Solution {
    public int singleNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				set.remove(arr[i]);
			}
		}
        return set.iterator().next();
    }
}