package recurssion;

import arrays.foursumbrute;

public class factorial {
    public static int factorialofano(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fact = factorialofano(n-1);
        int factorial = n*factorialofano(n-1);
        return factorial;

    }




    public static void calculatefactorial(int i , int n ,int fact){
        if(n==1){
          System.out.println(fact);
          return;
        }
        fact = fact * n;
        calculatefactorial(i, n-1, fact);
    }
    public static void main(String[] args) {
        // calculatefactorial(2, 6, 1);
        System.out.println(factorialofano(5));
        
    }
}




//     public static void findfactoraial(int i, int n ,int fact){
//         if(i == n){
//             fact = fact*i;
//             System.out.println(fact);
//             return;
//         }

//         fact = fact*i;
//         findfactoraial(i+1, n, fact);
//     }
   
//     public static void main(String[] args) {
//         findfactoraial(2, 4, 1);
      
        
//     }
    
// }
