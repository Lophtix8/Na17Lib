//package eulerproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Na17Lib {

    public static void main(String[] args) {
        System.out.println(isPrime(0));
    }

    public static ArrayList<Integer> generatePrimes(int x) {
        ArrayList<Integer> primes = new ArrayList();
        boolean[] isP = new boolean[x];
        Arrays.fill(isP, true);
        isP[0] = isP[1] = false;
        for (int i = 2; i < x; i++){
            if (isP[i]) {
                primes.add(i);
                for (int k = i + i; k < x; k += i){
                    isP[k] = false;
                }
            }
        }
        return primes;
    }
    
    public static ArrayList<Integer> getFactors(int x){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= x/2; i++) {
            if(x % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }
    /*public static int[] getPrimes(int x){
        return null;
    }

    public  static int changeBase(int x, int fromBase, int toBase){

    }
//    public static int[] getPrimes(int x){
//        return null;
//    }
//    public  static int changeBase(int x, int fromBase, int toBase){
//        
//    }*/

    public static int MGN(int x, int y){
        return x * y / GCD(x, y);
    }

    public static int GCD(int x, int y){  
//        for (int i = Math.min(x, y); i >= 2 ; i--) {
//            if(x % i == 0 && y % i == 0){
//                return i;
//            }
//        }
//        return 1;
        
        for (int i = 1; i < Math.min(x, y); i++) { //Snabbare metod
            if(Math.min(x, y) % i == 0){
                if(y % (Math.min(x, y)/i) == 0){
                    return Math.min(x, y)/i;
                }
            }
        }
        return 1;
    }

    public static int numSum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    /*
    public static HashMap<Integer, Integer> getDivisors(int x){

    }
    */

    public static boolean isPrime(int x){
        return (x <= 1) ? false : (getFactors(x).isEmpty());
    }
    
    public static int getBiggest(int[] arr){
        int biggest = arr[0];
        for (int i : arr){
            if (i > biggest){
                biggest = i;
            }
        }
        return biggest;
    }

    public static int getSmallest(int[] arr){
        int smallest = arr[0];
        for (int i : arr){
            if (i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static boolean isDivisible(int x, int d){
        return x % d == 0;
    }

    public static int nFac(int n){
        return (n == 0) ? 1 : n * nFac(n - 1);
    }

    public static long nFac(long n){
        return (n == 0) ? 1 : n * nFac(n - 1);
    }


}
