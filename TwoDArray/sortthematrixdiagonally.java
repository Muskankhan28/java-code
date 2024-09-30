package TwoDArray;
import java.util.*;

public class sortthematrixdiagonally {

    public static int[][] sortTheMatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        HashMap<Integer , List<Integer>>map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key = i-j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(matrix[i][j]);
            }
        }
        for (List<Integer> i: map.values()) {
            Collections.sort(i);
        }
        for(int i = n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int key = i-j;
                List<Integer>sorted = map.get(key);
                matrix[i][j] = sorted.remove(sorted.size()-1);
            }
        }
        return matrix;
    
    }


    public static void main(String[] args) {
        int matrix[][] = {{3,3,1,1},
                         {2,2,1,2},
                         {1,1,1,2}};




                         int result[][] = sortTheMatrix(matrix);
                         for(int i=0;i<result.length;i++){
                            for(int j=0;j<result[0].length;j++){
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                         }




    }
    
}
