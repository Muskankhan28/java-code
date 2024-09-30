package TwoDArray;
import java.util.*;

public class diagonalTraversal {
    public static int[] diagonaltraversall(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        HashMap<Integer , List<Integer>>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key = i+j;
                map.putIfAbsent(key , new ArrayList<>());
                map.get(key).add(matrix[i][j]);
            }
        }
        boolean flip = true;
        for (List<Integer>i : map.values()) {
            if(flip){
                Collections.reverse(i);
            }
            list.addAll(i);
            flip = !flip;  
        }

        int ans[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

                    
                          int result[] = diagonaltraversall(matrix);
                          for (int i : result) {
                            System.out.print(i + " ");
                            
                          }

                          
    }
    
}
