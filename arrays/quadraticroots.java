package arrays;
import java.util.*;

public class quadraticroots {
    public static ArrayList<Integer> findQuadraticroots(int a , int b , int c){
        ArrayList<Integer>roots = new ArrayList<>();
        int  d = ((b*b)-(4*a*c));
        // double r1 = 0;
        // double r2 = 0;
        int ro1 = 0;
        int ro2 = 0;
        // double realpart = 0;
        // double imaginarypart = 0;
        // if(d == 0){
        //     // roots are equall
        //      ro1 = -b/(2.0*a);
        //      ro2 = -b/(2.0*a); 
        //      roots.add(r1);   
        //      roots.add(r2);  
        // }
        // else 
        if(d>=0){
            // roots are real and distinct
            ro1 = Math.floor((-b+Math.sqrt(d))/(2*a));
            ro2 = Math.floor((-b-Math.sqrt(d))/(2*a));
            roots.add(ro1);
            roots.add(ro2);
        }
        return -1;
       
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = -7;
        int c = 12;
        ArrayList<Integer>ans = findQuadraticroots(a, b, c);
        for (Double i : ans) {
            System.out.println(i);
        }
       
    }
    
}
