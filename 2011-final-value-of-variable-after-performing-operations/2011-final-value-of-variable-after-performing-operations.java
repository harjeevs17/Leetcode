class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int total = 0;
		for(int i=0;i<arr.length;i++) {
			switch(arr[i]) {
				case "--X":
					total = total - 1;
				break;
				case "X--":
					total = total - 1;
				break;
				case "X++":
					total = total + 1;
				break;
				case "++X":
					total = total + 1;
				break;
			}
		}
        return total;
    }
}