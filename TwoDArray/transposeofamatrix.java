package TwoDArray;

public class transposeofamatrix {


    public static int [][] transposeMatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        int transposeMatrix[][] = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
        int matrix[][] = {{2,4,-1},
                          {-10,5,11},
                          {18,-7,6}};





                          int ans[][] = transposeMatrix(matrix);
                          for(int i=0;i<ans.length;i++){
                            for(int j=0;j<ans[0].length;j++){
                                System.out.print(ans[i][j] + " ");
                            }
                            System.out.println();

                          }
    }
    
}
