package patterns;
public class pattern7 {
    public static void main(String[]args){
        int n=5;
        int no=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(no+"   ");
                no++;
            }
            System.out.println("");
        }
    }
}
