public class Pattern4 {
    public static void main(String[] args) {
        for( int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==2-i||j==2+i||j==i-2||j==6-i){
                    System.out.print("*");

                }else{
                    System.out.print(" ") ;
                }
                
            }
            System.out.println();
        }
    }
    
}
