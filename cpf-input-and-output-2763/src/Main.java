import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String CPF = sc.nextLine();

        String[] CPF_PARTS = CPF.split("\\.|\\-");
        for (String CPF_PART : CPF_PARTS) {
            System.out.println(CPF_PART);
        }
    }
}
