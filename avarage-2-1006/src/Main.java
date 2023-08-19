import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int times = 3;
        int i = 0;
        double[] numbers = new double[times];
        double[] wheights = new double[] { 2.0, 3.0, 5.0 };

        while (i < times) {
            numbers[i] = sc.nextDouble() * wheights[i];
            i++;
        }

        double total = 0.0;
        double totalWeights = 0.0;
        i = 0;
        while (i < times) {
            total += numbers[i];
            totalWeights += wheights[i];
            i++;
        }

        double MEDIA = total / totalWeights;

        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
