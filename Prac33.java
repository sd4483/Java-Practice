import java.util.Scanner;

public class Prac33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Input integer: ");
        int num = scan.nextInt();
        int sum = 0;

        while (num>0) {
            sum = sum + num%10;
            num = num/10;
        }

        System.out.print(sum);
    }
}
