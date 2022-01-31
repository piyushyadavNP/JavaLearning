import java.util.Scanner;

public class Calculator {
    static int result;
    static int firstnumber;
    static int secondnumber;
    static char option;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your Choice(+ (For Addition), - (For Subtraction) and / (To Exit))");
        option = reader.next().charAt(0);
        System.out.print("Enter Your First Number");
        firstnumber = reader.nextInt();
        System.out.print("Enter Your Second Number");
        secondnumber = reader.nextInt();

        switch (option) {
            case '+':
                Addition addition = new Addition();
                addition.add();
                break;
            case '-':
                Subtraction subtraction = new Subtraction();
                subtraction.sub();
                break;
            default:
                System.out.println("Please Choose a Correct Option!!!");
                return;
        }
        System.out.printf("The Result is:" + result);
    }
}
