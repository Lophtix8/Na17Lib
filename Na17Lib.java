//package eulerproblems;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Na17Lib {

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> generatePrimes(int x) {
        ArrayList primes = new ArrayList();
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

    public static int[] getPrimesBetween(long s, long e) {
        ArrayList<Integer> ps = new ArrayList();
        if (s < 2 && 2 < e) ps.add(2);
        if (s < 3 && 3 < e) ps.add(3);

        for (int i = (int) s / 6 + 1; i < e / 6 + 1; i++) {
            boolean exists = false;
            for (Integer j : ps) {
                if ((6 * i - 1) % j == 0) exists = true;
            }
            if (!exists && s < 6 * i) ps.add(6 * i - 1);

            exists = false;
            for (Integer j : ps) {
                if ((6 * i + 1) % j == 0) exists = true;
            }
            if (!exists && 6 * i < e) ps.add(6 * i + 1);

        }
        Integer[] primes = ps.toArray(new Integer[ps.size()]);
        int[] plist = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            plist[i] = primes[i];
        }
        return plist;
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

    public static ArrayList<Long> getFactors(long x){
        ArrayList<Long> factors = new ArrayList();
        for (long i = 2; i <= x/2; i++) {
            if(x % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    public static ArrayList<Integer> getPrimeFactors(int x){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= x/2; i++) {
            if(x % i == 0 && isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    public static HashMap<Integer, Integer> getPrimeFactorsAsHash(int x){
        HashMap hash = new HashMap();
        ArrayList<Integer> primes = getPrimeFactors(x);

        for (int i = 0; i < primes.size(); i++) {
            int c = 0;
            while(x % primes.get(i) == 0){
                x /= primes.get(i);
                c++;
            }
            hash.put(primes.get(i), c);
        }

        return hash;
    }

    /*public static int[] getPrimes(int x){
        return null;
    }*/

    public static int changeBase(int x, int fromBase, int toBase){
        return Integer.parseInt(Integer.toString(Integer.parseInt("" + x, fromBase), toBase), 10);
    }

    public static String changeBase(String x, int fromBase, int toBase){
        return Integer.toString(Integer.parseInt(x, fromBase), toBase);
    }

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

    public static boolean isPrime(int x){
        return (x > 1) && (getFactors(x).isEmpty());
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

    public static int fib(int x) {
        // Shitstorm deluxe (formel från Wikipedia)
        return (int) Math.floor(Math.pow((1+Math.sqrt(5))/2, x)/Math.sqrt(5) + 0.5f);
    }

    public static long fib(long x) {
        // Shitstorm deluxe (formel från Wikipedia)
        return (long) Math.floor(Math.pow((1 + Math.sqrt(5)) / 2, x) / Math.sqrt(5) + 0.5f);
    }

    public static int[] fibList(int x, int z) {
        int[] fibs = new int[z-x+1];
        fibs[0] = fib(x);
        fibs[1] = fib(x+1);
        for (int i = 2; i <= z-x; i++) {
            fibs[i] = fibs[i-2] + fibs[i-1];
        }
        return fibs;
    }

    public static int nbrOfDigits(int x) {
        return (int) Math.floor(Math.log10(x)) + 1;
    }
}
