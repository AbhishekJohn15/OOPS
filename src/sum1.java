import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        System.out.println("enter the limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum =1;
        for (double i=2; i<n;i++) {
            sum = sum + 1 / (2 * i - 2);
        }
        System.out.println("sum="+sum);
        }
    }

