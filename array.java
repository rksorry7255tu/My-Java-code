package array;
import java.util.*;

public class array {
  
    public static void main(String[]args){
        int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no");
        n=sc.nextInt();
        System.out.println("enter column no");
        m=sc.nextInt();
        int [][] marks= new int[n][m];
        System.out.println("Enter "+m*n+" marks");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                marks [i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the no to search");
        int search=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(marks[i][j]==search){
                System.out.println(i+","+j);
               }
            }
            
        }

    }
}
