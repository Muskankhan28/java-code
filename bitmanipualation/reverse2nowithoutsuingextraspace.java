package bitmanipualation;
import java.util.*;

public class reverse2nowithoutsuingextraspace {

    // public static void swapnumbers(int a, int b){
    //     a = a^b;
    //     b = a^b;
    //     a = a^b;
    //     System.out.println(a);
    //     System.out.println(b);
    // }



    public static List<Integer> get(int a , int b){
        a = a^b;
        b = b^a;
        a = a^b; 
        return Arrays.asList(a,b);
  
    }
   
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // swapnumbers(a, b);
        List<Integer>ans = get(a, b);
        System.out.println(ans);
       
    }
    
}
