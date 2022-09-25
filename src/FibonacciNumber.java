import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt(); // next integer
        int a = 0;// integer a
        int b = 1;// integer b
        int count =2; // count variable
        while (count<=n){  // while count is less than n than value will execute
            int temp = b; // assign temp with value of b
                    b=b+a; // b = sum of a+b
            a = temp; // assign a as temp
            count++;// increase count variable


        }
        System.out.println(b);
    }
}

