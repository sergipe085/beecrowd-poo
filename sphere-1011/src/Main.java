import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    private static double GetVolume(double radius) {
        double PI = 3.14159;
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        double VOLUME = GetVolume(R);

        BigDecimal VOLUME_FIXED = new BigDecimal(VOLUME).setScale(3, RoundingMode.HALF_EVEN);
        System.out.printf("VOLUME = %.3f\n", VOLUME);
    }
}
