import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int n=arr.length;
        
        System.out.println("Enter Elements");
        Scanner kb=new Scanner(System.in);
        
        
        for(int i=0;i<n;i++){
            int a=kb.nextInt();
            arr[i]=a;
        }
        System.out.println("Elements of array before left rotate by one place!");
        for(int i:arr){
            System.out.print(i+" ");
        }
        
        int temp=arr[0];
        
        
        for(int i=1;i<=n-1;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("Elements of the array after left rotate!");
        for(int i: arr){
            System.out.print(i+" ");
        }
        
    }
}
