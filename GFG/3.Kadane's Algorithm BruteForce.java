class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length,sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>maxi)maxi=sum;
                if(sum<0)sum=0;
            }
        }
        return maxi;
    }
}
