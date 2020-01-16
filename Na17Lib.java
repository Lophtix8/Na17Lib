//package na17lib;

import java.util.ArrayList;
import java.util.List;

public class Na17Lib {

    public static void main(String[] args) {
        System.out.println(generatePrimes(100, 2));
    }

    public static List<Integer> generatePrimes(int upperLimit, int lowerLimit) {
        List<Integer> primes = new ArrayList<Integer>();

        for (int i = lowerLimit; i <= upperLimit; i++) {
            primes.add(i);
        }

        return primes;
    }
    /*public static int[] getPrimes(int x){
        return null;
    }

    public  static int changeBase(int x, int fromBase, int toBase){
        
    }

    public static int MGN(int x, int y){
        return 0;
    }

    public static int GCD(int x, int y){

    }*/

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

    public static boolean isPrime(int number){
        limit = Math.pow(number, 1/2);
    }
    */
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

    /*
    public static int nFac(int n){

    }

    public static long nFac(int n){

    }*/

}