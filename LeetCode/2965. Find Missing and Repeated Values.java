//not optimal one
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // int []arr=new int[grid[0].length];
       
       int[] arr = new int[grid.length * grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr[k++]=grid[i][j];
            }
        }
        
        int n=arr.length;
        int ans[]=new int[2];
        Set<Integer>st=new HashSet<>();
        
        for(int i=0;i<n;i++){
            int value=Math.abs(arr[i]);
            if(!st.contains(value)){
                st.add(value);
            }else{
              ans[0]=value;
            }
            
        
          if(arr[value-1]>0)  
            arr[value-1]*=-1;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
            
                //list.add(Math.abs(arr[i]));
                ans[1]=i+1;
                
                
                return ans;
            }
        }
        return new int[]{};
    }
}
