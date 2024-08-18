package patterns;
public class pattern1 {
    public static void main(String[]args){
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                //this can print the given pattern

                //  if((i==2||i==3)&&(j==2||j==3||j==4)){
                //      System.out.print(" ");
                //  }else{
                //     System.out.print("*");
                //  }
                
                //this can also print the given pattern
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }

               
            }
            System.out.println("");

        }

    }
}
