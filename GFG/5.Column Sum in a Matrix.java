class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int m=mat.length;
        int n=mat[0].length;
        int indx=0;
        int ans[]=new int[n];
        int sum=0;
        
        for(int col=0;col<n;col++){
            sum=0;
            for(int row=0;row<m;row++){
                sum+=mat[row][col];
                
            }
            ans[indx++]=sum;
        }
        return ans;
    }
}
