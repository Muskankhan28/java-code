package recurssion;

public class printno {
    public static void printno(int n){
        if(n==0){
            return;
        }    
        System.out.println(n);
        printno(n-1);
        
    }

    public static void printnumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumber(n+1);

    }






   

    public static void main(String[] args) {
    
        // int n=5;
        // printno(n);

        // int n=1;
        // printnumber(n);

       
    }
    
}
