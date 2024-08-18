package patterns;
public class pattern9 {
    public static void main(String[]args){
        int n=5;
        //upper part
        for(int i=1;i<=n;i++){
            //star part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
           
            //Space part
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
           
           
            System.out.println("");
        }
        //lower part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
             for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
