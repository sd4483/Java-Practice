import java.util.Scanner;

public class Prac49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scan.nextInt();
        if (n%2 == 0) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}
