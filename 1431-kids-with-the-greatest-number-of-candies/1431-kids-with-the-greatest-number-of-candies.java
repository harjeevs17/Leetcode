class Solution {
    public Boolean checkIfexists(int[] arr,int value) {
		for(Integer i:arr) {
			if(i>value) {
				return false;
			}
		}
		return true;
	}
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
        List<Boolean> result = new ArrayList<Boolean>();
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i]+extra;
			if(checkIfexists(arr,temp)) {
				result.add(true);
			}
			else {
				result.add(false);
			}
			counter++;
		}
        return result;
    }
}