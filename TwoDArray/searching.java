package TwoDArray;
import java.util.*;

public class searching {

    // searching in a 2D array
    public static boolean search(int matrix[][] , int n , int m , int key){
        for(int i=0;i<n;i++){
            for(int j=-0;j<m;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell" +"(" + i + "," +  j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        int key = 6;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // print
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(search(matrix, n, m, key));
    }
}