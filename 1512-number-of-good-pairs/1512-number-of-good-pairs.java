class Solution {
    public int numIdenticalPairs(int[] arr) {
        int flag = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j] && i<j) {
					flag++;
				}
			}
		}
        return flag;
    }
}