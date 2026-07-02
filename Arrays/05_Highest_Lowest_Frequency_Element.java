/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
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
    
    int maxFreq=-1,lowFreq=Integer.MAX_VALUE;
    int maxFreqKey=-1,lfk=Integer.MAX_VALUE;
    
    for(int i:mp.keySet()){
        int ck=i;
        int ckf=mp.get(i);
        if(ckf>maxFreq){
            maxFreq=ckf;
            maxFreqKey=i;
        }
        if(ckf<lowFreq){
            lowFreq=ckf;
            lfk=i;
        }
    }
    System.out.println();
    System.out.println("Lowest frequency key="+lfk);
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
