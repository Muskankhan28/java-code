package TwoDArray;
import java.util.*;

public class largetsin2d {
    // function to find the largest element in the 2D array
    public static int findlargesrtin2Darray(int matrix[][] , int n , int m){
        if(matrix == null || n == 0 || m == 0){
            System.out.println("the materix is empty");
            return -1;
        }
        int largest = matrix[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int currentlargest = matrix[i][j];
                if(currentlargest>largest){
                    largest = currentlargest;
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();

        System.out.println("enter the number of coloumns");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("enter the element of a matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // print
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int ans = findlargesrtin2Darray(matrix, n, m);
        System.out.println();
        System.out.println("the largest element in a matrix is " + ans);
    }
    
}
