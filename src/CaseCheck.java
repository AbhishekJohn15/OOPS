import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0
        );
//        String word = "Hello John";
//        System.out.println(word.charAt(8));
        if (ch >='a' && ch <= 'z') {
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
        }
        //System.out.println(ch);
    }

