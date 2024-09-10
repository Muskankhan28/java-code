package recrussions;

public class morequetion {

    //BASIC PROBLEMS ON RECURSSION 

    // print name n times using recurrsion 

    public static void printnameNtimes(String name , int n ){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printnameNtimes(name, n-1);
    }
    
    public static void print(int i , int n){
        if(i>n){
            return;
        }
        System.out.println("muskan");
        print(i+1, n);
    }


    // print linearly from 1 to N

    public static void print1ToN(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        print1ToN(i+1, n);
        
    }


    public static void printNt1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNt1(n-1);
    }

    public static void print1ton(int i , int n){
        if(i<1){
            return;
        }
        print1ton(i-1, n);
        System.out.print(i+ " ");
    }


    public static void printnto1(int i, int n){
        if(i>n){
            return;
        }
        printnto1(i+1, n);
        System.out.print(i + " ");
    }


    // parameterized recurrsion 
    // calculate the sum of n natural number

    public static void printsumofNnumber(int i , int sum){
        if(i<1){
            System.out.print(sum);
            return;
        }
        printsumofNnumber(i-1, sum+i);
    }

    // functional recurrsion 
    // calculate the sum of n natural number

    public static int printsum(int n){
        if(n == 0){
            return 0 ;
        }
        int sum = n + printsum(n-1);
        return sum;
        
    }


    // calculate the factorial of a number using recurrsion  
     
    public static int printfactorial(int n){
        if(n == 0 ){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        int fact = n * printfactorial(n-1);
        return fact;
    }



    public static void main(String[] args) {

        // String name = "muskan";
        // int n = 5;
        // printnameNtimes(name, n);

        // print(1, 5);

        // print1ToN(1, 5);
        // printNt1(4);
        // print1ton(3, 3);
        // printnto1(1, 3);


        // printsumofNnumber(5, 0);
        // System.out.println(printsum(5));

        System.out.println(printfactorial(5));


     


        
    }

    
}
