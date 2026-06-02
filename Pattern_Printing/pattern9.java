class Main{
    public static void main(String args[]){
    for(int i=0;i<5;i++){
        char m=(char)(i+64);
        for(int j=0;j<5-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            char ch=(char)(k+65);
            System.out.print(ch);
        }
        if(i>=1){
            for(int l=1;l<=i;l++){
                System.out.print(m--);
            }
        }
        System.out.println();
    }
        
    }
}
