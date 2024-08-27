package geeks;

public class primefactor {
    public static boolean isprime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+1)==0){
                return false;
            }
        }
        return true;
     
    }

    //  brute appraoch
    public static void primeFactors(int n){
        for(int i=2;i<n;i++){
            if(isprime(i)){
                int x=i;
                while(n%x == 0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }

    // better appraoch

    public static void Primefactor(int n){
        if(n<=1){
            return ;
        }
        for(int i=2; i*i<n;i++){
            while(n%i == 0){
                System.out.println(i);
                n=n/10;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }


    // optimized approach

    public static void PrimeFactor(int n){
        if(n<=1){
            return ;
        }
        while(n%2 == 0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3 == 0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i<n;i=i+6){
            while(n%i == 0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2) == 0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n=84;
        PrimeFactor(n);

    }
    
}
