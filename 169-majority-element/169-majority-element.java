class Solution {
    public int majorityElement(int[] arr) {
        int max = 0;
		int vv = 0;
		Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}else {
				int temp = Integer.parseInt(hm.get(arr[i]).toString());
				temp++;
				hm.put(arr[i],temp);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
		    if(max<Integer.parseInt(entry.getValue().toString())) {
				max = Integer.parseInt(entry.getValue().toString());
				vv = Integer.parseInt(entry.getKey().toString());
			}
		}
        return vv;
    }
}