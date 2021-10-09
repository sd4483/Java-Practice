import java.util.Scanner;

public class Prac44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = scan.nextInt();
        int compn = (n+(n*n)+(n*n*n));
        while (n<0 || n>10) {
            System.out.print("Enter a number >0 and <10: ");
            n = scan.nextInt();
            compn = (n+(n*n)+(n*n*n));
        }
        System.out.printf("The value of %d + %d%d + %d%d%d is %d ", n,n,n,n,n,n,compn);
    }
}
