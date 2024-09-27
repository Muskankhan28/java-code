package TwoDArray;

public class spiralMatrix2 {

    public static int[][] generateMatrix(int n){
        int matrix[][] = new int[n][n];
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        int num = 1;
        while(startrow <= endrow && startcol <=endcol){
            // fill the top boundary 
            for(int j=startcol;j<=endcol;j++){
                matrix[startrow][j] = num;
                num++;
            }
            // fill the right boundary
            for(int i=startrow+1;i<=endrow;i++){
                matrix[i][endcol] = num;
                num++;
            }
            // fill the bottom boundary
            for(int j=endcol-1;j>=startcol;j--){
                matrix[endrow][j] = num;
                num++;
            }
            // fill the left boundary
            for(int i=endrow-1;i>=startrow+1;i--){
                matrix[i][startcol] = num;
                num++;
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int n = 3;
        int ans[][] = generateMatrix(n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
