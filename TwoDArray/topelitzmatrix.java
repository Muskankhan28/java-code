package TwoDArray;

public class topelitzmatrix {
    public static boolean istopleitzmatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,1,2,3},
                          {9,5,1,2}};





                          System.out.println(istopleitzmatrix(matrix));
    }
    
}
