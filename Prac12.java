import java.util.Scanner;

public class Prac12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scan.nextInt();
        System.out.println("Average is " + (num1+num2+num3)/3);
    }
}
