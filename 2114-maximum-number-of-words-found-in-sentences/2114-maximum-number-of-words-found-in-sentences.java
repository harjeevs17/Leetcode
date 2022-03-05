class Solution {
    public int mostWordsFound(String[] arr) {
        int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i].split("\\s+").length) {
				max = arr[i].split("\\s+").length;
			}
		}
        return max;
    }
}