class Solution {
    public int[] runningSum(int[] arr) {
        int[] res = new int[arr.length];
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			int temp = 0;
			for(int j=0;j<=i;j++) {
				temp+=arr[j];
			}
			res[counter] = temp;
			counter++;
		}
        return res;
    }
}