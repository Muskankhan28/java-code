package arrays;
import java.util.*;

public class movezeros {
//     public static int[] movezeros(int arr[]){
//         int n = arr.length;
//         Arrays.sort(arr);
//         int count = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i] == 0){
//                 count++;
//             }
//         }
//       int temp[] = new int[count];
//       int j=0;
//       for(int i=0;i<count;i++){
//         temp[j] = arr[i];
//         j++;
//       }  

//       for(int i=count;i<n;i++){
//         arr[i-count] = arr[i];
//       }

//       int m=0;
//       for(int i=n-count;i<arr.length;i++){
//         arr[i] = temp[m];
//         m++;
//       }
//       return arr;

//     }
//     public static void main(String[] args) {
       
//         int arr[] = {1,0,2,0,0,3,0,4,0,5};
//         int ans[] = movezeros(arr);
//         for (int i : ans) {
//             System.out.print(i +  " ");
            
//         }
      
//     }
// }





    // brute approach (O 2N)

    public static int[] moveszeros(int arr[]){
      ArrayList<Integer>list = new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          if(arr[i] != 0){
              list.add(arr[i]);
          }
      }
      for(int i=0;i<list.size();i++){
          arr[i] = list.get(i);
      }
      for(int i=list.size();i<arr.length;i++){
          arr[i] = 0; 

      }
      
      return arr;

    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,2,0,0,4,0,5,1};
        int ans[] = moveszeros(arr);
        for (int i : ans) {
          System.out.print(i+ " ");
          
        }
       
        
    }

}




// optimized approach using two pointer O(N)



//     public static int[] movezeros(int arr[]){
//         int j=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == 0){
//                 j = i;
//                 break;
//             }
//         }
//         for(int i=j+1;i<arr.length;i++){
//             if(arr[i] != 0){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,0,2,0,2,0,0,4,0,1};
//         int ans[] = movezeros(arr);
//         for (int i : ans) {
//             System.out.print(i + " ");
            
//         }
//     }
    
// }
