//USed Set not optimal
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>st=new HashSet<>();
        for(int i:nums){
          if(!st.contains(i)){
            st.add(i);
          }else{
            return i;
          }
        }
        return -1;
    }
}
