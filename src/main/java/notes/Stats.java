package notes;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Star on 2017/7/3.
 */
public class Stats {

    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();
        while (!StdIn.isEmpty()) {
            Double number = StdIn.readDouble();
            numbers.add(number);
        }

        int N = numbers.size();

        double sum = 0.0;

        // 求和
        for (Double item : numbers) {
            sum += item;
        }

        double mean = sum / N;
        sum = 0.0;
        for (Double item : numbers) {
            sum += (item - mean) * (item - mean);
        }

        double std = Math.sqrt(sum / (N - 1));
        StdOut.printf("Mean : %.2f\n", mean);
        StdOut.printf("Std dev: %.2f", std);
    }
}
