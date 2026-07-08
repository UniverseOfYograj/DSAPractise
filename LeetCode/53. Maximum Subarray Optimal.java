class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        /*for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>maxi){
                    maxi=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
        }
        */
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi)maxi=sum;
            if(sum<0)sum=0;
        }

        return maxi;
    }
}
