import java.util.*;
public class Prac06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num01: ");
        int Num01 = scan.nextInt();
        System.out.print("Enter Num02: ");
        int Num02 = scan.nextInt();
        System.out.println("Addition of Num01+Num02: " + (Num01+Num02));
        System.out.println("Subtraction of Num01-Num02: " + (Num01-Num02));
        System.out.println("Multiplication of Num01*Num02: " + Num01*Num02);
        System.out.println("Division of Num01/Num02: " + Num01/Num02);
        System.out.println("Remainder of Num01%Num02: " + Num01%Num02);
    }
}
