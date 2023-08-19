import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159d;
        double radius = sc.nextDouble();
        double area = PI * (radius * radius);

        System.out.printf("A=%.4f\n", area);
    }
}
