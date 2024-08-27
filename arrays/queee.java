package arrays;

public class queee {

    public static int ifsizethree(int arr[]){
        int n=arr.length;
        int product = 1;
        for(int i=0;i<n;i++){
            product = arr[0]*arr[1]*arr[2];
        }
        return product;
    }
    public static int findlargest(int arr[]){
        
        int n=arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findsecondlargest(int arr[]){
        int n=arr.length;
        
        int secondlargest = -1 ;
        int large = findlargest(arr);
        for(int i=0;i<n;i++){
            if(arr[i] <  large && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static int findthirdlargest(int arr[]){
        int n = arr.length;
        int thirdlargest = -1;
        int large = findlargest(arr);
        int second = findsecondlargest(arr);
        for(int i=0;i<n;i++){
            if(arr[i]<second && arr[i]>thirdlargest){
                thirdlargest = arr[i];
            }
        }
        return thirdlargest;
    }

    
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3};
        System.out.println(ifsizethree(arr));
        int i = findlargest(arr);
        int j = findsecondlargest(arr);
        int k = findthirdlargest(arr);
        int maxproduct = i*j*k;
        System.out.println(maxproduct);
    }
    
}
