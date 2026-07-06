class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        Set<Integer>st=new HashSet<>();
        
        for(int i=0;i<n;i++){
            int value=Math.abs(arr[i]);
            if(!st.contains(value)){
                st.add(value);
            }else{
                list.add(value);
            }
            
        
          if(arr[value-1]>0)  
            arr[value-1]*=-1;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
            
                //list.add(Math.abs(arr[i]));
                list.add(i+1);
                
                
                return list;
            }
        }
        return new ArrayList<>();
    }
}
