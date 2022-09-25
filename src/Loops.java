import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q: Print number from 1 to 5
        /*
        for(initialization; condition; increment decrement){
        //body
        }
         */
        // Q: Print numbers from 1 to 5
//        for (int num =1; num<=5; num +=2)// (+=2 = number incemented by 2;)
//        {
//            System.out.println(num);
//        }
//        // print number from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num +" ");
            System.out.println("hello world");

        }
    }
}
