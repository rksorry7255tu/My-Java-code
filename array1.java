package array;


public class array1 {
     public static void main(String[]args){
        int nums[]= {1,3,2,9,6};
        int target=9;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            if((nums[i]+nums[j])==target){
                System.out.println("["+i+","+j+"]");
                
            }
            
            }
            
            
        }
    }
   
}
    

