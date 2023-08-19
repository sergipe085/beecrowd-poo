import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    private static double GetTotalSalary(double fixed, double sales) {
        return fixed + (sales * 0.15d);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String NAME = sc.nextLine();
        double FIXED_SALARY = sc.nextDouble();
        double TOTAL_SALES = sc.nextDouble();

        double TOTAL = GetTotalSalary(FIXED_SALARY, TOTAL_SALES);

        BigDecimal TOTAL_FIXED = new BigDecimal(TOTAL).setScale(2, RoundingMode.HALF_EVEN);
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL_FIXED);
    }
}
