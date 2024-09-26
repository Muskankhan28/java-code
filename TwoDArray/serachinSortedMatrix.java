package TwoDArray;

public class serachinSortedMatrix {

    public static boolean iskeypresent(int matrix[][] , int key){
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("found key at -> "+"(" + row + "," + col + ")");
                System.out.println();
                return true;
            }
            else if(key<matrix[row][col]){
                // move left
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = {{10,20,20,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

                          int key = 33;

                          System.out.println(iskeypresent(matrix, key));
    }
    
}
