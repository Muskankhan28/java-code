package TwoDArray;

public class convert1Dinto2D {

    public static int[][] twoDarray(int arr[] , int n , int m){
        int matrix[][] = new int[n][m];
        if(arr.length != n*m){
            return new int[0][0];
        }
        int indx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = arr[indx];
                indx++;
                
            }
      
        }
        return matrix;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = 2;
        int m = 2;



        int ans[][] = twoDarray(arr, n, m);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
