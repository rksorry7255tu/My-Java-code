package patterns;
public class pattern4 {
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            //for(int j=1;j<=n;j++){
                //first way
                // if((i==1&(j==1||j==2||j==3))||(i==2&&(j==1||j==2))||(i==3&&j==1)){
                //     System.out.print(" ");
                // }else{
                //     System.out.print("*");
                // }
                //second way
                // if(i==4||j==4||(i==3&&j==3)||(i==2&&j==3)||(i==3&&j==2)){
                //     System.out.print("*");
                // }
                // else{

                //     System.out.print(" ");
                // }
            //}
            //third way
            // for(int j=0;j<n-i;j++){
            //     System.out.print(" ");
            // }
            // for(int j=n-i;j<n;j++){
            //     System.out.print("*");
            // }
            //4th way
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }

            System.out.println("");
        }
    }
}
