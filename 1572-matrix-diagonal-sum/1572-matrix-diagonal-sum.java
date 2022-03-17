class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    res+=mat[i][j];
                }
            }
        }
        System.out.println(res);
        int p = 0;
        int q = mat[0].length-1;
        while(p<=(mat[0].length) && q>=0){
            res = res+mat[p][q];
            p++;
            q--;
        }
        System.out.println(res);
        if(mat[0].length%2!=0){
           int mi = mat[0].length/2;
            res = res - mat[mi][mi]; 
        }
        
        return res;
    }
    
}