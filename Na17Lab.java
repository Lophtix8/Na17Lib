package na17lab;

public class Na17Lab {

    public static void main(String[] args) {
        int[] array = {2,4,1,6,3,8};
        System.out.println(getBiggest(array));
        System.out.println(getSmallest(array));
    }


    /*public static HashPrimes getPrimes(int x){
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

    /*public static int[] getFactors(int x){
            
    }

    public static int[] getFactors(long x){
        
    }*/

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

    /*public static boolean isDivisibleBy(int d, int x){

    }

    public static int nFac(int n){

    }

    public static long nFac(int n){

    }*/

}