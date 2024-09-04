package recrussions;

import geeks.trailingzeroes;

public class questions {

    //  print the numbers in the decreasing order
    public static void printnumberNto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printnumberNto1(n-1);
    }

    //  print the number in the increasing order
    public static void printnumber1ToN(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printnumber1ToN(n-1);
        System.out.println(n);

    }

    //  print the factorial of a number
    public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1  = findFactorial(n-1);
        int fact = n*fnm1;
        return fact;
    }

    // print sum of n natural number

    public static int printsum(int n){
        if(n==1){
            return 1;
        }
        int sumNM1 = printsum(n-1);
        int sum = n+sumNM1;
        return sum;
    }

    // print nth fibonacci number 

    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fib1 = fibo(n-1);
        int fib2 = fibo(n-2);
        int ans = fib1+fib2;
        return ans;
    }

    // check if the array is sorted or not 

    public static boolean isSorted(int arr[],  int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // find the first occurance of an element in an array 

    public static int findIndx(int arr[] , int key ,int i){
        int n = arr.length;
        if(i == n){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return findIndx(arr, key, i+1);
    }


    // find the last occurance of an element in an array

    public static int findLastOccur(int arr[] , int key , int i){
        int n = arr.length;
        if(i == n){
            return -1;
        }
        int indx = findLastOccur(arr, key, i+1);
        if(indx == -1 && arr[i] == key){
            return i;
        }
        return indx;
        
    }

    // calculate power

    public static int calpower(int x , int n){
        if(n == 0){
            return 1;
        }
        int power = calpower(x, n-1);
        int ans = x*power;
        return ans;
    }

    // calculate power optimized approach

    public static int calpoweropt(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n == Integer.MIN_VALUE){
            n = n/2;
        }
        if(n<0){
            x = 1/x;
            n = -n;
        }
        int power = calpower(x, n/2);
        int ans = power*power;
        if(n%2 != 0){
            ans = x*ans;
        }
        return ans;
    }

    // calculate the length of an arary 

    public static int callength(int arr[] , int i){
        int n = arr.length;
        if(i == n){
            return i;
        }
        return callength(arr, i+1);
    }


    // tiling problem leetcode hard
    // very important question 

    public static int TailingProblem(int n){     // floor size is (2 x n)  where 2 is the breath and here n is representing the length
        // base case 
        if(n==0 || n==1){
            return 1;
        }

        // kaam 
        // making choices

        // VERTICALL CHOICE
        int VerticalTiles = TailingProblem(n-1);
        // HORIZONTAL CHOICE
        int HozizontalTiles = TailingProblem(n-2);
        int totalways = VerticalTiles + HozizontalTiles;
        return totalways;
    }


    // remove duplicates from a string
    // very important question

    public static void RemoveDuplicate(String s , int indx , StringBuilder newString , boolean temp[]){
        int n = s.length();
        // base case
        if(indx == n){
            System.out.println(newString);
            return;
        }
        // kaam
        char currentchar = s.charAt(indx);
        if(temp[currentchar - 'a'] == true){
            // currentcharacter is duplicate
            RemoveDuplicate(s, indx+1, newString, temp);
        }
        else{
            temp[currentchar - 'a'] = true;
            RemoveDuplicate(s, indx, newString.append(currentchar), temp);
        }
    }

   // friends pairing problem
   // very important problem 

   public static int FriendPairing(int n){         // here n is the number of friends
    // base case
    if(n == 1 || n == 2){
        return n;
    }
    // choice 

    // single
    int singlepair = FriendPairing(n-1);

    // pair
    int pairchoices = singlepair * FriendPairing(n-2);
    int totalways = singlepair + pairchoices;
    return totalways;

   }


   // print all binary String of size n without consecutive ones

   public static void printBinary(int n , int lastplace , String s){
    if(n==0){
        System.out.println(s);
        return;
    }
    printBinary(n-1, 0, s+"0");
    if(lastplace == 0){
        printBinary(n-1, 1, s+"1");
    }
   }


    public static void main(String[] args) {
        // printnumberNto1(10);

        // printnumber1ToN(5);

        // System.out.println(findFactorial(5));

        // System.out.println(printsum(5));

        // System.out.println(fibo(7));


        // int arr[] = {1,3,5,2};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(findIndx(arr, 5, 0));
        // System.out.println(findLastOccur(arr, 5, 0));


        // System.out.println(calpower(2, 3));

        // int arr[] = {1,4,5,6,7};
        // System.out.println(callength(arr, 0));


        // System.out.println(TailingProblem(4));


        // String s = "appnnacollege"; 
        // RemoveDuplicate(s, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(FriendPairing(3));

        printBinary(3, 0, "");
       
        
    }
}
