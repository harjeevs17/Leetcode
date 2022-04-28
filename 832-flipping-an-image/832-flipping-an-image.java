class Solution {
    public int[] reverse(int[] data){
        int[] temp = new int[data.length];
        int f=0;
        for(int i=data.length-1;i>=0;i--){
            temp[f] = data[i];
            f++;
        }
        return temp;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            image[i] = reverse(image[i]);    
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                System.out.println(image[i][j]);
            }
            System.out.println("**");
        }    
    for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    image[i][j] = 1;
                }
                else if(image[i][j]==1){
                    image[i][j] = 0;
            }
        }
    }
        System.out.println("AFTER");
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                System.out.println(image[i][j]);
            }
            System.out.println("**");
        }   
        return image;
    }    
}