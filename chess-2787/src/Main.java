import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int L = sc.nextInt();

        if ((C + L) % 2 == 0) {
            System.out.println("1");
            return;
        }
        System.out.println("0");
    }
}
