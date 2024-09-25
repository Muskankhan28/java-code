package TwoDArray;
import java.util.*;

public class smallestin2d {

    public static int findsmallestIn2Darray(int matrix[][] , int n , int m){
        if(matrix == null || n==0 || m==0){
            System.out.println("matrix is empty");
            return -1;
        }
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int currentsmallest  = matrix[i][j];
                if(currentsmallest<smallest){
                    smallest = currentsmallest;
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        System.out.println("enter the number of coloumns");
        int m = sc.nextInt();


        int matrix[][] = new int[n][m];

        System.out.println("enter the cell elements");
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


        int ans = findsmallestIn2Darray(matrix, n, m);
        System.out.println();
        System.out.println("smallest element in the matrix is ->" + ans);

        
    }
    
}
