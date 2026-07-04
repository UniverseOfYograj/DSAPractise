import java.util.*;
public class Main
{   static void sortZeroAndOnes(int []arr){

    int l=0, h=arr.length-1;
    while(l<=h){
        if(arr[l]==0)l++;
        else if(arr[l]==1 && arr[h]==0){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
        }
        else if(arr[h]==1)h--;
    }
    
    for(int i:arr){
        System.out.print(i+" ");
    }
         
}
	public static void main(String[] args) {
	    Scanner kb=new Scanner(System.in);
	   
        int arr[]=new int[9];	    
		for(int i=0;i<arr.length;i++){
		    arr[i]=kb.nextInt();
		}
		sortZeroAndOnes(arr);
	}
}
