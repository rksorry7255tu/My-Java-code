package patterns;
public class pattern11 {
    public static void main(String[]args){
        int n=5;
        
        //int no=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //1st way
            for(int j=1;j<=i;j++){
                System.out.print(i+"   ");
            }
            //2nd way
            // for(int j=1;j<=(2*(i-1))+1;j++){
            //     //System.out.print("* ");
            //     if(j%2==0){
            //          System.out.print("  ");
            //     }else{
            //         System.out.print(no+" ");
            //     }
            // }
            // no++;
            System.out.println("");
        }
    }
}
