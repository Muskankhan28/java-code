package TwoDArray;

public class diagonalsum {
    // optimized code
    // time complexity = 0(N)
    public static int diagonalSumOptimizedSol(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            // here we are calculating the primary diagonal sum 
            sum+=matrix[i][i];
            // here we are calculting the secondary diagonal sum

            // matrix.length-1-i iss ki help se hm j ki value ko calculate krre h 
            // agr i j ke equall nhi h tbhi vo if check ke andr ja kr sum calculate krega othervise primary diagonal ke andr uss particular cell ke liye sum calculate hogya hoga
            // or overlapping vala cell bhi do baar sum mai include nhi ho paega
            if(i != matrix.length-1-i){
               sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }



    // this is not a optimized code
    // time complexuty = 0(N^2)

    // here we are also not covering the overlapping element 

    public static int calculateDiagonalSum(int matrix[][]){
        int sum=0;
        // here we are calculating the sum of primary diagonal
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                       sum+=matrix[i][j];
                }
                // here we are calculating the sum of secondary diagonal
                else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2},
                          {3,4,5},
                          {6,7,8}};

          System.out.println(diagonalSumOptimizedSol(matrix));
    //    System.out.println(calculateDiagonalSum(matrix));

    
    }
    
}
