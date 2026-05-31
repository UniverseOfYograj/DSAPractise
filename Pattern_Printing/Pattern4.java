class Main{
    public static void main(String args[]){
    for(int i=0;i<5;i++){
        int m=i+1;
        for(int j=0;j<=i;j++){
            System.out.print(j+1);
        }
        for(int k=i;k<5;k++){
            System.out.print(" ");
        }
        for(int l=0;l<=i;l++){
            
            System.out.print(m--);
        }
        System.out.println();
    }
    
        
    }
}
