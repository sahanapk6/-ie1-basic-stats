import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        double[] numbers = {5.0, 3.2, 1.8, 9.7, 2.5, 7.1};
        MinMax result = calculateMinMax(numbers);
        System.out.println("Minimum: " + result.min);
        System.out.println("Maximum: " + result.max);
    }

    public static MinMax calculateMinMax(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        double min = numbers[0];
        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new MinMax(min, max);
    }

    static class MinMax {
        double min;
        double max;

        MinMax(double min, double max) {
            this.min = min;
            this.max = max;
        }
    }
}