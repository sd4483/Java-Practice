import java.util.Scanner;

public class Prac17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        /*
        //Using simple input without validation
        System.out.print("Input first binary number: ");
        int num1 = scan.nextInt();
        System.out.print("Inout second binary number: ");
        int num2 = scan.nextInt();
         */

        /*
        //Using input validation
        System.out.print("Input first binary number: ");
        int num1 = scan.nextInt();
        while (num1%10 != 0 && num1%10 != 1){
            System.out.print("Please enter a valid binary number: ");
            num1 = scan.nextInt();
        }
        System.out.print("Input second binary number: ");
        int num2 = scan.nextInt();
        while (num2%10 != 0 && num2%10 != 1){
            System.out.print("Please enter a valid binary number: ");
            num2 = scan.nextInt();
        }
         */
        System.out.print("Input first binary number: ");
        int num1 = scan.nextInt();
        num1 = ValidateBinary(num1);
        System.out.print("Input second binary number: ");
        int num2 = scan.nextInt();
        num2 = ValidateBinary(num2);

        System.out.println("Sum of two binary numbers: " + (num1+num2));
    }


    public static int ValidateBinary (int num) {
        Scanner scan = new Scanner(System.in);
        while (num%10 != 0 && num%10 != 1) {
            System.out.print("Please enter a valid binary number: ");
            num = scan.nextInt();
        }
        return num;
    }
}
