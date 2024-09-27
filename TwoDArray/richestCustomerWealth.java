package TwoDArray;

public class richestCustomerWealth {

    public static int MaximumWealth(int matrix[][]){
       int maxwealth = 0;
       for(int i=0;i<matrix.length;i++){
        int currentwealth = 0;
        for(int j=0;j<matrix[0].length;j++){
            currentwealth += matrix[i][j];
        }
        maxwealth = Math.max(maxwealth, currentwealth);
    }
    return maxwealth;
}


    public static void main(String[] args) {
        int matrix[][] = {{1,5},
                          {7,3},
                          {3,5}};



                          System.out.println(MaximumWealth(matrix));
        
    }
}
