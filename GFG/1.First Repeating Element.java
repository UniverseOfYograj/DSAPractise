class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        /*Set<Integer>st=new HashSet<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(!st.contains(arr[i]))st.add(arr[i]);
            else return i;
        }*/
        
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i])>1)return i+1;
        }
        return -1;
    }
}
