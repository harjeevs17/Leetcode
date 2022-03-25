class Solution {
    public double average(int[] salary) {
        for(int i=0;i<salary.length;i++){
            for(int j=0;j<salary.length;j++){
                if(salary[i]<salary[j]){
                    int temp = salary[j];
                    salary[j] = salary[i];
                    salary[i] = temp;
                }
            }
        }
        int t = 0;
        for(int i=1;i<salary.length-1;i++){
            System.out.println(salary[i]);
            t = t+ salary[i];
        }
        return (double)t/(salary.length-2);
    }
}