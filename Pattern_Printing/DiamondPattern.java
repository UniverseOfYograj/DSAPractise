class Main{
    public static void main(String args[]){
       for(int i=0;i<5;i++){
         for(int k=i;k<5;k++){
             System.out.print(" ");
         }
           for(int j=0;j<((2*i)+1);j++){
               System.out.print("* ");
           }
           System.out.println();
           
       }
       
        for(int i=4;i>0;i--){
            for(int k=0;k<=(5-i);k++){
                System.out.print(" ");
            }
            for(int j=0;j<((2*i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
