package bitmanipualation;

public class goodpairs {
    public int sumOfEncryptedInt(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int m=0;
        for(int i=0;i<n;i++){
            int temp = nums[i];
            int count = 0;
            int max = Integer.MIN_VALUE;
            while(temp != 0){
                temp = temp%10;
                max = temp;
                temp = temp/10;
                count ++;

                int result = 0;
                while(count>0){
                    result = result*10+max;
                    count--;
                    for(int i=0;i<ans.length)
                }
            }
           


        }

        
        
    }
   
    public static void main(String[] args) {
        int arr[] = {10,21,31};

    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           