public class minmax {
    public static void main(String[] args) {
        
        int arr[]={3,2,2,12,16,1};
        int s=0;
        int l=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<arr[s]){
                s=i;
            } 
            if(arr[i]>arr[l]){
                l=i;
            }   
        }
        System.out.println(arr[s]);
        System.out.println(arr[l]);
      
    }
}
