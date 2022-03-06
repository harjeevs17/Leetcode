class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int[] res = new int[arr.length];
		int counter = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					count++;
				}
			}
			res[counter] = count;
			counter++;
		}
        return res;
    }
}