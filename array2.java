package array;
 class array2 {
    public static void main(String[] args) {

        int nums[]={1,2,3,1,1,1,2};
        // System.out.println("Enter the nums in array");
        // nums=sc.next();
        int num[]=new int[nums.length];
        int size=nums.length;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(nums[i]!=nums[j]){
                    //num[j]=nums[j];
                    for(int k=0;k<size;k++){
                        if(nums[j]==num[k]){
                             num[i]=0;
                         }else if(num[j]!=nums[j]){
                             num[j]=nums[j];
                         }
                     }
                }
                else if(nums[i]==nums[j]){
                    for(int k=0;k<size;k++){
                       if(nums[j]==num[k]){
                            num[j]=0;
                        }else if(num[j]!=nums[j]){
                            num[j]=nums[j];
                        }
                    }
                
                 }
            }
                
              
               
            
        }
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
        
    }
}

