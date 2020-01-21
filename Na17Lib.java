package eulerproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Na17Lib {

    public static void main(String[] args) {
        //System.out.println(isPrime(0));
        HashMap<Integer, Integer> factors = getPrimeFactorsAsHash(450);

        for( Map.Entry<Integer,Integer> e : factors.entrySet()){
            System.out.println(e);
        }
        //System.out.println(changeBase(111, 2, 3));
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
        HashMap<Integer, Integer> hash = new HashMap();
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

    public static int[] getUniqueFactors(int n) {
        int[] primes = Arrays.copyOf(getPrimesBetween(0, n), getPrimesBetween(0, n).length);
        ArrayList<Integer> factors = new ArrayList();
        for (int i = 0; i < primes.length; i++) {
            if (n % primes[i] == 0) {
                factors.add(primes[i]);
            }
        }
        Integer[] unique_factors = factors.toArray(new Integer[factors.size()]);
        int[] u_f = new int[unique_factors.length];
        for (int i = 0; i < unique_factors.length; i++) {
            u_f[i] = unique_factors[i];
        }
        return u_f;
    }

    public static int EulersTotientFunction(int n) {
        int[] factors=Arrays.copyOf(getUniqueFactors(n), getUniqueFactors(n).length);
        double t=n;
        for (int i = 0; i < factors.length; i++) {
            t*=1.0-1.0/factors[i];
        }
        return (int) t;
    }


}
