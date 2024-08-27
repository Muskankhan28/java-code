package arrays;

public class rearrangevariety2que {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5,3,6};
        int countpos = 0;
        int countneg = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                countpos++;
            }
            else{
                countneg++;
            }
        }

    int positive[] = new int[countpos];
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] > 0){
            positive[j] = arr[i];
            j++;
        }
    }

    int negative[] = new int[countneg];
    int k=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] < 0){
            negative[k] = arr[i];
            k++;
        }
    }

    int n=countneg+countpos;
    int temp[] = new int[n];
    int r=0;
    int m=0;
    int u=0;

   for(int i=0;i<countpos;i++){
    if(positive[m] > negative[u]){
        temp[r] = positive[m];
        r++;
        temp[r] = negative[u];
        r++;
        m++;
        u++;
    }

   }
   for (int i : temp) {
    
   }
    
    


    


    

       
        
    
    }
    
}
