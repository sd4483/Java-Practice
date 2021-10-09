import java.util.Scanner;

public class Prac18 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Input first binary number: ");
        int num1 = scan.nextInt();
        num1 = ValidateBinary(num1);
        System.out.print("Input second binary number: ");
        int num2 = scan.nextInt();
        num2 = ValidateBinary(num2);
        System.out.println("Product of two binary numbers: " + (num1*num2));
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
