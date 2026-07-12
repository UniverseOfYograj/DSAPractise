class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=0;j<m;j++){
                list.add(mat[j][i]);
            }
            ans.add(list);
        }
        return ans;
    }
}
