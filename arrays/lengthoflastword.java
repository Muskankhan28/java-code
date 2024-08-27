package arrays;

public class lengthoflastword {
 
    public static void main(String[] args) {
        String s = "a good   example";
        String arr[] = s.split(" ");
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]+ " "+i);
            if(arr[i] == " "){
                continue;
            }
            System.out.println(arr[i]+" "+i);
        }
    }
}
