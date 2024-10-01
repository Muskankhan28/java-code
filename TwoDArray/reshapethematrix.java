package TwoDArray;

public class reshapethematrix {
    public static int[][] reshapeMatrix(int matrix[][] , int r , int c){
        int n = matrix.length;
        int m = matrix[0].length;

        if(n*m != r*c){
            return matrix;
        }
        int ans[][] = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[row][col] = matrix[i][j];
                col ++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return ans;


    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2},
                          {3,4}};

                          int r = 1;
                          int c = 4;



                          int result[][] = reshapeMatrix(matrix, r, c);
                          for(int i=0;i<result.length;i++){
                            for(int j=0;j<result[0].length;j++){
                                System.out.print(result [i][j] + " ");
                            }
                            System.out.println();
                          }

                          
    }

}
