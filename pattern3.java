package patterns;
public class pattern3 {
    public static void main(String[]args){
        int n=4;
        int m=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
