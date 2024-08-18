public class largsumsubarr {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        
        int temp;
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
             temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        int arrsum[]=new int[n];
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            arrsum[i]=sum;
        }
        System.out.println("arrsum");
        for(int i=0;i<n;i++){
            System.out.print(arrsum[i]+" ");
        }
        System.out.println("substring whose sum is:"+arrsum[n-1]);

    }
}
