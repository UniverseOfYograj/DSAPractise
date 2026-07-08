class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       //first thing i will sort it,
       // two sum ko  use krne k liye
       // i will pointer i
       //another loop inside it 
       //two sum // left ek le luga right
       // i +left +right 
       Arrays.sort(nums);
       List<List<Integer>>list=new ArrayList<>();
       int n=nums.length;
//[-1,0,1,2,-1,-4]  -->[-4,-1, -1,0,1,2 ]
       
       for( int i=0;i<n-2;i++){
          
          if(i>0 && nums[i]==nums[i-1]){
            continue;
          }
          int left =i+1, right=n-1;
         //target =0, 
         //required =0=i+left+right
         // required=-i=left+right
         //reuired =4 

         
         int targetSum=-nums[i];


          while(left<right){
            int sum=nums[left]+nums[right];
            if(sum>targetSum){
                right--;
            }
            else if(sum<targetSum){
                left++;
            }
            else{// else only condition would get match so Adding or storing the triplet
                List<Integer>l=new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[left]);
                l.add(nums[right]);
               list.add(l);
                left++; right--;

                //skip left duplicate value
                while(left<right && (nums[left]==nums[left-1]))left++;
                //skip the duplicate right
                while(left<right && nums[right]==nums[right+1])right--;
                
            }
          }

       }
  return list;       

    }
}
