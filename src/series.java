import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms in n = ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 1;

        int sum1 = 1;
        for (int i = 2; i < n; i++) {


            sum = sum + 2 * i - 3 / 2 * i - 2;


        }
        System.out.print("SUM =");
        System.out.println(sum);
    }
}
