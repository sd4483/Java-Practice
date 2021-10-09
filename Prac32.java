import java.util.Scanner;

public class Prac32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Input first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Input second integer: ");
        int num2 = scan.nextInt();

        if (num1==num2){
            System.out.println(num1 + " = " + num2);
        }
        else if (num1<num2){
            System.out.println(num1 + " != " +num2);
            System.out.println(num1 + " < " + num2);
            System.out.println(num1 + " <= " + num2);
        }
        else {
            System.out.println(num1 + " != " +num2);
            System.out.println(num1 + " > " + num2);
            System.out.println(num1 + " >= " + num2);
        }

    }
}
