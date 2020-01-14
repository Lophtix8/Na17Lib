import java.util.ArrayList;

public class Problem2{
    public static void main(String[] args){
        ArrayList<Integer> series = new ArrayList();
        int current_value = 2;
        series.add(1);
        series.add(1); 
        while (current_value < 4000000){
            series.add(current_value);
            current_value = series.get(series.size()-1) + series.get(series.size()-2);
        }
        long sum = 0;
        for (int number : series){
            if (number%2 == 0){
                sum += number;
            }
        }
        System.out.println(sum);
    }
}