import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
              list.add(nums[i]);
            }
            
        }
        list.add(nums[nums.length-1]);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        
        return list.size();
    }
}
