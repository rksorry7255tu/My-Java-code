package array;
public class reversearr {
    public static void main(String[] args) {
        int []arr={1,2,3,4,8};
        //int []revarr=new int[arr.length];
        //int j=0;
        // for(int i=arr.length-1;i>=0;i--){
        //     revarr[j]=arr[i];
        //     j++;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(revarr[i]);
        // }
        int temp;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
