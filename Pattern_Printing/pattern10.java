class Main{
    public static void main(String args[]){
    for(int i=4;i>=0;i--){
        char ch=(char)(i+65);
        for(int j=0;j<5-i;j++){
            
            System.out.print(ch+++" ");
        }
        System.out.println();
        
    }
}
}
