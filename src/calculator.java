import java.sql.SQLOutput;
import java.util.Scanner;

class calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number:");
                int a = in.nextInt();
        System.out.println("Enter the second Number:");
                int b = in.nextInt();


                //Addition
        int sum =a+b;
        System.out.print("Adiition  = ");
        System.out.println(sum);

        // Subtraction
        int sub=a-b;
        System.out.print("Subtraction = ");

        System.out.println(sub);

        //Multiply
        int mul=a*b;
        System.out.print("Multiplication = ");
        System.out.println(mul);

        // DIVisoin
        int div=a/b;
        System.out.print("Division = ");
        System.out.println(div);
//
        //Exponent
        int exp =a^b;
        System.out.print("Exponent = ");
        System.out.println(exp);

        //Percentage or modulus
        int mod=a%b;
        System.out.print("Modulus = ");
        System.out.println(mod);


    }
}

