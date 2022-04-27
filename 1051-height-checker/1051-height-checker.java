class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            temp[i] = heights[i];
        }    
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp.length;j++){
                if(temp[j]>=temp[i]){
                    int x = temp[j];
                    temp[j] = temp[i];
                    temp[i] = x;
                }
            }
        }
        int fl=0;
         for(int i=0;i<temp.length;i++){
             System.out.println(temp[i]);
             System.out.println(heights[i]);
             System.out.println("**");
            if(temp[i]!=heights[i]){
                fl++;
            }
         }
        return fl;
    }
}