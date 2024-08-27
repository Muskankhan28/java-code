package arrays;

public class container {

    public static int maxwater(int arr[]){
        int maximumwater  = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int currentwater = 0;
            for(int j=i+1;j<arr.length;j++){
                int height = Math.min(arr[i], arr[j]);
                int width = j-i;
                currentwater = height*width;
            }
            maximumwater = Math.max(maximumwater, currentwater);
        }
        return maximumwater;
    }



    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxwater(arr));
       
    }
    // public static int contaninerwithmaxwater(int height[]){
    //     int maxwater = Integer.MIN_VALUE;
    //     int start = 0;
    //     int end = height.length-1;
    //     while(start<=end){
    //         int h = Math.min(height[start], height[end]);
    //         int width = end-start;
    //         int currentwater = h*width;
    //         if(height[start]<height[end]){
    //             start++;
    //         }
    //         else{
    //             end--;
    //         }
    //         maxwater = Math.max(maxwater, currentwater);
           
    //     }
    //     return maxwater;
    // }
    // public static void main(String[] args) {
    //     int height[] = {1,8,6,2,5,4,8,3,7};
    //     int ans = contaninerwithmaxwater(height);
    //     System.out.println("maximum water in a container is ->" + ans);
    // }
    
}
