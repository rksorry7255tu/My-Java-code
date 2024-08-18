package array;
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of arr space");
        int n=sc.nextInt();
       System.out.println("Enter " +n +" number into array");
        int arr []= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }     
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}