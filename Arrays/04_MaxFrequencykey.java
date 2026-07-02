import java.util.*;
public class Main
{   static int findMaxFreq(int nums[]){
    Map<Integer,Integer>mp=new HashMap<>();
    for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
    }
    
    for(int i:mp.keySet()){
        System.out.print(mp.get(i)+" ");
    }
    
    int maxFreq=-1;
    int maxFreqKey=-1;
    
    for(int i:mp.keySet()){
        int ck=i;
        int ckf=mp.get(i);
        if(ckf>maxFreq){
            maxFreq=ckf;
            maxFreqKey=i;
        }
    }
    return maxFreqKey;
}
	public static void main(String[] args) {
	    Scanner kb=new Scanner(System.in);
	    int arr[]=new int[10];
	    
	    for(int i=0;i<arr.length;i++){
	        arr[i]=kb.nextInt();
	    }
	    System.out.println("Max frequency key="+findMaxFreq(arr));
	    
	}
}
